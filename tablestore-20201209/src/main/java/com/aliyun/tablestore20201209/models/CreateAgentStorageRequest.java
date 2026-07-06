// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class CreateAgentStorageRequest extends TeaModel {
    /**
     * <p>The description of the agent storage. The description must be 3 to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>description for agent storage</p>
     */
    @NameInMap("AgentStorageDescription")
    public String agentStorageDescription;

    /**
     * <p>The name of the agent storage. The naming conventions are as follows:</p>
     * <ul>
     * <li>The name can contain only letters, digits, and hyphens (-).</li>
     * <li>The name must start with a letter.</li>
     * <li>The name cannot end with a hyphen (-).</li>
     * <li>The name is case-insensitive.</li>
     * <li>The name must be 3 to 16 characters in length.</li>
     * <li>The name cannot contain the following words: ali, ay, ots, taobao, or admin.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>first-agent</p>
     */
    @NameInMap("AgentStorageName")
    public String agentStorageName;

    /**
     * <p>(Deprecated) The network type of the agent storage. Valid values: NORMAL and VPC_CONSOLE. Default value: NORMAL.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("Network")
    public String network;

    /**
     * <p>The list of allowed network sources for the agent storage. All sources are allowed by default. Valid values:</p>
     * <ul>
     * <li>TRUST_PROXY: console.</li>
     * </ul>
     */
    @NameInMap("NetworkSourceACL")
    public java.util.List<String> networkSourceACL;

    /**
     * <p>The list of allowed network types for the agent storage. All types are allowed by default. Valid values:</p>
     * <ul>
     * <li>CLASSIC: classic network.</li>
     * <li>INTERNET: public network.</li>
     * <li>VPC: VPC network.</li>
     * </ul>
     */
    @NameInMap("NetworkTypeACL")
    public java.util.List<String> networkTypeACL;

    /**
     * <p>The access control policy for the agent storage in JSON format. For the syntax, see <a href="https://www.alibabacloud.com/help/en/ram/user-guide/policy-structure-and-syntax">https://www.alibabacloud.com/help/en/ram/user-guide/policy-structure-and-syntax</a>.</p>
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
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxh4em5jnbcd</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of tags.</p>
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
         * <p>The key of the tag. The key can be up to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>created</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. The value can be up to 64 characters in length.</p>
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
