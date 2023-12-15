// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class LockAccountResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static LockAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LockAccountResponseBody self = new LockAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public LockAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
