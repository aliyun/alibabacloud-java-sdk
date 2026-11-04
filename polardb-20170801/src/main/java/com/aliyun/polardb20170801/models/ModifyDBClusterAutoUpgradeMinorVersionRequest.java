// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAutoUpgradeMinorVersionRequest extends TeaModel {
    /**
     * <p>The minor engine version update policy. Valid values:</p>
     * <ul>
     * <li>Auto: Automatic update.</li>
     * <li>Manual: Manual update.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("AutoUpgradeMinorVersion")
    public String autoUpgradeMinorVersion;

    /**
     * <p>The ID of the PolarDB cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-******************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static ModifyDBClusterAutoUpgradeMinorVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterAutoUpgradeMinorVersionRequest self = new ModifyDBClusterAutoUpgradeMinorVersionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterAutoUpgradeMinorVersionRequest setAutoUpgradeMinorVersion(String autoUpgradeMinorVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        return this;
    }
    public String getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }

    public ModifyDBClusterAutoUpgradeMinorVersionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
