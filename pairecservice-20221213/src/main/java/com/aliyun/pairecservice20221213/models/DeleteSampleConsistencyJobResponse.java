// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteSampleConsistencyJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSampleConsistencyJobResponseBody body;

    public static DeleteSampleConsistencyJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSampleConsistencyJobResponse self = new DeleteSampleConsistencyJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSampleConsistencyJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSampleConsistencyJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSampleConsistencyJobResponse setBody(DeleteSampleConsistencyJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSampleConsistencyJobResponseBody getBody() {
        return this.body;
    }

}
