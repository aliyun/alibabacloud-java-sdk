// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskDataNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetClriskDataNodeResponseBody body;

    public static GetClriskDataNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClriskDataNodeResponse self = new GetClriskDataNodeResponse();
        return TeaModel.build(map, self);
    }

    public GetClriskDataNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClriskDataNodeResponse setBody(GetClriskDataNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClriskDataNodeResponseBody getBody() {
        return this.body;
    }

}
