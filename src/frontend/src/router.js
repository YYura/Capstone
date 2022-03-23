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
  }
]

export const router = createRouter({
  history: createWebHistory(),
  routes
})
