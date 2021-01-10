// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutReleasedependencyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutReleasedependencyResponseBody body;

    public static UpdateLinkeBahamutReleasedependencyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutReleasedependencyResponse self = new UpdateLinkeBahamutReleasedependencyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutReleasedependencyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutReleasedependencyResponse setBody(UpdateLinkeBahamutReleasedependencyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutReleasedependencyResponseBody getBody() {
        return this.body;
    }

}
