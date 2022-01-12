// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceTDEResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceTDEResponseBody body;

    public static ModifyInstanceTDEResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceTDEResponse self = new ModifyInstanceTDEResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceTDEResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceTDEResponse setBody(ModifyInstanceTDEResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceTDEResponseBody getBody() {
        return this.body;
    }

}
