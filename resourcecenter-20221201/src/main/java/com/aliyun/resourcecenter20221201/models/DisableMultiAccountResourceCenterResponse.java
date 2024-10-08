// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class DisableMultiAccountResourceCenterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableMultiAccountResourceCenterResponseBody body;

    public static DisableMultiAccountResourceCenterResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableMultiAccountResourceCenterResponse self = new DisableMultiAccountResourceCenterResponse();
        return TeaModel.build(map, self);
    }

    public DisableMultiAccountResourceCenterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableMultiAccountResourceCenterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableMultiAccountResourceCenterResponse setBody(DisableMultiAccountResourceCenterResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableMultiAccountResourceCenterResponseBody getBody() {
        return this.body;
    }

}
