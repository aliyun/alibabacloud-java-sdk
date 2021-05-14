// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateSuspiciousTargetConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OperateSuspiciousTargetConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateSuspiciousTargetConfigResponseBody self = new OperateSuspiciousTargetConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateSuspiciousTargetConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
