// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTenantTagsResponseBody body;

    public static ModifyTenantTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantTagsResponse self = new ModifyTenantTagsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTenantTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTenantTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTenantTagsResponse setBody(ModifyTenantTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTenantTagsResponseBody getBody() {
        return this.body;
    }

}
