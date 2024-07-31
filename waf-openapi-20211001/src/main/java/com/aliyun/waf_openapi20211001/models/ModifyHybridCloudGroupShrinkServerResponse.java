// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyHybridCloudGroupShrinkServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHybridCloudGroupShrinkServerResponseBody body;

    public static ModifyHybridCloudGroupShrinkServerResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridCloudGroupShrinkServerResponse self = new ModifyHybridCloudGroupShrinkServerResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHybridCloudGroupShrinkServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHybridCloudGroupShrinkServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHybridCloudGroupShrinkServerResponse setBody(ModifyHybridCloudGroupShrinkServerResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHybridCloudGroupShrinkServerResponseBody getBody() {
        return this.body;
    }

}
