// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import axios from 'axios'
// axios.defaults.baseURL = 'http://127.0.0.1:9080';
// axios.defaults.timeout = 5000;
Vue.prototype.$http = axios;
Vue.use(axios);
// Vue.prototype.axios = axios;

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
