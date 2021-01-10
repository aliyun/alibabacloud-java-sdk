// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasRiskAggregationresolveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHasRiskAggregationresolveResponseBody body;

    public static UpdateHasRiskAggregationresolveResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasRiskAggregationresolveResponse self = new UpdateHasRiskAggregationresolveResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHasRiskAggregationresolveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHasRiskAggregationresolveResponse setBody(UpdateHasRiskAggregationresolveResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHasRiskAggregationresolveResponseBody getBody() {
        return this.body;
    }

}
