// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLatestScanTaskResponseBody extends TeaModel {
    /**
     * <p>The timestamp when the last check was performed. Unit: milliseconds.</p>
     */
    @NameInMap("LastCheckTime")
    public Long lastCheckTime;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of virus detection risks on the server.</p>
     */
    @NameInMap("RiskNum")
    public Integer riskNum;

    /**
     * <p>The information about the asset on which the virus scan task runs. The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:</p>
     * <br>
     * <p>*   **type**: the type of the asset on which the virus scan task runs. Valid values:</p>
     * <br>
     * <p>    *   **groupId**: server group</p>
     * <p>    *   **uuid**: server</p>
     * <br>
     * <p>*   **name**: the name of the server group or server</p>
     * <br>
     * <p>*   **target**: the asset on which the virus scan task runs The value of this field varies based on the value of the type field.</p>
     * <br>
     * <p>    *   If the value of **type** is **groupId**, the value of this field is the ID of the server group.</p>
     * <p>    *   If the value of **type** is **uuid**, the value of this field is the UUID of the server.</p>
     */
    @NameInMap("TargetInfo")
    public String targetInfo;

    /**
     * <p>The ID of the asset.</p>
     */
    @NameInMap("Uuids")
    public java.util.List<String> uuids;

    public static DescribeLatestScanTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLatestScanTaskResponseBody self = new DescribeLatestScanTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLatestScanTaskResponseBody setLastCheckTime(Long lastCheckTime) {
        this.lastCheckTime = lastCheckTime;
        return this;
    }
    public Long getLastCheckTime() {
        return this.lastCheckTime;
    }

    public DescribeLatestScanTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLatestScanTaskResponseBody setRiskNum(Integer riskNum) {
        this.riskNum = riskNum;
        return this;
    }
    public Integer getRiskNum() {
        return this.riskNum;
    }

    public DescribeLatestScanTaskResponseBody setTargetInfo(String targetInfo) {
        this.targetInfo = targetInfo;
        return this;
    }
    public String getTargetInfo() {
        return this.targetInfo;
    }

    public DescribeLatestScanTaskResponseBody setUuids(java.util.List<String> uuids) {
        this.uuids = uuids;
        return this;
    }
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

}
