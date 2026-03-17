// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagRouteProtocolBgpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSagRouteProtocolBgpResponseBody body;

    public static DescribeSagRouteProtocolBgpResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagRouteProtocolBgpResponse self = new DescribeSagRouteProtocolBgpResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagRouteProtocolBgpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagRouteProtocolBgpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSagRouteProtocolBgpResponse setBody(DescribeSagRouteProtocolBgpResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagRouteProtocolBgpResponseBody getBody() {
        return this.body;
    }

}
