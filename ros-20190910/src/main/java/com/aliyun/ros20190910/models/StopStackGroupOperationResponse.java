// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class StopStackGroupOperationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static StopStackGroupOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        StopStackGroupOperationResponse self = new StopStackGroupOperationResponse();
        return TeaModel.build(map, self);
    }

}
