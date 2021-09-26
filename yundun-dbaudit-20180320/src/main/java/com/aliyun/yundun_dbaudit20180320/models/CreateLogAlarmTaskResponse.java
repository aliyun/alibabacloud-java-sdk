// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CreateLogAlarmTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLogAlarmTaskResponseBody body;

    public static CreateLogAlarmTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLogAlarmTaskResponse self = new CreateLogAlarmTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateLogAlarmTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLogAlarmTaskResponse setBody(CreateLogAlarmTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLogAlarmTaskResponseBody getBody() {
        return this.body;
    }

}
