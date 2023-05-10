// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackGroupRequest extends TeaModel {
    /**
     * <p>The ID of the stack group.</p>
     * <br>
     * <p>>  You must specify one of the StackGroupName and StackGroupId parameters.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The details of the stack group.</p>
     */
    @NameInMap("StackGroupId")
    public String stackGroupId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    public static GetStackGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackGroupRequest self = new GetStackGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetStackGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetStackGroupRequest setStackGroupId(String stackGroupId) {
        this.stackGroupId = stackGroupId;
        return this;
    }
    public String getStackGroupId() {
        return this.stackGroupId;
    }

    public GetStackGroupRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

}
