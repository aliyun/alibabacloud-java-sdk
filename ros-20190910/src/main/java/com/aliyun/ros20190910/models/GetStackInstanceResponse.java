// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetStackInstanceResponseBody body;

    public static GetStackInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackInstanceResponse self = new GetStackInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetStackInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStackInstanceResponse setBody(GetStackInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStackInstanceResponseBody getBody() {
        return this.body;
    }

}
