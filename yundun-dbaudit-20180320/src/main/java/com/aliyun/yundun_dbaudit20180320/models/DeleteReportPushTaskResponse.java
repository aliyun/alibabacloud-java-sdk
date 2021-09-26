// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DeleteReportPushTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteReportPushTaskResponseBody body;

    public static DeleteReportPushTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteReportPushTaskResponse self = new DeleteReportPushTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteReportPushTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteReportPushTaskResponse setBody(DeleteReportPushTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteReportPushTaskResponseBody getBody() {
        return this.body;
    }

}
