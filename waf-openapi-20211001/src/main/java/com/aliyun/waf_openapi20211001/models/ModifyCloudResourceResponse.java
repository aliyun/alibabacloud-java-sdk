// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyCloudResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCloudResourceResponseBody body;

    public static ModifyCloudResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudResourceResponse self = new ModifyCloudResourceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCloudResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCloudResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCloudResourceResponse setBody(ModifyCloudResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCloudResourceResponseBody getBody() {
        return this.body;
    }

}
