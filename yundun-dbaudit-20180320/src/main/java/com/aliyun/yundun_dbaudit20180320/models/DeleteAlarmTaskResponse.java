// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DeleteAlarmTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAlarmTaskResponseBody body;

    public static DeleteAlarmTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlarmTaskResponse self = new DeleteAlarmTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlarmTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlarmTaskResponse setBody(DeleteAlarmTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlarmTaskResponseBody getBody() {
        return this.body;
    }

}
