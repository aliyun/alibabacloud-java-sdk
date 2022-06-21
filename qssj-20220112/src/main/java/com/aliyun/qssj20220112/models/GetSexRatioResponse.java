// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetSexRatioResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSexRatioResponseBody body;

    public static GetSexRatioResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSexRatioResponse self = new GetSexRatioResponse();
        return TeaModel.build(map, self);
    }

    public GetSexRatioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSexRatioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSexRatioResponse setBody(GetSexRatioResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSexRatioResponseBody getBody() {
        return this.body;
    }

}
