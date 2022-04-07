<template>
  <Sidebar />
  <div :style="{ 'margin-left': sidebarWidth }">
    <router-view />
  </div>
  <div class="ItemBuy">
    <h2>Item Buy</h2>
    <button><router-link class="nav-link" to="/itemBuy/buyNow">Buy Now</router-link></button>
    <button><router-link class="nav-link" to="/itemBuy/buyNow">Add to Cart</router-link></button>
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

  }

}

</script>

<style scoped>
.ItemBuy{
  width: 100%;
  height: 100%;
  margin-top: 3%;
}
.ItemBuy button{
  margin: 5%;
}
</style>
