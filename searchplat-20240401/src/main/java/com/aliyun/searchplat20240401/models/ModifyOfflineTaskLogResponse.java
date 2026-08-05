// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ModifyOfflineTaskLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyOfflineTaskLogResponseBody body;

    public static ModifyOfflineTaskLogResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfflineTaskLogResponse self = new ModifyOfflineTaskLogResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOfflineTaskLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOfflineTaskLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyOfflineTaskLogResponse setBody(ModifyOfflineTaskLogResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOfflineTaskLogResponseBody getBody() {
        return this.body;
    }

}
