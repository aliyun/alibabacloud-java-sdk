// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class GetCrowdDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCrowdDatasetResponseBody body;

    public static GetCrowdDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCrowdDatasetResponse self = new GetCrowdDatasetResponse();
        return TeaModel.build(map, self);
    }

    public GetCrowdDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCrowdDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCrowdDatasetResponse setBody(GetCrowdDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCrowdDatasetResponseBody getBody() {
        return this.body;
    }

}
