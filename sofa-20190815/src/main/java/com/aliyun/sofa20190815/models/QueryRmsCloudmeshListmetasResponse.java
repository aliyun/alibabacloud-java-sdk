// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsCloudmeshListmetasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsCloudmeshListmetasResponseBody body;

    public static QueryRmsCloudmeshListmetasResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsCloudmeshListmetasResponse self = new QueryRmsCloudmeshListmetasResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsCloudmeshListmetasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsCloudmeshListmetasResponse setBody(QueryRmsCloudmeshListmetasResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsCloudmeshListmetasResponseBody getBody() {
        return this.body;
    }

}
