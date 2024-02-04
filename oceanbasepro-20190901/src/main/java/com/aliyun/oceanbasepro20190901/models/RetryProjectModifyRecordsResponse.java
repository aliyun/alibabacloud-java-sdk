// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class RetryProjectModifyRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryProjectModifyRecordsResponseBody body;

    public static RetryProjectModifyRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryProjectModifyRecordsResponse self = new RetryProjectModifyRecordsResponse();
        return TeaModel.build(map, self);
    }

    public RetryProjectModifyRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryProjectModifyRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryProjectModifyRecordsResponse setBody(RetryProjectModifyRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryProjectModifyRecordsResponseBody getBody() {
        return this.body;
    }

}
