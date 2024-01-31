// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyLogMetaStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLogMetaStatusResponseBody body;

    public static ModifyLogMetaStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogMetaStatusResponse self = new ModifyLogMetaStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLogMetaStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLogMetaStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLogMetaStatusResponse setBody(ModifyLogMetaStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLogMetaStatusResponseBody getBody() {
        return this.body;
    }

}
