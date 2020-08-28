// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ApplyPhysicalConnectionLOAResponse extends TeaModel {
    // description: The ID of the request.; 
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ApplyPhysicalConnectionLOAResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyPhysicalConnectionLOAResponse self = new ApplyPhysicalConnectionLOAResponse();
        return TeaModel.build(map, self);
    }

}
