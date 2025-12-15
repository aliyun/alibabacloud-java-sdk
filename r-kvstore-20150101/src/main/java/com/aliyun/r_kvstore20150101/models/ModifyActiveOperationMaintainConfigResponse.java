// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationMaintainConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyActiveOperationMaintainConfigResponseBody body;

    public static ModifyActiveOperationMaintainConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyActiveOperationMaintainConfigResponse self = new ModifyActiveOperationMaintainConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyActiveOperationMaintainConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyActiveOperationMaintainConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyActiveOperationMaintainConfigResponse setBody(ModifyActiveOperationMaintainConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyActiveOperationMaintainConfigResponseBody getBody() {
        return this.body;
    }

}
