// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ApplyPhysicalConnectionLOAResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ApplyPhysicalConnectionLOAResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyPhysicalConnectionLOAResponseBody self = new ApplyPhysicalConnectionLOAResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyPhysicalConnectionLOAResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
