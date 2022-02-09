// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeMigrationEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMigrationEndpointsResponseBody body;

    public static DescribeMigrationEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationEndpointsResponse self = new DescribeMigrationEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMigrationEndpointsResponse setBody(DescribeMigrationEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMigrationEndpointsResponseBody getBody() {
        return this.body;
    }

}
