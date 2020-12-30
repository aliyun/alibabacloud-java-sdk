// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryUniqueDeviceStatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUniqueDeviceStatResponseBody body;

    public static QueryUniqueDeviceStatResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUniqueDeviceStatResponse self = new QueryUniqueDeviceStatResponse();
        return TeaModel.build(map, self);
    }

    public QueryUniqueDeviceStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUniqueDeviceStatResponse setBody(QueryUniqueDeviceStatResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUniqueDeviceStatResponseBody getBody() {
        return this.body;
    }

}
