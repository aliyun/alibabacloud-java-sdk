// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetDatabaseResponseBody extends TeaModel {
    @NameInMap("Database")
    public GetDatabaseResponseBodyDatabase database;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseResponseBody self = new GetDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatabaseResponseBody setDatabase(GetDatabaseResponseBodyDatabase database) {
        this.database = database;
        return this;
    }
    public GetDatabaseResponseBodyDatabase getDatabase() {
        return this.database;
    }

    public GetDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDatabaseResponseBodyDatabase extends TeaModel {
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

        @NameInMap("SourceInstanceRegionId")
        public String sourceInstanceRegionId;

        @NameInMap("SourceInstanceState")
        public String sourceInstanceState;

        public static GetDatabaseResponseBodyDatabase build(java.util.Map<String, ?> map) throws Exception {
            GetDatabaseResponseBodyDatabase self = new GetDatabaseResponseBodyDatabase();
            return TeaModel.build(map, self);
        }

        public GetDatabaseResponseBodyDatabase setActiveAddressType(String activeAddressType) {
            this.activeAddressType = activeAddressType;
            return this;
        }
        public String getActiveAddressType() {
            return this.activeAddressType;
        }

        public GetDatabaseResponseBodyDatabase setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetDatabaseResponseBodyDatabase setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public GetDatabaseResponseBodyDatabase setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public GetDatabaseResponseBodyDatabase setDatabasePort(Long databasePort) {
            this.databasePort = databasePort;
            return this;
        }
        public Long getDatabasePort() {
            return this.databasePort;
        }

        public GetDatabaseResponseBodyDatabase setDatabasePrivateAddress(String databasePrivateAddress) {
            this.databasePrivateAddress = databasePrivateAddress;
            return this;
        }
        public String getDatabasePrivateAddress() {
            return this.databasePrivateAddress;
        }

        public GetDatabaseResponseBodyDatabase setDatabasePublicAddress(String databasePublicAddress) {
            this.databasePublicAddress = databasePublicAddress;
            return this;
        }
        public String getDatabasePublicAddress() {
            return this.databasePublicAddress;
        }

        public GetDatabaseResponseBodyDatabase setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public GetDatabaseResponseBodyDatabase setNetworkDomainId(String networkDomainId) {
            this.networkDomainId = networkDomainId;
            return this;
        }
        public String getNetworkDomainId() {
            return this.networkDomainId;
        }

        public GetDatabaseResponseBodyDatabase setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetDatabaseResponseBodyDatabase setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public GetDatabaseResponseBodyDatabase setSourceInstanceRegionId(String sourceInstanceRegionId) {
            this.sourceInstanceRegionId = sourceInstanceRegionId;
            return this;
        }
        public String getSourceInstanceRegionId() {
            return this.sourceInstanceRegionId;
        }

        public GetDatabaseResponseBodyDatabase setSourceInstanceState(String sourceInstanceState) {
            this.sourceInstanceState = sourceInstanceState;
            return this;
        }
        public String getSourceInstanceState() {
            return this.sourceInstanceState;
        }

    }

}
