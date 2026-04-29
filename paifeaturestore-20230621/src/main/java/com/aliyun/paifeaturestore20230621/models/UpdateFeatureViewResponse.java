// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class UpdateFeatureViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFeatureViewResponseBody body;

    public static UpdateFeatureViewResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFeatureViewResponse self = new UpdateFeatureViewResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFeatureViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFeatureViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFeatureViewResponse setBody(UpdateFeatureViewResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFeatureViewResponseBody getBody() {
        return this.body;
    }

}
