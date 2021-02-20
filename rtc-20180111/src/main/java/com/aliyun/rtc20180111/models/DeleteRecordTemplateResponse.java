// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteRecordTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRecordTemplateResponseBody body;

    public static DeleteRecordTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecordTemplateResponse self = new DeleteRecordTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRecordTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRecordTemplateResponse setBody(DeleteRecordTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRecordTemplateResponseBody getBody() {
        return this.body;
    }

}
