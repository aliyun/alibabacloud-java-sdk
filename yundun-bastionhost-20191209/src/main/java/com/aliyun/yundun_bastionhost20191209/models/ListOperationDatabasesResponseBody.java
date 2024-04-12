// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationDatabasesResponseBody extends TeaModel {
    @NameInMap("Databases")
    public java.util.List<ListOperationDatabasesResponseBodyDatabases> databases;

    @NameInMap("RequestId")
    public String requestId;

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

        @NameInMap("Source")
        public String source;

        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        @NameInMap("SourceInstanceRegionId")
        public String sourceInstanceRegionId;

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
