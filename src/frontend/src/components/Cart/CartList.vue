<template>
  <div class="cart">
    <div class="buy-cart-btn">
      <img :src="require('@/assets/buyBtn.png')">
      <h5>구매 장바구니</h5>
    </div>
    <div class="share-cart-btn">
      <img :src="require('@/assets/rentBtn.png')">
      <h5>대여 장바구니</h5>
    </div>
  </div>
</template>

<script>
export default {
  name: 'CartList'
}
</script>

<style scoped>
.cart{
  width: 100%;
  height: 100%;
}
.cart .buy-cart-btn{
  width: 15%;
  height: 20%;
  /*padding: 20px;*/
  border: 1px solid black;
  margin-left: 10%;
  padding: 3%;
  text-align: center;
}
.cart .buy-cart-btn img{
  width: 50%;
  height: 50%;
}
.cart .buy-cart-btn h5 {
  margin-top: 10%;
}
.cart .share-cart-btn{
  width: 15%;
  height: 20%;
  /*padding: 20px;*/
  border: 1px solid black;
  margin: 10%;
  padding: 3%;
  text-align: center;
}
.cart .share-cart-btn img{
  width: 50%;
  height: 50%;
}
.cart .share-cart-btn h5 {
  margin-top: 10%;
}
</style>
