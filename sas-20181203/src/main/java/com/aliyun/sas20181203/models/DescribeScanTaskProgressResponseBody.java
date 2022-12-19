// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeScanTaskProgressResponseBody extends TeaModel {
    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The progress of the virus scan task. Valid values:
    // 
    // *   **init**: The task is being initialized.
    // *   **Processing**: The task is running.
    // *   **Success**: The task is complete.
    // *   **Failed**: The task fails.
    @NameInMap("ScanTaskProgress")
    public String scanTaskProgress;

    // The information about the asset on which the virus scan task runs. The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:
    // 
    // *   **type**: the type of the asset on which the virus scan task runs. Valid values:
    // 
    //     *   **groupId**: server group.
    //     *   **uuid**: server.
    // 
    // *   **name**: the name of the server group or server.
    // 
    // *   **target**: the asset on which the virus scan task runs. The value of this field varies based on the value of the type field.
    // 
    //     *   If the value of **type** is **groupId**, the value of this field is the ID of the server group.
    //     *   If the value of **type** is **uuid**, the value of this field is the UUID of the server.
    @NameInMap("TargetInfo")
    public String targetInfo;

    public static DescribeScanTaskProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScanTaskProgressResponseBody self = new DescribeScanTaskProgressResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeScanTaskProgressResponseBody setTargetInfo(String targetInfo) {
        this.targetInfo = targetInfo;
        return this;
    }
    public String getTargetInfo() {
        return this.targetInfo;
    }

}
