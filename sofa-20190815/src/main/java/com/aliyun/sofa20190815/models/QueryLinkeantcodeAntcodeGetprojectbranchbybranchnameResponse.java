// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBody body;

    public static QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse self = new QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse setBody(QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBody getBody() {
        return this.body;
    }

}
