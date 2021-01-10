// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutArchdomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutArchdomainResponseBody body;

    public static UpdateLinkeBahamutArchdomainResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutArchdomainResponse self = new UpdateLinkeBahamutArchdomainResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutArchdomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutArchdomainResponse setBody(UpdateLinkeBahamutArchdomainResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutArchdomainResponseBody getBody() {
        return this.body;
    }

}
