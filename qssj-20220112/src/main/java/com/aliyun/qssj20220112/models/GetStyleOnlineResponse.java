// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetStyleOnlineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetStyleOnlineResponseBody body;

    public static GetStyleOnlineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStyleOnlineResponse self = new GetStyleOnlineResponse();
        return TeaModel.build(map, self);
    }

    public GetStyleOnlineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStyleOnlineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStyleOnlineResponse setBody(GetStyleOnlineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStyleOnlineResponseBody getBody() {
        return this.body;
    }

}
