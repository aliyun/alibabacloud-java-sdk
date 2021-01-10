// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeLinklogConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeLinklogConfigResponseBody body;

    public static AddLinkeLinklogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeLinklogConfigResponse self = new AddLinkeLinklogConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeLinklogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeLinklogConfigResponse setBody(AddLinkeLinklogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeLinklogConfigResponseBody getBody() {
        return this.body;
    }

}
