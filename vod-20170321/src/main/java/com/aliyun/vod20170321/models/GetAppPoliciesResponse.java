// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAppPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppPoliciesResponseBody body;

    public static GetAppPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppPoliciesResponse self = new GetAppPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public GetAppPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppPoliciesResponse setBody(GetAppPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppPoliciesResponseBody getBody() {
        return this.body;
    }

}
