// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListDatabasesForUserResponseBody extends TeaModel {
    /**
     * <p>The databases returned.</p>
     */
    @NameInMap("Databases")
    public java.util.List<ListDatabasesForUserResponseBodyDatabases> databases;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A8A665B9-8550-4942-9DEE-73198051856B</p>
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

    public static ListDatabasesForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatabasesForUserResponseBody self = new ListDatabasesForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatabasesForUserResponseBody setDatabases(java.util.List<ListDatabasesForUserResponseBodyDatabases> databases) {
        this.databases = databases;
        return this;
    }
    public java.util.List<ListDatabasesForUserResponseBodyDatabases> getDatabases() {
        return this.databases;
    }

    public ListDatabasesForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatabasesForUserResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDatabasesForUserResponseBodyDatabases extends TeaModel {
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
         * <p>The database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL56</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The database port.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("DatabasePort")
        public Long databasePort;

        /**
         * <p>The internal endpoint of the database. The value is a domain name or an IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-wz97******</p>
         */
        @NameInMap("DatabasePrivateAddress")
        public String databasePrivateAddress;

        /**
         * <p>The public endpoint of the database. The value is a domain name or an IP address.</p>
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
         * <p>2</p>
         */
        @NameInMap("NetworkDomainId")
        public String networkDomainId;

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
         * <p>The ID of the ApsaraDB RDS instance or PolarDB cluster.</p>
         * <blockquote>
         * <p> No value is returned for this parameter if <strong>Source</strong> is set to <strong>Local</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-wz9fv2hwux78x9h1pmje</p>
         */
        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        public static ListDatabasesForUserResponseBodyDatabases build(java.util.Map<String, ?> map) throws Exception {
            ListDatabasesForUserResponseBodyDatabases self = new ListDatabasesForUserResponseBodyDatabases();
            return TeaModel.build(map, self);
        }

        public ListDatabasesForUserResponseBodyDatabases setActiveAddressType(String activeAddressType) {
            this.activeAddressType = activeAddressType;
            return this;
        }
        public String getActiveAddressType() {
            return this.activeAddressType;
        }

        public ListDatabasesForUserResponseBodyDatabases setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListDatabasesForUserResponseBodyDatabases setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public ListDatabasesForUserResponseBodyDatabases setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ListDatabasesForUserResponseBodyDatabases setDatabasePort(Long databasePort) {
            this.databasePort = databasePort;
            return this;
        }
        public Long getDatabasePort() {
            return this.databasePort;
        }

        public ListDatabasesForUserResponseBodyDatabases setDatabasePrivateAddress(String databasePrivateAddress) {
            this.databasePrivateAddress = databasePrivateAddress;
            return this;
        }
        public String getDatabasePrivateAddress() {
            return this.databasePrivateAddress;
        }

        public ListDatabasesForUserResponseBodyDatabases setDatabasePublicAddress(String databasePublicAddress) {
            this.databasePublicAddress = databasePublicAddress;
            return this;
        }
        public String getDatabasePublicAddress() {
            return this.databasePublicAddress;
        }

        public ListDatabasesForUserResponseBodyDatabases setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public ListDatabasesForUserResponseBodyDatabases setNetworkDomainId(String networkDomainId) {
            this.networkDomainId = networkDomainId;
            return this;
        }
        public String getNetworkDomainId() {
            return this.networkDomainId;
        }

        public ListDatabasesForUserResponseBodyDatabases setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListDatabasesForUserResponseBodyDatabases setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

    }

}
