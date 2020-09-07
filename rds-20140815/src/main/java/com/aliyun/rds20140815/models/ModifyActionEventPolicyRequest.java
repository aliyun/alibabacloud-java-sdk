// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyActionEventPolicyRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("EnableEventLog")
    @Validation(required = true)
    public String enableEventLog;

    public static ModifyActionEventPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyActionEventPolicyRequest self = new ModifyActionEventPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyActionEventPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyActionEventPolicyRequest setEnableEventLog(String enableEventLog) {
        this.enableEventLog = enableEventLog;
        return this;
    }
    public String getEnableEventLog() {
        return this.enableEventLog;
    }

}
