// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCContainerServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLDCContainerServiceResponseBody body;

    public static QueryLDCContainerServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCContainerServiceResponse self = new QueryLDCContainerServiceResponse();
        return TeaModel.build(map, self);
    }

    public QueryLDCContainerServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLDCContainerServiceResponse setBody(QueryLDCContainerServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLDCContainerServiceResponseBody getBody() {
        return this.body;
    }

}
