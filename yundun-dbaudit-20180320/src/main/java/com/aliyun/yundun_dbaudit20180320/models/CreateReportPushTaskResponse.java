// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CreateReportPushTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateReportPushTaskResponseBody body;

    public static CreateReportPushTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateReportPushTaskResponse self = new CreateReportPushTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateReportPushTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateReportPushTaskResponse setBody(CreateReportPushTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateReportPushTaskResponseBody getBody() {
        return this.body;
    }

}
