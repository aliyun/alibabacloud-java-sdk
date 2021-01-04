// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GrantInstanceToCbnResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GrantInstanceToCbnResponseBody body;

    public static GrantInstanceToCbnResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantInstanceToCbnResponse self = new GrantInstanceToCbnResponse();
        return TeaModel.build(map, self);
    }

    public GrantInstanceToCbnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantInstanceToCbnResponse setBody(GrantInstanceToCbnResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantInstanceToCbnResponseBody getBody() {
        return this.body;
    }

}
