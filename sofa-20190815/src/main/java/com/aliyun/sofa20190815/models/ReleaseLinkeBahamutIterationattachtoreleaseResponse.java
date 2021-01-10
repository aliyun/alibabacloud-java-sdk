// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReleaseLinkeBahamutIterationattachtoreleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseLinkeBahamutIterationattachtoreleaseResponseBody body;

    public static ReleaseLinkeBahamutIterationattachtoreleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseLinkeBahamutIterationattachtoreleaseResponse self = new ReleaseLinkeBahamutIterationattachtoreleaseResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseLinkeBahamutIterationattachtoreleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseLinkeBahamutIterationattachtoreleaseResponse setBody(ReleaseLinkeBahamutIterationattachtoreleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseLinkeBahamutIterationattachtoreleaseResponseBody getBody() {
        return this.body;
    }

}
