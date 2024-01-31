// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class UpdateModelFeatureFGInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateModelFeatureFGInfoResponseBody body;

    public static UpdateModelFeatureFGInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelFeatureFGInfoResponse self = new UpdateModelFeatureFGInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateModelFeatureFGInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateModelFeatureFGInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateModelFeatureFGInfoResponse setBody(UpdateModelFeatureFGInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateModelFeatureFGInfoResponseBody getBody() {
        return this.body;
    }

}
