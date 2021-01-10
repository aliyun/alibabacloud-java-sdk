// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody body;

    public static QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse self = new QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse setBody(QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody getBody() {
        return this.body;
    }

}
