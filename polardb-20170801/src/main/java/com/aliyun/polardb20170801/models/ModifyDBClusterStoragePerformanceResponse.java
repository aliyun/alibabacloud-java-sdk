// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterStoragePerformanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBClusterStoragePerformanceResponseBody body;

    public static ModifyDBClusterStoragePerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterStoragePerformanceResponse self = new ModifyDBClusterStoragePerformanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterStoragePerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterStoragePerformanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterStoragePerformanceResponse setBody(ModifyDBClusterStoragePerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterStoragePerformanceResponseBody getBody() {
        return this.body;
    }

}
