// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeActionEventPolicyResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the event history feature is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("EnableEventLog")
    public String enableEventLog;

    /**
     * <p>The region ID.</p>
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
     * <p>CCECD3CD-AB2D-4F6D-BEDE-47BC90A398D2</p>
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
