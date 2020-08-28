// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class TerminatePhysicalConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static TerminatePhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        TerminatePhysicalConnectionResponse self = new TerminatePhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

}
