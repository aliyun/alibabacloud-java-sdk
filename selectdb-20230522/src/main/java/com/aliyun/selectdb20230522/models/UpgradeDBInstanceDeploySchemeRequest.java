// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceDeploySchemeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-7213cjv****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MultiZone")
    public java.util.List<UpgradeDBInstanceDeploySchemeRequestMultiZone> multiZone;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static UpgradeDBInstanceDeploySchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceDeploySchemeRequest self = new UpgradeDBInstanceDeploySchemeRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceDeploySchemeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpgradeDBInstanceDeploySchemeRequest setMultiZone(java.util.List<UpgradeDBInstanceDeploySchemeRequestMultiZone> multiZone) {
        this.multiZone = multiZone;
        return this;
    }
    public java.util.List<UpgradeDBInstanceDeploySchemeRequestMultiZone> getMultiZone() {
        return this.multiZone;
    }

    public UpgradeDBInstanceDeploySchemeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradeDBInstanceDeploySchemeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static class UpgradeDBInstanceDeploySchemeRequestMultiZone extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-k</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static UpgradeDBInstanceDeploySchemeRequestMultiZone build(java.util.Map<String, ?> map) throws Exception {
            UpgradeDBInstanceDeploySchemeRequestMultiZone self = new UpgradeDBInstanceDeploySchemeRequestMultiZone();
            return TeaModel.build(map, self);
        }

        public UpgradeDBInstanceDeploySchemeRequestMultiZone setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public UpgradeDBInstanceDeploySchemeRequestMultiZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
