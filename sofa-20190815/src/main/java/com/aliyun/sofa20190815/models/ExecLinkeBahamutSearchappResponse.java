// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeBahamutSearchappResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeBahamutSearchappResponseBody body;

    public static ExecLinkeBahamutSearchappResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeBahamutSearchappResponse self = new ExecLinkeBahamutSearchappResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeBahamutSearchappResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeBahamutSearchappResponse setBody(ExecLinkeBahamutSearchappResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeBahamutSearchappResponseBody getBody() {
        return this.body;
    }

}
