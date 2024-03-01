// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class GetSubtaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSubtaskResponseBody body;

    public static GetSubtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSubtaskResponse self = new GetSubtaskResponse();
        return TeaModel.build(map, self);
    }

    public GetSubtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSubtaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSubtaskResponse setBody(GetSubtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSubtaskResponseBody getBody() {
        return this.body;
    }

}
