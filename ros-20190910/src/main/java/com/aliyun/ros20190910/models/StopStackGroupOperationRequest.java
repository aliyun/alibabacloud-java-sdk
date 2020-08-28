// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class StopStackGroupOperationRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("OperationId")
    @Validation(required = true)
    public String operationId;

    public static StopStackGroupOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        StopStackGroupOperationRequest self = new StopStackGroupOperationRequest();
        return TeaModel.build(map, self);
    }

}
