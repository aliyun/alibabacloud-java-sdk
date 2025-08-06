// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAIServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAIServiceResponseBody body;

    public static GetAIServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIServiceResponse self = new GetAIServiceResponse();
        return TeaModel.build(map, self);
    }

    public GetAIServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAIServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAIServiceResponse setBody(GetAIServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAIServiceResponseBody getBody() {
        return this.body;
    }

}
