// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateScheduleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateScheduleResponseBody body;

    public static CreateScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleResponse self = new CreateScheduleResponse();
        return TeaModel.build(map, self);
    }

    public CreateScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScheduleResponse setBody(CreateScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScheduleResponseBody getBody() {
        return this.body;
    }

}
