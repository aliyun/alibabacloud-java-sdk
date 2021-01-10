// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutIterationsupdateiterationpersonsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutIterationsupdateiterationpersonsResponseBody body;

    public static QueryLinkeBahamutIterationsupdateiterationpersonsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutIterationsupdateiterationpersonsResponse self = new QueryLinkeBahamutIterationsupdateiterationpersonsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutIterationsupdateiterationpersonsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutIterationsupdateiterationpersonsResponse setBody(QueryLinkeBahamutIterationsupdateiterationpersonsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutIterationsupdateiterationpersonsResponseBody getBody() {
        return this.body;
    }

}
