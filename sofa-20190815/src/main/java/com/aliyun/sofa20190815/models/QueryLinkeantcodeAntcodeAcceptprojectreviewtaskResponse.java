// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeAcceptprojectreviewtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeAcceptprojectreviewtaskResponseBody body;

    public static QueryLinkeantcodeAntcodeAcceptprojectreviewtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeAcceptprojectreviewtaskResponse self = new QueryLinkeantcodeAntcodeAcceptprojectreviewtaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeAcceptprojectreviewtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeAcceptprojectreviewtaskResponse setBody(QueryLinkeantcodeAntcodeAcceptprojectreviewtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeAcceptprojectreviewtaskResponseBody getBody() {
        return this.body;
    }

}
