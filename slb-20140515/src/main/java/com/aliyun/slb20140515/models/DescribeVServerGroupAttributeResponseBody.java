// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeVServerGroupAttributeResponseBody extends TeaModel {
    /**
     * <p>The list of backend servers.</p>
     */
    @NameInMap("BackendServers")
    public DescribeVServerGroupAttributeResponseBodyBackendServers backendServers;

    /**
     * <p>The time when the CLB instance was created. The time follows the `YYYY-MM-DDThh:mm:ssZ` format.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The ID of the CLB instance.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tags")
    public DescribeVServerGroupAttributeResponseBodyTags tags;

    /**
     * <p>The ID of the vServer group.</p>
     */
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    /**
     * <p>The name of the vServer group.</p>
     */
    @NameInMap("VServerGroupName")
    public String VServerGroupName;

    public static DescribeVServerGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVServerGroupAttributeResponseBody self = new DescribeVServerGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVServerGroupAttributeResponseBody setBackendServers(DescribeVServerGroupAttributeResponseBodyBackendServers backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public DescribeVServerGroupAttributeResponseBodyBackendServers getBackendServers() {
        return this.backendServers;
    }

    public DescribeVServerGroupAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeVServerGroupAttributeResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeVServerGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVServerGroupAttributeResponseBody setTags(DescribeVServerGroupAttributeResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeVServerGroupAttributeResponseBodyTags getTags() {
        return this.tags;
    }

    public DescribeVServerGroupAttributeResponseBody setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public DescribeVServerGroupAttributeResponseBody setVServerGroupName(String VServerGroupName) {
        this.VServerGroupName = VServerGroupName;
        return this;
    }
    public String getVServerGroupName() {
        return this.VServerGroupName;
    }

    public static class DescribeVServerGroupAttributeResponseBodyBackendServersBackendServer extends TeaModel {
        /**
         * <p>The description of the vServer group.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The port used by the backend server.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the ECS instance, ENI, or elastic container instance.</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The IP address of the ECS instance, ENI, or elastic container instance.</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The type of the backend server. Valid values:</p>
         * <br>
         * <p>*   **ecs** (default): an Elastic Compute Service (ECS) instance</p>
         * <p>*   **eni**: an elastic network interface (ENI)</p>
         * <p>*   **eci**: an elastic container instance</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the backend server.</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static DescribeVServerGroupAttributeResponseBodyBackendServersBackendServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeVServerGroupAttributeResponseBodyBackendServersBackendServer self = new DescribeVServerGroupAttributeResponseBodyBackendServersBackendServer();
            return TeaModel.build(map, self);
        }

        public DescribeVServerGroupAttributeResponseBodyBackendServersBackendServer setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVServerGroupAttributeResponseBodyBackendServersBackendServer setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeVServerGroupAttributeResponseBodyBackendServersBackendServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public DescribeVServerGroupAttributeResponseBodyBackendServersBackendServer setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public DescribeVServerGroupAttributeResponseBodyBackendServersBackendServer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeVServerGroupAttributeResponseBodyBackendServersBackendServer setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeVServerGroupAttributeResponseBodyBackendServers extends TeaModel {
        @NameInMap("BackendServer")
        public java.util.List<DescribeVServerGroupAttributeResponseBodyBackendServersBackendServer> backendServer;

        public static DescribeVServerGroupAttributeResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeVServerGroupAttributeResponseBodyBackendServers self = new DescribeVServerGroupAttributeResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public DescribeVServerGroupAttributeResponseBodyBackendServers setBackendServer(java.util.List<DescribeVServerGroupAttributeResponseBodyBackendServersBackendServer> backendServer) {
            this.backendServer = backendServer;
            return this;
        }
        public java.util.List<DescribeVServerGroupAttributeResponseBodyBackendServersBackendServer> getBackendServer() {
            return this.backendServer;
        }

    }

    public static class DescribeVServerGroupAttributeResponseBodyTagsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeVServerGroupAttributeResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVServerGroupAttributeResponseBodyTagsTag self = new DescribeVServerGroupAttributeResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeVServerGroupAttributeResponseBodyTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeVServerGroupAttributeResponseBodyTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeVServerGroupAttributeResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeVServerGroupAttributeResponseBodyTagsTag> tag;

        public static DescribeVServerGroupAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVServerGroupAttributeResponseBodyTags self = new DescribeVServerGroupAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeVServerGroupAttributeResponseBodyTags setTag(java.util.List<DescribeVServerGroupAttributeResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeVServerGroupAttributeResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}
