// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListGWApiGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public ListGWApiGroupResponseBodyData data;

    public static ListGWApiGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGWApiGroupResponseBody self = new ListGWApiGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGWApiGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGWApiGroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListGWApiGroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListGWApiGroupResponseBody setData(ListGWApiGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGWApiGroupResponseBodyData getData() {
        return this.data;
    }

    public static class ListGWApiGroupResponseBodyDataList extends TeaModel {
        @NameInMap("ApiCount")
        public Long apiCount;

        @NameInMap("ApiGroupId")
        public String apiGroupId;

        @NameInMap("AuthUserSwitch")
        public String authUserSwitch;

        @NameInMap("CanDelete")
        public Boolean canDelete;

        @NameInMap("CanOperate")
        public Boolean canOperate;

        @NameInMap("Description")
        public String description;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("NeedApiAuthUser")
        public Boolean needApiAuthUser;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListGWApiGroupResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupResponseBodyDataList self = new ListGWApiGroupResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupResponseBodyDataList setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWApiGroupResponseBodyDataList setApiGroupId(String apiGroupId) {
            this.apiGroupId = apiGroupId;
            return this;
        }
        public String getApiGroupId() {
            return this.apiGroupId;
        }

        public ListGWApiGroupResponseBodyDataList setAuthUserSwitch(String authUserSwitch) {
            this.authUserSwitch = authUserSwitch;
            return this;
        }
        public String getAuthUserSwitch() {
            return this.authUserSwitch;
        }

        public ListGWApiGroupResponseBodyDataList setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWApiGroupResponseBodyDataList setCanOperate(Boolean canOperate) {
            this.canOperate = canOperate;
            return this;
        }
        public Boolean getCanOperate() {
            return this.canOperate;
        }

        public ListGWApiGroupResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiGroupResponseBodyDataList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListGWApiGroupResponseBodyDataList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiGroupResponseBodyDataList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiGroupResponseBodyDataList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListGWApiGroupResponseBodyDataList setNeedApiAuthUser(Boolean needApiAuthUser) {
            this.needApiAuthUser = needApiAuthUser;
            return this;
        }
        public Boolean getNeedApiAuthUser() {
            return this.needApiAuthUser;
        }

        public ListGWApiGroupResponseBodyDataList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiGroupResponseBodyDataList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiGroupResponseBodyDataList setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class ListGWApiGroupResponseBodyDataPageInfoOrderInfos extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Order")
        public String order;

        public static ListGWApiGroupResponseBodyDataPageInfoOrderInfos build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupResponseBodyDataPageInfoOrderInfos self = new ListGWApiGroupResponseBodyDataPageInfoOrderInfos();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupResponseBodyDataPageInfoOrderInfos setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListGWApiGroupResponseBodyDataPageInfoOrderInfos setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

    }

    public static class ListGWApiGroupResponseBodyDataPageInfo extends TeaModel {
        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("OrderInfos")
        public java.util.List<ListGWApiGroupResponseBodyDataPageInfoOrderInfos> orderInfos;

        public static ListGWApiGroupResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupResponseBodyDataPageInfo self = new ListGWApiGroupResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupResponseBodyDataPageInfo setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public ListGWApiGroupResponseBodyDataPageInfo setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListGWApiGroupResponseBodyDataPageInfo setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListGWApiGroupResponseBodyDataPageInfo setOrderInfos(java.util.List<ListGWApiGroupResponseBodyDataPageInfoOrderInfos> orderInfos) {
            this.orderInfos = orderInfos;
            return this;
        }
        public java.util.List<ListGWApiGroupResponseBodyDataPageInfoOrderInfos> getOrderInfos() {
            return this.orderInfos;
        }

    }

    public static class ListGWApiGroupResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListGWApiGroupResponseBodyDataList> list;

        @NameInMap("PageInfo")
        public ListGWApiGroupResponseBodyDataPageInfo pageInfo;

        public static ListGWApiGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupResponseBodyData self = new ListGWApiGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupResponseBodyData setList(java.util.List<ListGWApiGroupResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListGWApiGroupResponseBodyDataList> getList() {
            return this.list;
        }

        public ListGWApiGroupResponseBodyData setPageInfo(ListGWApiGroupResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public ListGWApiGroupResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

    }

}
