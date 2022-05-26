// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateMeshFeatureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMeshFeatureResponseBody body;

    public static UpdateMeshFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeshFeatureResponse self = new UpdateMeshFeatureResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMeshFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMeshFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMeshFeatureResponse setBody(UpdateMeshFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMeshFeatureResponseBody getBody() {
        return this.body;
    }

}
