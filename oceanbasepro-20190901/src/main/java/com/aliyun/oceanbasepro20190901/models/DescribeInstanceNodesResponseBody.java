// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceNodesResponseBody extends TeaModel {
    @NameInMap("Nodes")
    public java.util.List<DescribeInstanceNodesResponseBodyNodes> nodes;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeInstanceNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceNodesResponseBody self = new DescribeInstanceNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceNodesResponseBody setNodes(java.util.List<DescribeInstanceNodesResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<DescribeInstanceNodesResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public DescribeInstanceNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceNodesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstanceNodesResponseBodyNodes extends TeaModel {
        @NameInMap("AvailableZoneId")
        public String availableZoneId;

        @NameInMap("ServerClass")
        public String serverClass;

        @NameInMap("ServerName")
        public String serverName;

        @NameInMap("ServerStatus")
        public String serverStatus;

        public static DescribeInstanceNodesResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceNodesResponseBodyNodes self = new DescribeInstanceNodesResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceNodesResponseBodyNodes setAvailableZoneId(String availableZoneId) {
            this.availableZoneId = availableZoneId;
            return this;
        }
        public String getAvailableZoneId() {
            return this.availableZoneId;
        }

        public DescribeInstanceNodesResponseBodyNodes setServerClass(String serverClass) {
            this.serverClass = serverClass;
            return this;
        }
        public String getServerClass() {
            return this.serverClass;
        }

        public DescribeInstanceNodesResponseBodyNodes setServerName(String serverName) {
            this.serverName = serverName;
            return this;
        }
        public String getServerName() {
            return this.serverName;
        }

        public DescribeInstanceNodesResponseBodyNodes setServerStatus(String serverStatus) {
            this.serverStatus = serverStatus;
            return this;
        }
        public String getServerStatus() {
            return this.serverStatus;
        }

    }

}
