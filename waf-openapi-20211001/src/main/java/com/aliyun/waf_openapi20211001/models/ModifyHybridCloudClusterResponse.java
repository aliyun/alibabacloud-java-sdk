// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyHybridCloudClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHybridCloudClusterResponseBody body;

    public static ModifyHybridCloudClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridCloudClusterResponse self = new ModifyHybridCloudClusterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHybridCloudClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHybridCloudClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHybridCloudClusterResponse setBody(ModifyHybridCloudClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHybridCloudClusterResponseBody getBody() {
        return this.body;
    }

}
