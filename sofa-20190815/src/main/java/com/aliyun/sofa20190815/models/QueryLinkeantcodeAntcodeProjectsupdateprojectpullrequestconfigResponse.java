// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponseBody body;

    public static QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponse self = new QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponse setBody(QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponseBody getBody() {
        return this.body;
    }

}
