// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class StopStackGroupOperationRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("OperationId")
    public String operationId;

    public static StopStackGroupOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        StopStackGroupOperationRequest self = new StopStackGroupOperationRequest();
        return TeaModel.build(map, self);
    }

    public StopStackGroupOperationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StopStackGroupOperationRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
