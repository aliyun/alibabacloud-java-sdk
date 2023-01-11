// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CancelStackOperationRequest extends TeaModel {
    @NameInMap("AllowedStackOperations")
    public java.util.List<String> allowedStackOperations;

    @NameInMap("CancelType")
    public String cancelType;

    @NameInMap("RegionId")
    public String regionId;

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
