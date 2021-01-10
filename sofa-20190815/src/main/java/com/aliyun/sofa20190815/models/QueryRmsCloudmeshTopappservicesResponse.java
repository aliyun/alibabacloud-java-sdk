// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsCloudmeshTopappservicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsCloudmeshTopappservicesResponseBody body;

    public static QueryRmsCloudmeshTopappservicesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsCloudmeshTopappservicesResponse self = new QueryRmsCloudmeshTopappservicesResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsCloudmeshTopappservicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsCloudmeshTopappservicesResponse setBody(QueryRmsCloudmeshTopappservicesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsCloudmeshTopappservicesResponseBody getBody() {
        return this.body;
    }

}
