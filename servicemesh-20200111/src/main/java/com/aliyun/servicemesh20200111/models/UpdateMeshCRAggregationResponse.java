// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateMeshCRAggregationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMeshCRAggregationResponseBody body;

    public static UpdateMeshCRAggregationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeshCRAggregationResponse self = new UpdateMeshCRAggregationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMeshCRAggregationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMeshCRAggregationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMeshCRAggregationResponse setBody(UpdateMeshCRAggregationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMeshCRAggregationResponseBody getBody() {
        return this.body;
    }

}
