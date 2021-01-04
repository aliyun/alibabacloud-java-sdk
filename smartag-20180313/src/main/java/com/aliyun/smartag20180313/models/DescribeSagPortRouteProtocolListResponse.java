// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagPortRouteProtocolListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSagPortRouteProtocolListResponseBody body;

    public static DescribeSagPortRouteProtocolListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagPortRouteProtocolListResponse self = new DescribeSagPortRouteProtocolListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagPortRouteProtocolListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagPortRouteProtocolListResponse setBody(DescribeSagPortRouteProtocolListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagPortRouteProtocolListResponseBody getBody() {
        return this.body;
    }

}
