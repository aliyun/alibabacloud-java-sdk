// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyHybridCloudServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHybridCloudServerResponseBody body;

    public static ModifyHybridCloudServerResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridCloudServerResponse self = new ModifyHybridCloudServerResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHybridCloudServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHybridCloudServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHybridCloudServerResponse setBody(ModifyHybridCloudServerResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHybridCloudServerResponseBody getBody() {
        return this.body;
    }

}
