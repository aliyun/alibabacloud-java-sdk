// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBody body;

    public static ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse self = new ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse setBody(ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBody getBody() {
        return this.body;
    }

}
