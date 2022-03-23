<template>
  <Sidebar />
  <div :style="{ 'margin-left': sidebarWidth}">
    <router-view />
  </div>
  <div class="ItemBuy">
    <h2>Item Buy</h2>
    <h2>Best</h2>
    <div class="best-item-box">
    </div>
    <h2>New</h2>
    <div class="new-item-box">
    </div>
  </div>
</template>

<script>
import Sidebar from '@/components/ItemBuy/Sidebar'
import { sidebarWidth } from '@/components/ItemBuy/state'

export default {
  name: 'ItemBuy',
  components: { Sidebar },
  setup () {
    return { sidebarWidth }
  },
  data () {
    return {

    }
  }
}

</script>

<style scoped>
.ItemBuy{
  width: 100%;
  height: 1200px;
}
.best-item-box{
  position: absolute;
  box-sizing: content-box;
  width: 800px;
  height: 1000px;
  padding: 0;
  border: 1px solid black;
  margin: 80px 350px;
}
.new-item-box{
  position: absolute;
  box-sizing: content-box;
  width: 800px;
  height: 1000px;
  padding: 0;
  border: 1px solid black;
  margin: 80px 1300px;
}

</style>
