// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceMajorVersionPrecheckRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call DescribeDBInstances to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp1c808s731l****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The major engine version of the target instance. The version must be later than the current major engine version of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>17.0</p>
     */
    @NameInMap("TargetMajorVersion")
    public String targetMajorVersion;

    /**
     * <p>The upgrade mode. Valid values:</p>
     * <ul>
     * <li><strong>zeroDownTimeUpgrade</strong>: zero-downtime upgrade.</li>
     * <li><strong>inPlaceUpgrade</strong>: in-place upgrade.</li>
     * <li><strong>greenBlueDeployment</strong>: blue-green deployment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zeroDownTimeUpgrade</p>
     */
    @NameInMap("UpgradeMode")
    public String upgradeMode;

    public static UpgradeDBInstanceMajorVersionPrecheckRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceMajorVersionPrecheckRequest self = new UpgradeDBInstanceMajorVersionPrecheckRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceMajorVersionPrecheckRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpgradeDBInstanceMajorVersionPrecheckRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpgradeDBInstanceMajorVersionPrecheckRequest setTargetMajorVersion(String targetMajorVersion) {
        this.targetMajorVersion = targetMajorVersion;
        return this;
    }
    public String getTargetMajorVersion() {
        return this.targetMajorVersion;
    }

    public UpgradeDBInstanceMajorVersionPrecheckRequest setUpgradeMode(String upgradeMode) {
        this.upgradeMode = upgradeMode;
        return this;
    }
    public String getUpgradeMode() {
        return this.upgradeMode;
    }

}
