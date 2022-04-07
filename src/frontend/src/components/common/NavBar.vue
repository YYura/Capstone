<template>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <router-link class="nav-link" to="/">캠핑플랜</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" to="/infoter">인포터</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" to="/itemBuy">Item Buy</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" to="/itemShare">Item Share</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" to="/itemShare">보관함</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" to="/">캠프파이어</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" to="/">고객센터</router-link>
          </li>
        </ul>
        <form class="d-flex">
          <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-success" type="submit">Search</button>
        </form>
      </div>
    </div>
  </nav>
</template>

<script>
export default {
  name: 'NavBar.vue'
}
</script>

<style scoped>
.d-flex{
  color: #b2e2fd;
}
.btn{
  border-color: #009fff;
  color: #00a3de;
}
.btn:hover{
  border-color: #009fff;
  background-color: #b2e2fd;
}
</style>
