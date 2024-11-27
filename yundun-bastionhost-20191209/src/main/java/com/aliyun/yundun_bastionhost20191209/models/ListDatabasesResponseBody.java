// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListDatabasesResponseBody extends TeaModel {
    /**
     * <p>The databases returned.</p>
     */
    @NameInMap("Databases")
    public java.util.List<ListDatabasesResponseBodyDatabases> databases;

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
     * <p>4</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDatabasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatabasesResponseBody self = new ListDatabasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatabasesResponseBody setDatabases(java.util.List<ListDatabasesResponseBodyDatabases> databases) {
        this.databases = databases;
        return this;
    }
    public java.util.List<ListDatabasesResponseBodyDatabases> getDatabases() {
        return this.databases;
    }

    public ListDatabasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatabasesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDatabasesResponseBodyDatabases extends TeaModel {
        /**
         * <p>The address type of the database. Valid values:</p>
         * <ul>
         * <li><strong>Public</strong></li>
         * <li><strong>Private</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
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
         * <p>9</p>
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
        public Integer databasePort;

        /**
         * <p>The internal address of the database. The value is a domain name or an IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-wz973w7******</p>
         */
        @NameInMap("DatabasePrivateAddress")
        public String databasePrivateAddress;

        /**
         * <p>The public address of the database. The value is a domain name or an IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf65n2******</p>
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
         * <p>8</p>
         */
        @NameInMap("NetworkDomainId")
        public String networkDomainId;

        /**
         * <p>The type of the database. Valid values:</p>
         * <ul>
         * <li><strong>Local</strong>: on-premises database.</li>
         * <li><strong>Rds</strong>: ApsaraDB for RDS instance.</li>
         * <li><strong>PolarDB</strong>: PolarDB cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Local</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The ID of the ApsaraDB for RDS instance or PolarDB cluster.</p>
         * <blockquote>
         * <p>No value is returned for this parameter if <strong>Source</strong> is set to <strong>Local</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-wz9ejupczf41******</p>
         */
        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        /**
         * <p>The region ID of the ApsaraDB for RDS instance or PolarDB cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("SourceInstanceRegionId")
        public String sourceInstanceRegionId;

        /**
         * <p>The status of the database. Valid values:</p>
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

        public static ListDatabasesResponseBodyDatabases build(java.util.Map<String, ?> map) throws Exception {
            ListDatabasesResponseBodyDatabases self = new ListDatabasesResponseBodyDatabases();
            return TeaModel.build(map, self);
        }

        public ListDatabasesResponseBodyDatabases setActiveAddressType(String activeAddressType) {
            this.activeAddressType = activeAddressType;
            return this;
        }
        public String getActiveAddressType() {
            return this.activeAddressType;
        }

        public ListDatabasesResponseBodyDatabases setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListDatabasesResponseBodyDatabases setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public ListDatabasesResponseBodyDatabases setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ListDatabasesResponseBodyDatabases setDatabasePort(Integer databasePort) {
            this.databasePort = databasePort;
            return this;
        }
        public Integer getDatabasePort() {
            return this.databasePort;
        }

        public ListDatabasesResponseBodyDatabases setDatabasePrivateAddress(String databasePrivateAddress) {
            this.databasePrivateAddress = databasePrivateAddress;
            return this;
        }
        public String getDatabasePrivateAddress() {
            return this.databasePrivateAddress;
        }

        public ListDatabasesResponseBodyDatabases setDatabasePublicAddress(String databasePublicAddress) {
            this.databasePublicAddress = databasePublicAddress;
            return this;
        }
        public String getDatabasePublicAddress() {
            return this.databasePublicAddress;
        }

        public ListDatabasesResponseBodyDatabases setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public ListDatabasesResponseBodyDatabases setNetworkDomainId(String networkDomainId) {
            this.networkDomainId = networkDomainId;
            return this;
        }
        public String getNetworkDomainId() {
            return this.networkDomainId;
        }

        public ListDatabasesResponseBodyDatabases setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListDatabasesResponseBodyDatabases setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public ListDatabasesResponseBodyDatabases setSourceInstanceRegionId(String sourceInstanceRegionId) {
            this.sourceInstanceRegionId = sourceInstanceRegionId;
            return this;
        }
        public String getSourceInstanceRegionId() {
            return this.sourceInstanceRegionId;
        }

        public ListDatabasesResponseBodyDatabases setSourceInstanceState(String sourceInstanceState) {
            this.sourceInstanceState = sourceInstanceState;
            return this;
        }
        public String getSourceInstanceState() {
            return this.sourceInstanceState;
        }

    }

}
