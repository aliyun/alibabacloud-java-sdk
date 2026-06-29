// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class GetAgentStorageResponseBody extends TeaModel {
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
     * 
     * <strong>example:</strong>
     * <p>agent-test</p>
     */
    @NameInMap("AgentStorageName")
    public String agentStorageName;

    /**
     * <p>The specification of the agent storage.</p>
     * 
     * <strong>example:</strong>
     * <p>SSD</p>
     */
    @NameInMap("AgentStorageSpecification")
    public String agentStorageSpecification;

    /**
     * <p>The status of the agent storage. Valid values:</p>
     * <ul>
     * <li>normal: Normal.</li>
     * <li>forbidden: Disabled.</li>
     * <li>deleting: Being released.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("AgentStorageStatus")
    public String agentStorageStatus;

    /**
     * <p>The alias of the agent storage.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-test</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>The time when the agent storage was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-12-23T07:24:33Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The list of network sources allowed for the agent storage. TRUST_PROXY: console.</p>
     */
    @NameInMap("NetworkSourceACL")
    public java.util.List<String> networkSourceACL;

    /**
     * <p>The list of network types allowed for the agent storage. CLASSIC: classic network. INTERNET: Internet. VPC: VPC network.</p>
     */
    @NameInMap("NetworkTypeACL")
    public java.util.List<String> networkTypeACL;

    /**
     * <p>The access control policy of the agent storage.</p>
     * 
     * <strong>example:</strong>
     * <p>drop</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The version of the agent storage policy.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PolicyVersion")
    public Long policyVersion;

    /**
     * <p>The region ID of the agent storage.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3104C83E-6E82-57FB-BB88-8C64CCFDEF89</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxh4em5jncda</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags of the agent storage.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetAgentStorageResponseBodyTags> tags;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16542312566</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GetAgentStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentStorageResponseBody self = new GetAgentStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentStorageResponseBody setAgentStorageDescription(String agentStorageDescription) {
        this.agentStorageDescription = agentStorageDescription;
        return this;
    }
    public String getAgentStorageDescription() {
        return this.agentStorageDescription;
    }

    public GetAgentStorageResponseBody setAgentStorageName(String agentStorageName) {
        this.agentStorageName = agentStorageName;
        return this;
    }
    public String getAgentStorageName() {
        return this.agentStorageName;
    }

    public GetAgentStorageResponseBody setAgentStorageSpecification(String agentStorageSpecification) {
        this.agentStorageSpecification = agentStorageSpecification;
        return this;
    }
    public String getAgentStorageSpecification() {
        return this.agentStorageSpecification;
    }

    public GetAgentStorageResponseBody setAgentStorageStatus(String agentStorageStatus) {
        this.agentStorageStatus = agentStorageStatus;
        return this;
    }
    public String getAgentStorageStatus() {
        return this.agentStorageStatus;
    }

    public GetAgentStorageResponseBody setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public GetAgentStorageResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetAgentStorageResponseBody setNetworkSourceACL(java.util.List<String> networkSourceACL) {
        this.networkSourceACL = networkSourceACL;
        return this;
    }
    public java.util.List<String> getNetworkSourceACL() {
        return this.networkSourceACL;
    }

    public GetAgentStorageResponseBody setNetworkTypeACL(java.util.List<String> networkTypeACL) {
        this.networkTypeACL = networkTypeACL;
        return this;
    }
    public java.util.List<String> getNetworkTypeACL() {
        return this.networkTypeACL;
    }

    public GetAgentStorageResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public GetAgentStorageResponseBody setPolicyVersion(Long policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }
    public Long getPolicyVersion() {
        return this.policyVersion;
    }

    public GetAgentStorageResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAgentStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentStorageResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetAgentStorageResponseBody setTags(java.util.List<GetAgentStorageResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetAgentStorageResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetAgentStorageResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class GetAgentStorageResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>Owner</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>(Deprecated) The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>keyTestA</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>(Deprecated) The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>00004a20240452b0</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>Tester</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetAgentStorageResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetAgentStorageResponseBodyTags self = new GetAgentStorageResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetAgentStorageResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAgentStorageResponseBodyTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetAgentStorageResponseBodyTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public GetAgentStorageResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
