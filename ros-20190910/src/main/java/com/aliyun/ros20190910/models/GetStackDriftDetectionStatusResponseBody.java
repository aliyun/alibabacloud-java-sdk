// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackDriftDetectionStatusResponseBody extends TeaModel {
    @NameInMap("StackId")
    public String stackId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DriftDetectionTime")
    public String driftDetectionTime;

    @NameInMap("StackDriftStatus")
    public String stackDriftStatus;

    @NameInMap("DriftDetectionId")
    public String driftDetectionId;

    @NameInMap("DriftDetectionStatus")
    public String driftDetectionStatus;

    @NameInMap("DriftedStackResourceCount")
    public Integer driftedStackResourceCount;

    @NameInMap("DriftDetectionStatusReason")
    public String driftDetectionStatusReason;

    public static GetStackDriftDetectionStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStackDriftDetectionStatusResponseBody self = new GetStackDriftDetectionStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStackDriftDetectionStatusResponseBody setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public GetStackDriftDetectionStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStackDriftDetectionStatusResponseBody setDriftDetectionTime(String driftDetectionTime) {
        this.driftDetectionTime = driftDetectionTime;
        return this;
    }
    public String getDriftDetectionTime() {
        return this.driftDetectionTime;
    }

    public GetStackDriftDetectionStatusResponseBody setStackDriftStatus(String stackDriftStatus) {
        this.stackDriftStatus = stackDriftStatus;
        return this;
    }
    public String getStackDriftStatus() {
        return this.stackDriftStatus;
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

    public GetStackDriftDetectionStatusResponseBody setDriftedStackResourceCount(Integer driftedStackResourceCount) {
        this.driftedStackResourceCount = driftedStackResourceCount;
        return this;
    }
    public Integer getDriftedStackResourceCount() {
        return this.driftedStackResourceCount;
    }

    public GetStackDriftDetectionStatusResponseBody setDriftDetectionStatusReason(String driftDetectionStatusReason) {
        this.driftDetectionStatusReason = driftDetectionStatusReason;
        return this;
    }
    public String getDriftDetectionStatusReason() {
        return this.driftDetectionStatusReason;
    }

}
