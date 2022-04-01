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
  },
  {
    path: '/itemShare/shareNow',
    name: 'ShareNow',
    component: () => import('@/components/ItemShare/ShareNow')
  }

]

export const router = createRouter({
  history: createWebHistory(),
  routes
})
