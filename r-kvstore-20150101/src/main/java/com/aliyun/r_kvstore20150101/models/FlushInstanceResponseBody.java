// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class FlushInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8D0C0AFC-E9CD-47A4-8395-5C31BF9B3E7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static FlushInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlushInstanceResponseBody self = new FlushInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public FlushInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
