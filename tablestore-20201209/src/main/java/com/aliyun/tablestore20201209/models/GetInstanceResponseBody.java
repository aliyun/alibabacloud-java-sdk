// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    @NameInMap("AliasName")
    public String aliasName;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("InstanceDescription")
    public String instanceDescription;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceSpecification")
    public String instanceSpecification;

    @NameInMap("InstanceStatus")
    public String instanceStatus;

    @NameInMap("Network")
    public String network;

    @NameInMap("NetworkSourceACL")
    public java.util.List<String> networkSourceACL;

    @NameInMap("NetworkTypeACL")
    public java.util.List<String> networkTypeACL;

    @NameInMap("PaymentType")
    public String paymentType;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("PolicyVersion")
    public Long policyVersion;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SPInstanceId")
    public String SPInstanceId;

    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("TableQuota")
    public Integer tableQuota;

    @NameInMap("Tags")
    public java.util.List<GetInstanceResponseBodyTags> tags;

    @NameInMap("UserId")
    public String userId;

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
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static GetInstanceResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyTags self = new GetInstanceResponseBodyTags();
            return TeaModel.build(map, self);
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

    }

}
