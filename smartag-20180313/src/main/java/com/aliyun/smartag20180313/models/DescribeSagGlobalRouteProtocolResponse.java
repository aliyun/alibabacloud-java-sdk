// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagGlobalRouteProtocolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSagGlobalRouteProtocolResponseBody body;

    public static DescribeSagGlobalRouteProtocolResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagGlobalRouteProtocolResponse self = new DescribeSagGlobalRouteProtocolResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagGlobalRouteProtocolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagGlobalRouteProtocolResponse setBody(DescribeSagGlobalRouteProtocolResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagGlobalRouteProtocolResponseBody getBody() {
        return this.body;
    }

}
