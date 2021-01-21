// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackResourceRequest extends TeaModel {
    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ShowResourceAttributes")
    public Boolean showResourceAttributes;

    @NameInMap("LogicalResourceId")
    @Validation(required = true)
    public String logicalResourceId;

    public static GetStackResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackResourceRequest self = new GetStackResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetStackResourceRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public GetStackResourceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetStackResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetStackResourceRequest setShowResourceAttributes(Boolean showResourceAttributes) {
        this.showResourceAttributes = showResourceAttributes;
        return this;
    }
    public Boolean getShowResourceAttributes() {
        return this.showResourceAttributes;
    }

    public GetStackResourceRequest setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
        return this;
    }
    public String getLogicalResourceId() {
        return this.logicalResourceId;
    }

}
