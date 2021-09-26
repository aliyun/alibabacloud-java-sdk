// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class StartAlarmTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartAlarmTaskResponseBody body;

    public static StartAlarmTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAlarmTaskResponse self = new StartAlarmTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartAlarmTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartAlarmTaskResponse setBody(StartAlarmTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartAlarmTaskResponseBody getBody() {
        return this.body;
    }

}
