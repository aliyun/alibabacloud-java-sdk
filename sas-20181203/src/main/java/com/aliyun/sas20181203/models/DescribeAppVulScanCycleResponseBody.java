// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAppVulScanCycleResponseBody extends TeaModel {
    @NameInMap("Cycle")
    public String cycle;

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
