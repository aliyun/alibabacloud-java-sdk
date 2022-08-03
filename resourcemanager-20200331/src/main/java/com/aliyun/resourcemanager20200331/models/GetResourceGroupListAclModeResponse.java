// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetResourceGroupListAclModeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetResourceGroupListAclModeResponseBody body;

    public static GetResourceGroupListAclModeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupListAclModeResponse self = new GetResourceGroupListAclModeResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupListAclModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceGroupListAclModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceGroupListAclModeResponse setBody(GetResourceGroupListAclModeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceGroupListAclModeResponseBody getBody() {
        return this.body;
    }

}
