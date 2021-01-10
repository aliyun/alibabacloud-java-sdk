// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponseBody body;

    public static QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse self = new QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse setBody(QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponseBody getBody() {
        return this.body;
    }

}
