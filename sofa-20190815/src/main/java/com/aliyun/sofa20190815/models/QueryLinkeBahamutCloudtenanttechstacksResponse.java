// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutCloudtenanttechstacksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutCloudtenanttechstacksResponseBody body;

    public static QueryLinkeBahamutCloudtenanttechstacksResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutCloudtenanttechstacksResponse self = new QueryLinkeBahamutCloudtenanttechstacksResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutCloudtenanttechstacksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutCloudtenanttechstacksResponse setBody(QueryLinkeBahamutCloudtenanttechstacksResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutCloudtenanttechstacksResponseBody getBody() {
        return this.body;
    }

}
