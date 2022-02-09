// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoUpgradeObVersionRequest extends TeaModel {
    @NameInMap("AutoUpgradeObVersion")
    public Boolean autoUpgradeObVersion;

    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    public static ModifyInstanceAutoUpgradeObVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoUpgradeObVersionRequest self = new ModifyInstanceAutoUpgradeObVersionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAutoUpgradeObVersionRequest setAutoUpgradeObVersion(Boolean autoUpgradeObVersion) {
        this.autoUpgradeObVersion = autoUpgradeObVersion;
        return this;
    }
    public Boolean getAutoUpgradeObVersion() {
        return this.autoUpgradeObVersion;
    }

    public ModifyInstanceAutoUpgradeObVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
