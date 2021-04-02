<template>
  <div>
    <h5>登录后的页面</h5>
    <div>用户名：{{user.loginId}}</div>
    <div>密码：{{user.password}}</div>
  </div>
</template>

<script>
export default {
  data () {
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
