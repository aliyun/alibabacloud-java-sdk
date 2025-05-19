// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetSampleConsistencyJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSampleConsistencyJobResponseBody body;

    public static GetSampleConsistencyJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSampleConsistencyJobResponse self = new GetSampleConsistencyJobResponse();
        return TeaModel.build(map, self);
    }

    public GetSampleConsistencyJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSampleConsistencyJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSampleConsistencyJobResponse setBody(GetSampleConsistencyJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSampleConsistencyJobResponseBody getBody() {
        return this.body;
    }

}
