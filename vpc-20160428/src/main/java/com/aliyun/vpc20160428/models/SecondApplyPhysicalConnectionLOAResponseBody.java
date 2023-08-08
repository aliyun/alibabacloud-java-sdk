// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class SecondApplyPhysicalConnectionLOAResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SecondApplyPhysicalConnectionLOAResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SecondApplyPhysicalConnectionLOAResponseBody self = new SecondApplyPhysicalConnectionLOAResponseBody();
        return TeaModel.build(map, self);
    }

    public SecondApplyPhysicalConnectionLOAResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
