// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tunnel_service20210509.models;

import com.aliyun.tea.*;

public class GetInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public String body;

    public static GetInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponse self = new GetInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceResponse setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
