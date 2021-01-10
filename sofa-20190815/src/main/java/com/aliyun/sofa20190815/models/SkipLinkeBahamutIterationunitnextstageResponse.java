// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SkipLinkeBahamutIterationunitnextstageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SkipLinkeBahamutIterationunitnextstageResponseBody body;

    public static SkipLinkeBahamutIterationunitnextstageResponse build(java.util.Map<String, ?> map) throws Exception {
        SkipLinkeBahamutIterationunitnextstageResponse self = new SkipLinkeBahamutIterationunitnextstageResponse();
        return TeaModel.build(map, self);
    }

    public SkipLinkeBahamutIterationunitnextstageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SkipLinkeBahamutIterationunitnextstageResponse setBody(SkipLinkeBahamutIterationunitnextstageResponseBody body) {
        this.body = body;
        return this;
    }
    public SkipLinkeBahamutIterationunitnextstageResponseBody getBody() {
        return this.body;
    }

}
