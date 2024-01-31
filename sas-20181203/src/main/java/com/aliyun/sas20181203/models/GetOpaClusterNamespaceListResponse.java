// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOpaClusterNamespaceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOpaClusterNamespaceListResponseBody body;

    public static GetOpaClusterNamespaceListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpaClusterNamespaceListResponse self = new GetOpaClusterNamespaceListResponse();
        return TeaModel.build(map, self);
    }

    public GetOpaClusterNamespaceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOpaClusterNamespaceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOpaClusterNamespaceListResponse setBody(GetOpaClusterNamespaceListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOpaClusterNamespaceListResponseBody getBody() {
        return this.body;
    }

}
