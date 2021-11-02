// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartVirusScanTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScanTaskId")
    public Long scanTaskId;

    public static StartVirusScanTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartVirusScanTaskResponseBody self = new StartVirusScanTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StartVirusScanTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartVirusScanTaskResponseBody setScanTaskId(Long scanTaskId) {
        this.scanTaskId = scanTaskId;
        return this;
    }
    public Long getScanTaskId() {
        return this.scanTaskId;
    }

}
