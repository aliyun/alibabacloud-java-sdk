// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CancelStackOperationRequest extends TeaModel {
    /**
     * <p>The operation N that you want to cancel on the stack.</p>
     */
    @NameInMap("AllowedStackOperations")
    public java.util.List<String> allowedStackOperations;

    /**
     * <p>The method that you want to use to cancel the operation. Default value: Safe. Valid values:</p>
     * <br>
     * <p>*   Quick: cancels the operation on the stack at the earliest opportunity. In this case, ROS stops scheduling new resources and stops running resources at the earliest opportunity. If you use this method, the resource status may become invalid and subsequent stack operations may be affected.</p>
     * <p>*   Safe: cancels the operation on the stack in a secure manner. In this case, ROS stops scheduling new resources and waits for running resources to be stopped.</p>
     */
    @NameInMap("CancelType")
    public String cancelType;

    /**
     * <p>The region ID of the stack.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the stack.</p>
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
