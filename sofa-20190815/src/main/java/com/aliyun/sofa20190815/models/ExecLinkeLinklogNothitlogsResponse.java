// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinklogNothitlogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeLinklogNothitlogsResponseBody body;

    public static ExecLinkeLinklogNothitlogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinklogNothitlogsResponse self = new ExecLinkeLinklogNothitlogsResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinklogNothitlogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeLinklogNothitlogsResponse setBody(ExecLinkeLinklogNothitlogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeLinklogNothitlogsResponseBody getBody() {
        return this.body;
    }

}
