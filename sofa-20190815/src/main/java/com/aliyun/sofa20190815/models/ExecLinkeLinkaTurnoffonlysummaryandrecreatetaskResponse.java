// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinkaTurnoffonlysummaryandrecreatetaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeLinkaTurnoffonlysummaryandrecreatetaskResponseBody body;

    public static ExecLinkeLinkaTurnoffonlysummaryandrecreatetaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinkaTurnoffonlysummaryandrecreatetaskResponse self = new ExecLinkeLinkaTurnoffonlysummaryandrecreatetaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinkaTurnoffonlysummaryandrecreatetaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeLinkaTurnoffonlysummaryandrecreatetaskResponse setBody(ExecLinkeLinkaTurnoffonlysummaryandrecreatetaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeLinkaTurnoffonlysummaryandrecreatetaskResponseBody getBody() {
        return this.body;
    }

}
