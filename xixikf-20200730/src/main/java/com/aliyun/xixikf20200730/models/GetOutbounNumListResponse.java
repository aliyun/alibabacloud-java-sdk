// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetOutbounNumListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOutbounNumListResponseBody body;

    public static GetOutbounNumListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOutbounNumListResponse self = new GetOutbounNumListResponse();
        return TeaModel.build(map, self);
    }

    public GetOutbounNumListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOutbounNumListResponse setBody(GetOutbounNumListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOutbounNumListResponseBody getBody() {
        return this.body;
    }

}
