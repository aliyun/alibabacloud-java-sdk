// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateTokenResult extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("token")
    public String token;

    public static CreateTokenResult build(java.util.Map<String, ?> map) throws Exception {
        CreateTokenResult self = new CreateTokenResult();
        return TeaModel.build(map, self);
    }

    public CreateTokenResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTokenResult setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
