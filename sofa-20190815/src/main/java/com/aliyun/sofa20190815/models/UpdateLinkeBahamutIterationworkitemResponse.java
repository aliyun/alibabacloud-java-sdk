// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutIterationworkitemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutIterationworkitemResponseBody body;

    public static UpdateLinkeBahamutIterationworkitemResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutIterationworkitemResponse self = new UpdateLinkeBahamutIterationworkitemResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutIterationworkitemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutIterationworkitemResponse setBody(UpdateLinkeBahamutIterationworkitemResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutIterationworkitemResponseBody getBody() {
        return this.body;
    }

}
