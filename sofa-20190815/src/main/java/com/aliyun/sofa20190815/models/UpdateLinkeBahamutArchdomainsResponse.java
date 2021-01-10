// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutArchdomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutArchdomainsResponseBody body;

    public static UpdateLinkeBahamutArchdomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutArchdomainsResponse self = new UpdateLinkeBahamutArchdomainsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutArchdomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutArchdomainsResponse setBody(UpdateLinkeBahamutArchdomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutArchdomainsResponseBody getBody() {
        return this.body;
    }

}
