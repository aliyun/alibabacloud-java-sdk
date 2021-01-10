// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasDatabaseImportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Data")
    public java.util.List<QueryCasDatabaseImportResponseBodyData> data;

    public static QueryCasDatabaseImportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCasDatabaseImportResponseBody self = new QueryCasDatabaseImportResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCasDatabaseImportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCasDatabaseImportResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCasDatabaseImportResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryCasDatabaseImportResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryCasDatabaseImportResponseBody setData(java.util.List<QueryCasDatabaseImportResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCasDatabaseImportResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryCasDatabaseImportResponseBodyDataImportInfo extends TeaModel {
        @NameInMap("ImportedWorkspaceName")
        public String importedWorkspaceName;

        @NameInMap("IsImported")
        public Boolean isImported;

        @NameInMap("IsUnimportable")
        public Boolean isUnimportable;

        @NameInMap("UnimportableReason")
        public String unimportableReason;

        public static QueryCasDatabaseImportResponseBodyDataImportInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryCasDatabaseImportResponseBodyDataImportInfo self = new QueryCasDatabaseImportResponseBodyDataImportInfo();
            return TeaModel.build(map, self);
        }

        public QueryCasDatabaseImportResponseBodyDataImportInfo setImportedWorkspaceName(String importedWorkspaceName) {
            this.importedWorkspaceName = importedWorkspaceName;
            return this;
        }
        public String getImportedWorkspaceName() {
            return this.importedWorkspaceName;
        }

        public QueryCasDatabaseImportResponseBodyDataImportInfo setIsImported(Boolean isImported) {
            this.isImported = isImported;
            return this;
        }
        public Boolean getIsImported() {
            return this.isImported;
        }

        public QueryCasDatabaseImportResponseBodyDataImportInfo setIsUnimportable(Boolean isUnimportable) {
            this.isUnimportable = isUnimportable;
            return this;
        }
        public Boolean getIsUnimportable() {
            return this.isUnimportable;
        }

        public QueryCasDatabaseImportResponseBodyDataImportInfo setUnimportableReason(String unimportableReason) {
            this.unimportableReason = unimportableReason;
            return this;
        }
        public String getUnimportableReason() {
            return this.unimportableReason;
        }

    }

    public static class QueryCasDatabaseImportResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("IaasId")
        public String iaasId;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("ImportInfo")
        public QueryCasDatabaseImportResponseBodyDataImportInfo importInfo;

        public static QueryCasDatabaseImportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCasDatabaseImportResponseBodyData self = new QueryCasDatabaseImportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCasDatabaseImportResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryCasDatabaseImportResponseBodyData setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public QueryCasDatabaseImportResponseBodyData setIaasId(String iaasId) {
            this.iaasId = iaasId;
            return this;
        }
        public String getIaasId() {
            return this.iaasId;
        }

        public QueryCasDatabaseImportResponseBodyData setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public QueryCasDatabaseImportResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCasDatabaseImportResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryCasDatabaseImportResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryCasDatabaseImportResponseBodyData setImportInfo(QueryCasDatabaseImportResponseBodyDataImportInfo importInfo) {
            this.importInfo = importInfo;
            return this;
        }
        public QueryCasDatabaseImportResponseBodyDataImportInfo getImportInfo() {
            return this.importInfo;
        }

    }

}
