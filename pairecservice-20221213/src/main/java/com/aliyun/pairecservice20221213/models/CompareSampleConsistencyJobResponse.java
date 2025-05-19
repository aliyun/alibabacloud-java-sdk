// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CompareSampleConsistencyJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CompareSampleConsistencyJobResponseBody body;

    public static CompareSampleConsistencyJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CompareSampleConsistencyJobResponse self = new CompareSampleConsistencyJobResponse();
        return TeaModel.build(map, self);
    }

    public CompareSampleConsistencyJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompareSampleConsistencyJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompareSampleConsistencyJobResponse setBody(CompareSampleConsistencyJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CompareSampleConsistencyJobResponseBody getBody() {
        return this.body;
    }

}
