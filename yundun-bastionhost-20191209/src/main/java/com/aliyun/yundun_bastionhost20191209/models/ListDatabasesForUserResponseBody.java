// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListDatabasesForUserResponseBody extends TeaModel {
    @NameInMap("Databases")
    public java.util.List<ListDatabasesForUserResponseBodyDatabases> databases;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ActiveAddressType")
        public String activeAddressType;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("DatabasePort")
        public Long databasePort;

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
