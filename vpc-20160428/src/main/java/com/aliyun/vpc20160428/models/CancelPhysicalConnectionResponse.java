// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CancelPhysicalConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CancelPhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelPhysicalConnectionResponse self = new CancelPhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

}
