// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAIStatisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAIStatisResponseBody body;

    public static GetAIStatisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIStatisResponse self = new GetAIStatisResponse();
        return TeaModel.build(map, self);
    }

    public GetAIStatisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAIStatisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAIStatisResponse setBody(GetAIStatisResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAIStatisResponseBody getBody() {
        return this.body;
    }

}
