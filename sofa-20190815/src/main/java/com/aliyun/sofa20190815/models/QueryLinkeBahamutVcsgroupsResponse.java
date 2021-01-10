// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutVcsgroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutVcsgroupsResponseBody body;

    public static QueryLinkeBahamutVcsgroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutVcsgroupsResponse self = new QueryLinkeBahamutVcsgroupsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutVcsgroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutVcsgroupsResponse setBody(QueryLinkeBahamutVcsgroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutVcsgroupsResponseBody getBody() {
        return this.body;
    }

}
