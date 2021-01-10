// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCASUserRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("CustomerId")
    public String customerId;

    @NameInMap("Email")
    public String email;

    @NameInMap("Id")
    public String id;

    @NameInMap("IsLocaleEnabled")
    public Boolean isLocaleEnabled;

    @NameInMap("Local")
    public String local;

    @NameInMap("LoginName")
    public String loginName;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("OrdersRepeatList")
    public java.util.List<String> ordersRepeatList;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Paging")
    public Boolean paging;

    @NameInMap("QueryType")
    public String queryType;

    @NameInMap("RealName")
    public String realName;

    @NameInMap("Search")
    public Boolean search;

    @NameInMap("Type")
    public String type;

    @NameInMap("TypesRepeatList")
    public java.util.List<String> typesRepeatList;

    public static QueryCASUserRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCASUserRequest self = new QueryCASUserRequest();
        return TeaModel.build(map, self);
    }

    public QueryCASUserRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryCASUserRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public QueryCASUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public QueryCASUserRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryCASUserRequest setIsLocaleEnabled(Boolean isLocaleEnabled) {
        this.isLocaleEnabled = isLocaleEnabled;
        return this;
    }
    public Boolean getIsLocaleEnabled() {
        return this.isLocaleEnabled;
    }

    public QueryCASUserRequest setLocal(String local) {
        this.local = local;
        return this;
    }
    public String getLocal() {
        return this.local;
    }

    public QueryCASUserRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public QueryCASUserRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryCASUserRequest setOrdersRepeatList(java.util.List<String> ordersRepeatList) {
        this.ordersRepeatList = ordersRepeatList;
        return this;
    }
    public java.util.List<String> getOrdersRepeatList() {
        return this.ordersRepeatList;
    }

    public QueryCASUserRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCASUserRequest setPaging(Boolean paging) {
        this.paging = paging;
        return this;
    }
    public Boolean getPaging() {
        return this.paging;
    }

    public QueryCASUserRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public QueryCASUserRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public QueryCASUserRequest setSearch(Boolean search) {
        this.search = search;
        return this;
    }
    public Boolean getSearch() {
        return this.search;
    }

    public QueryCASUserRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryCASUserRequest setTypesRepeatList(java.util.List<String> typesRepeatList) {
        this.typesRepeatList = typesRepeatList;
        return this;
    }
    public java.util.List<String> getTypesRepeatList() {
        return this.typesRepeatList;
    }

}
