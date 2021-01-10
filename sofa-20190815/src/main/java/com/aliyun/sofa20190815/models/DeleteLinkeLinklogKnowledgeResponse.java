// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinklogKnowledgeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeLinklogKnowledgeResponseBody body;

    public static DeleteLinkeLinklogKnowledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinklogKnowledgeResponse self = new DeleteLinkeLinklogKnowledgeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinklogKnowledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeLinklogKnowledgeResponse setBody(DeleteLinkeLinklogKnowledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeLinklogKnowledgeResponseBody getBody() {
        return this.body;
    }

}
