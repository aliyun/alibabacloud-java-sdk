// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CompletePhysicalConnectionLOAResponse extends TeaModel {
    // description: The ID of the request.; 
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CompletePhysicalConnectionLOAResponse build(java.util.Map<String, ?> map) throws Exception {
        CompletePhysicalConnectionLOAResponse self = new CompletePhysicalConnectionLOAResponse();
        return TeaModel.build(map, self);
    }

}
