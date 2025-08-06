// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetAIServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAIServiceResponseBody body;

    public static SetAIServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAIServiceResponse self = new SetAIServiceResponse();
        return TeaModel.build(map, self);
    }

    public SetAIServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAIServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAIServiceResponse setBody(SetAIServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAIServiceResponseBody getBody() {
        return this.body;
    }

}
