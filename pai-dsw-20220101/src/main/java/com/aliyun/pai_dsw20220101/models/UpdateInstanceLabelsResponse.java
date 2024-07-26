// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class UpdateInstanceLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstanceLabelsResponseBody body;

    public static UpdateInstanceLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceLabelsResponse self = new UpdateInstanceLabelsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceLabelsResponse setBody(UpdateInstanceLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceLabelsResponseBody getBody() {
        return this.body;
    }

}
