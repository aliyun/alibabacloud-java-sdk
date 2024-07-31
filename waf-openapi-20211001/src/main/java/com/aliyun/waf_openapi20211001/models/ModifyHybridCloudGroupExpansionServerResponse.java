// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyHybridCloudGroupExpansionServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHybridCloudGroupExpansionServerResponseBody body;

    public static ModifyHybridCloudGroupExpansionServerResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridCloudGroupExpansionServerResponse self = new ModifyHybridCloudGroupExpansionServerResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHybridCloudGroupExpansionServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHybridCloudGroupExpansionServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHybridCloudGroupExpansionServerResponse setBody(ModifyHybridCloudGroupExpansionServerResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHybridCloudGroupExpansionServerResponseBody getBody() {
        return this.body;
    }

}
