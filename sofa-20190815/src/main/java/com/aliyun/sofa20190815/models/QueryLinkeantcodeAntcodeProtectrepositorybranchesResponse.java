// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBody body;

    public static QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse self = new QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse setBody(QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseBody getBody() {
        return this.body;
    }

}
