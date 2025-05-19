// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class StopSampleConsistencyJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopSampleConsistencyJobResponseBody body;

    public static StopSampleConsistencyJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StopSampleConsistencyJobResponse self = new StopSampleConsistencyJobResponse();
        return TeaModel.build(map, self);
    }

    public StopSampleConsistencyJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopSampleConsistencyJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopSampleConsistencyJobResponse setBody(StopSampleConsistencyJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StopSampleConsistencyJobResponseBody getBody() {
        return this.body;
    }

}
