// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class RegisterMessageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RegisterMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterMessageResponseBody self = new RegisterMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
