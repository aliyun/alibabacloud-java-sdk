// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSPartitionConsumptionLatencyHisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSPartitionConsumptionLatencyHisResponseBody body;

    public static GetDWSPartitionConsumptionLatencyHisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSPartitionConsumptionLatencyHisResponse self = new GetDWSPartitionConsumptionLatencyHisResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSPartitionConsumptionLatencyHisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSPartitionConsumptionLatencyHisResponse setBody(GetDWSPartitionConsumptionLatencyHisResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSPartitionConsumptionLatencyHisResponseBody getBody() {
        return this.body;
    }

}
