// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLatestScanTaskResponseBody extends TeaModel {
    @NameInMap("LastCheckTime")
    public Long lastCheckTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RiskNum")
    public Integer riskNum;

    @NameInMap("TargetInfo")
    public String targetInfo;

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
