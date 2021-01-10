// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutVcsmergerequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutVcsmergerequestResponseBody body;

    public static QueryLinkeBahamutVcsmergerequestResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutVcsmergerequestResponse self = new QueryLinkeBahamutVcsmergerequestResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutVcsmergerequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutVcsmergerequestResponse setBody(QueryLinkeBahamutVcsmergerequestResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutVcsmergerequestResponseBody getBody() {
        return this.body;
    }

}
