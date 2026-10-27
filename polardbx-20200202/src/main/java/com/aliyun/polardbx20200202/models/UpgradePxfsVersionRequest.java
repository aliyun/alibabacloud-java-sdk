// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpgradePxfsVersionRequest extends TeaModel {
    /**
     * <p>The PolarDB-X instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-xxxxxxxx</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The target minor version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.0</p>
     */
    @NameInMap("MinorVersion")
    public String minorVersion;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpgradePxfsVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradePxfsVersionRequest self = new UpgradePxfsVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradePxfsVersionRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public UpgradePxfsVersionRequest setMinorVersion(String minorVersion) {
        this.minorVersion = minorVersion;
        return this;
    }
    public String getMinorVersion() {
        return this.minorVersion;
    }

    public UpgradePxfsVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
