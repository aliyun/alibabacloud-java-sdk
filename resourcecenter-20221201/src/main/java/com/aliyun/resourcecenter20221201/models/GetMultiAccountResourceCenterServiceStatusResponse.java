// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetMultiAccountResourceCenterServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMultiAccountResourceCenterServiceStatusResponseBody body;

    public static GetMultiAccountResourceCenterServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMultiAccountResourceCenterServiceStatusResponse self = new GetMultiAccountResourceCenterServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetMultiAccountResourceCenterServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMultiAccountResourceCenterServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMultiAccountResourceCenterServiceStatusResponse setBody(GetMultiAccountResourceCenterServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMultiAccountResourceCenterServiceStatusResponseBody getBody() {
        return this.body;
    }

}
