// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutUpdatebasejarversionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutUpdatebasejarversionResponseBody body;

    public static UpdateLinkeBahamutUpdatebasejarversionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutUpdatebasejarversionResponse self = new UpdateLinkeBahamutUpdatebasejarversionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutUpdatebasejarversionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutUpdatebasejarversionResponse setBody(UpdateLinkeBahamutUpdatebasejarversionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutUpdatebasejarversionResponseBody getBody() {
        return this.body;
    }

}
