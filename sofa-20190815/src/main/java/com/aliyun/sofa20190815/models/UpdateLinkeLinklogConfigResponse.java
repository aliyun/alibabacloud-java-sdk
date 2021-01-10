// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinklogConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinklogConfigResponseBody body;

    public static UpdateLinkeLinklogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinklogConfigResponse self = new UpdateLinkeLinklogConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinklogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinklogConfigResponse setBody(UpdateLinkeLinklogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinklogConfigResponseBody getBody() {
        return this.body;
    }

}
