<template>
  <Sidebar />
  <div :style="{ 'margin-left': sidebarWidth }">
    <router-view />
  </div>
  <div class="ItemBuy">
    <h2>Item Buy</h2>
    <div class="btn-group" role="group" aria-label="Basic radio toggle button group">
      <input type="radio" class="btn-check" name="btnradio" id="btnradio1" autocomplete="off" checked>
      <label class="btn btn-outline-primary" for="btnradio1">전체</label>

      <input type="radio" class="btn-check" name="btnradio" id="btnradio2" autocomplete="off">
      <label class="btn btn-outline-primary" for="btnradio2">최신순</label>

      <input type="radio" class="btn-check" name="btnradio" id="btnradio3" autocomplete="off">
      <label class="btn btn-outline-primary" for="btnradio3">인기순</label>

      <input type="radio" class="btn-check" name="btnradio" id="btnradio4" autocomplete="off">
      <label class="btn btn-outline-primary" for="btnradio4">낮은 가격순</label>

      <input type="radio" class="btn-check" name="btnradio" id="btnradio5" autocomplete="off">
      <label class="btn btn-outline-primary" for="btnradio5">높은 가격순</label>
    </div>

    <div class="buy-btn-group">
      <button class="buy-list-btn" @click="buyNowBtn">Buy Now</button>
      <button class="buy-list-btn" @click="buyAddCart">Add to Cart</button>
    </div>
  </div>
</template>

<script>
import Sidebar from '@/components/Sidebar/Sidebar'
import { sidebarWidth } from '@/components/Sidebar/state'

// import { reactive } from 'vue'

export default {
  name: 'ItemBuy',
  components: { Sidebar },
  return: {
    sidebarWidth
  },
  // },
  methods: {
    buyNowBtn () {
      window.location.href = 'http://localhost:8080/itemBuy/buyNow'
    },
    buyAddCart () {
      window.location.href = 'http://localhost:8080/cart'
    }
  }
}

</script>

<style scoped>
.ItemBuy{
  width: 100%;
  height: 100%;
  margin-top: 3%;
}
.ItemBuy .btn-group{
  margin-top: 2%;
  margin-left: 60%;
  width: 25%;
}
.buy-btn-group{
  text-align: center;
  margin: 30%;
  width: 50%;
}
.buy-btn-group .buy-list-btn{
  margin-left: 2%;
  margin-right: 3%;
  width: 12%;
  padding: 1.5%;
  background-color: #ffffff;
  font-weight: bolder;
  border-color: #00a3de;
  border-radius: 1em;
  color: #00a3de;
}
.buy-list-btn:hover{
  color: white;
  background-color: #b2e2fd;
}
</style>
