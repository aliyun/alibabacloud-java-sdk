// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeMasterSlaveServerGroupAttributeResponseBody extends TeaModel {
    /**
     * <p>The time when the CLB instance was created. The time follows the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-02T02:49:05Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The ID of the associated CLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-14fadafw4343a******</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>A list of backend servers in the primary/secondary server group.</p>
     */
    @NameInMap("MasterSlaveBackendServers")
    public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers masterSlaveBackendServers;

    /**
     * <p>The ID of the primary/secondary server group.</p>
     * 
     * <strong>example:</strong>
     * <p>rsp-cige6******</p>
     */
    @NameInMap("MasterSlaveServerGroupId")
    public String masterSlaveServerGroupId;

    /**
     * <p>The name of the primary/secondary server group.</p>
     * 
     * <strong>example:</strong>
     * <p>Group1</p>
     */
    @NameInMap("MasterSlaveServerGroupName")
    public String masterSlaveServerGroupName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9DEC9C28-AB05-4DDF-9A78-6B08EC9CE18C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tag list.</p>
     */
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
         * <p>The description of the primary/secondary server group.</p>
         * 
         * <strong>example:</strong>
         * <p>Primary and secondary server group description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The port that is used by the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>vm-hrf******</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The type of backend server. Valid values: <strong>Master</strong> and <strong>Slave</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Slave</p>
         */
        @NameInMap("ServerType")
        public String serverType;

        /**
         * <p>The type of the backend server. Valid values:</p>
         * <ul>
         * <li><strong>ecs</strong> (default): Elastic Compute Service (ECS) instance</li>
         * <li><strong>eni</strong>: elastic network interface (ENI)</li>
         * <li><strong>eci</strong>: elastic container instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
        /**
         * <p>The tag key. Valid values of N: <strong>1</strong> to <strong>20</strong>. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value. Valid values of N: <strong>1</strong> to <strong>20</strong>. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. The tag value cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
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
