// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeMasterSlaveServerGroupAttributeResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The region ID of the Classic Load Balancer (CLB) instance.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The ID of the associated CLB instance.</p>
     */
    @NameInMap("MasterSlaveBackendServers")
    public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers masterSlaveBackendServers;

    /**
     * <p>The type of the backend server. Valid values:</p>
     * <br>
     * <p>*   **ecs** (default): an Elastic Compute Service (ECS) instance</p>
     * <p>*   **eni**: an elastic network interface (ENI)</p>
     */
    @NameInMap("MasterSlaveServerGroupId")
    public String masterSlaveServerGroupId;

    /**
     * <p>The name of the primary/secondary server group.</p>
     */
    @NameInMap("MasterSlaveServerGroupName")
    public String masterSlaveServerGroupName;

    /**
     * <p>The ID of the primary/secondary server group.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tags")
    public DescribeMasterSlaveServerGroupAttributeResponseBodyTags tags;

    public static DescribeMasterSlaveServerGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMasterSlaveServerGroupAttributeResponseBody self = new DescribeMasterSlaveServerGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMasterSlaveServerGroupAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeMasterSlaveServerGroupAttributeResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeMasterSlaveServerGroupAttributeResponseBody setMasterSlaveBackendServers(DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers masterSlaveBackendServers) {
        this.masterSlaveBackendServers = masterSlaveBackendServers;
        return this;
    }
    public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers getMasterSlaveBackendServers() {
        return this.masterSlaveBackendServers;
    }

    public DescribeMasterSlaveServerGroupAttributeResponseBody setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
        this.masterSlaveServerGroupId = masterSlaveServerGroupId;
        return this;
    }
    public String getMasterSlaveServerGroupId() {
        return this.masterSlaveServerGroupId;
    }

    public DescribeMasterSlaveServerGroupAttributeResponseBody setMasterSlaveServerGroupName(String masterSlaveServerGroupName) {
        this.masterSlaveServerGroupName = masterSlaveServerGroupName;
        return this;
    }
    public String getMasterSlaveServerGroupName() {
        return this.masterSlaveServerGroupName;
    }

    public DescribeMasterSlaveServerGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMasterSlaveServerGroupAttributeResponseBody setTags(DescribeMasterSlaveServerGroupAttributeResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeMasterSlaveServerGroupAttributeResponseBodyTags getTags() {
        return this.tags;
    }

    public static class DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer extends TeaModel {
        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("ServerType")
        public String serverType;

        /**
         * <p>The weight of the backend server.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The type of backend server. Valid values: **Master and Slave. Default value: Master.</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer self = new DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer();
            return TeaModel.build(map, self);
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers extends TeaModel {
        @NameInMap("MasterSlaveBackendServer")
        public java.util.List<DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer> masterSlaveBackendServer;

        public static DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers self = new DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers();
            return TeaModel.build(map, self);
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers setMasterSlaveBackendServer(java.util.List<DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer> masterSlaveBackendServer) {
            this.masterSlaveBackendServer = masterSlaveBackendServer;
            return this;
        }
        public java.util.List<DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer> getMasterSlaveBackendServer() {
            return this.masterSlaveBackendServer;
        }

    }

    public static class DescribeMasterSlaveServerGroupAttributeResponseBodyTagsTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeMasterSlaveServerGroupAttributeResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupAttributeResponseBodyTagsTag self = new DescribeMasterSlaveServerGroupAttributeResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBodyTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBodyTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeMasterSlaveServerGroupAttributeResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeMasterSlaveServerGroupAttributeResponseBodyTagsTag> tag;

        public static DescribeMasterSlaveServerGroupAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupAttributeResponseBodyTags self = new DescribeMasterSlaveServerGroupAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBodyTags setTag(java.util.List<DescribeMasterSlaveServerGroupAttributeResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeMasterSlaveServerGroupAttributeResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}
