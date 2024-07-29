// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppRecordTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAppRecordTemplateResponseBody body;

    public static ModifyAppRecordTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppRecordTemplateResponse self = new ModifyAppRecordTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppRecordTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppRecordTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppRecordTemplateResponse setBody(ModifyAppRecordTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppRecordTemplateResponseBody getBody() {
        return this.body;
    }

}
