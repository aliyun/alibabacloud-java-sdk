// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetLoadBalancerModificationProtectionRequest extends TeaModel {
    /**
     * <p>The ID of the CLB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-bp1b6c719dfa08e*****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The reason why the configuration read-only mode is enabled. The value must be 1 to 80 characters in length. It must start with a letter and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * <blockquote>
     * <p> This parameter is valid only if the <strong>ModificationProtectionStatus</strong> parameter is set to <strong>ConsoleProtection</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Configuration change</p>
     */
    @NameInMap("ModificationProtectionReason")
    public String modificationProtectionReason;

    /**
     * <p>Specifies whether to enable the configuration read-only mode. Valid values:</p>
     * <ul>
     * <li><strong>NonProtection</strong>: disables the configuration read-only mode. After you disable the configuration read-only mode, the value of <strong>ModificationProtectionReason</strong> is cleared.</li>
     * <li><strong>ConsoleProtection</strong>: enables the configuration read-only mode.</li>
     * </ul>
     * <blockquote>
     * <p> If you set this parameter to <strong>ConsoleProtection</strong>, you cannot use the CLB console to modify instance configurations. However, you can call API operations to modify instance configurations.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ConsoleProtection</p>
     */
    @NameInMap("ModificationProtectionStatus")
    public String modificationProtectionStatus;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the CLB instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/27584.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static SetLoadBalancerModificationProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerModificationProtectionRequest self = new SetLoadBalancerModificationProtectionRequest();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerModificationProtectionRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public SetLoadBalancerModificationProtectionRequest setModificationProtectionReason(String modificationProtectionReason) {
        this.modificationProtectionReason = modificationProtectionReason;
        return this;
    }
    public String getModificationProtectionReason() {
        return this.modificationProtectionReason;
    }

    public SetLoadBalancerModificationProtectionRequest setModificationProtectionStatus(String modificationProtectionStatus) {
        this.modificationProtectionStatus = modificationProtectionStatus;
        return this;
    }
    public String getModificationProtectionStatus() {
        return this.modificationProtectionStatus;
    }

    public SetLoadBalancerModificationProtectionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetLoadBalancerModificationProtectionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetLoadBalancerModificationProtectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetLoadBalancerModificationProtectionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetLoadBalancerModificationProtectionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
