// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class SyncProductInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SyncProductInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncProductInstanceResponseBody self = new SyncProductInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncProductInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
