// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushLinkeBahamutWebapireleasesubmitreleasebyenvResponseBody body;

    public static PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse build(java.util.Map<String, ?> map) throws Exception {
        PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse self = new PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse();
        return TeaModel.build(map, self);
    }

    public PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse setBody(PushLinkeBahamutWebapireleasesubmitreleasebyenvResponseBody body) {
        this.body = body;
        return this;
    }
    public PushLinkeBahamutWebapireleasesubmitreleasebyenvResponseBody getBody() {
        return this.body;
    }

}
