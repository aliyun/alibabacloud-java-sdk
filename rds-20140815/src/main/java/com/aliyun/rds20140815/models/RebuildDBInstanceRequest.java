// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RebuildDBInstanceRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The dedicated cluster ID. You can call the DescribeDedicatedHostGroups operation to query the dedicated cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dhg-4nxxxxxxx</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>The ID of the host on which the system rebuilds the secondary instance.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system preferentially rebuilds the secondary instance on the original host on which the secondary instance resides. If the remaining storage of the original host is insufficient, the system rebuilds the secondary instance on a host on which the primary instance does not reside. If no suitable hosts are found, the system reports an error that indicates insufficient storage.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>i-bpxxxxxxx</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The role of the secondary instance that you want to rebuild. Valid values:</p>
     * <ul>
     * <li><strong>FOLLOWER</strong>: secondary instance</li>
     * <li><strong>LOG</strong>: logger instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FOLLOWER</p>
     */
    @NameInMap("RebuildNodeType")
    public String rebuildNodeType;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
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

    public static RebuildDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RebuildDBInstanceRequest self = new RebuildDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RebuildDBInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public RebuildDBInstanceRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public RebuildDBInstanceRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public RebuildDBInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RebuildDBInstanceRequest setRebuildNodeType(String rebuildNodeType) {
        this.rebuildNodeType = rebuildNodeType;
        return this;
    }
    public String getRebuildNodeType() {
        return this.rebuildNodeType;
    }

    public RebuildDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RebuildDBInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RebuildDBInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
