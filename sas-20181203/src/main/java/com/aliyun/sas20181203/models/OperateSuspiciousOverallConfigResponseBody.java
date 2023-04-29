// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateSuspiciousOverallConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OperateSuspiciousOverallConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateSuspiciousOverallConfigResponseBody self = new OperateSuspiciousOverallConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateSuspiciousOverallConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
