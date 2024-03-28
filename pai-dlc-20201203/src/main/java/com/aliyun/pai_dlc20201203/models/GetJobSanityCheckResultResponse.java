// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobSanityCheckResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJobSanityCheckResultResponseBody body;

    public static GetJobSanityCheckResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobSanityCheckResultResponse self = new GetJobSanityCheckResultResponse();
        return TeaModel.build(map, self);
    }

    public GetJobSanityCheckResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobSanityCheckResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobSanityCheckResultResponse setBody(GetJobSanityCheckResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobSanityCheckResultResponseBody getBody() {
        return this.body;
    }

}
