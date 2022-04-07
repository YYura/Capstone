<template>
  <div id="app">
    <Header />
    <NavBar />
    <router-view />
    <Footer />
  </div>
</template>

<script>
import Header from '@/components/common/Header'
import Footer from '@/components/common/Footer'
import NavBar from '@/components/common/NavBar'

export default {
  name: 'App',
  components: {
    Header,
    NavBar,
    Footer
  }
}
</script>

<style>
html,body{
  padding: 0;
  margin: 0;
}
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
  padding: 0; margin: 0;
}
</style>
