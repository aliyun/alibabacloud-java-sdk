// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutWebapiupdatebasejarversionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutWebapiupdatebasejarversionResponseBody body;

    public static UpdateLinkeBahamutWebapiupdatebasejarversionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutWebapiupdatebasejarversionResponse self = new UpdateLinkeBahamutWebapiupdatebasejarversionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutWebapiupdatebasejarversionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutWebapiupdatebasejarversionResponse setBody(UpdateLinkeBahamutWebapiupdatebasejarversionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutWebapiupdatebasejarversionResponseBody getBody() {
        return this.body;
    }

}
