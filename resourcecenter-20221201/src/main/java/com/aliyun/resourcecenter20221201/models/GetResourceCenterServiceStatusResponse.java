// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetResourceCenterServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetResourceCenterServiceStatusResponseBody body;

    public static GetResourceCenterServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceCenterServiceStatusResponse self = new GetResourceCenterServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceCenterServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceCenterServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceCenterServiceStatusResponse setBody(GetResourceCenterServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceCenterServiceStatusResponseBody getBody() {
        return this.body;
    }

}
