<template>
  <div class="buy-cart">
    <h2>장바구니(구매)</h2>

    <table class="buy-cart-item-info">
      <tr>
        <td><input type="checkbox" v-model="checkAll">전체선택</td>
        <td>상품/옵션 정보</td>
        <td>수량</td>
        <td>상품 금액</td>
        <td>배송비</td>
      </tr>
      <tr>
        <td><input type="checkbox" v-model="check.check1"></td>
        <td>
          <div class="card mb-3" style="max-width: 540px;">
            <div class="row g-0">
              <div class="col-md-4">
                <img src="" class="img-fluid rounded-start" alt="...">
              </div>
              <div class="col-md-8">
                <div class="card-body">
                  <h5 class="card-title">상품 이름</h5>
                  <h5 class="card-text">옵션</h5>
                </div>
              </div>
            </div>
          </div>
        </td>
        <td>{{n}}</td>
        <td>{{price}}</td>
        <td>{{price}}</td>
      </tr>
      <tr>
        <td><input type="checkbox" v-model="check.check2"></td>
        <td>
          <div class="card mb-3" style="max-width: 540px;">
            <div class="row g-0">
              <div class="col-md-4">
                <img src="" class="img-fluid rounded-start" alt="...">
              </div>
              <div class="col-md-8">
                <div class="card-body">
                  <h5 class="card-title">상품 이름</h5>
                  <h5 class="card-text">옵션</h5>
                </div>
              </div>
            </div>
          </div>
        </td>
        <td>{{n}}</td>
        <td>{{price}}</td>
        <td>{{price}}</td>
      </tr>
    </table>

  </div>
</template>

<script>
export default {
  name: 'BuyCart',
  data () {
    return {
      price: 1000,
      n: 5,
      check: {
        check1: false,
        check2: false

      },
      computed: {
        checkAll: {
          // get: () => {
          //   return this.check.check1 + ', ' + this.check.check2
          // },
          set: (e) => {
            if (e === true) {
              this.check.check1 = true
              this.check.check2 = true
            } else {
              this.check.check1 = false
              this.check.check2 = false
            }
          }
        }
      }
    }
  }
}
</script>

<style scoped>
.buy-cart{
  margin: 1% 2%;
  width: 100%;
  height: 100%;
}
.buy-cart .buy-cart-item-info {
  margin: 1% 10%;
  width: 80%;
  border: 1px solid #444444;
  border-collapse: collapse;
}

</style>
