<template>
  <div class="test">
    <button @click="button">Click</button>
    <h1>{{memberName}}</h1>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'HelloWorld',
  data () {
    return {
      memberName: ''
    }
  },
  methods: {
    button () {
      axios.get('http://localhost:8090/api/shop')
        .then(response => {
          this.memberName = response.data
          return alert(this.memberName)
        })
        .catch(function (ex) {
          console.log('button fail', ex)
        })
    }
  }
}
</script>

<style scoped>
  .test{height: 200px}
</style>
