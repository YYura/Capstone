import { createWebHistory, createRouter } from 'vue-router'

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
  },
  {
    path: '/itemBuy/buyNow',
    name: 'BuyNow',
    component: () => import('@/components/ItemBuy/BuyNow')
  },
  {
    path: '/itemBuy/payComplete',
    name: 'PayComplete',
    component: () => import('@/components/ItemBuy/PayComplete')
  }
]

export const router = createRouter({
  history: createWebHistory(),
  routes
})
