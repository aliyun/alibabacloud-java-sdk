// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ResetSystemResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetSystemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetSystemResponseBody self = new ResetSystemResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetSystemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
