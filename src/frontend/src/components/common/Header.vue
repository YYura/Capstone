<template>
  <div class="header-info">
    <header>
      <h1 class="header-name"><a href="/" class="header-name-link"><img :src="require('@/assets/campingLogo.jpg')" alt="...">Camping Planner</a></h1>
      <a class="header-signup-link" href="/signup">회원가입</a>
      <a class="header-login-link" href="/login">로그인</a>
    </header>
  </div>
</template>

<script>
export default {

}
</script>

<style scoped>
header{
  width:100%;
  position:relative;
  height:100%;
  border-bottom:1px solid #35495e;
  text-align: center;
}
header img{
  width: 5%;
  height: 5%;
}

.header-name{
  margin-top: 3%;
  margin-bottom: 3%;
}

.header-name-link{
  text-decoration:none;
  color: black;
  margin-top: 3%;
}
.header-name-link:hover{
  color: cadetblue;
}

.header-login-link{
  text-decoration: none;
  color: black;
  position: absolute;
  top: -30%;
  left: 87%;
}
.header-login-link:hover{
  color: cadetblue;
}
.header-signup-link{
  text-decoration: none;
  color: black;
  position: absolute;
  top: -30%;
  left: 80%;
}

</style>
