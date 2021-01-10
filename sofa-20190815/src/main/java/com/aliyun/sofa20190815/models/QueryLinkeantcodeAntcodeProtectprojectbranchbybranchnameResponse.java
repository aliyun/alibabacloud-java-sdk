// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBody body;

    public static QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse self = new QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse setBody(QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBody getBody() {
        return this.body;
    }

}
