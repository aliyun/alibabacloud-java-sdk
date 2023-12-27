// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StopRecordTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopRecordTaskResponseBody body;

    public static StopRecordTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopRecordTaskResponse self = new StopRecordTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopRecordTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopRecordTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopRecordTaskResponse setBody(StopRecordTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopRecordTaskResponseBody getBody() {
        return this.body;
    }

}
