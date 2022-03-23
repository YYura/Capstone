<template>
  <div>
    <header>
      <h1><a href="#" class="logo"><img alt="Vue logo" src="../../assets/logo.png" style="width: 80px">Camping Planner</a></h1>
      <div class="menuWrap">
        <ul class="menu">
          <li><router-link to ="/itemBuy">Item Buy</router-link></li>
          <li><a href="">메뉴2</a></li>
          <li><a href="">메뉴3</a></li>
          <li><a href="">메뉴4</a></li>
        </ul>
      </div>
    </header>
  </div>
</template>

<script>
export default {

}
</script>

<style scoped>
header{width:100%; text-align:center; display: flex; position:relative; height:120px; border-bottom:1px solid #35495e}
header h1{position:absolute; top:0; left:100px;}
header ul.menu:after{display:block; clear:both; content:'';}
header ul.menu{position:absolute; top:20px; right:50px;}
header ul.menu li{float:left; padding:10px 20px; list-style:none;}

a{text-decoration:none; color:#333;}
</style>
