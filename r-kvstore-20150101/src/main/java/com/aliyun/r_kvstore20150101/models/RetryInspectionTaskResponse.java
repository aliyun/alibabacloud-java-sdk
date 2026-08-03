// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class RetryInspectionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryInspectionTaskResponseBody body;

    public static RetryInspectionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryInspectionTaskResponse self = new RetryInspectionTaskResponse();
        return TeaModel.build(map, self);
    }

    public RetryInspectionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryInspectionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryInspectionTaskResponse setBody(RetryInspectionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryInspectionTaskResponseBody getBody() {
        return this.body;
    }

}
