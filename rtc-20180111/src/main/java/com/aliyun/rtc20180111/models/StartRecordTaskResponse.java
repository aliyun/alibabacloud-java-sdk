// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartRecordTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartRecordTaskResponseBody body;

    public static StartRecordTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartRecordTaskResponse self = new StartRecordTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartRecordTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartRecordTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartRecordTaskResponse setBody(StartRecordTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartRecordTaskResponseBody getBody() {
        return this.body;
    }

}
