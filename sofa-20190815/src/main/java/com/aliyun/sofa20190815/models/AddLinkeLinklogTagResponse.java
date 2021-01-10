// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeLinklogTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeLinklogTagResponseBody body;

    public static AddLinkeLinklogTagResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeLinklogTagResponse self = new AddLinkeLinklogTagResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeLinklogTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeLinklogTagResponse setBody(AddLinkeLinklogTagResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeLinklogTagResponseBody getBody() {
        return this.body;
    }

}
