// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateScratchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTemplateScratchResponseBody body;

    public static GetTemplateScratchResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateScratchResponse self = new GetTemplateScratchResponse();
        return TeaModel.build(map, self);
    }

    public GetTemplateScratchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTemplateScratchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTemplateScratchResponse setBody(GetTemplateScratchResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTemplateScratchResponseBody getBody() {
        return this.body;
    }

}
