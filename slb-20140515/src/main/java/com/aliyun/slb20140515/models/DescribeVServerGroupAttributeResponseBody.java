// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeVServerGroupAttributeResponseBody extends TeaModel {
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VServerGroupName")
    public String VServerGroupName;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("BackendServers")
    public java.util.List<DescribeVServerGroupAttributeResponseBodyBackendServers> backendServers;

    public static DescribeVServerGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVServerGroupAttributeResponseBody self = new DescribeVServerGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVServerGroupAttributeResponseBody setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public DescribeVServerGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVServerGroupAttributeResponseBody setVServerGroupName(String VServerGroupName) {
        this.VServerGroupName = VServerGroupName;
        return this;
    }
    public String getVServerGroupName() {
        return this.VServerGroupName;
    }

    public DescribeVServerGroupAttributeResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeVServerGroupAttributeResponseBody setBackendServers(java.util.List<DescribeVServerGroupAttributeResponseBodyBackendServers> backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public java.util.List<DescribeVServerGroupAttributeResponseBodyBackendServers> getBackendServers() {
        return this.backendServers;
    }

    public static class DescribeVServerGroupAttributeResponseBodyBackendServers extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public Integer weight;

        @NameInMap("Description")
        public String description;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("ServerId")
        public String serverId;

        public static DescribeVServerGroupAttributeResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeVServerGroupAttributeResponseBodyBackendServers self = new DescribeVServerGroupAttributeResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public DescribeVServerGroupAttributeResponseBodyBackendServers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeVServerGroupAttributeResponseBodyBackendServers setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public DescribeVServerGroupAttributeResponseBodyBackendServers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVServerGroupAttributeResponseBodyBackendServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeVServerGroupAttributeResponseBodyBackendServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

    }

}
