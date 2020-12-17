// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DetectStackDriftRequest extends TeaModel {
    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("LogicalResourceId")
    public java.util.List<String> logicalResourceId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DetectStackDriftRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectStackDriftRequest self = new DetectStackDriftRequest();
        return TeaModel.build(map, self);
    }

    public DetectStackDriftRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public DetectStackDriftRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetectStackDriftRequest setLogicalResourceId(java.util.List<String> logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
        return this;
    }
    public java.util.List<String> getLogicalResourceId() {
        return this.logicalResourceId;
    }

    public DetectStackDriftRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
