// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAutoDelConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAutoDelConfigResponseBody body;

    public static ModifyAutoDelConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoDelConfigResponse self = new ModifyAutoDelConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAutoDelConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAutoDelConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAutoDelConfigResponse setBody(ModifyAutoDelConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAutoDelConfigResponseBody getBody() {
        return this.body;
    }

}
