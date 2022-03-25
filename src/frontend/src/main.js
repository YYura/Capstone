import { createApp } from 'vue'
import App from './App.vue'
import { router } from './router'
import axios from 'axios'

import 'bootstrap/dist/css/bootstrap.css'

import '@fortawesome/fontawesome-free'

import 'bootstrap/dist/js/bootstrap.js'

axios.defaults.headers.common['Access-Control_Allow-Origin'] = '*'
axios.defaults.headers.get['Content-Type'] = 'application/json;charset=utf-8'

const app = createApp(App)
app.use(router)
app.mount('#app')
app.config.globalProperties.axios = axios
