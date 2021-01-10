// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidunsubscribeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidunsubscribeResponseBody body;

    public static QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidunsubscribeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidunsubscribeResponse self = new QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidunsubscribeResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidunsubscribeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidunsubscribeResponse setBody(QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidunsubscribeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidunsubscribeResponseBody getBody() {
        return this.body;
    }

}
