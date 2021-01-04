// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyQosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyQosResponseBody body;

    public static ModifyQosResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyQosResponse self = new ModifyQosResponse();
        return TeaModel.build(map, self);
    }

    public ModifyQosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyQosResponse setBody(ModifyQosResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyQosResponseBody getBody() {
        return this.body;
    }

}
