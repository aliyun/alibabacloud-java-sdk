// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSServiceSubscriberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMSServiceSubscriberResponseBody body;

    public static QueryMSServiceSubscriberResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMSServiceSubscriberResponse self = new QueryMSServiceSubscriberResponse();
        return TeaModel.build(map, self);
    }

    public QueryMSServiceSubscriberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMSServiceSubscriberResponse setBody(QueryMSServiceSubscriberResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMSServiceSubscriberResponseBody getBody() {
        return this.body;
    }

}
