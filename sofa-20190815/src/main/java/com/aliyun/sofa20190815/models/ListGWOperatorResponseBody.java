// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListGWOperatorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public ListGWOperatorResponseBodyData data;

    public static ListGWOperatorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGWOperatorResponseBody self = new ListGWOperatorResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGWOperatorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGWOperatorResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListGWOperatorResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListGWOperatorResponseBody setData(ListGWOperatorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGWOperatorResponseBodyData getData() {
        return this.data;
    }

    public static class ListGWOperatorResponseBodyDataList extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Customer")
        public String customer;

        @NameInMap("Email")
        public String email;

        @NameInMap("Id")
        public String id;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("WorkNo")
        public String workNo;

        @NameInMap("Tenants")
        public java.util.List<String> tenants;

        public static ListGWOperatorResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListGWOperatorResponseBodyDataList self = new ListGWOperatorResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListGWOperatorResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListGWOperatorResponseBodyDataList setCustomer(String customer) {
            this.customer = customer;
            return this;
        }
        public String getCustomer() {
            return this.customer;
        }

        public ListGWOperatorResponseBodyDataList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListGWOperatorResponseBodyDataList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListGWOperatorResponseBodyDataList setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListGWOperatorResponseBodyDataList setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListGWOperatorResponseBodyDataList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListGWOperatorResponseBodyDataList setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public ListGWOperatorResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListGWOperatorResponseBodyDataList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWOperatorResponseBodyDataList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListGWOperatorResponseBodyDataList setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWOperatorResponseBodyDataList setWorkNo(String workNo) {
            this.workNo = workNo;
            return this;
        }
        public String getWorkNo() {
            return this.workNo;
        }

        public ListGWOperatorResponseBodyDataList setTenants(java.util.List<String> tenants) {
            this.tenants = tenants;
            return this;
        }
        public java.util.List<String> getTenants() {
            return this.tenants;
        }

    }

    public static class ListGWOperatorResponseBodyDataPageInfoOrderInfos extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Order")
        public String order;

        public static ListGWOperatorResponseBodyDataPageInfoOrderInfos build(java.util.Map<String, ?> map) throws Exception {
            ListGWOperatorResponseBodyDataPageInfoOrderInfos self = new ListGWOperatorResponseBodyDataPageInfoOrderInfos();
            return TeaModel.build(map, self);
        }

        public ListGWOperatorResponseBodyDataPageInfoOrderInfos setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListGWOperatorResponseBodyDataPageInfoOrderInfos setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

    }

    public static class ListGWOperatorResponseBodyDataPageInfo extends TeaModel {
        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("OrderInfos")
        public java.util.List<ListGWOperatorResponseBodyDataPageInfoOrderInfos> orderInfos;

        public static ListGWOperatorResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListGWOperatorResponseBodyDataPageInfo self = new ListGWOperatorResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public ListGWOperatorResponseBodyDataPageInfo setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public ListGWOperatorResponseBodyDataPageInfo setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListGWOperatorResponseBodyDataPageInfo setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListGWOperatorResponseBodyDataPageInfo setOrderInfos(java.util.List<ListGWOperatorResponseBodyDataPageInfoOrderInfos> orderInfos) {
            this.orderInfos = orderInfos;
            return this;
        }
        public java.util.List<ListGWOperatorResponseBodyDataPageInfoOrderInfos> getOrderInfos() {
            return this.orderInfos;
        }

    }

    public static class ListGWOperatorResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListGWOperatorResponseBodyDataList> list;

        @NameInMap("PageInfo")
        public ListGWOperatorResponseBodyDataPageInfo pageInfo;

        public static ListGWOperatorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGWOperatorResponseBodyData self = new ListGWOperatorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGWOperatorResponseBodyData setList(java.util.List<ListGWOperatorResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListGWOperatorResponseBodyDataList> getList() {
            return this.list;
        }

        public ListGWOperatorResponseBodyData setPageInfo(ListGWOperatorResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public ListGWOperatorResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

    }

}
