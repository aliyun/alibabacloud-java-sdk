// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ModifyOfflineTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyOfflineTaskResponseBody body;

    public static ModifyOfflineTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfflineTaskResponse self = new ModifyOfflineTaskResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOfflineTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOfflineTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyOfflineTaskResponse setBody(ModifyOfflineTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOfflineTaskResponseBody getBody() {
        return this.body;
    }

}
