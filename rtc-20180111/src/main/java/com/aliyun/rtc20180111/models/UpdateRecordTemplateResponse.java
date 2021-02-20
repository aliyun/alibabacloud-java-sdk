// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateRecordTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRecordTemplateResponseBody body;

    public static UpdateRecordTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecordTemplateResponse self = new UpdateRecordTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRecordTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRecordTemplateResponse setBody(UpdateRecordTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRecordTemplateResponseBody getBody() {
        return this.body;
    }

}
