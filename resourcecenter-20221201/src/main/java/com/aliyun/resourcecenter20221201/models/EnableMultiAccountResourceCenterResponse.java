// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class EnableMultiAccountResourceCenterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableMultiAccountResourceCenterResponseBody body;

    public static EnableMultiAccountResourceCenterResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableMultiAccountResourceCenterResponse self = new EnableMultiAccountResourceCenterResponse();
        return TeaModel.build(map, self);
    }

    public EnableMultiAccountResourceCenterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableMultiAccountResourceCenterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableMultiAccountResourceCenterResponse setBody(EnableMultiAccountResourceCenterResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableMultiAccountResourceCenterResponseBody getBody() {
        return this.body;
    }

}
