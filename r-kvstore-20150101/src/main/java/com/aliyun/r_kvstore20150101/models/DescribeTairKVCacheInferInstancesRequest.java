// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairKVCacheInferInstancesRequest extends TeaModel {
    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription.</li>
     * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The expiration status of the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: expired.</li>
     * <li><strong>false</strong>: not expired.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Expired")
    public String expired;

    /**
     * <p>The instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>kvcache.cu.g4c.2</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The IDs of the instances that you want to query.</p>
     * <blockquote>
     * <p>To specify multiple instance IDs, separate them with commas (,). You can specify up to 30 instance IDs in a single request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>tk-2zefe7728c2c****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The instance status. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: Normal.</li>
     * <li><strong>Creating</strong>: The instance is being created.</li>
     * </ul>
     * <blockquote>
     * <p>For more information about instance statuses, see <a href="https://help.aliyun.com/document_detail/200740.html">Instance states and impacts</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>The network type. Valid values:</p>
     * <ul>
     * <li><strong>VPC</strong>: virtual private cloud (VPC). This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. The value starts from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The private IP address in the VPC. This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.49.***</p>
     */
    @NameInMap("PrivateIp")
    public String privateIp;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. This parameter can be left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyiu4ekp****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The keyword used for fuzzy search by instance name or instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>apitest</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The tags of the instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeTairKVCacheInferInstancesRequestTag> tag;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1e7clcw529l773d****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1nme44gek34slfc****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-e</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeTairKVCacheInferInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairKVCacheInferInstancesRequest self = new DescribeTairKVCacheInferInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTairKVCacheInferInstancesRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeTairKVCacheInferInstancesRequest setExpired(String expired) {
        this.expired = expired;
        return this;
    }
    public String getExpired() {
        return this.expired;
    }

    public DescribeTairKVCacheInferInstancesRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public DescribeTairKVCacheInferInstancesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeTairKVCacheInferInstancesRequest setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public DescribeTairKVCacheInferInstancesRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeTairKVCacheInferInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeTairKVCacheInferInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeTairKVCacheInferInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTairKVCacheInferInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTairKVCacheInferInstancesRequest setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }
    public String getPrivateIp() {
        return this.privateIp;
    }

    public DescribeTairKVCacheInferInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeTairKVCacheInferInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeTairKVCacheInferInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeTairKVCacheInferInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeTairKVCacheInferInstancesRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public DescribeTairKVCacheInferInstancesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeTairKVCacheInferInstancesRequest setTag(java.util.List<DescribeTairKVCacheInferInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeTairKVCacheInferInstancesRequestTag> getTag() {
        return this.tag;
    }

    public DescribeTairKVCacheInferInstancesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeTairKVCacheInferInstancesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeTairKVCacheInferInstancesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeTairKVCacheInferInstancesRequestTag extends TeaModel {
        /**
         * <p>The key of the tag. The key and value of a tag form a key-value pair.</p>
         * <blockquote>
         * <p>You can specify up to 5 key-value pairs of tags in a single request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>key1_test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * <blockquote>
         * <p><strong>N</strong> specifies the sequence number of the tag. For example, <strong>Tag.1.Value</strong> specifies the value of the first tag, and <strong>Tag.2.Value</strong> specifies the value of the second tag.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testvalue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeTairKVCacheInferInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairKVCacheInferInstancesRequestTag self = new DescribeTairKVCacheInferInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeTairKVCacheInferInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeTairKVCacheInferInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
