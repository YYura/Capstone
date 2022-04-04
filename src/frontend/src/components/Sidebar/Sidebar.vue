<template>
  <div class="sidebar" :style="{ width: sidebarWidth}">
    <h1>
      <span v-if="collapsed">
        <div>V</div>
        <div>S</div>
      </span>
      <span v-else>Vue Sidebar</span>
    </h1>

    <SidebarLink icon="" to="/">Home</SidebarLink>
    <SidebarLink icon="" to="/">Home</SidebarLink>
    <SidebarLink icon="" to="/">Home</SidebarLink>
    <SidebarLink icon="" to="/">Home</SidebarLink>
    <SidebarLink icon="" to="/">Home</SidebarLink>
    <SidebarLink icon="" to="/">Home</SidebarLink>
    <SidebarLink icon="" to="/">Home</SidebarLink>
    <SidebarLink icon="" to="/">Home</SidebarLink>
    <SidebarLink icon="" to="/">Home</SidebarLink>
    <SidebarLink icon="" to="/">Home</SidebarLink>
    <SidebarLink icon="" to="/">Home</SidebarLink>
    <SidebarLink icon="" to="/">Home</SidebarLink>
    <SidebarLink icon="" to="/">Home</SidebarLink>
    <SidebarLink icon="" to="/">Home</SidebarLink>
    <SidebarLink icon="" to="/">Home</SidebarLink>
    <SidebarLink icon="" to="/">Home</SidebarLink>

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
  --sidebar-bg-color: #2f855a;
  --sidebar-item-hover: #38a169;
  --sidebar-item-active: #276749;
}
</style>

<style scoped>
.sidebar {
  color: white;
  background-color: var(--sidebar-bg-color);

  float: left;
  z-index: 1;
  margin: 0;
  height: 1305px;
  left: 0;
  bottom: 0;
  padding: 0.5em;

  transition: 0.3s ease;

  display: flex;
  flex-direction: column;
}

.collapse-icon{
  position: absolute;
  bottom: 0;
  padding: 0.75em;

  color: rgba(255, 255, 255, 0.7);

  transition: 0.2s linear;
}
.rotate-180 {
  transform: rotate(180deg);
  transition: 0.2s linear;
}
</style>
