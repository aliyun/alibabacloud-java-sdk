// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetTempFileTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTempFileTaskResponseBody body;

    public static GetTempFileTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTempFileTaskResponse self = new GetTempFileTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetTempFileTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTempFileTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTempFileTaskResponse setBody(GetTempFileTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTempFileTaskResponseBody getBody() {
        return this.body;
    }

}
