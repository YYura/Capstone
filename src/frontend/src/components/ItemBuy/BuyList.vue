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
import Sidebar from '@/components/ItemBuy/Sidebar'
import { sidebarWidth } from '@/components/ItemBuy/state'
import axios from 'axios'
import { reactive } from 'vue'

export default {
  name: 'ItemBuy',
  components: { Sidebar },
  // data () {
  //   return {
  //     memberName: ''
  //   }
  // },
  setup () {
    const items = reactive({
      data: {

      }
    })

    axios.get('http://localhost:8090/api/shop')
      .then(response => {
        console.log(items)
        items.data = response.data
      })
      .catch(function (ex) {
        console.log('button fail', ex)
      })
    return {
      sidebarWidth, items
    }
  },
  methods: {

  }

}

</script>

<style scoped>
.ItemBuy{
  width: 100%;
  height: 90%;
}
.ItemBuy button{
  margin: 5%;
}
</style>
