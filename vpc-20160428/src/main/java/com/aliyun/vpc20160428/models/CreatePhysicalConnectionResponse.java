// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PhysicalConnectionId")
    @Validation(required = true)
    public String physicalConnectionId;

    public static CreatePhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalConnectionResponse self = new CreatePhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

}
