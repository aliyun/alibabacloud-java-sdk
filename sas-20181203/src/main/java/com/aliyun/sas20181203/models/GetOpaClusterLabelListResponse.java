// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOpaClusterLabelListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOpaClusterLabelListResponseBody body;

    public static GetOpaClusterLabelListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpaClusterLabelListResponse self = new GetOpaClusterLabelListResponse();
        return TeaModel.build(map, self);
    }

    public GetOpaClusterLabelListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOpaClusterLabelListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOpaClusterLabelListResponse setBody(GetOpaClusterLabelListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOpaClusterLabelListResponseBody getBody() {
        return this.body;
    }

}
