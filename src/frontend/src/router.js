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
    path: '/itemBuy/buyComplete',
    name: 'BuyComplete',
    component: () => import('@/components/ItemBuy/BuyComplete')
  },
  {
    path: '/itemShare',
    name: 'ShareList',
    component: () => import('@/components/ItemShare/ShareList')
  },
  {
    path: '/itemShare/shareNow',
    name: 'ShareNow',
    component: () => import('@/components/ItemShare/ShareNow')
  },
  {
    path: '/itemBuy/shareComplete',
    name: 'shareComplete',
    component: () => import('@/components/ItemShare/ShareComplete')
  },
  {
    path: '/infoter',
    name: 'InfoterList',
    component: () => import('@/components/Infoter/InfoterList')
  },
  {
    path: '/infoter/infoterNow',
    name: 'InfoterNow',
    component: () => import('@/components/Infoter/InfoterNow')
  }

]

export const router = createRouter({
  history: createWebHistory(),
  routes
})
