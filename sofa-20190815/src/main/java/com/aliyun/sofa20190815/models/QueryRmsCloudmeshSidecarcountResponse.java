// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsCloudmeshSidecarcountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsCloudmeshSidecarcountResponseBody body;

    public static QueryRmsCloudmeshSidecarcountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsCloudmeshSidecarcountResponse self = new QueryRmsCloudmeshSidecarcountResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsCloudmeshSidecarcountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsCloudmeshSidecarcountResponse setBody(QueryRmsCloudmeshSidecarcountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsCloudmeshSidecarcountResponseBody getBody() {
        return this.body;
    }

}
