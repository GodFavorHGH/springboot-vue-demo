<template>
  <div>登录后的页面</div>
  <div>{{this.user.name}}</div>
</template>

<script>
export default {
  data () {
    debugger
    return {
      user: this.$route.params,
    }
  },
  name: 'Home',
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
