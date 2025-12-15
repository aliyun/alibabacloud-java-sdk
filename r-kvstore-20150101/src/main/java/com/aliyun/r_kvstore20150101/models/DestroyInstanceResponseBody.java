// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DestroyInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>870422DE-B64C-5A15-9C48-4A9485D1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DestroyInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DestroyInstanceResponseBody self = new DestroyInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DestroyInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
