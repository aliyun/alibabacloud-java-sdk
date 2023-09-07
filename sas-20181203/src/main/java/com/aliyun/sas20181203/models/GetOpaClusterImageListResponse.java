// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOpaClusterImageListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOpaClusterImageListResponseBody body;

    public static GetOpaClusterImageListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpaClusterImageListResponse self = new GetOpaClusterImageListResponse();
        return TeaModel.build(map, self);
    }

    public GetOpaClusterImageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOpaClusterImageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOpaClusterImageListResponse setBody(GetOpaClusterImageListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOpaClusterImageListResponseBody getBody() {
        return this.body;
    }

}
