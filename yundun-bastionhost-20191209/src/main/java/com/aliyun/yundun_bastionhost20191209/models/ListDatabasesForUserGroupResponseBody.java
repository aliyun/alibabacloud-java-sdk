// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListDatabasesForUserGroupResponseBody extends TeaModel {
    /**
     * <p>The list of databases that are queried.</p>
     */
    @NameInMap("Databases")
    public java.util.List<ListDatabasesForUserGroupResponseBodyDatabases> databases;

    /**
     * <p>The unique ID that Alibaba Cloud generates for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of databases that are queried.</p>
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
         * <p>The type of the database address. Valid values:</p>
         * <ul>
         * <li><p><strong>Public</strong>: public address</p>
         * </li>
         * <li><p><strong>Private</strong>: private address</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("ActiveAddressType")
        public String activeAddressType;

        /**
         * <p>The description of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The total number of database accounts that are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DatabaseAccountCount")
        public Long databaseAccountCount;

        /**
         * <p>The ID of the database instance to which the database account belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        /**
         * <p>The name of the database instance.</p>
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
         * <p>The private endpoint of the database, which can be a domain name or an IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1******</p>
         */
        @NameInMap("DatabasePrivateAddress")
        public String databasePrivateAddress;

        /**
         * <p>The public address of the database, which can be a domain name or an IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf65******</p>
         */
        @NameInMap("DatabasePublicAddress")
        public String databasePublicAddress;

        /**
         * <p>The type of the database. Valid values:</p>
         * <ul>
         * <li><p><strong>MySQL</strong></p>
         * </li>
         * <li><p><strong>Oracle</strong></p>
         * </li>
         * <li><p><strong>PostgreSQL</strong></p>
         * </li>
         * <li><p><strong>SQLServer</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DatabaseType")
        public String databaseType;

        /**
         * <p>The ID of the network domain to which the database belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("NetworkDomainId")
        public String networkDomainId;

        /**
         * <p>The source of the database. Valid values:</p>
         * <ul>
         * <li><p><strong>Local</strong>: local database instance</p>
         * </li>
         * <li><p><strong>Rds</strong>: RDS database instance</p>
         * </li>
         * <li><p><strong>PolarDB</strong>: PolarDB database instance</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Local</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The ID of the RDS instance or PolarDB instance that corresponds to the database.</p>
         * <blockquote>
         * <p>If <strong>Source</strong> is set to <strong>Local</strong>, this parameter is empty.</p>
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
