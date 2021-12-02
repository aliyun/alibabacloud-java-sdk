// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetPhysicalConnectionServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPhysicalConnectionServiceStatusResponseBody body;

    public static GetPhysicalConnectionServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalConnectionServiceStatusResponse self = new GetPhysicalConnectionServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetPhysicalConnectionServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPhysicalConnectionServiceStatusResponse setBody(GetPhysicalConnectionServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPhysicalConnectionServiceStatusResponseBody getBody() {
        return this.body;
    }

}
