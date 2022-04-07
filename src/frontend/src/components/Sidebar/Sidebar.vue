<template>
  <div class="sidebar" :style="{ width: sidebarWidth }">
    <h1>
      <span v-if="collapsed">
        <div>C</div>
      </span>
      <span v-else >Category</span>
    </h1>

    <SidebarLink class="sidebar-link" icon="" to="/">Home</SidebarLink>
    <SidebarLink class="sidebar-link" icon="" to="/">Home</SidebarLink>
    <SidebarLink class="sidebar-link" icon="" to="/">Home</SidebarLink>
    <SidebarLink class="sidebar-link" icon="" to="/">Home</SidebarLink>
    <SidebarLink class="sidebar-link" icon="" to="/">Home</SidebarLink>
    <SidebarLink class="sidebar-link" icon="" to="/">Home</SidebarLink>
    <SidebarLink class="sidebar-link" icon="" to="/">Home</SidebarLink>
    <SidebarLink class="sidebar-link" icon="" to="/">Home</SidebarLink>
    <SidebarLink class="sidebar-link" icon="" to="/">Home</SidebarLink>
    <SidebarLink class="sidebar-link" icon="" to="/">Home</SidebarLink>
    <SidebarLink class="sidebar-link" icon="" to="/">Home</SidebarLink>
    <SidebarLink class="sidebar-link" icon="" to="/">Home</SidebarLink>

    <span
      class="collapse-icon"
        :class="{ 'rotate-180': collapsed }"
        @click="toggleSidebar">
          <i class='fas fa-angle-double-left'>  〈〈  </i>
    </span>
  </div>

</template>

<script>
import { collapsed, toggleSidebar, sidebarWidth } from '@/components/Sidebar/state'
import SidebarLink from '@/components/Sidebar/SidebarLink'

export default {
  name: 'Sidebar',
  props: {},
  components: { SidebarLink },
  setup () {
    return { collapsed, toggleSidebar, sidebarWidth }
  }
}
</script>

<style>

:root {
  --sidebar-bg-color: #e6f4ff;
  --sidebar-item-hover: #b2e2fd;
}
</style>

<style scoped>
.sidebar {
  color: black;
  background-color: var(--sidebar-bg-color);

  float: left;
  z-index: 1;
  /*margin: 0%;*/
  height: 100%;
  left: 0;
  bottom: 0;
  padding-bottom: 50%;
  margin-right: 3%;

  transition: 0.3s ease;

  display: flex;
  flex-direction: column;
}

.sidebar-link{
  color: black;
}

.collapse-icon{
  position: absolute;
  top: 70% ;
  padding: 0.75em;

  color: black;

  transition: 0.2s linear;
}
.rotate-180 {
  transform: rotate(180deg);
  transition: 0.2s linear;
}
</style>
