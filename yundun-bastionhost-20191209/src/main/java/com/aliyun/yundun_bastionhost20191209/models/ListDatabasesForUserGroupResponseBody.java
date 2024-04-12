// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListDatabasesForUserGroupResponseBody extends TeaModel {
    @NameInMap("Databases")
    public java.util.List<ListDatabasesForUserGroupResponseBodyDatabases> databases;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ActiveAddressType")
        public String activeAddressType;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("DatabaseAccountCount")
        public Long databaseAccountCount;

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
