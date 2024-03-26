// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAIVideoTagResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAIVideoTagResultResponseBody body;

    public static GetAIVideoTagResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIVideoTagResultResponse self = new GetAIVideoTagResultResponse();
        return TeaModel.build(map, self);
    }

    public GetAIVideoTagResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAIVideoTagResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAIVideoTagResultResponse setBody(GetAIVideoTagResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAIVideoTagResultResponseBody getBody() {
        return this.body;
    }

}
