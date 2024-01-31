// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class AddRecordTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AddRecordTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddRecordTemplateResponse setBody(AddRecordTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRecordTemplateResponseBody getBody() {
        return this.body;
    }

}
