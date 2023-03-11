// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAppVulScanCycleResponseBody extends TeaModel {
    /**
     * <p>The scan cycle for application vulnerabilities.</p>
     * <br>
     * <p>*   1week</p>
     * <p>*   2weeks</p>
     * <p>*   3days</p>
     */
    @NameInMap("Cycle")
    public String cycle;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAppVulScanCycleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppVulScanCycleResponseBody self = new DescribeAppVulScanCycleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppVulScanCycleResponseBody setCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }
    public String getCycle() {
        return this.cycle;
    }

    public DescribeAppVulScanCycleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
