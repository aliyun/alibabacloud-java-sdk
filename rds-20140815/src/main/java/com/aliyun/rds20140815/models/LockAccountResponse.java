// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class LockAccountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static LockAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        LockAccountResponse self = new LockAccountResponse();
        return TeaModel.build(map, self);
    }

    public LockAccountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
