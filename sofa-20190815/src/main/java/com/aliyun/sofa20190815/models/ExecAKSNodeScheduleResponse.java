// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecAKSNodeScheduleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecAKSNodeScheduleResponseBody body;

    public static ExecAKSNodeScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecAKSNodeScheduleResponse self = new ExecAKSNodeScheduleResponse();
        return TeaModel.build(map, self);
    }

    public ExecAKSNodeScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecAKSNodeScheduleResponse setBody(ExecAKSNodeScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecAKSNodeScheduleResponseBody getBody() {
        return this.body;
    }

}
