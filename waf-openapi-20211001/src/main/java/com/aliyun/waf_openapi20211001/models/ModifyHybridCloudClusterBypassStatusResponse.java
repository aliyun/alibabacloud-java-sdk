// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyHybridCloudClusterBypassStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHybridCloudClusterBypassStatusResponseBody body;

    public static ModifyHybridCloudClusterBypassStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridCloudClusterBypassStatusResponse self = new ModifyHybridCloudClusterBypassStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHybridCloudClusterBypassStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHybridCloudClusterBypassStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHybridCloudClusterBypassStatusResponse setBody(ModifyHybridCloudClusterBypassStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHybridCloudClusterBypassStatusResponseBody getBody() {
        return this.body;
    }

}
