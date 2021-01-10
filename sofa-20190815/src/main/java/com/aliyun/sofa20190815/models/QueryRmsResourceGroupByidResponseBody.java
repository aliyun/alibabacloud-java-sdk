// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsResourceGroupByidResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsResourceGroupByidResponseBodyResponse response;

    public static QueryRmsResourceGroupByidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsResourceGroupByidResponseBody self = new QueryRmsResourceGroupByidResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsResourceGroupByidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsResourceGroupByidResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsResourceGroupByidResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsResourceGroupByidResponseBody setResponse(QueryRmsResourceGroupByidResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsResourceGroupByidResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsResourceGroupByidResponseBodyResponseDataEntryRes extends TeaModel {
        @NameInMap("ResId")
        public String resId;

        @NameInMap("ResName")
        public String resName;

        public static QueryRmsResourceGroupByidResponseBodyResponseDataEntryRes build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourceGroupByidResponseBodyResponseDataEntryRes self = new QueryRmsResourceGroupByidResponseBodyResponseDataEntryRes();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourceGroupByidResponseBodyResponseDataEntryRes setResId(String resId) {
            this.resId = resId;
            return this;
        }
        public String getResId() {
            return this.resId;
        }

        public QueryRmsResourceGroupByidResponseBodyResponseDataEntryRes setResName(String resName) {
            this.resName = resName;
            return this;
        }
        public String getResName() {
            return this.resName;
        }

    }

    public static class QueryRmsResourceGroupByidResponseBodyResponseDataLabels extends TeaModel {
        @NameInMap("ResId")
        public String resId;

        @NameInMap("ResName")
        public String resName;

        public static QueryRmsResourceGroupByidResponseBodyResponseDataLabels build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourceGroupByidResponseBodyResponseDataLabels self = new QueryRmsResourceGroupByidResponseBodyResponseDataLabels();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourceGroupByidResponseBodyResponseDataLabels setResId(String resId) {
            this.resId = resId;
            return this;
        }
        public String getResId() {
            return this.resId;
        }

        public QueryRmsResourceGroupByidResponseBodyResponseDataLabels setResName(String resName) {
            this.resName = resName;
            return this;
        }
        public String getResName() {
            return this.resName;
        }

    }

    public static class QueryRmsResourceGroupByidResponseBodyResponseData extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupType")
        public String groupType;

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

        @NameInMap("EntryRes")
        public java.util.List<QueryRmsResourceGroupByidResponseBodyResponseDataEntryRes> entryRes;

        @NameInMap("Labels")
        public java.util.List<QueryRmsResourceGroupByidResponseBodyResponseDataLabels> labels;

        public static QueryRmsResourceGroupByidResponseBodyResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourceGroupByidResponseBodyResponseData self = new QueryRmsResourceGroupByidResponseBodyResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourceGroupByidResponseBodyResponseData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryRmsResourceGroupByidResponseBodyResponseData setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public QueryRmsResourceGroupByidResponseBodyResponseData setOriginType(String originType) {
            this.originType = originType;
            return this;
        }
        public String getOriginType() {
            return this.originType;
        }

        public QueryRmsResourceGroupByidResponseBodyResponseData setResType(String resType) {
            this.resType = resType;
            return this;
        }
        public String getResType() {
            return this.resType;
        }

        public QueryRmsResourceGroupByidResponseBodyResponseData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryRmsResourceGroupByidResponseBodyResponseData setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

        public QueryRmsResourceGroupByidResponseBodyResponseData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryRmsResourceGroupByidResponseBodyResponseData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryRmsResourceGroupByidResponseBodyResponseData setEntryRes(java.util.List<QueryRmsResourceGroupByidResponseBodyResponseDataEntryRes> entryRes) {
            this.entryRes = entryRes;
            return this;
        }
        public java.util.List<QueryRmsResourceGroupByidResponseBodyResponseDataEntryRes> getEntryRes() {
            return this.entryRes;
        }

        public QueryRmsResourceGroupByidResponseBodyResponseData setLabels(java.util.List<QueryRmsResourceGroupByidResponseBodyResponseDataLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<QueryRmsResourceGroupByidResponseBodyResponseDataLabels> getLabels() {
            return this.labels;
        }

    }

    public static class QueryRmsResourceGroupByidResponseBodyResponse extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Data")
        public QueryRmsResourceGroupByidResponseBodyResponseData data;

        public static QueryRmsResourceGroupByidResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourceGroupByidResponseBodyResponse self = new QueryRmsResourceGroupByidResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourceGroupByidResponseBodyResponse setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public QueryRmsResourceGroupByidResponseBodyResponse setData(QueryRmsResourceGroupByidResponseBodyResponseData data) {
            this.data = data;
            return this;
        }
        public QueryRmsResourceGroupByidResponseBodyResponseData getData() {
            return this.data;
        }

    }

}
