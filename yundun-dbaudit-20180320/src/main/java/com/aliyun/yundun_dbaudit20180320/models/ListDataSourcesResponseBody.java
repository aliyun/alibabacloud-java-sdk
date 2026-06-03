// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListDataSourcesResponseBody extends TeaModel {
    @NameInMap("DbList")
    public java.util.List<ListDataSourcesResponseBodyDbList> dbList;

    /**
     * <strong>example:</strong>
     * <p>1B217656-2267-4FBF-B26C-CDD201BDC3B8</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AuditSwitch")
        public Integer auditSwitch;

        /**
         * <strong>example:</strong>
         * <p>2019-06-06 09:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DbAddresses")
        public java.util.List<String> dbAddresses;

        /**
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE----- ...... -----END CERTIFICATE-----</p>
         */
        @NameInMap("DbCertificate")
        public String dbCertificate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DbId")
        public Integer dbId;

        /**
         * <strong>example:</strong>
         * <p>rds-a235dsdg2a****</p>
         */
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        @NameInMap("DbName")
        public String dbName;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DbType")
        public Integer dbType;

        /**
         * <strong>example:</strong>
         * <p>Mysql</p>
         */
        @NameInMap("DbTypeName")
        public String dbTypeName;

        /**
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("DbUsername")
        public String dbUsername;

        /**
         * <strong>example:</strong>
         * <p>5700</p>
         */
        @NameInMap("DbVersion")
        public Integer dbVersion;

        /**
         * <strong>example:</strong>
         * <p>5.7</p>
         */
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
