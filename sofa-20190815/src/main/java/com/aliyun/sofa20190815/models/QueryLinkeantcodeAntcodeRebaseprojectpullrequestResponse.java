// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody body;

    public static QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse self = new QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse setBody(QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody getBody() {
        return this.body;
    }

}
