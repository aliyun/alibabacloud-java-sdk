// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagRouteProtocolOspfResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSagRouteProtocolOspfResponseBody body;

    public static DescribeSagRouteProtocolOspfResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagRouteProtocolOspfResponse self = new DescribeSagRouteProtocolOspfResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagRouteProtocolOspfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagRouteProtocolOspfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSagRouteProtocolOspfResponse setBody(DescribeSagRouteProtocolOspfResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagRouteProtocolOspfResponseBody getBody() {
        return this.body;
    }

}
