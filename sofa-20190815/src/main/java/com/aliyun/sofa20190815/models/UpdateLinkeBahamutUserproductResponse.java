// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutUserproductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutUserproductResponseBody body;

    public static UpdateLinkeBahamutUserproductResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutUserproductResponse self = new UpdateLinkeBahamutUserproductResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutUserproductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutUserproductResponse setBody(UpdateLinkeBahamutUserproductResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutUserproductResponseBody getBody() {
        return this.body;
    }

}
