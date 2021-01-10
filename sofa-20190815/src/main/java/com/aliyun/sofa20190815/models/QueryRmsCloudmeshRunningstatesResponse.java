// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsCloudmeshRunningstatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsCloudmeshRunningstatesResponseBody body;

    public static QueryRmsCloudmeshRunningstatesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsCloudmeshRunningstatesResponse self = new QueryRmsCloudmeshRunningstatesResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsCloudmeshRunningstatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsCloudmeshRunningstatesResponse setBody(QueryRmsCloudmeshRunningstatesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsCloudmeshRunningstatesResponseBody getBody() {
        return this.body;
    }

}
