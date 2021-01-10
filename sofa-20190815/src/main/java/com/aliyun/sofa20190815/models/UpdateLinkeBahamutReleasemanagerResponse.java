// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutReleasemanagerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutReleasemanagerResponseBody body;

    public static UpdateLinkeBahamutReleasemanagerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutReleasemanagerResponse self = new UpdateLinkeBahamutReleasemanagerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutReleasemanagerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutReleasemanagerResponse setBody(UpdateLinkeBahamutReleasemanagerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutReleasemanagerResponseBody getBody() {
        return this.body;
    }

}
