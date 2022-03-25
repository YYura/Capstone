<template>
  <Sidebar />
  <div :style="{ 'margin-left': sidebarWidth }">
    <router-view />
  </div>
  <div class="ItemBuy">
    <h2>Item Buy</h2>
    <div class="row row-cols-1 row-cols-md-3 g-4">
      <div class="col">
        <div class="card" v-for="(item, index) in items" :key="index">
          <img src="https://picsum.photos/id/237/200/300" class="card-img-top" alt="...">
          <div class="card-body">
            <h5 class="card-title">{{item.data}}</h5>
            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
          </div>
        </div>
      </div>
<!--      <div class="col">-->
<!--        <div class="card">-->
<!--          <img src="https://picsum.photos/id/237/200/300" class="card-img-top" alt="...">-->
<!--          <div class="card                                                                                                                                                                                                                                                       -body">-->
<!--            <h5 class="card-title">Card title</h5>-->
<!--            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>-->
<!--          </div>-->
<!--        </div>-->
<!--      </div>-->
<!--      <div class="col">-->
<!--        <div class="card">-->
<!--          <img src="https://picsum.photos/id/237/200/300" class="card-img-top" alt="...">-->
<!--          <div class="card-body">-->
<!--            <h5 class="card-title">Card title</h5>-->
<!--            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content.</p>-->
<!--          </div>-->
<!--        </div>-->
<!--      </div>-->
<!--      <div class="col">-->
<!--        <div class="card">-->
<!--          <img src="https://picsum.photos/id/237/200/300" class="card-img-top" alt="...">-->
<!--          <div class="card-body">-->
<!--            <h5 class="card-title">Card title</h5>-->
<!--            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>-->
<!--          </div>-->
<!--        </div>-->
<!--      </div>-->
<!--      <div class="col">-->
<!--        <div class="card">-->
<!--          <img src="https://picsum.photos/id/237/200/300" class="card-img-top" alt="...">-->
<!--          <div class="card-body">-->
<!--            <h5 class="card-title">Card title</h5>-->
<!--            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>-->
<!--          </div>-->
<!--        </div>-->
<!--      </div>-->
<!--      <div class="col">-->
<!--        <div class="card">-->
<!--          <img src="https://picsum.photos/id/237/200/300" class="card-img-top" alt="...">-->
<!--          <div class="card-body">-->
<!--            <h5 class="card-title">Card title</h5>-->
<!--            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>-->
<!--          </div>-->
<!--        </div>-->
<!--      </div>-->
<!--      <div class="col">-->
<!--        <div class="card">-->
<!--          <img src="https://picsum.photos/id/237/200/300" class="card-img-top" alt="...">-->
<!--          <div class="card-body">-->
<!--            <h5 class="card-title">Card title</h5>-->
<!--            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>-->
<!--          </div>-->
<!--        </div>-->
<!--      </div>-->
<!--      <div class="col">-->
<!--        <div class="card">-->
<!--          <img src="https://picsum.photos/id/237/200/300" class="card-img-top" alt="...">-->
<!--          <div class="card-body">-->
<!--            <h5 class="card-title">Card title</h5>-->
<!--            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>-->
<!--          </div>-->
<!--        </div>-->
<!--      </div>-->
<!--      <div class="col">-->
<!--        <div class="card">-->
<!--          <img src="https://picsum.photos/id/237/200/300" class="card-img-top" alt="...">-->
<!--          <div class="card-body">-->
<!--            <h5 class="card-title">Card title</h5>-->
<!--            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>-->
<!--          </div>-->
<!--        </div>-->
<!--      </div>-->
    </div>
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
        datas: [

        ]
      }
    })

    axios.get('http://localhost:8090/api/shop')
      .then(response => {
        console.log(items)
        items.data = response.data.datas
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
.row-cols-1{
  width: 80%;
  height: 100%;
  margin: 120px 300px;
}
.card{
  width: 50%;
  height: 50%;
}
</style>
