// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryOneconsoleUserprojectsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryOneconsoleUserprojectsResponseBodyData> data;

    public static QueryOneconsoleUserprojectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOneconsoleUserprojectsResponseBody self = new QueryOneconsoleUserprojectsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOneconsoleUserprojectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOneconsoleUserprojectsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOneconsoleUserprojectsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryOneconsoleUserprojectsResponseBody setData(java.util.List<QueryOneconsoleUserprojectsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryOneconsoleUserprojectsResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryOneconsoleUserprojectsResponseBodyData extends TeaModel {
        @NameInMap("BusinessOwnerId")
        public String businessOwnerId;

        @NameInMap("Description")
        public String description;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Id")
        public String id;

        @NameInMap("MasterId")
        public String masterId;

        @NameInMap("Name")
        public String name;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UniqueId")
        public String uniqueId;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        public static QueryOneconsoleUserprojectsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOneconsoleUserprojectsResponseBodyData self = new QueryOneconsoleUserprojectsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOneconsoleUserprojectsResponseBodyData setBusinessOwnerId(String businessOwnerId) {
            this.businessOwnerId = businessOwnerId;
            return this;
        }
        public String getBusinessOwnerId() {
            return this.businessOwnerId;
        }

        public QueryOneconsoleUserprojectsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryOneconsoleUserprojectsResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public QueryOneconsoleUserprojectsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryOneconsoleUserprojectsResponseBodyData setMasterId(String masterId) {
            this.masterId = masterId;
            return this;
        }
        public String getMasterId() {
            return this.masterId;
        }

        public QueryOneconsoleUserprojectsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryOneconsoleUserprojectsResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryOneconsoleUserprojectsResponseBodyData setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public QueryOneconsoleUserprojectsResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryOneconsoleUserprojectsResponseBodyData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

}
