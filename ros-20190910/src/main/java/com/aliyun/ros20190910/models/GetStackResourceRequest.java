// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackResourceRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("LogicalResourceId")
    public String logicalResourceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ShowResourceAttributes")
    public Boolean showResourceAttributes;

    @NameInMap("StackId")
    public String stackId;

    public static GetStackResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackResourceRequest self = new GetStackResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetStackResourceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetStackResourceRequest setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
        return this;
    }
    public String getLogicalResourceId() {
        return this.logicalResourceId;
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

    public GetStackResourceRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

}
