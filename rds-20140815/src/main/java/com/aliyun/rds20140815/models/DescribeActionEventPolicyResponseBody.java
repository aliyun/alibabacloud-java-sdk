// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeActionEventPolicyResponseBody extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **DescribeActionEventPolicy**.</p>
     */
    @NameInMap("EnableEventLog")
    public String enableEventLog;

    /**
     * <p>Indicates whether the event history feature is enabled.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeActionEventPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActionEventPolicyResponseBody self = new DescribeActionEventPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActionEventPolicyResponseBody setEnableEventLog(String enableEventLog) {
        this.enableEventLog = enableEventLog;
        return this;
    }
    public String getEnableEventLog() {
        return this.enableEventLog;
    }

    public DescribeActionEventPolicyResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeActionEventPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
