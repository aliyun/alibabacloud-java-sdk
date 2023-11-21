// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class TerminatePhysicalConnectionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TerminatePhysicalConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TerminatePhysicalConnectionResponseBody self = new TerminatePhysicalConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public TerminatePhysicalConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
