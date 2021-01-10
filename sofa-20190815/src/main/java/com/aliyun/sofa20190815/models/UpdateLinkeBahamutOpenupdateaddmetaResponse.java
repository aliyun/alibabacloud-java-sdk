// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutOpenupdateaddmetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutOpenupdateaddmetaResponseBody body;

    public static UpdateLinkeBahamutOpenupdateaddmetaResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutOpenupdateaddmetaResponse self = new UpdateLinkeBahamutOpenupdateaddmetaResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutOpenupdateaddmetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutOpenupdateaddmetaResponse setBody(UpdateLinkeBahamutOpenupdateaddmetaResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutOpenupdateaddmetaResponseBody getBody() {
        return this.body;
    }

}
