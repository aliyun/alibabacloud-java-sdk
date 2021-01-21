// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackInstanceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("StackGroupName")
    @Validation(required = true)
    public String stackGroupName;

    @NameInMap("StackInstanceAccountId")
    @Validation(required = true)
    public String stackInstanceAccountId;

    @NameInMap("StackInstanceRegionId")
    @Validation(required = true)
    public String stackInstanceRegionId;

    public static GetStackInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackInstanceRequest self = new GetStackInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetStackInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetStackInstanceRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public GetStackInstanceRequest setStackInstanceAccountId(String stackInstanceAccountId) {
        this.stackInstanceAccountId = stackInstanceAccountId;
        return this;
    }
    public String getStackInstanceAccountId() {
        return this.stackInstanceAccountId;
    }

    public GetStackInstanceRequest setStackInstanceRegionId(String stackInstanceRegionId) {
        this.stackInstanceRegionId = stackInstanceRegionId;
        return this;
    }
    public String getStackInstanceRegionId() {
        return this.stackInstanceRegionId;
    }

}
