// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListGWApiGroupAuthUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public ListGWApiGroupAuthUserResponseBodyData data;

    public static ListGWApiGroupAuthUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGWApiGroupAuthUserResponseBody self = new ListGWApiGroupAuthUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGWApiGroupAuthUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGWApiGroupAuthUserResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListGWApiGroupAuthUserResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListGWApiGroupAuthUserResponseBody setData(ListGWApiGroupAuthUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGWApiGroupAuthUserResponseBodyData getData() {
        return this.data;
    }

    public static class ListGWApiGroupAuthUserResponseBodyDataList extends TeaModel {
        @NameInMap("ApiGroupId")
        public String apiGroupId;

        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("AuthStatus")
        public String authStatus;

        @NameInMap("AuthUserId")
        public String authUserId;

        @NameInMap("CanAuth")
        public Boolean canAuth;

        @NameInMap("Customer")
        public String customer;

        @NameInMap("Email")
        public String email;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("WorkNo")
        public String workNo;

        public static ListGWApiGroupAuthUserResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupAuthUserResponseBodyDataList self = new ListGWApiGroupAuthUserResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupAuthUserResponseBodyDataList setApiGroupId(String apiGroupId) {
            this.apiGroupId = apiGroupId;
            return this;
        }
        public String getApiGroupId() {
            return this.apiGroupId;
        }

        public ListGWApiGroupAuthUserResponseBodyDataList setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWApiGroupAuthUserResponseBodyDataList setAuthStatus(String authStatus) {
            this.authStatus = authStatus;
            return this;
        }
        public String getAuthStatus() {
            return this.authStatus;
        }

        public ListGWApiGroupAuthUserResponseBodyDataList setAuthUserId(String authUserId) {
            this.authUserId = authUserId;
            return this;
        }
        public String getAuthUserId() {
            return this.authUserId;
        }

        public ListGWApiGroupAuthUserResponseBodyDataList setCanAuth(Boolean canAuth) {
            this.canAuth = canAuth;
            return this;
        }
        public Boolean getCanAuth() {
            return this.canAuth;
        }

        public ListGWApiGroupAuthUserResponseBodyDataList setCustomer(String customer) {
            this.customer = customer;
            return this;
        }
        public String getCustomer() {
            return this.customer;
        }

        public ListGWApiGroupAuthUserResponseBodyDataList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListGWApiGroupAuthUserResponseBodyDataList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiGroupAuthUserResponseBodyDataList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiGroupAuthUserResponseBodyDataList setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListGWApiGroupAuthUserResponseBodyDataList setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListGWApiGroupAuthUserResponseBodyDataList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListGWApiGroupAuthUserResponseBodyDataList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiGroupAuthUserResponseBodyDataList setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public ListGWApiGroupAuthUserResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListGWApiGroupAuthUserResponseBodyDataList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiGroupAuthUserResponseBodyDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListGWApiGroupAuthUserResponseBodyDataList setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiGroupAuthUserResponseBodyDataList setWorkNo(String workNo) {
            this.workNo = workNo;
            return this;
        }
        public String getWorkNo() {
            return this.workNo;
        }

    }

    public static class ListGWApiGroupAuthUserResponseBodyDataPageInfoOrderInfos extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Order")
        public String order;

        public static ListGWApiGroupAuthUserResponseBodyDataPageInfoOrderInfos build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupAuthUserResponseBodyDataPageInfoOrderInfos self = new ListGWApiGroupAuthUserResponseBodyDataPageInfoOrderInfos();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupAuthUserResponseBodyDataPageInfoOrderInfos setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListGWApiGroupAuthUserResponseBodyDataPageInfoOrderInfos setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

    }

    public static class ListGWApiGroupAuthUserResponseBodyDataPageInfo extends TeaModel {
        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("OrderInfos")
        public java.util.List<ListGWApiGroupAuthUserResponseBodyDataPageInfoOrderInfos> orderInfos;

        public static ListGWApiGroupAuthUserResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupAuthUserResponseBodyDataPageInfo self = new ListGWApiGroupAuthUserResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupAuthUserResponseBodyDataPageInfo setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public ListGWApiGroupAuthUserResponseBodyDataPageInfo setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListGWApiGroupAuthUserResponseBodyDataPageInfo setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListGWApiGroupAuthUserResponseBodyDataPageInfo setOrderInfos(java.util.List<ListGWApiGroupAuthUserResponseBodyDataPageInfoOrderInfos> orderInfos) {
            this.orderInfos = orderInfos;
            return this;
        }
        public java.util.List<ListGWApiGroupAuthUserResponseBodyDataPageInfoOrderInfos> getOrderInfos() {
            return this.orderInfos;
        }

    }

    public static class ListGWApiGroupAuthUserResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListGWApiGroupAuthUserResponseBodyDataList> list;

        @NameInMap("PageInfo")
        public ListGWApiGroupAuthUserResponseBodyDataPageInfo pageInfo;

        public static ListGWApiGroupAuthUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupAuthUserResponseBodyData self = new ListGWApiGroupAuthUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupAuthUserResponseBodyData setList(java.util.List<ListGWApiGroupAuthUserResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListGWApiGroupAuthUserResponseBodyDataList> getList() {
            return this.list;
        }

        public ListGWApiGroupAuthUserResponseBodyData setPageInfo(ListGWApiGroupAuthUserResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public ListGWApiGroupAuthUserResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

    }

}
