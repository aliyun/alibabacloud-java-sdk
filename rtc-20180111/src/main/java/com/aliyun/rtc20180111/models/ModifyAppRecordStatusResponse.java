// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppRecordStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAppRecordStatusResponseBody body;

    public static ModifyAppRecordStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppRecordStatusResponse self = new ModifyAppRecordStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppRecordStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppRecordStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppRecordStatusResponse setBody(ModifyAppRecordStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppRecordStatusResponseBody getBody() {
        return this.body;
    }

}
