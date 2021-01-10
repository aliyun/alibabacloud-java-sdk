// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinklogAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinklogAccountResponseBody body;

    public static UpdateLinkeLinklogAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinklogAccountResponse self = new UpdateLinkeLinklogAccountResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinklogAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinklogAccountResponse setBody(UpdateLinkeLinklogAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinklogAccountResponseBody getBody() {
        return this.body;
    }

}
