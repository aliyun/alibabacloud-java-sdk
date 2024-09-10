// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAppVulScanCycleResponseBody extends TeaModel {
    /**
     * <p>The scan cycle for application vulnerabilities.</p>
     * <ul>
     * <li>1week</li>
     * <li>2weeks</li>
     * <li>3days</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1week</p>
     */
    @NameInMap("Cycle")
    public String cycle;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>934E6D2A-0123-5A99-88BA-80DC27634E22</p>
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
