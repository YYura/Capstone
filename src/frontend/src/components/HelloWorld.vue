<template>
  <div class="main">
    <div class="main-event-image-bar">
      <div id="carouselExampleDark" class="carousel carousel-dark slide" data-bs-ride="carousel">
        <div class="carousel-indicators">
          <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
          <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="1" aria-label="Slide 2"></button>
          <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="2" aria-label="Slide 3"></button>
        </div>
        <div class="carousel-inner">
          <div class="carousel-item active" data-bs-interval="4000">
            <img :src="require('@/assets/camp1.jpg')" class="d-block w-100" alt="...">
          </div>
          <div class="carousel-item" data-bs-interval="4000">
            <img :src="require('@/assets/camp2.jpg')" class="d-block w-100" alt="...">
          </div>
          <div class="carousel-item">
            <img :src="require('@/assets/camp3.jpg')" class="d-block w-100" alt="...">
          </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Next</span>
        </button>
      </div>
    </div>
  </div>
</template>

<script>

export default {
  name: 'Main'
}
</script>

<style scoped>
.main{
  width: 100%;
  height: 100%;
  text-align: center;
  flex-flow: row;
}
.main .main-event-image-bar{
  margin-top: 5%;
  width: 50%;
  height: 40%;
  display: inline-block;
  overflow: hidden;
  flex-flow: row;
}
.main-event-image-bar .d-block{
  width: 100%;
  height: 470px;
  box-sizing: border-box;
  object-fit: cover;
}

</style>
