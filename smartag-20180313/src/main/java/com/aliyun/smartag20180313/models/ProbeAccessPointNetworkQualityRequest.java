// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ProbeAccessPointNetworkQualityRequest extends TeaModel {
    /**
     * <p>The IDs of the access point.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccessPointIds")
    public java.util.List<Integer> accessPointIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the SAG instance is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the SAG instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-6z21oj0vjjrx6s****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    public static ProbeAccessPointNetworkQualityRequest build(java.util.Map<String, ?> map) throws Exception {
        ProbeAccessPointNetworkQualityRequest self = new ProbeAccessPointNetworkQualityRequest();
        return TeaModel.build(map, self);
    }

    public ProbeAccessPointNetworkQualityRequest setAccessPointIds(java.util.List<Integer> accessPointIds) {
        this.accessPointIds = accessPointIds;
        return this;
    }
    public java.util.List<Integer> getAccessPointIds() {
        return this.accessPointIds;
    }

    public ProbeAccessPointNetworkQualityRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ProbeAccessPointNetworkQualityRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ProbeAccessPointNetworkQualityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ProbeAccessPointNetworkQualityRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ProbeAccessPointNetworkQualityRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ProbeAccessPointNetworkQualityRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

}
