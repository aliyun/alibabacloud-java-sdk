// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasLoadbalanceImportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryCasLoadbalanceImportResponseBodyData> data;

    public static QueryCasLoadbalanceImportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCasLoadbalanceImportResponseBody self = new QueryCasLoadbalanceImportResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCasLoadbalanceImportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCasLoadbalanceImportResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCasLoadbalanceImportResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryCasLoadbalanceImportResponseBody setData(java.util.List<QueryCasLoadbalanceImportResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCasLoadbalanceImportResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryCasLoadbalanceImportResponseBodyDataImportInfo extends TeaModel {
        @NameInMap("ImportedWorkspaceName")
        public String importedWorkspaceName;

        @NameInMap("IsImported")
        public Boolean isImported;

        @NameInMap("IsUnimportable")
        public Boolean isUnimportable;

        @NameInMap("UnimportableReason")
        public String unimportableReason;

        public static QueryCasLoadbalanceImportResponseBodyDataImportInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryCasLoadbalanceImportResponseBodyDataImportInfo self = new QueryCasLoadbalanceImportResponseBodyDataImportInfo();
            return TeaModel.build(map, self);
        }

        public QueryCasLoadbalanceImportResponseBodyDataImportInfo setImportedWorkspaceName(String importedWorkspaceName) {
            this.importedWorkspaceName = importedWorkspaceName;
            return this;
        }
        public String getImportedWorkspaceName() {
            return this.importedWorkspaceName;
        }

        public QueryCasLoadbalanceImportResponseBodyDataImportInfo setIsImported(Boolean isImported) {
            this.isImported = isImported;
            return this;
        }
        public Boolean getIsImported() {
            return this.isImported;
        }

        public QueryCasLoadbalanceImportResponseBodyDataImportInfo setIsUnimportable(Boolean isUnimportable) {
            this.isUnimportable = isUnimportable;
            return this;
        }
        public Boolean getIsUnimportable() {
            return this.isUnimportable;
        }

        public QueryCasLoadbalanceImportResponseBodyDataImportInfo setUnimportableReason(String unimportableReason) {
            this.unimportableReason = unimportableReason;
            return this;
        }
        public String getUnimportableReason() {
            return this.unimportableReason;
        }

    }

    public static class QueryCasLoadbalanceImportResponseBodyData extends TeaModel {
        @NameInMap("IaasId")
        public String iaasId;

        @NameInMap("Name")
        public String name;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("InnerIpAddress")
        public java.util.List<String> innerIpAddress;

        @NameInMap("PublicIpAddress")
        public java.util.List<String> publicIpAddress;

        @NameInMap("ImportInfo")
        public QueryCasLoadbalanceImportResponseBodyDataImportInfo importInfo;

        public static QueryCasLoadbalanceImportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCasLoadbalanceImportResponseBodyData self = new QueryCasLoadbalanceImportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCasLoadbalanceImportResponseBodyData setIaasId(String iaasId) {
            this.iaasId = iaasId;
            return this;
        }
        public String getIaasId() {
            return this.iaasId;
        }

        public QueryCasLoadbalanceImportResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCasLoadbalanceImportResponseBodyData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public QueryCasLoadbalanceImportResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryCasLoadbalanceImportResponseBodyData setInnerIpAddress(java.util.List<String> innerIpAddress) {
            this.innerIpAddress = innerIpAddress;
            return this;
        }
        public java.util.List<String> getInnerIpAddress() {
            return this.innerIpAddress;
        }

        public QueryCasLoadbalanceImportResponseBodyData setPublicIpAddress(java.util.List<String> publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public java.util.List<String> getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public QueryCasLoadbalanceImportResponseBodyData setImportInfo(QueryCasLoadbalanceImportResponseBodyDataImportInfo importInfo) {
            this.importInfo = importInfo;
            return this;
        }
        public QueryCasLoadbalanceImportResponseBodyDataImportInfo getImportInfo() {
            return this.importInfo;
        }

    }

}
