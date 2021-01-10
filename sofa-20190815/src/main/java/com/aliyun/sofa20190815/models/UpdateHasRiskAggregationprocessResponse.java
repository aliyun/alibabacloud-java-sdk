// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasRiskAggregationprocessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHasRiskAggregationprocessResponseBody body;

    public static UpdateHasRiskAggregationprocessResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasRiskAggregationprocessResponse self = new UpdateHasRiskAggregationprocessResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHasRiskAggregationprocessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHasRiskAggregationprocessResponse setBody(UpdateHasRiskAggregationprocessResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHasRiskAggregationprocessResponseBody getBody() {
        return this.body;
    }

}
