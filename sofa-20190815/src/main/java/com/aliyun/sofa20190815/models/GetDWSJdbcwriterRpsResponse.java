// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSJdbcwriterRpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSJdbcwriterRpsResponseBody body;

    public static GetDWSJdbcwriterRpsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSJdbcwriterRpsResponse self = new GetDWSJdbcwriterRpsResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSJdbcwriterRpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSJdbcwriterRpsResponse setBody(GetDWSJdbcwriterRpsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSJdbcwriterRpsResponseBody getBody() {
        return this.body;
    }

}
