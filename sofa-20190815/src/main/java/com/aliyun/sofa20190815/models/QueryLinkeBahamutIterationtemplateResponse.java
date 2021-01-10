// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutIterationtemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutIterationtemplateResponseBody body;

    public static QueryLinkeBahamutIterationtemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutIterationtemplateResponse self = new QueryLinkeBahamutIterationtemplateResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutIterationtemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutIterationtemplateResponse setBody(QueryLinkeBahamutIterationtemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutIterationtemplateResponseBody getBody() {
        return this.body;
    }

}
