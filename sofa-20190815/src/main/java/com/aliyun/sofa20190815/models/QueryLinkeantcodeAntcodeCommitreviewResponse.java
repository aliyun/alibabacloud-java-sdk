// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeCommitreviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeCommitreviewResponseBody body;

    public static QueryLinkeantcodeAntcodeCommitreviewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeCommitreviewResponse self = new QueryLinkeantcodeAntcodeCommitreviewResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeCommitreviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeCommitreviewResponse setBody(QueryLinkeantcodeAntcodeCommitreviewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeCommitreviewResponseBody getBody() {
        return this.body;
    }

}
