// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetPolicyAssetScopeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPolicyAssetScopeResponseBody body;

    public static GetPolicyAssetScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyAssetScopeResponse self = new GetPolicyAssetScopeResponse();
        return TeaModel.build(map, self);
    }

    public GetPolicyAssetScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPolicyAssetScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPolicyAssetScopeResponse setBody(GetPolicyAssetScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPolicyAssetScopeResponseBody getBody() {
        return this.body;
    }

}
