// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteADSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteADSettingResponseBody body;

    public static DeleteADSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteADSettingResponse self = new DeleteADSettingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteADSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteADSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteADSettingResponse setBody(DeleteADSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteADSettingResponseBody getBody() {
        return this.body;
    }

}
