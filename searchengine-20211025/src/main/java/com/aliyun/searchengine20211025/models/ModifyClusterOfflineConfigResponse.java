// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyClusterOfflineConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyClusterOfflineConfigResponseBody body;

    public static ModifyClusterOfflineConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterOfflineConfigResponse self = new ModifyClusterOfflineConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterOfflineConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterOfflineConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyClusterOfflineConfigResponse setBody(ModifyClusterOfflineConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClusterOfflineConfigResponseBody getBody() {
        return this.body;
    }

}
