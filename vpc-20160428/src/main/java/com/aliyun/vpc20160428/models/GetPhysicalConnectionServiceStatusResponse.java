// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetPhysicalConnectionServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetPhysicalConnectionServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPhysicalConnectionServiceStatusResponse setBody(GetPhysicalConnectionServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPhysicalConnectionServiceStatusResponseBody getBody() {
        return this.body;
    }

}
