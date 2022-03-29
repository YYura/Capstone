<template>
  <div class="buyNow">
    <h2>주문/결제</h2>

    <h3>구매자 정보</h3>
    <table>
      <tr>
        <td>이름</td>
        <td>땡땡땡</td>
      </tr>
      <tr>
        <td>이메일</td>
        <td>Tang@naver.com</td>
      </tr>
      <tr>
        <td>휴대폰 번호</td>
        <td>01012345678</td>
      </tr>
    </table>

    <h3>받는사람 정보</h3>
    <table>
      <tr>
        <td>이름</td>
        <td><input type="text"></td>
      </tr>
      <tr>
        <td>우편번호</td>
        <td><input v-bind:value="zip" v-bind:disabled="zip" placeholder="우편번호"><button @click="showApi()">우편번호 찾기</button></td>
      </tr>
      <tr>
        <td rowspan='2'>배송 주소</td>
        <td><input size="40" v-bind:value="addr1" v-bind:disabled="addr1" placeholder="기본 주소"></td>
      </tr>
      <tr>
<!--        <td></td>-->
        <td><input size="40" v-bind:name="addr2" placeholder="상세 주소 입력"> </td>
      </tr>
      <tr>
        <td>연락처</td>
        <td><input type="text"></td>
      </tr>
      <tr>
        <td>배송 요청사항</td>
        <td><input size="40" type="text"></td>
      </tr>
    </table>

    <h3>상품 정보</h3>
    <table>
      <tr>
        <td>상품 이름</td>
        <td>땡땡땡땡땡상품</td>
      </tr>
      <tr>
        <td>상품 금액</td>
        <td>200000</td>
      </tr>
      <tr>
        <td>배송비</td>
        <td>10000</td>
      </tr>
    </table>

    <h3>결제 정보</h3>
    <table>
      <tr>
        <td>총 상품 금액</td>
        <td>200000</td>
      </tr>
      <tr>
        <td>배송비</td>
        <td>10000</td>
      </tr>
      <tr>
        <td>총 결제 금액</td>
        <td>{{price}}</td>
      </tr>
      <tr>
        <td>결제 수단</td>
        <td>결제 수단~~~~</td>
      </tr>
    </table>

    <h5>구매조건 확인 및 결제대행 서비스 약관 동의<button>보기</button></h5>
    <h5>개인정보 제3자 제공 동의<button>보기</button></h5>

    <button class="payNow" @click="paymentBtn()">결제하기</button>

  </div>
</template>

<script>

const { IMP } = window.IMP;

export default {
  name: 'BuyNow',
  data () {
    return {
      zip: '',
      addr1: '',
      addr2: '',
      price: 10000
    }
  },
  created() {
    document.cookie = "safeCookie1=foo; SameSite=Lax";
    document.cookie = "safeCookie2=foo";
    document.cookie = "crossCookie=bar; SameSite=None; Secure";
  },
  methods: {
    showApi () {
      new window.daum.Postcode({
        oncomplete: (data) => {
          let fullRoadAddr = data.roadAddress
          let extraRoadAddr = ''

          if (data.bname !== '' && /[동|로|가]$/g.test(data.bname)) {
            extraRoadAddr += data.bname
          }

          if (data.buildingName !== '' && data.apartment === 'Y') {
            extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName)
          }

          if (extraRoadAddr !== '') {
            extraRoadAddr = ' (' + extraRoadAddr + ')'
          }

          if (fullRoadAddr !== '') {
            fullRoadAddr += extraRoadAddr
          }

          this.zip = data.zonecode
          this.addr1 = fullRoadAddr
        }
      }).open()
    },
    paymentBtn(){
      IMP.init("imp35975601")

      IMP.request_pay({
        pg: "html5_inicis",
        pay_method: "card",
        merchant_uid: "주문번호",
        name: "상품명",
        amount: this.price,
        buyer_tel: "01012345678",
        confirm_url: ''
      }, (rsp)=>{
        if(rsp.success){
          let msg = '결제가 완료되었습니다.';
          msg += '고유ID : ' + rsp.imp_uid;

        }else{
          alert("결제 실패")
        }
      })
    }
  }
}
</script>

<style scoped>
.buyNow{
  margin: 1% 2%;
  width: 100%;
  height: 100%;
}
.buyNow h3{
  margin: 1% 10%;
  width: 100%;
  height: 100%;
}
.buyNow table {
  margin: 1.5% 15%;
  width: 30%;
  border: 1px solid #444444;
  border-collapse: collapse;
}
.buyNow td {
  border: 1px solid #444444;
  padding: 2%;
}
.buyNow h5{
  margin: 1% 10%;
}
.buyNow h5 button{
  margin: 0% 19%;
}
.payNow{
  margin: 2% 25%;
}
</style>
