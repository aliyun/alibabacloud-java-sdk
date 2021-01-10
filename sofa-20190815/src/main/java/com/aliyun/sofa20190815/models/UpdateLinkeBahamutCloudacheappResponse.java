// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutCloudacheappResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutCloudacheappResponseBody body;

    public static UpdateLinkeBahamutCloudacheappResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutCloudacheappResponse self = new UpdateLinkeBahamutCloudacheappResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutCloudacheappResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutCloudacheappResponse setBody(UpdateLinkeBahamutCloudacheappResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutCloudacheappResponseBody getBody() {
        return this.body;
    }

}
