// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchOverMajorVersionUpgradeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-m5e4gegx63fh92bn</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/610399.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public byte[] regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The timeout period for the switchover operation. The operation is canceled after it has been performed for a time period that exceeds the value. Unit: seconds. Valid value: 10 to 3600.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SwitchoverTimeout")
    public Integer switchoverTimeout;

    /**
     * <p>The type of the switchover operation. Valid values:</p>
     * <ul>
     * <li>switch</li>
     * <li>cancel</li>
     * <li>interrupt</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>switch</p>
     */
    @NameInMap("Type")
    public String type;

    public static SwitchOverMajorVersionUpgradeRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchOverMajorVersionUpgradeRequest self = new SwitchOverMajorVersionUpgradeRequest();
        return TeaModel.build(map, self);
    }

    public SwitchOverMajorVersionUpgradeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SwitchOverMajorVersionUpgradeRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public SwitchOverMajorVersionUpgradeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SwitchOverMajorVersionUpgradeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SwitchOverMajorVersionUpgradeRequest setRegionId(byte[] regionId) {
        this.regionId = regionId;
        return this;
    }
    public byte[] getRegionId() {
        return this.regionId;
    }

    public SwitchOverMajorVersionUpgradeRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public SwitchOverMajorVersionUpgradeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SwitchOverMajorVersionUpgradeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SwitchOverMajorVersionUpgradeRequest setSwitchoverTimeout(Integer switchoverTimeout) {
        this.switchoverTimeout = switchoverTimeout;
        return this;
    }
    public Integer getSwitchoverTimeout() {
        return this.switchoverTimeout;
    }

    public SwitchOverMajorVersionUpgradeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
