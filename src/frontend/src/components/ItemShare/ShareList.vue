<template>
  <Sidebar/>
  <div :style="{ 'margin-left': sidebarWidth }">
    <router-view />
  </div>
  <div class="ItemShare">
    <h2>Item Share</h2>
    <button><router-link class="nav-link" to="/itemShare/shareNow">Share Now</router-link></button>
    <button><router-link class="nav-link" to="/itemBuy/buyNow">Add to Cart</router-link></button>
  </div>
</template>

<script>
import Sidebar from '@/components/Sidebar/Sidebar'
import { sidebarWidth } from '@/components/Sidebar/state'

export default {
  name: 'ShareList',
  components: { Sidebar },
  return: {
    sidebarWidth
  }
}
</script>

<style scoped>
.ItemShare{
  width: 100%;
  height: 90%;
}
.ItemShare button{
  margin: 5%;
}
</style>
