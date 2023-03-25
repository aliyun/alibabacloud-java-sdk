// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeScanTaskProgressResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The progress of the virus scan task. Valid values:</p>
     * <br>
     * <p>*   **init**: The task is being initialized.</p>
     * <p>*   **Processing**: The task is running.</p>
     * <p>*   **Success**: The task is complete.</p>
     * <p>*   **Failed**: The task fails.</p>
     */
    @NameInMap("ScanTaskProgress")
    public String scanTaskProgress;

    /**
     * <p>The information about the asset on which the virus scan task runs. The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:</p>
     * <br>
     * <p>*   **type**: the type of the asset on which the virus scan task runs. Valid values:</p>
     * <br>
     * <p>    *   **groupId**: server group.</p>
     * <p>    *   **uuid**: server.</p>
     * <br>
     * <p>*   **name**: the name of the server group or server.</p>
     * <br>
     * <p>*   **target**: the asset on which the virus scan task runs. The value of this field varies based on the value of the type field.</p>
     * <br>
     * <p>    *   If the value of **type** is **groupId**, the value of this field is the ID of the server group.</p>
     * <p>    *   If the value of **type** is **uuid**, the value of this field is the UUID of the server.</p>
     */
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
