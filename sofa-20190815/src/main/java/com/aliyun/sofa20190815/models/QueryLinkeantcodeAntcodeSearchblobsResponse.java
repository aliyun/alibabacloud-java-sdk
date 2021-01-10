// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeSearchblobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeSearchblobsResponseBody body;

    public static QueryLinkeantcodeAntcodeSearchblobsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeSearchblobsResponse self = new QueryLinkeantcodeAntcodeSearchblobsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeSearchblobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeSearchblobsResponse setBody(QueryLinkeantcodeAntcodeSearchblobsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeSearchblobsResponseBody getBody() {
        return this.body;
    }

}
