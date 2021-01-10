// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeLinklogIndicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeLinklogIndicationResponseBody body;

    public static AddLinkeLinklogIndicationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeLinklogIndicationResponse self = new AddLinkeLinklogIndicationResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeLinklogIndicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeLinklogIndicationResponse setBody(AddLinkeLinklogIndicationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeLinklogIndicationResponseBody getBody() {
        return this.body;
    }

}
