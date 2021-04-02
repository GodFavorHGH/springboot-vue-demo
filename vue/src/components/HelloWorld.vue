<template>
  <form id="form">
    <ul>
      <li>
        <em>登陆用户：</em>
        <input v-model="formData.loginId" type="text">
      </li><br>
      <li>
        <em>登陆密码：</em>
        <input v-model="formData.password" type="password">
      </li><br>
      <li>
        <input type="button" value="get方式" @click="doGet">
        <input type="button" value="post方式" @click="doPost">
      </li>
    </ul>
  </form>
</template>

<script>
export default {
  data () {
    return {
      msg: '11Welcome to Your Vue.js App',
      formData: {
        loginId:'lzy',
        password:'lzy'
      }
    }
  },
  name: 'HelloWorld',
  methods :{
    doGet(){
      this.$http.get('http://127.0.0.1:9080/login/get?'+'loginId='+this.formData.loginId+'&'+'password='+this.formData.password).then(res=>{
        if (!!res.data){
          console.log(res.data)
          this.$router.push({name:'Home',params:res.data.data})
        }
      }).catch(function (error) {
        console.log(error);
      });
    },
    doPost(){
      this.$http.post('http://127.0.0.1:9080/login/post', this.formData).then(res=>{
        if (!!res.data && res.data.code == 200){
          console.log(res.data)
          this.$router.push({name:'Home',params:res.data.data})
        }
      }).catch(function (error) {
        console.log(error);
      });
    }
  }
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
