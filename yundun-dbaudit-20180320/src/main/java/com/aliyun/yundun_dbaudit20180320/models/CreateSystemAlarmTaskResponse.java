// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CreateSystemAlarmTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSystemAlarmTaskResponseBody body;

    public static CreateSystemAlarmTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSystemAlarmTaskResponse self = new CreateSystemAlarmTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateSystemAlarmTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSystemAlarmTaskResponse setBody(CreateSystemAlarmTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSystemAlarmTaskResponseBody getBody() {
        return this.body;
    }

}
