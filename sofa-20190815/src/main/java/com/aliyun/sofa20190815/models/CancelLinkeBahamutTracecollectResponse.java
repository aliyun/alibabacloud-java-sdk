// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelLinkeBahamutTracecollectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelLinkeBahamutTracecollectResponseBody body;

    public static CancelLinkeBahamutTracecollectResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelLinkeBahamutTracecollectResponse self = new CancelLinkeBahamutTracecollectResponse();
        return TeaModel.build(map, self);
    }

    public CancelLinkeBahamutTracecollectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelLinkeBahamutTracecollectResponse setBody(CancelLinkeBahamutTracecollectResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelLinkeBahamutTracecollectResponseBody getBody() {
        return this.body;
    }

}
