// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponseBody body;

    public static QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse self = new QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse setBody(QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponseBody getBody() {
        return this.body;
    }

}
