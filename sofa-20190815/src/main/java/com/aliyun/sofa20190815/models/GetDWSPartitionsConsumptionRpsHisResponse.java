// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSPartitionsConsumptionRpsHisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSPartitionsConsumptionRpsHisResponseBody body;

    public static GetDWSPartitionsConsumptionRpsHisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSPartitionsConsumptionRpsHisResponse self = new GetDWSPartitionsConsumptionRpsHisResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSPartitionsConsumptionRpsHisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSPartitionsConsumptionRpsHisResponse setBody(GetDWSPartitionsConsumptionRpsHisResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSPartitionsConsumptionRpsHisResponseBody getBody() {
        return this.body;
    }

}
