
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ReceiptComplainmentManager from "./components/listers/ReceiptComplainmentCards"
import ReceiptComplainmentDetail from "./components/listers/ReceiptComplainmentDetail"

import PaymentFeeManager from "./components/listers/PaymentFeeCards"
import PaymentFeeDetail from "./components/listers/PaymentFeeDetail"

import UserUserManager from "./components/listers/UserUserCards"
import UserUserDetail from "./components/listers/UserUserDetail"

import SearchSearchEngineManager from "./components/listers/SearchSearchEngineCards"
import SearchSearchEngineDetail from "./components/listers/SearchSearchEngineDetail"

import 통계StarSchemeManager from "./components/listers/통계StarSchemeCards"
import 통계StarSchemeDetail from "./components/listers/통계StarSchemeDetail"

import 연계연계Manager from "./components/listers/연계연계Cards"
import 연계연계Detail from "./components/listers/연계연계Detail"

import 주문주문Manager from "./components/listers/주문주문Cards"
import 주문주문Detail from "./components/listers/주문주문Detail"

import 게시판게시물Manager from "./components/listers/게시판게시물Cards"
import 게시판게시물Detail from "./components/listers/게시판게시물Detail"
import 게시판댓글Manager from "./components/listers/게시판댓글Cards"
import 게시판댓글Detail from "./components/listers/게시판댓글Detail"

import 게시판2게시물Manager from "./components/listers/게시판2게시물Cards"
import 게시판2게시물Detail from "./components/listers/게시판2게시물Detail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/receipts/complainments',
                name: 'ReceiptComplainmentManager',
                component: ReceiptComplainmentManager
            },
            {
                path: '/receipts/complainments/:id',
                name: 'ReceiptComplainmentDetail',
                component: ReceiptComplainmentDetail
            },

            {
                path: '/payments/fees',
                name: 'PaymentFeeManager',
                component: PaymentFeeManager
            },
            {
                path: '/payments/fees/:id',
                name: 'PaymentFeeDetail',
                component: PaymentFeeDetail
            },

            {
                path: '/users/users',
                name: 'UserUserManager',
                component: UserUserManager
            },
            {
                path: '/users/users/:id',
                name: 'UserUserDetail',
                component: UserUserDetail
            },

            {
                path: '/searches/searchEngines',
                name: 'SearchSearchEngineManager',
                component: SearchSearchEngineManager
            },
            {
                path: '/searches/searchEngines/:id',
                name: 'SearchSearchEngineDetail',
                component: SearchSearchEngineDetail
            },

            {
                path: '/통계/starSchemes',
                name: '통계StarSchemeManager',
                component: 통계StarSchemeManager
            },
            {
                path: '/통계/starSchemes/:id',
                name: '통계StarSchemeDetail',
                component: 통계StarSchemeDetail
            },

            {
                path: '/연계/연계',
                name: '연계연계Manager',
                component: 연계연계Manager
            },
            {
                path: '/연계/연계/:id',
                name: '연계연계Detail',
                component: 연계연계Detail
            },

            {
                path: '/주문/주문',
                name: '주문주문Manager',
                component: 주문주문Manager
            },
            {
                path: '/주문/주문/:id',
                name: '주문주문Detail',
                component: 주문주문Detail
            },

            {
                path: '/게시판/게시물',
                name: '게시판게시물Manager',
                component: 게시판게시물Manager
            },
            {
                path: '/게시판/게시물/:id',
                name: '게시판게시물Detail',
                component: 게시판게시물Detail
            },
            {
                path: '/게시판/댓글',
                name: '게시판댓글Manager',
                component: 게시판댓글Manager
            },
            {
                path: '/게시판/댓글/:id',
                name: '게시판댓글Detail',
                component: 게시판댓글Detail
            },

            {
                path: '/게시판2s/게시물',
                name: '게시판2게시물Manager',
                component: 게시판2게시물Manager
            },
            {
                path: '/게시판2s/게시물/:id',
                name: '게시판2게시물Detail',
                component: 게시판2게시물Detail
            },



    ]
})
