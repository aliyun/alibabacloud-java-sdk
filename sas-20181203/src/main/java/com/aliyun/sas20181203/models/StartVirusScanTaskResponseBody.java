// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartVirusScanTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>DAE17926-4ABE-4DBD-9600-DDCB9B200F35</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the virus scan task.</p>
     * 
     * <strong>example:</strong>
     * <p>282832</p>
     */
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
