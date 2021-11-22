// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackGroupOperationRequest extends TeaModel {
    @NameInMap("OperationId")
    public String operationId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetStackGroupOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackGroupOperationRequest self = new GetStackGroupOperationRequest();
        return TeaModel.build(map, self);
    }

    public GetStackGroupOperationRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public GetStackGroupOperationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
