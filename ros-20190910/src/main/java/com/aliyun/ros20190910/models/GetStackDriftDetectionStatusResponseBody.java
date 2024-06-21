// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackDriftDetectionStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the drift detection operation.</p>
     * 
     * <strong>example:</strong>
     * <p>a7044f0d-6f2e-4128-a307-4524ef88****</p>
     */
    @NameInMap("DriftDetectionId")
    public String driftDetectionId;

    /**
     * <p>The drift detection status. Valid values:</p>
     * <ul>
     * <li>DETECTION_COMPLETE: The drift detection operation has been completed for all resources that support drift detection in the stack.</li>
     * <li>DETECTION_FAILED: The stack drift detection operation has failed for at least one resource in the stack.</li>
     * <li>DETECTION_IN_PROGRESS: The stack drift detection operation is in progress.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DETECTION_COMPLETE</p>
     */
    @NameInMap("DriftDetectionStatus")
    public String driftDetectionStatus;

    /**
     * <p>The reason why the stack drift detection operation has its current status.</p>
     * 
     * <strong>example:</strong>
     * <p>Detect stack drift successfully</p>
     */
    @NameInMap("DriftDetectionStatusReason")
    public String driftDetectionStatusReason;

    /**
     * <p>The time when the stack drift detection operation was initiated.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-02-27T07:47:47</p>
     */
    @NameInMap("DriftDetectionTime")
    public String driftDetectionTime;

    /**
     * <p>The total number of stack resources that have drifted.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DriftedStackResourceCount")
    public Integer driftedStackResourceCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The drift status of the stack. Valid values:</p>
     * <ul>
     * <li>DRIFTED: The actual configuration of the stack differs, or has drifted, from its expected template configuration. A stack is considered to have drifted if one or more of its resources have drifted.</li>
     * <li>NOT_CHECKED: Resource Orchestration Service (ROS) has not checked whether the actual configuration of the resource differs from its expected template configuration.</li>
     * <li>IN_SYNC: The current configuration of each supported resource matches its expected template configuration. A stack with no resources that support drift detection also has a status of IN_SYNC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DRIFTED</p>
     */
    @NameInMap("StackDriftStatus")
    public String stackDriftStatus;

    /**
     * <p>The ID of the stack.</p>
     * 
     * <strong>example:</strong>
     * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
     */
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
