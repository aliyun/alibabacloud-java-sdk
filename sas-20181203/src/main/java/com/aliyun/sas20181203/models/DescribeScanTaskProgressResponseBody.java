// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeScanTaskProgressResponseBody extends TeaModel {
    @NameInMap("TargetInfo")
    public String targetInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScanTaskProgress")
    public String scanTaskProgress;

    public static DescribeScanTaskProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScanTaskProgressResponseBody self = new DescribeScanTaskProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScanTaskProgressResponseBody setTargetInfo(String targetInfo) {
        this.targetInfo = targetInfo;
        return this;
    }
    public String getTargetInfo() {
        return this.targetInfo;
    }

    public DescribeScanTaskProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScanTaskProgressResponseBody setScanTaskProgress(String scanTaskProgress) {
        this.scanTaskProgress = scanTaskProgress;
        return this;
    }
    public String getScanTaskProgress() {
        return this.scanTaskProgress;
    }

}
