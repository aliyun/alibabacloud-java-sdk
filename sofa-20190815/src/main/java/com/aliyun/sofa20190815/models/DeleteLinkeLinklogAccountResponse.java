// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinklogAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeLinklogAccountResponseBody body;

    public static DeleteLinkeLinklogAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinklogAccountResponse self = new DeleteLinkeLinklogAccountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinklogAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeLinklogAccountResponse setBody(DeleteLinkeLinklogAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeLinklogAccountResponseBody getBody() {
        return this.body;
    }

}
