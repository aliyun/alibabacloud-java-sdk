// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class DescribeGreConnectionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UisId")
    @Validation(required = true)
    public String uisId;

    @NameInMap("UisName")
    @Validation(required = true)
    public String uisName;

    @NameInMap("State")
    @Validation(required = true)
    public String state;

    @NameInMap("Page")
    @Validation(required = true)
    public Long page;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("GreConnections")
    @Validation(required = true)
    public java.util.List<DescribeGreConnectionsResponseGreConnections> greConnections;

    public static DescribeGreConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGreConnectionsResponse self = new DescribeGreConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGreConnectionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGreConnectionsResponse setUisId(String uisId) {
        this.uisId = uisId;
        return this;
    }
    public String getUisId() {
        return this.uisId;
    }

    public DescribeGreConnectionsResponse setUisName(String uisName) {
        this.uisName = uisName;
        return this;
    }
    public String getUisName() {
        return this.uisName;
    }

    public DescribeGreConnectionsResponse setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeGreConnectionsResponse setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public DescribeGreConnectionsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeGreConnectionsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeGreConnectionsResponse setGreConnections(java.util.List<DescribeGreConnectionsResponseGreConnections> greConnections) {
        this.greConnections = greConnections;
        return this;
    }
    public java.util.List<DescribeGreConnectionsResponseGreConnections> getGreConnections() {
        return this.greConnections;
    }

    public static class DescribeGreConnectionsResponseGreConnections extends TeaModel {
        @NameInMap("GreConnectionId")
        @Validation(required = true)
        public String greConnectionId;

        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("Cidrs")
        @Validation(required = true)
        public String cidrs;

        @NameInMap("LocalIp")
        @Validation(required = true)
        public String localIp;

        @NameInMap("LocalTunnelIp")
        @Validation(required = true)
        public String localTunnelIp;

        @NameInMap("CustomerIp")
        @Validation(required = true)
        public String customerIp;

        @NameInMap("CustomerTunnelIp")
        @Validation(required = true)
        public String customerTunnelIp;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        public static DescribeGreConnectionsResponseGreConnections build(java.util.Map<String, ?> map) throws Exception {
            DescribeGreConnectionsResponseGreConnections self = new DescribeGreConnectionsResponseGreConnections();
            return TeaModel.build(map, self);
        }

        public DescribeGreConnectionsResponseGreConnections setGreConnectionId(String greConnectionId) {
            this.greConnectionId = greConnectionId;
            return this;
        }
        public String getGreConnectionId() {
            return this.greConnectionId;
        }

        public DescribeGreConnectionsResponseGreConnections setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeGreConnectionsResponseGreConnections setCidrs(String cidrs) {
            this.cidrs = cidrs;
            return this;
        }
        public String getCidrs() {
            return this.cidrs;
        }

        public DescribeGreConnectionsResponseGreConnections setLocalIp(String localIp) {
            this.localIp = localIp;
            return this;
        }
        public String getLocalIp() {
            return this.localIp;
        }

        public DescribeGreConnectionsResponseGreConnections setLocalTunnelIp(String localTunnelIp) {
            this.localTunnelIp = localTunnelIp;
            return this;
        }
        public String getLocalTunnelIp() {
            return this.localTunnelIp;
        }

        public DescribeGreConnectionsResponseGreConnections setCustomerIp(String customerIp) {
            this.customerIp = customerIp;
            return this;
        }
        public String getCustomerIp() {
            return this.customerIp;
        }

        public DescribeGreConnectionsResponseGreConnections setCustomerTunnelIp(String customerTunnelIp) {
            this.customerTunnelIp = customerTunnelIp;
            return this;
        }
        public String getCustomerTunnelIp() {
            return this.customerTunnelIp;
        }

        public DescribeGreConnectionsResponseGreConnections setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGreConnectionsResponseGreConnections setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeGreConnectionsResponseGreConnections setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

    }

}
