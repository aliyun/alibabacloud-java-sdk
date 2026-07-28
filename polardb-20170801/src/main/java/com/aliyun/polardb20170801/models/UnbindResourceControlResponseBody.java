// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UnbindResourceControlResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22C0ACF0-DD29-4B67-9190-B7A48C******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindResourceControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindResourceControlResponseBody self = new UnbindResourceControlResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindResourceControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
