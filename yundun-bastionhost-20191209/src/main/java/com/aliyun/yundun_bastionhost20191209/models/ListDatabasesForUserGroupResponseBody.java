// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListDatabasesForUserGroupResponseBody extends TeaModel {
    /**
     * <p>The databases returned.</p>
     */
    @NameInMap("Databases")
    public java.util.List<ListDatabasesForUserGroupResponseBodyDatabases> databases;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of databases returned.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDatabasesForUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatabasesForUserGroupResponseBody self = new ListDatabasesForUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatabasesForUserGroupResponseBody setDatabases(java.util.List<ListDatabasesForUserGroupResponseBodyDatabases> databases) {
        this.databases = databases;
        return this;
    }
    public java.util.List<ListDatabasesForUserGroupResponseBodyDatabases> getDatabases() {
        return this.databases;
    }

    public ListDatabasesForUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatabasesForUserGroupResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDatabasesForUserGroupResponseBodyDatabases extends TeaModel {
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
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The total number of database accounts returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DatabaseAccountCount")
        public Long databaseAccountCount;

        /**
         * <p>The ID of the database to which the database account belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL0</p>
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
         * <p>The internal address of the database. The value is a domain name or an IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1******</p>
         */
        @NameInMap("DatabasePrivateAddress")
        public String databasePrivateAddress;

        /**
         * <p>The public address of the database. The value is a domain name or an IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf65******</p>
         */
        @NameInMap("DatabasePublicAddress")
        public String databasePublicAddress;

        /**
         * <p>The database engine. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>Oracle</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * <li><strong>SQLServer</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DatabaseType")
        public String databaseType;

        /**
         * <p>The ID of the network domain where the database resides.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("NetworkDomainId")
        public String networkDomainId;

        /**
         * <p>The type of the database. Valid values:</p>
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
         * <p>The ID of the ApsaraDB RDS instance or PolarDB cluster.</p>
         * <blockquote>
         * <p>No value is returned for this parameter if <strong>Source</strong> is set to <strong>Local</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-wz9c7mjxywmdmqk7q6e4</p>
         */
        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        public static ListDatabasesForUserGroupResponseBodyDatabases build(java.util.Map<String, ?> map) throws Exception {
            ListDatabasesForUserGroupResponseBodyDatabases self = new ListDatabasesForUserGroupResponseBodyDatabases();
            return TeaModel.build(map, self);
        }

        public ListDatabasesForUserGroupResponseBodyDatabases setActiveAddressType(String activeAddressType) {
            this.activeAddressType = activeAddressType;
            return this;
        }
        public String getActiveAddressType() {
            return this.activeAddressType;
        }

        public ListDatabasesForUserGroupResponseBodyDatabases setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListDatabasesForUserGroupResponseBodyDatabases setDatabaseAccountCount(Long databaseAccountCount) {
            this.databaseAccountCount = databaseAccountCount;
            return this;
        }
        public Long getDatabaseAccountCount() {
            return this.databaseAccountCount;
        }

        public ListDatabasesForUserGroupResponseBodyDatabases setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public ListDatabasesForUserGroupResponseBodyDatabases setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ListDatabasesForUserGroupResponseBodyDatabases setDatabasePort(Long databasePort) {
            this.databasePort = databasePort;
            return this;
        }
        public Long getDatabasePort() {
            return this.databasePort;
        }

        public ListDatabasesForUserGroupResponseBodyDatabases setDatabasePrivateAddress(String databasePrivateAddress) {
            this.databasePrivateAddress = databasePrivateAddress;
            return this;
        }
        public String getDatabasePrivateAddress() {
            return this.databasePrivateAddress;
        }

        public ListDatabasesForUserGroupResponseBodyDatabases setDatabasePublicAddress(String databasePublicAddress) {
            this.databasePublicAddress = databasePublicAddress;
            return this;
        }
        public String getDatabasePublicAddress() {
            return this.databasePublicAddress;
        }

        public ListDatabasesForUserGroupResponseBodyDatabases setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public ListDatabasesForUserGroupResponseBodyDatabases setNetworkDomainId(String networkDomainId) {
            this.networkDomainId = networkDomainId;
            return this;
        }
        public String getNetworkDomainId() {
            return this.networkDomainId;
        }

        public ListDatabasesForUserGroupResponseBodyDatabases setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListDatabasesForUserGroupResponseBodyDatabases setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

    }

}
