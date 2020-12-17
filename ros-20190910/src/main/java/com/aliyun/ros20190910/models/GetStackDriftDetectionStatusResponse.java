// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackDriftDetectionStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DriftDetectionId")
    @Validation(required = true)
    public String driftDetectionId;

    @NameInMap("DriftDetectionTime")
    @Validation(required = true)
    public String driftDetectionTime;

    @NameInMap("DriftDetectionStatus")
    @Validation(required = true)
    public String driftDetectionStatus;

    @NameInMap("DriftDetectionStatusReason")
    @Validation(required = true)
    public String driftDetectionStatusReason;

    @NameInMap("StackDriftStatus")
    @Validation(required = true)
    public String stackDriftStatus;

    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("DriftedStackResourceCount")
    @Validation(required = true)
    public Integer driftedStackResourceCount;

    public static GetStackDriftDetectionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackDriftDetectionStatusResponse self = new GetStackDriftDetectionStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetStackDriftDetectionStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStackDriftDetectionStatusResponse setDriftDetectionId(String driftDetectionId) {
        this.driftDetectionId = driftDetectionId;
        return this;
    }
    public String getDriftDetectionId() {
        return this.driftDetectionId;
    }

    public GetStackDriftDetectionStatusResponse setDriftDetectionTime(String driftDetectionTime) {
        this.driftDetectionTime = driftDetectionTime;
        return this;
    }
    public String getDriftDetectionTime() {
        return this.driftDetectionTime;
    }

    public GetStackDriftDetectionStatusResponse setDriftDetectionStatus(String driftDetectionStatus) {
        this.driftDetectionStatus = driftDetectionStatus;
        return this;
    }
    public String getDriftDetectionStatus() {
        return this.driftDetectionStatus;
    }

    public GetStackDriftDetectionStatusResponse setDriftDetectionStatusReason(String driftDetectionStatusReason) {
        this.driftDetectionStatusReason = driftDetectionStatusReason;
        return this;
    }
    public String getDriftDetectionStatusReason() {
        return this.driftDetectionStatusReason;
    }

    public GetStackDriftDetectionStatusResponse setStackDriftStatus(String stackDriftStatus) {
        this.stackDriftStatus = stackDriftStatus;
        return this;
    }
    public String getStackDriftStatus() {
        return this.stackDriftStatus;
    }

    public GetStackDriftDetectionStatusResponse setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public GetStackDriftDetectionStatusResponse setDriftedStackResourceCount(Integer driftedStackResourceCount) {
        this.driftedStackResourceCount = driftedStackResourceCount;
        return this;
    }
    public Integer getDriftedStackResourceCount() {
        return this.driftedStackResourceCount;
    }

}
