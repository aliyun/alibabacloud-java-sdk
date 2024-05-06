// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyOnlineConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyOnlineConfigResponseBody body;

    public static ModifyOnlineConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOnlineConfigResponse self = new ModifyOnlineConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOnlineConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOnlineConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyOnlineConfigResponse setBody(ModifyOnlineConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOnlineConfigResponseBody getBody() {
        return this.body;
    }

}
