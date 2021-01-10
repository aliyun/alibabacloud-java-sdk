// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPEnvironmentLookoutAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryODPEnvironmentLookoutAddressResponseBody body;

    public static QueryODPEnvironmentLookoutAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryODPEnvironmentLookoutAddressResponse self = new QueryODPEnvironmentLookoutAddressResponse();
        return TeaModel.build(map, self);
    }

    public QueryODPEnvironmentLookoutAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryODPEnvironmentLookoutAddressResponse setBody(QueryODPEnvironmentLookoutAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryODPEnvironmentLookoutAddressResponseBody getBody() {
        return this.body;
    }

}
