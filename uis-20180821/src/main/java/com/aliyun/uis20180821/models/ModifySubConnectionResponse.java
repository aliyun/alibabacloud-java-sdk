// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class ModifySubConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySubConnectionResponseBody body;

    public static ModifySubConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySubConnectionResponse self = new ModifySubConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ModifySubConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySubConnectionResponse setBody(ModifySubConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySubConnectionResponseBody getBody() {
        return this.body;
    }

}
