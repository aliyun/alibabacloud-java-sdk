// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyHybridCloudGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHybridCloudGroupResponseBody body;

    public static ModifyHybridCloudGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridCloudGroupResponse self = new ModifyHybridCloudGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHybridCloudGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHybridCloudGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHybridCloudGroupResponse setBody(ModifyHybridCloudGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHybridCloudGroupResponseBody getBody() {
        return this.body;
    }

}
