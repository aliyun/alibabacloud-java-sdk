// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackPolicyRequest extends TeaModel {
    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static GetStackPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackPolicyRequest self = new GetStackPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetStackPolicyRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public GetStackPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
