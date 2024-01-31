// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyImageFixCycleConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyImageFixCycleConfigResponseBody body;

    public static ModifyImageFixCycleConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageFixCycleConfigResponse self = new ModifyImageFixCycleConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyImageFixCycleConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyImageFixCycleConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyImageFixCycleConfigResponse setBody(ModifyImageFixCycleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyImageFixCycleConfigResponseBody getBody() {
        return this.body;
    }

}
