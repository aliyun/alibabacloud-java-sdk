// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyHybridCloudSdkPullinStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHybridCloudSdkPullinStatusResponseBody body;

    public static ModifyHybridCloudSdkPullinStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridCloudSdkPullinStatusResponse self = new ModifyHybridCloudSdkPullinStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHybridCloudSdkPullinStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHybridCloudSdkPullinStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHybridCloudSdkPullinStatusResponse setBody(ModifyHybridCloudSdkPullinStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHybridCloudSdkPullinStatusResponseBody getBody() {
        return this.body;
    }

}
