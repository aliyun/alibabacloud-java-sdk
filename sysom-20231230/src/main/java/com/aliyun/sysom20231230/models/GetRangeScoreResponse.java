// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetRangeScoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRangeScoreResponseBody body;

    public static GetRangeScoreResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRangeScoreResponse self = new GetRangeScoreResponse();
        return TeaModel.build(map, self);
    }

    public GetRangeScoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRangeScoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRangeScoreResponse setBody(GetRangeScoreResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRangeScoreResponseBody getBody() {
        return this.body;
    }

}
