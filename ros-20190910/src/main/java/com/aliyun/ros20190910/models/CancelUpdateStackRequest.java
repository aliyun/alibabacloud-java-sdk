// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CancelUpdateStackRequest extends TeaModel {
    @NameInMap("StackId")
    public String stackId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("CancelType")
    public String cancelType;

    public static CancelUpdateStackRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelUpdateStackRequest self = new CancelUpdateStackRequest();
        return TeaModel.build(map, self);
    }

    public CancelUpdateStackRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public CancelUpdateStackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CancelUpdateStackRequest setCancelType(String cancelType) {
        this.cancelType = cancelType;
        return this;
    }
    public String getCancelType() {
        return this.cancelType;
    }

}
