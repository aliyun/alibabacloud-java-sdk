// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartRecordTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public StartRecordTaskResponse setBody(StartRecordTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartRecordTaskResponseBody getBody() {
        return this.body;
    }

}
