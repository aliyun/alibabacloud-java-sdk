// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSJdbcwriterDelayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSJdbcwriterDelayResponseBody body;

    public static GetDWSJdbcwriterDelayResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSJdbcwriterDelayResponse self = new GetDWSJdbcwriterDelayResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSJdbcwriterDelayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSJdbcwriterDelayResponse setBody(GetDWSJdbcwriterDelayResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSJdbcwriterDelayResponseBody getBody() {
        return this.body;
    }

}
