// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAppNetworkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppNetworkResponseBody body;

    public static GetAppNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppNetworkResponse self = new GetAppNetworkResponse();
        return TeaModel.build(map, self);
    }

    public GetAppNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppNetworkResponse setBody(GetAppNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppNetworkResponseBody getBody() {
        return this.body;
    }

}
