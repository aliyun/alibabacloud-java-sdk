// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteCommonBandwidthPackageRequest extends TeaModel {
    /**
     * <p>The ID of the Internet Shared Bandwidth instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cbwp-2ze2ic1xd2qeqk145pn4u</p>
     */
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    /**
     * <p>The force delete option is enabled or disabled for the Internet Shared Bandwidth instance. Valid values: </p>
     * <ul>
     * <li><p><strong>false</strong> (default): Deletes only the Internet Shared Bandwidth instance that does not contain EIPs.</p>
     * </li>
     * <li><p><strong>true</strong>: Removes all EIPs from the Internet Shared Bandwidth instance and then deletes the instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public String force;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region where the Internet Shared Bandwidth instance resides. </p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
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

    public static DeleteCommonBandwidthPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommonBandwidthPackageRequest self = new DeleteCommonBandwidthPackageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCommonBandwidthPackageRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public DeleteCommonBandwidthPackageRequest setForce(String force) {
        this.force = force;
        return this;
    }
    public String getForce() {
        return this.force;
    }

    public DeleteCommonBandwidthPackageRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteCommonBandwidthPackageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteCommonBandwidthPackageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteCommonBandwidthPackageRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteCommonBandwidthPackageRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
