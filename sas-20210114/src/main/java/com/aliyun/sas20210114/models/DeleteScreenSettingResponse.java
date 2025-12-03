// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DeleteScreenSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteScreenSettingResponseBody body;

    public static DeleteScreenSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScreenSettingResponse self = new DeleteScreenSettingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScreenSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScreenSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteScreenSettingResponse setBody(DeleteScreenSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScreenSettingResponseBody getBody() {
        return this.body;
    }

}
