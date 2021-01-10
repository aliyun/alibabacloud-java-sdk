// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsCloudmeshListappserviceversionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsCloudmeshListappserviceversionsResponseBody body;

    public static QueryRmsCloudmeshListappserviceversionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsCloudmeshListappserviceversionsResponse self = new QueryRmsCloudmeshListappserviceversionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsCloudmeshListappserviceversionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsCloudmeshListappserviceversionsResponse setBody(QueryRmsCloudmeshListappserviceversionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsCloudmeshListappserviceversionsResponseBody getBody() {
        return this.body;
    }

}
