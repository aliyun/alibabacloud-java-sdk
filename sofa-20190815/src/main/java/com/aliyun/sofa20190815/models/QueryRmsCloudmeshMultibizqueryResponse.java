// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsCloudmeshMultibizqueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsCloudmeshMultibizqueryResponseBody body;

    public static QueryRmsCloudmeshMultibizqueryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsCloudmeshMultibizqueryResponse self = new QueryRmsCloudmeshMultibizqueryResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsCloudmeshMultibizqueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsCloudmeshMultibizqueryResponse setBody(QueryRmsCloudmeshMultibizqueryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsCloudmeshMultibizqueryResponseBody getBody() {
        return this.body;
    }

}
