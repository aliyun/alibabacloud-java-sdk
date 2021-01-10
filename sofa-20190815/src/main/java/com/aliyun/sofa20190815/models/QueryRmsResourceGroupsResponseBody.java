// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsResourceGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsResourceGroupsResponseBodyResponse response;

    public static QueryRmsResourceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsResourceGroupsResponseBody self = new QueryRmsResourceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsResourceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsResourceGroupsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsResourceGroupsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsResourceGroupsResponseBody setResponse(QueryRmsResourceGroupsResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsResourceGroupsResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsResourceGroupsResponseBodyResponseDataLables extends TeaModel {
        @NameInMap("ResId")
        public String resId;

        @NameInMap("ResName")
        public String resName;

        public static QueryRmsResourceGroupsResponseBodyResponseDataLables build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourceGroupsResponseBodyResponseDataLables self = new QueryRmsResourceGroupsResponseBodyResponseDataLables();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourceGroupsResponseBodyResponseDataLables setResId(String resId) {
            this.resId = resId;
            return this;
        }
        public String getResId() {
            return this.resId;
        }

        public QueryRmsResourceGroupsResponseBodyResponseDataLables setResName(String resName) {
            this.resName = resName;
            return this;
        }
        public String getResName() {
            return this.resName;
        }

    }

    public static class QueryRmsResourceGroupsResponseBodyResponseData extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupType")
        public String groupType;

        @NameInMap("Id")
        public String id;

        @NameInMap("OriginType")
        public String originType;

        @NameInMap("ResType")
        public String resType;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UtcCreated")
        public String utcCreated;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("ItemTypeAlerting")
        public java.util.List<String> itemTypeAlerting;

        @NameInMap("ItemTypeConfigured")
        public java.util.List<String> itemTypeConfigured;

        @NameInMap("Lables")
        public java.util.List<QueryRmsResourceGroupsResponseBodyResponseDataLables> lables;

        public static QueryRmsResourceGroupsResponseBodyResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourceGroupsResponseBodyResponseData self = new QueryRmsResourceGroupsResponseBodyResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourceGroupsResponseBodyResponseData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryRmsResourceGroupsResponseBodyResponseData setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public QueryRmsResourceGroupsResponseBodyResponseData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryRmsResourceGroupsResponseBodyResponseData setOriginType(String originType) {
            this.originType = originType;
            return this;
        }
        public String getOriginType() {
            return this.originType;
        }

        public QueryRmsResourceGroupsResponseBodyResponseData setResType(String resType) {
            this.resType = resType;
            return this;
        }
        public String getResType() {
            return this.resType;
        }

        public QueryRmsResourceGroupsResponseBodyResponseData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryRmsResourceGroupsResponseBodyResponseData setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

        public QueryRmsResourceGroupsResponseBodyResponseData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryRmsResourceGroupsResponseBodyResponseData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryRmsResourceGroupsResponseBodyResponseData setItemTypeAlerting(java.util.List<String> itemTypeAlerting) {
            this.itemTypeAlerting = itemTypeAlerting;
            return this;
        }
        public java.util.List<String> getItemTypeAlerting() {
            return this.itemTypeAlerting;
        }

        public QueryRmsResourceGroupsResponseBodyResponseData setItemTypeConfigured(java.util.List<String> itemTypeConfigured) {
            this.itemTypeConfigured = itemTypeConfigured;
            return this;
        }
        public java.util.List<String> getItemTypeConfigured() {
            return this.itemTypeConfigured;
        }

        public QueryRmsResourceGroupsResponseBodyResponseData setLables(java.util.List<QueryRmsResourceGroupsResponseBodyResponseDataLables> lables) {
            this.lables = lables;
            return this;
        }
        public java.util.List<QueryRmsResourceGroupsResponseBodyResponseDataLables> getLables() {
            return this.lables;
        }

    }

    public static class QueryRmsResourceGroupsResponseBodyResponse extends TeaModel {
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalSize")
        public Long totalSize;

        @NameInMap("Data")
        public java.util.List<QueryRmsResourceGroupsResponseBodyResponseData> data;

        public static QueryRmsResourceGroupsResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourceGroupsResponseBodyResponse self = new QueryRmsResourceGroupsResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourceGroupsResponseBodyResponse setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryRmsResourceGroupsResponseBodyResponse setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryRmsResourceGroupsResponseBodyResponse setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

        public QueryRmsResourceGroupsResponseBodyResponse setData(java.util.List<QueryRmsResourceGroupsResponseBodyResponseData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryRmsResourceGroupsResponseBodyResponseData> getData() {
            return this.data;
        }

    }

}
