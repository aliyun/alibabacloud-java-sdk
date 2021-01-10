// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StartLinkeBahamutReleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartLinkeBahamutReleaseResponseBody body;

    public static StartLinkeBahamutReleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        StartLinkeBahamutReleaseResponse self = new StartLinkeBahamutReleaseResponse();
        return TeaModel.build(map, self);
    }

    public StartLinkeBahamutReleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartLinkeBahamutReleaseResponse setBody(StartLinkeBahamutReleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public StartLinkeBahamutReleaseResponseBody getBody() {
        return this.body;
    }

}
