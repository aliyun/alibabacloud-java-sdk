// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RefreshDBClusterStorageUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshDBClusterStorageUsageResponseBody body;

    public static RefreshDBClusterStorageUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshDBClusterStorageUsageResponse self = new RefreshDBClusterStorageUsageResponse();
        return TeaModel.build(map, self);
    }

    public RefreshDBClusterStorageUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshDBClusterStorageUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshDBClusterStorageUsageResponse setBody(RefreshDBClusterStorageUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshDBClusterStorageUsageResponseBody getBody() {
        return this.body;
    }

}
