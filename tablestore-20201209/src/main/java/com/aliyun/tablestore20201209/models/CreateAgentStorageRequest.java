// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class CreateAgentStorageRequest extends TeaModel {
    /**
     * <p>agent storage description</p>
     * 
     * <strong>example:</strong>
     * <p>description for agent storage</p>
     */
    @NameInMap("AgentStorageDescription")
    public String agentStorageDescription;

    /**
     * <p>agent storage name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>first-ins</p>
     */
    @NameInMap("AgentStorageName")
    public String agentStorageName;

    /**
     * <p>（已弃用）智能体存储网络类型。NORMAL, VPC_CONSOLE。默认为NORMAL。</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("Network")
    public String network;

    /**
     * <p>The list of network sources allowed for the agent storage instance. By default, all network sources are allowed. Valid values: TRUST_PROXY: console.</p>
     */
    @NameInMap("NetworkSourceACL")
    public java.util.List<String> networkSourceACL;

    /**
     * <p>The list of network types allowed for the agent storage instance. By default, all network types are allowed. Valid values: CLASSIC: classic network. INTERNET: Internet. VPC: VPC.</p>
     */
    @NameInMap("NetworkTypeACL")
    public java.util.List<String> networkTypeACL;

    /**
     * <p>The access control policy of the agent storage instance in JSON format. For the policy syntax, see <a href="https://www.alibabacloud.com/help/en/ram/user-guide/policy-structure-and-syntax">https://www.alibabacloud.com/help/en/ram/user-guide/policy-structure-and-syntax</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;Version&quot;: &quot;1&quot;,
     *     &quot;Statement&quot;: [
     *         {
     *             &quot;Action&quot;: [
     *                 &quot;ots:<em>&quot;
     *             ],
     *             &quot;Resource&quot;: [
     *                 &quot;acs:ots:</em>:13791xxxxxxxxxxx:agentstorage/myagentstorage*&quot;
     *             ],
     *             &quot;Principal&quot;: [
     *                 &quot;*&quot;
     *             ],
     *             &quot;Effect&quot;: &quot;Allow&quot;,
     *             &quot;Condition&quot;: {
     *                 &quot;StringEquals&quot;: {
     *                     &quot;ots:TLSVersion&quot;: [
     *                         &quot;1.2&quot;
     *                     ]
     *                 },
     *                 &quot;IpAddress&quot;: {
     *                     &quot;acs:SourceIp&quot;: [
     *                         &quot;192.168.0.1&quot;,
     *                         &quot;198.51.100.1&quot;
     *                     ]
     *                 }
     *             }
     *         }
     *     ]
     * }</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>resource group id</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxh4em5jnbcd</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>tag</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateAgentStorageRequestTags> tags;

    public static CreateAgentStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentStorageRequest self = new CreateAgentStorageRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentStorageRequest setAgentStorageDescription(String agentStorageDescription) {
        this.agentStorageDescription = agentStorageDescription;
        return this;
    }
    public String getAgentStorageDescription() {
        return this.agentStorageDescription;
    }

    public CreateAgentStorageRequest setAgentStorageName(String agentStorageName) {
        this.agentStorageName = agentStorageName;
        return this;
    }
    public String getAgentStorageName() {
        return this.agentStorageName;
    }

    public CreateAgentStorageRequest setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public CreateAgentStorageRequest setNetworkSourceACL(java.util.List<String> networkSourceACL) {
        this.networkSourceACL = networkSourceACL;
        return this;
    }
    public java.util.List<String> getNetworkSourceACL() {
        return this.networkSourceACL;
    }

    public CreateAgentStorageRequest setNetworkTypeACL(java.util.List<String> networkTypeACL) {
        this.networkTypeACL = networkTypeACL;
        return this;
    }
    public java.util.List<String> getNetworkTypeACL() {
        return this.networkTypeACL;
    }

    public CreateAgentStorageRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public CreateAgentStorageRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateAgentStorageRequest setTags(java.util.List<CreateAgentStorageRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateAgentStorageRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateAgentStorageRequestTags extends TeaModel {
        /**
         * <p>The key of the tag.
         * The key can be up to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>created</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.
         * The value can be up to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0woauavextilfqr61</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateAgentStorageRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentStorageRequestTags self = new CreateAgentStorageRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateAgentStorageRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAgentStorageRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
