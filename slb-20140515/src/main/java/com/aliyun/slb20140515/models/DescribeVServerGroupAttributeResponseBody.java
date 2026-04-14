// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeVServerGroupAttributeResponseBody extends TeaModel {
    @NameInMap("BackendServers")
    public DescribeVServerGroupAttributeResponseBodyBackendServers backendServers;

    /**
     * <p>The time when the CLB instance was created. The time follows the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-08-31T02:49:05Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The ID of the CLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-jfakd****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9DEC9C28-AB05-4DDF-9A78-6B08EC9CE18C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tags")
    public DescribeVServerGroupAttributeResponseBodyTags tags;

    /**
     * <p>The ID of the vServer group.</p>
     * 
     * <strong>example:</strong>
     * <p>rsp-cige6****</p>
     */
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    /**
     * <p>The name of the vServer group.</p>
     * 
     * <strong>example:</strong>
     * <p>Group1</p>
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
        @NameInMap("Description")
        public String description;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("ServerIp")
        public String serverIp;

        @NameInMap("Type")
        public String type;

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
        @NameInMap("TagKey")
        public String tagKey;

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
