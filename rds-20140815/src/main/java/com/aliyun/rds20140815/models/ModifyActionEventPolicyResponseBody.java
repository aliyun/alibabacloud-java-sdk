// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyActionEventPolicyResponseBody extends TeaModel {
    @NameInMap("EnableEventLog")
    public String enableEventLog;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyActionEventPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyActionEventPolicyResponseBody self = new ModifyActionEventPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyActionEventPolicyResponseBody setEnableEventLog(String enableEventLog) {
        this.enableEventLog = enableEventLog;
        return this;
    }
    public String getEnableEventLog() {
        return this.enableEventLog;
    }

    public ModifyActionEventPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyActionEventPolicyResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
