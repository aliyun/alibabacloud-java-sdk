// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateRecordTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateRecordTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRecordTemplateResponse setBody(UpdateRecordTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRecordTemplateResponseBody getBody() {
        return this.body;
    }

}
