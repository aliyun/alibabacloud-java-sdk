// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class MoveAccountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static MoveAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveAccountResponse self = new MoveAccountResponse();
        return TeaModel.build(map, self);
    }

    public MoveAccountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
