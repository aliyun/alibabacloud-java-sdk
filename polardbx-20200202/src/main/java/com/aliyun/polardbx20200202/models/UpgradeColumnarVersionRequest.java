// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpgradeColumnarVersionRequest extends TeaModel {
    /**
     * <p>The column store version.</p>
     * 
     * <strong>example:</strong>
     * <p>polarx-col-kernel-5.4.20-20250819_17555906</p>
     */
    @NameInMap("ColumnarVersion")
    public String columnarVersion;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-xxx</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-hzrh51fze****pon-cdc</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The region in which the instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The switch mode.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SwitchMode")
    public String switchMode;

    public static UpgradeColumnarVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeColumnarVersionRequest self = new UpgradeColumnarVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeColumnarVersionRequest setColumnarVersion(String columnarVersion) {
        this.columnarVersion = columnarVersion;
        return this;
    }
    public String getColumnarVersion() {
        return this.columnarVersion;
    }

    public UpgradeColumnarVersionRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public UpgradeColumnarVersionRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpgradeColumnarVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradeColumnarVersionRequest setSwitchMode(String switchMode) {
        this.switchMode = switchMode;
        return this;
    }
    public String getSwitchMode() {
        return this.switchMode;
    }

}
