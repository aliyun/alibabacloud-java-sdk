// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyTemplateResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTemplateResourcesResponseBody body;

    public static ModifyTemplateResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTemplateResourcesResponse self = new ModifyTemplateResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTemplateResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTemplateResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTemplateResourcesResponse setBody(ModifyTemplateResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTemplateResourcesResponseBody getBody() {
        return this.body;
    }

}
