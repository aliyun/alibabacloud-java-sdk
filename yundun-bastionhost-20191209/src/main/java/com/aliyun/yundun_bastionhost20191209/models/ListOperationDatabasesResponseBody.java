// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationDatabasesResponseBody extends TeaModel {
    /**
     * <p>The databases returned.</p>
     */
    @NameInMap("Databases")
    public java.util.List<ListOperationDatabasesResponseBodyDatabases> databases;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListOperationDatabasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOperationDatabasesResponseBody self = new ListOperationDatabasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOperationDatabasesResponseBody setDatabases(java.util.List<ListOperationDatabasesResponseBodyDatabases> databases) {
        this.databases = databases;
        return this;
    }
    public java.util.List<ListOperationDatabasesResponseBodyDatabases> getDatabases() {
        return this.databases;
    }

    public ListOperationDatabasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOperationDatabasesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListOperationDatabasesResponseBodyDatabases extends TeaModel {
        /**
         * <p>The address type of the database. Valid values:</p>
         * <ul>
         * <li><strong>Public</strong></li>
         * <li><strong>Private</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("ActiveAddressType")
        public String activeAddressType;

        /**
         * <p>The remarks of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>cpp</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>zDatabase</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The port of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("DatabasePort")
        public Long databasePort;

        /**
         * <p>The private address of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-b******9b.mysql.rds.aliyuncs.com</p>
         */
        @NameInMap("DatabasePrivateAddress")
        public String databasePrivateAddress;

        /**
         * <p>The public address of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf******p45.mysql.rds.aliyuncs.com</p>
         */
        @NameInMap("DatabasePublicAddress")
        public String databasePublicAddress;

        /**
         * <p>The database engine. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * <li><strong>Oracle</strong></li>
         * <li><strong>SQLServer</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DatabaseType")
        public String databaseType;

        /**
         * <p>The database type. Valid values:</p>
         * <ul>
         * <li><strong>Local</strong>: on-premises database.</li>
         * <li><strong>Rds</strong>: ApsaraDB RDS instance.</li>
         * <li><strong>PolarDB</strong>: PolarDB cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Local</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The ID of the ApsaraDB RDS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz9225bhipya******</p>
         */
        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        /**
         * <p>The region ID of the ApsaraDB RDS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("SourceInstanceRegionId")
        public String sourceInstanceRegionId;

        /**
         * <p>The database status. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong></li>
         * <li><strong>Release</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("SourceInstanceState")
        public String sourceInstanceState;

        public static ListOperationDatabasesResponseBodyDatabases build(java.util.Map<String, ?> map) throws Exception {
            ListOperationDatabasesResponseBodyDatabases self = new ListOperationDatabasesResponseBodyDatabases();
            return TeaModel.build(map, self);
        }

        public ListOperationDatabasesResponseBodyDatabases setActiveAddressType(String activeAddressType) {
            this.activeAddressType = activeAddressType;
            return this;
        }
        public String getActiveAddressType() {
            return this.activeAddressType;
        }

        public ListOperationDatabasesResponseBodyDatabases setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListOperationDatabasesResponseBodyDatabases setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public ListOperationDatabasesResponseBodyDatabases setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ListOperationDatabasesResponseBodyDatabases setDatabasePort(Long databasePort) {
            this.databasePort = databasePort;
            return this;
        }
        public Long getDatabasePort() {
            return this.databasePort;
        }

        public ListOperationDatabasesResponseBodyDatabases setDatabasePrivateAddress(String databasePrivateAddress) {
            this.databasePrivateAddress = databasePrivateAddress;
            return this;
        }
        public String getDatabasePrivateAddress() {
            return this.databasePrivateAddress;
        }

        public ListOperationDatabasesResponseBodyDatabases setDatabasePublicAddress(String databasePublicAddress) {
            this.databasePublicAddress = databasePublicAddress;
            return this;
        }
        public String getDatabasePublicAddress() {
            return this.databasePublicAddress;
        }

        public ListOperationDatabasesResponseBodyDatabases setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public ListOperationDatabasesResponseBodyDatabases setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListOperationDatabasesResponseBodyDatabases setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public ListOperationDatabasesResponseBodyDatabases setSourceInstanceRegionId(String sourceInstanceRegionId) {
            this.sourceInstanceRegionId = sourceInstanceRegionId;
            return this;
        }
        public String getSourceInstanceRegionId() {
            return this.sourceInstanceRegionId;
        }

        public ListOperationDatabasesResponseBodyDatabases setSourceInstanceState(String sourceInstanceState) {
            this.sourceInstanceState = sourceInstanceState;
            return this;
        }
        public String getSourceInstanceState() {
            return this.sourceInstanceState;
        }

    }

}
