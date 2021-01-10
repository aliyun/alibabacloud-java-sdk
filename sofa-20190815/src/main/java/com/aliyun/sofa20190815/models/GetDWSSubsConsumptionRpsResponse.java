// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsConsumptionRpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSSubsConsumptionRpsResponseBody body;

    public static GetDWSSubsConsumptionRpsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsConsumptionRpsResponse self = new GetDWSSubsConsumptionRpsResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsConsumptionRpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSSubsConsumptionRpsResponse setBody(GetDWSSubsConsumptionRpsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSSubsConsumptionRpsResponseBody getBody() {
        return this.body;
    }

}
