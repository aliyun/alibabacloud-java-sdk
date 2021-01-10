// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutIterationnameprojectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutIterationnameprojectResponseBody body;

    public static UpdateLinkeBahamutIterationnameprojectResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutIterationnameprojectResponse self = new UpdateLinkeBahamutIterationnameprojectResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutIterationnameprojectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutIterationnameprojectResponse setBody(UpdateLinkeBahamutIterationnameprojectResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutIterationnameprojectResponseBody getBody() {
        return this.body;
    }

}
