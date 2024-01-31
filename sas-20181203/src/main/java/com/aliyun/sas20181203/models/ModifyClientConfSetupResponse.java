// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyClientConfSetupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyClientConfSetupResponseBody body;

    public static ModifyClientConfSetupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClientConfSetupResponse self = new ModifyClientConfSetupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClientConfSetupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClientConfSetupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyClientConfSetupResponse setBody(ModifyClientConfSetupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClientConfSetupResponseBody getBody() {
        return this.body;
    }

}
