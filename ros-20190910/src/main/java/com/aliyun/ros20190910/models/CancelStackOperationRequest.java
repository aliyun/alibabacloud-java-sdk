// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CancelStackOperationRequest extends TeaModel {
    /**
     * <p>The operations that you want to cancel on the stack.</p>
     */
    @NameInMap("AllowedStackOperations")
    public java.util.List<String> allowedStackOperations;

    /**
     * <p>The method that you want to use to cancel the operations. Valid values:</p>
     * <ul>
     * <li>Quick: cancels the operations on the stack at the earliest opportunity. In this case, Resource Orchestration Service (ROS) stops scheduling new resources and stops running resources at the earliest opportunity. If you use this method, the resource status may become invalid and subsequent stack operations may be affected.</li>
     * <li>Safe (default): cancels the operations on the stack in a secure manner. In this case, ROS stops scheduling new resources and waits for running resources to be stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Safe</p>
     */
    @NameInMap("CancelType")
    public String cancelType;

    /**
     * <p>The region ID of the stack. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The stack ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
     */
    @NameInMap("StackId")
    public String stackId;

    public static CancelStackOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelStackOperationRequest self = new CancelStackOperationRequest();
        return TeaModel.build(map, self);
    }

    public CancelStackOperationRequest setAllowedStackOperations(java.util.List<String> allowedStackOperations) {
        this.allowedStackOperations = allowedStackOperations;
        return this;
    }
    public java.util.List<String> getAllowedStackOperations() {
        return this.allowedStackOperations;
    }

    public CancelStackOperationRequest setCancelType(String cancelType) {
        this.cancelType = cancelType;
        return this;
    }
    public String getCancelType() {
        return this.cancelType;
    }

    public CancelStackOperationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CancelStackOperationRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

}
