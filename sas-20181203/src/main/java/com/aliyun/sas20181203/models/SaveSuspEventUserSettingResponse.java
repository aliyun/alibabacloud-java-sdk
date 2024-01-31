// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SaveSuspEventUserSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveSuspEventUserSettingResponseBody body;

    public static SaveSuspEventUserSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSuspEventUserSettingResponse self = new SaveSuspEventUserSettingResponse();
        return TeaModel.build(map, self);
    }

    public SaveSuspEventUserSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSuspEventUserSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSuspEventUserSettingResponse setBody(SaveSuspEventUserSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSuspEventUserSettingResponseBody getBody() {
        return this.body;
    }

}
