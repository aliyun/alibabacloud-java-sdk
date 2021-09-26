// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class StopAlarmTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopAlarmTaskResponseBody body;

    public static StopAlarmTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopAlarmTaskResponse self = new StopAlarmTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopAlarmTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopAlarmTaskResponse setBody(StopAlarmTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopAlarmTaskResponseBody getBody() {
        return this.body;
    }

}
