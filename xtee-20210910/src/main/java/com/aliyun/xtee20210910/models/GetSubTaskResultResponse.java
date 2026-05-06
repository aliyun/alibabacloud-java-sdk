// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class GetSubTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSubTaskResultResponseBody body;

    public static GetSubTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSubTaskResultResponse self = new GetSubTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetSubTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSubTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSubTaskResultResponse setBody(GetSubTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSubTaskResultResponseBody getBody() {
        return this.body;
    }

}
