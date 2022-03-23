<template>
  <div class="ItemBuy">
    <Sidebar />
    <div :style="{ 'margin-left': sidebarWidth}">
      <router-view />
    </div>
    <h2>Item Buy</h2>
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
  height: 1200px;
}
</style>
