import { createWebHistory, createRouter } from 'vue-router'
import Vue from 'vue'

const routes = [
  {
    path: '/',
    name: 'Main',
    component: () => import('@/components/HelloWorld')
  },
  {
    path: '/itemBuy',
    name: 'ItemBuy',
    component: () => import('@/components/ItemBuy/BuyList')
  }
]
Vue.use

export const router = createRouter({
  history: createWebHistory(),
  routes
})
