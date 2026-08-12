// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ToggleAutoMinorVersionUpgradeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic minor version upgrades. Valid values:</p>
     * <ul>
     * <li><p>true: Enables automatic upgrades.</p>
     * </li>
     * <li><p>false: Disables automatic upgrades.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoUpgrade")
    public Boolean autoUpgrade;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ToggleAutoMinorVersionUpgradeRequest build(java.util.Map<String, ?> map) throws Exception {
        ToggleAutoMinorVersionUpgradeRequest self = new ToggleAutoMinorVersionUpgradeRequest();
        return TeaModel.build(map, self);
    }

    public ToggleAutoMinorVersionUpgradeRequest setAutoUpgrade(Boolean autoUpgrade) {
        this.autoUpgrade = autoUpgrade;
        return this;
    }
    public Boolean getAutoUpgrade() {
        return this.autoUpgrade;
    }

    public ToggleAutoMinorVersionUpgradeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
