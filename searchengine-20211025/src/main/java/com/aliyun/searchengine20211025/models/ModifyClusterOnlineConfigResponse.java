// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyClusterOnlineConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyClusterOnlineConfigResponseBody body;

    public static ModifyClusterOnlineConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterOnlineConfigResponse self = new ModifyClusterOnlineConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterOnlineConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterOnlineConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyClusterOnlineConfigResponse setBody(ModifyClusterOnlineConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClusterOnlineConfigResponseBody getBody() {
        return this.body;
    }

}
