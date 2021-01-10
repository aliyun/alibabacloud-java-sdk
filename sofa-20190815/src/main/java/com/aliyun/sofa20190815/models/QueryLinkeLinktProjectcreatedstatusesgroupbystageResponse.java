// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktProjectcreatedstatusesgroupbystageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktProjectcreatedstatusesgroupbystageResponseBody body;

    public static QueryLinkeLinktProjectcreatedstatusesgroupbystageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktProjectcreatedstatusesgroupbystageResponse self = new QueryLinkeLinktProjectcreatedstatusesgroupbystageResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktProjectcreatedstatusesgroupbystageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktProjectcreatedstatusesgroupbystageResponse setBody(QueryLinkeLinktProjectcreatedstatusesgroupbystageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktProjectcreatedstatusesgroupbystageResponseBody getBody() {
        return this.body;
    }

}
