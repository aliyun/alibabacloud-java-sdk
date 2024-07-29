// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteAppRecordTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAppRecordTemplateResponseBody body;

    public static DeleteAppRecordTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppRecordTemplateResponse self = new DeleteAppRecordTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppRecordTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppRecordTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppRecordTemplateResponse setBody(DeleteAppRecordTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppRecordTemplateResponseBody getBody() {
        return this.body;
    }

}
