// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSJdbcwriterStoredelayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSJdbcwriterStoredelayResponseBody body;

    public static GetDWSJdbcwriterStoredelayResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSJdbcwriterStoredelayResponse self = new GetDWSJdbcwriterStoredelayResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSJdbcwriterStoredelayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSJdbcwriterStoredelayResponse setBody(GetDWSJdbcwriterStoredelayResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSJdbcwriterStoredelayResponseBody getBody() {
        return this.body;
    }

}
