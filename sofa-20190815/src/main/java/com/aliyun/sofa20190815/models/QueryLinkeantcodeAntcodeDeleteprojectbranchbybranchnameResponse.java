// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponseBody body;

    public static QueryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponse self = new QueryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponse setBody(QueryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponseBody getBody() {
        return this.body;
    }

}
