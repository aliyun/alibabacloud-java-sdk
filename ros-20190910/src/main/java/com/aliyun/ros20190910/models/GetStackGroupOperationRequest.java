// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackGroupOperationRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("OperationId")
    @Validation(required = true)
    public String operationId;

    public static GetStackGroupOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackGroupOperationRequest self = new GetStackGroupOperationRequest();
        return TeaModel.build(map, self);
    }

}
