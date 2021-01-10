// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeBahamutAppcustompipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeBahamutAppcustompipelineResponseBody body;

    public static ExecLinkeBahamutAppcustompipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeBahamutAppcustompipelineResponse self = new ExecLinkeBahamutAppcustompipelineResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeBahamutAppcustompipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeBahamutAppcustompipelineResponse setBody(ExecLinkeBahamutAppcustompipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeBahamutAppcustompipelineResponseBody getBody() {
        return this.body;
    }

}
