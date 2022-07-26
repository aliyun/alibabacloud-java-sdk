// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetUatSpecCtDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUatSpecCtDataResponseBody body;

    public static GetUatSpecCtDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUatSpecCtDataResponse self = new GetUatSpecCtDataResponse();
        return TeaModel.build(map, self);
    }

    public GetUatSpecCtDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUatSpecCtDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUatSpecCtDataResponse setBody(GetUatSpecCtDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUatSpecCtDataResponseBody getBody() {
        return this.body;
    }

}
