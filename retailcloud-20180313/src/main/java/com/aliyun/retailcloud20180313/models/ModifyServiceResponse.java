// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ModifyServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyServiceResponseBody body;

    public static ModifyServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyServiceResponse self = new ModifyServiceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyServiceResponse setBody(ModifyServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyServiceResponseBody getBody() {
        return this.body;
    }

}
