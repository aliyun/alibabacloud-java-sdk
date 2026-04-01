// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyActionEventPolicyResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the event history feature is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("EnableEventLog")
    public String enableEventLog;

    /**
     * <p>The ID of the region for which the event history feature is enabled or disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BAC0952C-0EB3-4DE7-A567-B83269BFE43F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public ModifyActionEventPolicyResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyActionEventPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
