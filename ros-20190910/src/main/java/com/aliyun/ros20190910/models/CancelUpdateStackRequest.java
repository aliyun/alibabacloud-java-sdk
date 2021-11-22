// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CancelUpdateStackRequest extends TeaModel {
    @NameInMap("CancelType")
    public String cancelType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StackId")
    public String stackId;

    public static CancelUpdateStackRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelUpdateStackRequest self = new CancelUpdateStackRequest();
        return TeaModel.build(map, self);
    }

    public CancelUpdateStackRequest setCancelType(String cancelType) {
        this.cancelType = cancelType;
        return this;
    }
    public String getCancelType() {
        return this.cancelType;
    }

    public CancelUpdateStackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CancelUpdateStackRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

}
