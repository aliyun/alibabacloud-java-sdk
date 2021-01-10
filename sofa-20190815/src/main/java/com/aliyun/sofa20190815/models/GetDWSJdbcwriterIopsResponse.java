// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSJdbcwriterIopsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSJdbcwriterIopsResponseBody body;

    public static GetDWSJdbcwriterIopsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSJdbcwriterIopsResponse self = new GetDWSJdbcwriterIopsResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSJdbcwriterIopsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSJdbcwriterIopsResponse setBody(GetDWSJdbcwriterIopsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSJdbcwriterIopsResponseBody getBody() {
        return this.body;
    }

}
