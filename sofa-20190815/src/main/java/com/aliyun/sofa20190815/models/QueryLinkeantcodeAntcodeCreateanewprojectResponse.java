// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeCreateanewprojectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody body;

    public static QueryLinkeantcodeAntcodeCreateanewprojectResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeCreateanewprojectResponse self = new QueryLinkeantcodeAntcodeCreateanewprojectResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponse setBody(QueryLinkeantcodeAntcodeCreateanewprojectResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody getBody() {
        return this.body;
    }

}
