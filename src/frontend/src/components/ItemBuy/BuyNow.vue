<template>
  <div class="buyNow">
    <h2></h2>
    <div class="daummap">
      <h2>우편번호: <input v-bind:value="zip" v-bind:disabled="zip"/> <button @click="showApi()">우편번호 찾기</button></h2>
      <h2>기본주소: <input size="30" v-bind:value="addr1" v-bind:disabled="addr1"></h2>
      <h2>상세주소: <input size="40" v-bind:name="addr2"> <span>{{ addr2 }}</span></h2>
      <div ref="embed"></div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'BuyNow',
  data () {
    return {
      zip: '',
      addr1: '',
      addr2: ''
    }
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
    }
  }
}
</script>

<style scoped>
.buyNow.daummap{
  width: 100%;
  height: 100%;
}
</style>
