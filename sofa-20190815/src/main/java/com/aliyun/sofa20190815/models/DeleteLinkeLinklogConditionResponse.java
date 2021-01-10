// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinklogConditionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeLinklogConditionResponseBody body;

    public static DeleteLinkeLinklogConditionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinklogConditionResponse self = new DeleteLinkeLinklogConditionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinklogConditionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeLinklogConditionResponse setBody(DeleteLinkeLinklogConditionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeLinklogConditionResponseBody getBody() {
        return this.body;
    }

}
