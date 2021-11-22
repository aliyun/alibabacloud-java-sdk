// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackDriftDetectionStatusResponseBody extends TeaModel {
    @NameInMap("DriftDetectionId")
    public String driftDetectionId;

    @NameInMap("DriftDetectionStatus")
    public String driftDetectionStatus;

    @NameInMap("DriftDetectionStatusReason")
    public String driftDetectionStatusReason;

    @NameInMap("DriftDetectionTime")
    public String driftDetectionTime;

    @NameInMap("DriftedStackResourceCount")
    public Integer driftedStackResourceCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StackDriftStatus")
    public String stackDriftStatus;

    @NameInMap("StackId")
    public String stackId;

    public static GetStackDriftDetectionStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStackDriftDetectionStatusResponseBody self = new GetStackDriftDetectionStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStackDriftDetectionStatusResponseBody setDriftDetectionId(String driftDetectionId) {
        this.driftDetectionId = driftDetectionId;
        return this;
    }
    public String getDriftDetectionId() {
        return this.driftDetectionId;
    }

    public GetStackDriftDetectionStatusResponseBody setDriftDetectionStatus(String driftDetectionStatus) {
        this.driftDetectionStatus = driftDetectionStatus;
        return this;
    }
    public String getDriftDetectionStatus() {
        return this.driftDetectionStatus;
    }

    public GetStackDriftDetectionStatusResponseBody setDriftDetectionStatusReason(String driftDetectionStatusReason) {
        this.driftDetectionStatusReason = driftDetectionStatusReason;
        return this;
    }
    public String getDriftDetectionStatusReason() {
        return this.driftDetectionStatusReason;
    }

    public GetStackDriftDetectionStatusResponseBody setDriftDetectionTime(String driftDetectionTime) {
        this.driftDetectionTime = driftDetectionTime;
        return this;
    }
    public String getDriftDetectionTime() {
        return this.driftDetectionTime;
    }

    public GetStackDriftDetectionStatusResponseBody setDriftedStackResourceCount(Integer driftedStackResourceCount) {
        this.driftedStackResourceCount = driftedStackResourceCount;
        return this;
    }
    public Integer getDriftedStackResourceCount() {
        return this.driftedStackResourceCount;
    }

    public GetStackDriftDetectionStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStackDriftDetectionStatusResponseBody setStackDriftStatus(String stackDriftStatus) {
        this.stackDriftStatus = stackDriftStatus;
        return this;
    }
    public String getStackDriftStatus() {
        return this.stackDriftStatus;
    }

    public GetStackDriftDetectionStatusResponseBody setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

}
