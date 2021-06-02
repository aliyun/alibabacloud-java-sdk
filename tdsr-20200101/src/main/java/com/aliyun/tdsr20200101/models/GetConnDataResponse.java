// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetConnDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetConnDataResponseBody body;

    public static GetConnDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConnDataResponse self = new GetConnDataResponse();
        return TeaModel.build(map, self);
    }

    public GetConnDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConnDataResponse setBody(GetConnDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConnDataResponseBody getBody() {
        return this.body;
    }

}
