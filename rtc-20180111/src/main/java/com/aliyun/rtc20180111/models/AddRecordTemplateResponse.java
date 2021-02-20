// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class AddRecordTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddRecordTemplateResponseBody body;

    public static AddRecordTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRecordTemplateResponse self = new AddRecordTemplateResponse();
        return TeaModel.build(map, self);
    }

    public AddRecordTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRecordTemplateResponse setBody(AddRecordTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRecordTemplateResponseBody getBody() {
        return this.body;
    }

}
