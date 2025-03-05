// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class CreateIpamResourceDiscoveryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("IpamResourceDiscoveryDescription")
    public String ipamResourceDiscoveryDescription;

    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("IpamResourceDiscoveryName")
    public String ipamResourceDiscoveryName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperatingRegionList")
    public java.util.List<String> operatingRegionList;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-aek2sermdd6****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<CreateIpamResourceDiscoveryRequestTag> tag;

    public static CreateIpamResourceDiscoveryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpamResourceDiscoveryRequest self = new CreateIpamResourceDiscoveryRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpamResourceDiscoveryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIpamResourceDiscoveryRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateIpamResourceDiscoveryRequest setIpamResourceDiscoveryDescription(String ipamResourceDiscoveryDescription) {
        this.ipamResourceDiscoveryDescription = ipamResourceDiscoveryDescription;
        return this;
    }
    public String getIpamResourceDiscoveryDescription() {
        return this.ipamResourceDiscoveryDescription;
    }

    public CreateIpamResourceDiscoveryRequest setIpamResourceDiscoveryName(String ipamResourceDiscoveryName) {
        this.ipamResourceDiscoveryName = ipamResourceDiscoveryName;
        return this;
    }
    public String getIpamResourceDiscoveryName() {
        return this.ipamResourceDiscoveryName;
    }

    public CreateIpamResourceDiscoveryRequest setOperatingRegionList(java.util.List<String> operatingRegionList) {
        this.operatingRegionList = operatingRegionList;
        return this;
    }
    public java.util.List<String> getOperatingRegionList() {
        return this.operatingRegionList;
    }

    public CreateIpamResourceDiscoveryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateIpamResourceDiscoveryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateIpamResourceDiscoveryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateIpamResourceDiscoveryRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateIpamResourceDiscoveryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateIpamResourceDiscoveryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateIpamResourceDiscoveryRequest setTag(java.util.List<CreateIpamResourceDiscoveryRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateIpamResourceDiscoveryRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateIpamResourceDiscoveryRequestTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateIpamResourceDiscoveryRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateIpamResourceDiscoveryRequestTag self = new CreateIpamResourceDiscoveryRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateIpamResourceDiscoveryRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateIpamResourceDiscoveryRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
