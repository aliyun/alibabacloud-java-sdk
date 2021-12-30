// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListDataSourcesResponseBody extends TeaModel {
    @NameInMap("DbList")
    public java.util.List<ListDataSourcesResponseBodyDbList> dbList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourcesResponseBody self = new ListDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourcesResponseBody setDbList(java.util.List<ListDataSourcesResponseBodyDbList> dbList) {
        this.dbList = dbList;
        return this;
    }
    public java.util.List<ListDataSourcesResponseBodyDbList> getDbList() {
        return this.dbList;
    }

    public ListDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataSourcesResponseBodyDbList extends TeaModel {
        @NameInMap("AssetType")
        public Integer assetType;

        @NameInMap("AuditSwitch")
        public Integer auditSwitch;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DbAddresses")
        public java.util.List<String> dbAddresses;

        @NameInMap("DbCertificate")
        public String dbCertificate;

        @NameInMap("DbId")
        public Integer dbId;

        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("DbType")
        public Integer dbType;

        @NameInMap("DbTypeName")
        public String dbTypeName;

        @NameInMap("DbUsername")
        public String dbUsername;

        @NameInMap("DbVersion")
        public Integer dbVersion;

        @NameInMap("DbVersionName")
        public String dbVersionName;

        public static ListDataSourcesResponseBodyDbList build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourcesResponseBodyDbList self = new ListDataSourcesResponseBodyDbList();
            return TeaModel.build(map, self);
        }

        public ListDataSourcesResponseBodyDbList setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public ListDataSourcesResponseBodyDbList setAuditSwitch(Integer auditSwitch) {
            this.auditSwitch = auditSwitch;
            return this;
        }
        public Integer getAuditSwitch() {
            return this.auditSwitch;
        }

        public ListDataSourcesResponseBodyDbList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDataSourcesResponseBodyDbList setDbAddresses(java.util.List<String> dbAddresses) {
            this.dbAddresses = dbAddresses;
            return this;
        }
        public java.util.List<String> getDbAddresses() {
            return this.dbAddresses;
        }

        public ListDataSourcesResponseBodyDbList setDbCertificate(String dbCertificate) {
            this.dbCertificate = dbCertificate;
            return this;
        }
        public String getDbCertificate() {
            return this.dbCertificate;
        }

        public ListDataSourcesResponseBodyDbList setDbId(Integer dbId) {
            this.dbId = dbId;
            return this;
        }
        public Integer getDbId() {
            return this.dbId;
        }

        public ListDataSourcesResponseBodyDbList setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public ListDataSourcesResponseBodyDbList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public ListDataSourcesResponseBodyDbList setDbType(Integer dbType) {
            this.dbType = dbType;
            return this;
        }
        public Integer getDbType() {
            return this.dbType;
        }

        public ListDataSourcesResponseBodyDbList setDbTypeName(String dbTypeName) {
            this.dbTypeName = dbTypeName;
            return this;
        }
        public String getDbTypeName() {
            return this.dbTypeName;
        }

        public ListDataSourcesResponseBodyDbList setDbUsername(String dbUsername) {
            this.dbUsername = dbUsername;
            return this;
        }
        public String getDbUsername() {
            return this.dbUsername;
        }

        public ListDataSourcesResponseBodyDbList setDbVersion(Integer dbVersion) {
            this.dbVersion = dbVersion;
            return this;
        }
        public Integer getDbVersion() {
            return this.dbVersion;
        }

        public ListDataSourcesResponseBodyDbList setDbVersionName(String dbVersionName) {
            this.dbVersionName = dbVersionName;
            return this;
        }
        public String getDbVersionName() {
            return this.dbVersionName;
        }

    }

}
