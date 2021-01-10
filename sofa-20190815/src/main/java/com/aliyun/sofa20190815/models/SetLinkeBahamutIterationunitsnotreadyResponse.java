// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetLinkeBahamutIterationunitsnotreadyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetLinkeBahamutIterationunitsnotreadyResponseBody body;

    public static SetLinkeBahamutIterationunitsnotreadyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLinkeBahamutIterationunitsnotreadyResponse self = new SetLinkeBahamutIterationunitsnotreadyResponse();
        return TeaModel.build(map, self);
    }

    public SetLinkeBahamutIterationunitsnotreadyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLinkeBahamutIterationunitsnotreadyResponse setBody(SetLinkeBahamutIterationunitsnotreadyResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLinkeBahamutIterationunitsnotreadyResponseBody getBody() {
        return this.body;
    }

}
