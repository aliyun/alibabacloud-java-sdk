// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateABTestFixedFlowDividersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateABTestFixedFlowDividersResponseBody body;

    public static UpdateABTestFixedFlowDividersResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateABTestFixedFlowDividersResponse self = new UpdateABTestFixedFlowDividersResponse();
        return TeaModel.build(map, self);
    }

    public UpdateABTestFixedFlowDividersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateABTestFixedFlowDividersResponse setBody(UpdateABTestFixedFlowDividersResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateABTestFixedFlowDividersResponseBody getBody() {
        return this.body;
    }

}
