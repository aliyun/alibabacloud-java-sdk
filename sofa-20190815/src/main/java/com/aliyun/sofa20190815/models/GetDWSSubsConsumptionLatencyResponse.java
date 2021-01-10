// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsConsumptionLatencyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSSubsConsumptionLatencyResponseBody body;

    public static GetDWSSubsConsumptionLatencyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsConsumptionLatencyResponse self = new GetDWSSubsConsumptionLatencyResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsConsumptionLatencyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSSubsConsumptionLatencyResponse setBody(GetDWSSubsConsumptionLatencyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSSubsConsumptionLatencyResponseBody getBody() {
        return this.body;
    }

}
