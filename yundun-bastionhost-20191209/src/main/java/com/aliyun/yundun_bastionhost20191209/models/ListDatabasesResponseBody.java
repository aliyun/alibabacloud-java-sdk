// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListDatabasesResponseBody extends TeaModel {
    @NameInMap("Databases")
    public java.util.List<ListDatabasesResponseBodyDatabases> databases;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ActiveAddressType")
        public String activeAddressType;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("DatabasePort")
        public Integer databasePort;

        @NameInMap("DatabasePrivateAddress")
        public String databasePrivateAddress;

        @NameInMap("DatabasePublicAddress")
        public String databasePublicAddress;

        @NameInMap("DatabaseType")
        public String databaseType;

        @NameInMap("NetworkDomainId")
        public String networkDomainId;

        @NameInMap("Source")
        public String source;

        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        @NameInMap("SourceInstanceRegionId")
        public String sourceInstanceRegionId;

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
