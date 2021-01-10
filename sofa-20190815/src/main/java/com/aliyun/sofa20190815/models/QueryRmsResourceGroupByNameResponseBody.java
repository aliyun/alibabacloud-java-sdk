// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsResourceGroupByNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Resopnse")
    public QueryRmsResourceGroupByNameResponseBodyResopnse resopnse;

    public static QueryRmsResourceGroupByNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsResourceGroupByNameResponseBody self = new QueryRmsResourceGroupByNameResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsResourceGroupByNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsResourceGroupByNameResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsResourceGroupByNameResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsResourceGroupByNameResponseBody setResopnse(QueryRmsResourceGroupByNameResponseBodyResopnse resopnse) {
        this.resopnse = resopnse;
        return this;
    }
    public QueryRmsResourceGroupByNameResponseBodyResopnse getResopnse() {
        return this.resopnse;
    }

    public static class QueryRmsResourceGroupByNameResponseBodyResopnseDataEntryRes extends TeaModel {
        @NameInMap("ResId")
        public String resId;

        @NameInMap("ResName")
        public String resName;

        public static QueryRmsResourceGroupByNameResponseBodyResopnseDataEntryRes build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourceGroupByNameResponseBodyResopnseDataEntryRes self = new QueryRmsResourceGroupByNameResponseBodyResopnseDataEntryRes();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourceGroupByNameResponseBodyResopnseDataEntryRes setResId(String resId) {
            this.resId = resId;
            return this;
        }
        public String getResId() {
            return this.resId;
        }

        public QueryRmsResourceGroupByNameResponseBodyResopnseDataEntryRes setResName(String resName) {
            this.resName = resName;
            return this;
        }
        public String getResName() {
            return this.resName;
        }

    }

    public static class QueryRmsResourceGroupByNameResponseBodyResopnseDataLabels extends TeaModel {
        @NameInMap("ResId")
        public String resId;

        @NameInMap("ResName")
        public String resName;

        public static QueryRmsResourceGroupByNameResponseBodyResopnseDataLabels build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourceGroupByNameResponseBodyResopnseDataLabels self = new QueryRmsResourceGroupByNameResponseBodyResopnseDataLabels();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourceGroupByNameResponseBodyResopnseDataLabels setResId(String resId) {
            this.resId = resId;
            return this;
        }
        public String getResId() {
            return this.resId;
        }

        public QueryRmsResourceGroupByNameResponseBodyResopnseDataLabels setResName(String resName) {
            this.resName = resName;
            return this;
        }
        public String getResName() {
            return this.resName;
        }

    }

    public static class QueryRmsResourceGroupByNameResponseBodyResopnseData extends TeaModel {
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
        public java.util.List<QueryRmsResourceGroupByNameResponseBodyResopnseDataEntryRes> entryRes;

        @NameInMap("Labels")
        public java.util.List<QueryRmsResourceGroupByNameResponseBodyResopnseDataLabels> labels;

        public static QueryRmsResourceGroupByNameResponseBodyResopnseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourceGroupByNameResponseBodyResopnseData self = new QueryRmsResourceGroupByNameResponseBodyResopnseData();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourceGroupByNameResponseBodyResopnseData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryRmsResourceGroupByNameResponseBodyResopnseData setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public QueryRmsResourceGroupByNameResponseBodyResopnseData setOriginType(String originType) {
            this.originType = originType;
            return this;
        }
        public String getOriginType() {
            return this.originType;
        }

        public QueryRmsResourceGroupByNameResponseBodyResopnseData setResType(String resType) {
            this.resType = resType;
            return this;
        }
        public String getResType() {
            return this.resType;
        }

        public QueryRmsResourceGroupByNameResponseBodyResopnseData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryRmsResourceGroupByNameResponseBodyResopnseData setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

        public QueryRmsResourceGroupByNameResponseBodyResopnseData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryRmsResourceGroupByNameResponseBodyResopnseData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryRmsResourceGroupByNameResponseBodyResopnseData setEntryRes(java.util.List<QueryRmsResourceGroupByNameResponseBodyResopnseDataEntryRes> entryRes) {
            this.entryRes = entryRes;
            return this;
        }
        public java.util.List<QueryRmsResourceGroupByNameResponseBodyResopnseDataEntryRes> getEntryRes() {
            return this.entryRes;
        }

        public QueryRmsResourceGroupByNameResponseBodyResopnseData setLabels(java.util.List<QueryRmsResourceGroupByNameResponseBodyResopnseDataLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<QueryRmsResourceGroupByNameResponseBodyResopnseDataLabels> getLabels() {
            return this.labels;
        }

    }

    public static class QueryRmsResourceGroupByNameResponseBodyResopnse extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Data")
        public QueryRmsResourceGroupByNameResponseBodyResopnseData data;

        public static QueryRmsResourceGroupByNameResponseBodyResopnse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourceGroupByNameResponseBodyResopnse self = new QueryRmsResourceGroupByNameResponseBodyResopnse();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourceGroupByNameResponseBodyResopnse setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public QueryRmsResourceGroupByNameResponseBodyResopnse setData(QueryRmsResourceGroupByNameResponseBodyResopnseData data) {
            this.data = data;
            return this;
        }
        public QueryRmsResourceGroupByNameResponseBodyResopnseData getData() {
            return this.data;
        }

    }

}
