// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetDBAuditCountListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DbList")
    public java.util.List<GetDBAuditCountListResponseBodyDbList> dbList;

    public static GetDBAuditCountListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDBAuditCountListResponseBody self = new GetDBAuditCountListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDBAuditCountListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDBAuditCountListResponseBody setDbList(java.util.List<GetDBAuditCountListResponseBodyDbList> dbList) {
        this.dbList = dbList;
        return this;
    }
    public java.util.List<GetDBAuditCountListResponseBodyDbList> getDbList() {
        return this.dbList;
    }

    public static class GetDBAuditCountListResponseBodyDbList extends TeaModel {
        @NameInMap("SessionCount")
        public Long sessionCount;

        @NameInMap("DbId")
        public Integer dbId;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("DbType")
        public Integer dbType;

        @NameInMap("SqlCount")
        public Long sqlCount;

        @NameInMap("DbTypeName")
        public String dbTypeName;

        @NameInMap("RiskCount")
        public Long riskCount;

        @NameInMap("DbVersionName")
        public String dbVersionName;

        @NameInMap("AssetType")
        public Integer assetType;

        @NameInMap("DbVersion")
        public Integer dbVersion;

        @NameInMap("DbAddresses")
        public java.util.List<String> dbAddresses;

        public static GetDBAuditCountListResponseBodyDbList build(java.util.Map<String, ?> map) throws Exception {
            GetDBAuditCountListResponseBodyDbList self = new GetDBAuditCountListResponseBodyDbList();
            return TeaModel.build(map, self);
        }

        public GetDBAuditCountListResponseBodyDbList setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

        public GetDBAuditCountListResponseBodyDbList setDbId(Integer dbId) {
            this.dbId = dbId;
            return this;
        }
        public Integer getDbId() {
            return this.dbId;
        }

        public GetDBAuditCountListResponseBodyDbList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public GetDBAuditCountListResponseBodyDbList setDbType(Integer dbType) {
            this.dbType = dbType;
            return this;
        }
        public Integer getDbType() {
            return this.dbType;
        }

        public GetDBAuditCountListResponseBodyDbList setSqlCount(Long sqlCount) {
            this.sqlCount = sqlCount;
            return this;
        }
        public Long getSqlCount() {
            return this.sqlCount;
        }

        public GetDBAuditCountListResponseBodyDbList setDbTypeName(String dbTypeName) {
            this.dbTypeName = dbTypeName;
            return this;
        }
        public String getDbTypeName() {
            return this.dbTypeName;
        }

        public GetDBAuditCountListResponseBodyDbList setRiskCount(Long riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Long getRiskCount() {
            return this.riskCount;
        }

        public GetDBAuditCountListResponseBodyDbList setDbVersionName(String dbVersionName) {
            this.dbVersionName = dbVersionName;
            return this;
        }
        public String getDbVersionName() {
            return this.dbVersionName;
        }

        public GetDBAuditCountListResponseBodyDbList setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public GetDBAuditCountListResponseBodyDbList setDbVersion(Integer dbVersion) {
            this.dbVersion = dbVersion;
            return this;
        }
        public Integer getDbVersion() {
            return this.dbVersion;
        }

        public GetDBAuditCountListResponseBodyDbList setDbAddresses(java.util.List<String> dbAddresses) {
            this.dbAddresses = dbAddresses;
            return this;
        }
        public java.util.List<String> getDbAddresses() {
            return this.dbAddresses;
        }

    }

}
