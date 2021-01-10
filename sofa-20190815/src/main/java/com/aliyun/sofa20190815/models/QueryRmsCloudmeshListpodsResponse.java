// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsCloudmeshListpodsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsCloudmeshListpodsResponseBody body;

    public static QueryRmsCloudmeshListpodsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsCloudmeshListpodsResponse self = new QueryRmsCloudmeshListpodsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsCloudmeshListpodsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsCloudmeshListpodsResponse setBody(QueryRmsCloudmeshListpodsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsCloudmeshListpodsResponseBody getBody() {
        return this.body;
    }

}
