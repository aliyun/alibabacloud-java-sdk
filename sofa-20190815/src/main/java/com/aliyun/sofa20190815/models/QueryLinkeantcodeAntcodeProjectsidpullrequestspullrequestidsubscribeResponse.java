// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponseBody body;

    public static QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponse self = new QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponse setBody(QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponseBody getBody() {
        return this.body;
    }

}
