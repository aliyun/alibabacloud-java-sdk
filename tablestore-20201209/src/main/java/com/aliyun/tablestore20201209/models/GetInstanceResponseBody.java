// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    /**
     * <p>The instance alias.</p>
     * 
     * <strong>example:</strong>
     * <p>instance-test</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>The time when the instance was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-12-23T07:24:33Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The upper limit for the VCUs of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("ElasticVCUUpperLimit")
    public Float elasticVCUUpperLimit;

    /**
     * <p>The description of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Description of the test instance.</p>
     */
    @NameInMap("InstanceDescription")
    public String instanceDescription;

    /**
     * <p>The name of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>instance-test</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The type of the instance.</p>
     * <ul>
     * <li>SSD: high-performance instance</li>
     * <li>HYBRID: capacity instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SSD</p>
     */
    @NameInMap("InstanceSpecification")
    public String instanceSpecification;

    /**
     * <p>The status of the instance.</p>
     * <ul>
     * <li>normal: The instance works as expected.</li>
     * <li>forbidden: The instance is disabled.</li>
     * <li>Deleting: The instance is being deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>Indicates whether zone-redundant storage (ZRS) is enabled for the instance.</p>
     * <ul>
     * <li>true: ZRS is enabled for the instance.</li>
     * <li>false: Locally redundant storage (LRS) is enabled for the instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsMultiAZ")
    public Boolean isMultiAZ;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <ul>
     * <li>VPC: The instance can be accessed only over the bound virtual private clouds (VPCs).</li>
     * <li>VPC_CONSOLE: The instance can be accessed from the Tablestore console or over the bound VPCs.</li>
     * <li>NORMAL: The instance can be accessed from networks of the custom types.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("Network")
    public String network;

    /**
     * <p>The sources of the network from which access is allowed. Valid value:</p>
     * <p>TRUST_PROXY: console</p>
     */
    @NameInMap("NetworkSourceACL")
    public java.util.List<String> networkSourceACL;

    /**
     * <p>The types of the network from which access is allowed. Valid values:</p>
     * <ul>
     * <li>CLASSIC: the classic network</li>
     * <li>INTERNET: the Internet</li>
     * <li>VPC: VPCs</li>
     * </ul>
     */
    @NameInMap("NetworkTypeACL")
    public java.util.List<String> networkTypeACL;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li>Subscription: subscription</li>
     * <li>PayAsYouGo: pay-as-you-go</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Subscription</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The instance policy.</p>
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
     *                 &quot;acs:ots:</em>:13791xxxxxxxxxxx:instance/myinstance*&quot;
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
     * <p>The version of the instance policy.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PolicyVersion")
    public Long policyVersion;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID, which can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>757E172A-F94B-5E78-8A23-D9068E42F2E9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxh4em5jncda</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ots_standard_public_cn-9lb34u7u5001</p>
     */
    @NameInMap("SPInstanceId")
    public String SPInstanceId;

    /**
     * <p>The storage type.</p>
     * <ul>
     * <li>SSD: high-performance</li>
     * <li>HYBRID: capacity</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HYBRID</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The total number of tables in the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TableQuota")
    public Integer tableQuota;

    /**
     * <p>The tags of the instance.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetInstanceResponseBodyTags> tags;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16542312566</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The VCU quota.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("VCUQuota")
    public Integer VCUQuota;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public GetInstanceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetInstanceResponseBody setElasticVCUUpperLimit(Float elasticVCUUpperLimit) {
        this.elasticVCUUpperLimit = elasticVCUUpperLimit;
        return this;
    }
    public Float getElasticVCUUpperLimit() {
        return this.elasticVCUUpperLimit;
    }

    public GetInstanceResponseBody setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
        return this;
    }
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    public GetInstanceResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public GetInstanceResponseBody setInstanceSpecification(String instanceSpecification) {
        this.instanceSpecification = instanceSpecification;
        return this;
    }
    public String getInstanceSpecification() {
        return this.instanceSpecification;
    }

    public GetInstanceResponseBody setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public GetInstanceResponseBody setIsMultiAZ(Boolean isMultiAZ) {
        this.isMultiAZ = isMultiAZ;
        return this;
    }
    public Boolean getIsMultiAZ() {
        return this.isMultiAZ;
    }

    public GetInstanceResponseBody setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public GetInstanceResponseBody setNetworkSourceACL(java.util.List<String> networkSourceACL) {
        this.networkSourceACL = networkSourceACL;
        return this;
    }
    public java.util.List<String> getNetworkSourceACL() {
        return this.networkSourceACL;
    }

    public GetInstanceResponseBody setNetworkTypeACL(java.util.List<String> networkTypeACL) {
        this.networkTypeACL = networkTypeACL;
        return this;
    }
    public java.util.List<String> getNetworkTypeACL() {
        return this.networkTypeACL;
    }

    public GetInstanceResponseBody setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public GetInstanceResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public GetInstanceResponseBody setPolicyVersion(Long policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }
    public Long getPolicyVersion() {
        return this.policyVersion;
    }

    public GetInstanceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetInstanceResponseBody setSPInstanceId(String SPInstanceId) {
        this.SPInstanceId = SPInstanceId;
        return this;
    }
    public String getSPInstanceId() {
        return this.SPInstanceId;
    }

    public GetInstanceResponseBody setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public GetInstanceResponseBody setTableQuota(Integer tableQuota) {
        this.tableQuota = tableQuota;
        return this;
    }
    public Integer getTableQuota() {
        return this.tableQuota;
    }

    public GetInstanceResponseBody setTags(java.util.List<GetInstanceResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetInstanceResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetInstanceResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetInstanceResponseBody setVCUQuota(Integer VCUQuota) {
        this.VCUQuota = VCUQuota;
        return this;
    }
    public Integer getVCUQuota() {
        return this.VCUQuota;
    }

    public static class GetInstanceResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>tag</p>
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
         * <p>333</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetInstanceResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyTags self = new GetInstanceResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetInstanceResponseBodyTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetInstanceResponseBodyTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public GetInstanceResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
