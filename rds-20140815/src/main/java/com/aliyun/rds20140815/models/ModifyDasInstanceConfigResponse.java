// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDasInstanceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDasInstanceConfigResponseBody body;

    public static ModifyDasInstanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDasInstanceConfigResponse self = new ModifyDasInstanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDasInstanceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDasInstanceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDasInstanceConfigResponse setBody(ModifyDasInstanceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDasInstanceConfigResponseBody getBody() {
        return this.body;
    }

}
