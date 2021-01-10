// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSPartitionsStoreLatencyHisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSPartitionsStoreLatencyHisResponseBody body;

    public static GetDWSPartitionsStoreLatencyHisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSPartitionsStoreLatencyHisResponse self = new GetDWSPartitionsStoreLatencyHisResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSPartitionsStoreLatencyHisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSPartitionsStoreLatencyHisResponse setBody(GetDWSPartitionsStoreLatencyHisResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSPartitionsStoreLatencyHisResponseBody getBody() {
        return this.body;
    }

}
