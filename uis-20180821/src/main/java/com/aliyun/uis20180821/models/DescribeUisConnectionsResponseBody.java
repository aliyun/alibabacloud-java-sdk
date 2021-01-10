// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DescribeUisConnectionsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("UisConnections")
    public DescribeUisConnectionsResponseBodyUisConnections uisConnections;

    public static DescribeUisConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUisConnectionsResponseBody self = new DescribeUisConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUisConnectionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeUisConnectionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeUisConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUisConnectionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeUisConnectionsResponseBody setUisConnections(DescribeUisConnectionsResponseBodyUisConnections uisConnections) {
        this.uisConnections = uisConnections;
        return this;
    }
    public DescribeUisConnectionsResponseBodyUisConnections getUisConnections() {
        return this.uisConnections;
    }

    public static class DescribeUisConnectionsResponseBodyUisConnectionsUisConnection extends TeaModel {
        @NameInMap("GreConfig")
        public String greConfig;

        @NameInMap("UisId")
        public String uisId;

        @NameInMap("UisNodeId")
        public String uisNodeId;

        @NameInMap("Description")
        public String description;

        @NameInMap("State")
        public String state;

        @NameInMap("UisProtocol")
        public String uisProtocol;

        @NameInMap("Name")
        public String name;

        @NameInMap("SslConfig")
        public String sslConfig;

        @NameInMap("UisConnectionId")
        public String uisConnectionId;

        public static DescribeUisConnectionsResponseBodyUisConnectionsUisConnection build(java.util.Map<String, ?> map) throws Exception {
            DescribeUisConnectionsResponseBodyUisConnectionsUisConnection self = new DescribeUisConnectionsResponseBodyUisConnectionsUisConnection();
            return TeaModel.build(map, self);
        }

        public DescribeUisConnectionsResponseBodyUisConnectionsUisConnection setGreConfig(String greConfig) {
            this.greConfig = greConfig;
            return this;
        }
        public String getGreConfig() {
            return this.greConfig;
        }

        public DescribeUisConnectionsResponseBodyUisConnectionsUisConnection setUisId(String uisId) {
            this.uisId = uisId;
            return this;
        }
        public String getUisId() {
            return this.uisId;
        }

        public DescribeUisConnectionsResponseBodyUisConnectionsUisConnection setUisNodeId(String uisNodeId) {
            this.uisNodeId = uisNodeId;
            return this;
        }
        public String getUisNodeId() {
            return this.uisNodeId;
        }

        public DescribeUisConnectionsResponseBodyUisConnectionsUisConnection setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeUisConnectionsResponseBodyUisConnectionsUisConnection setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeUisConnectionsResponseBodyUisConnectionsUisConnection setUisProtocol(String uisProtocol) {
            this.uisProtocol = uisProtocol;
            return this;
        }
        public String getUisProtocol() {
            return this.uisProtocol;
        }

        public DescribeUisConnectionsResponseBodyUisConnectionsUisConnection setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeUisConnectionsResponseBodyUisConnectionsUisConnection setSslConfig(String sslConfig) {
            this.sslConfig = sslConfig;
            return this;
        }
        public String getSslConfig() {
            return this.sslConfig;
        }

        public DescribeUisConnectionsResponseBodyUisConnectionsUisConnection setUisConnectionId(String uisConnectionId) {
            this.uisConnectionId = uisConnectionId;
            return this;
        }
        public String getUisConnectionId() {
            return this.uisConnectionId;
        }

    }

    public static class DescribeUisConnectionsResponseBodyUisConnections extends TeaModel {
        @NameInMap("UisConnection")
        public java.util.List<DescribeUisConnectionsResponseBodyUisConnectionsUisConnection> uisConnection;

        public static DescribeUisConnectionsResponseBodyUisConnections build(java.util.Map<String, ?> map) throws Exception {
            DescribeUisConnectionsResponseBodyUisConnections self = new DescribeUisConnectionsResponseBodyUisConnections();
            return TeaModel.build(map, self);
        }

        public DescribeUisConnectionsResponseBodyUisConnections setUisConnection(java.util.List<DescribeUisConnectionsResponseBodyUisConnectionsUisConnection> uisConnection) {
            this.uisConnection = uisConnection;
            return this;
        }
        public java.util.List<DescribeUisConnectionsResponseBodyUisConnectionsUisConnection> getUisConnection() {
            return this.uisConnection;
        }

    }

}
