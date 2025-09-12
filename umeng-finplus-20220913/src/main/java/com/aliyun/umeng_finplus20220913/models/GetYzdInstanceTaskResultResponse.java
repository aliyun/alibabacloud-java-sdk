// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class GetYzdInstanceTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetYzdInstanceTaskResultResponseBody body;

    public static GetYzdInstanceTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetYzdInstanceTaskResultResponse self = new GetYzdInstanceTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetYzdInstanceTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetYzdInstanceTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetYzdInstanceTaskResultResponse setBody(GetYzdInstanceTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetYzdInstanceTaskResultResponseBody getBody() {
        return this.body;
    }

}
