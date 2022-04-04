<template>
  <div class="infoter">
    <h2>인포터</h2>
    <button><router-link class="nav-link" to="/infoter/infoterNow">Reservation Now</router-link></button>
    <button><router-link class="nav-link" to="/itemBuy/buyNow">Add to Cart</router-link></button>
  </div>
</template>

<script>
export default {
  name: 'InfoterList'
}
</script>

<style scoped>
.infoter{
  width: 100%;
  height: 90%;
}
.infoter button{
  margin: 5%;
}
</style>
