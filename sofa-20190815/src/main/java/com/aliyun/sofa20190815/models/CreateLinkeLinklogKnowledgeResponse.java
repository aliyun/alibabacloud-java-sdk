// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinklogKnowledgeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeLinklogKnowledgeResponseBody body;

    public static CreateLinkeLinklogKnowledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinklogKnowledgeResponse self = new CreateLinkeLinklogKnowledgeResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinklogKnowledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeLinklogKnowledgeResponse setBody(CreateLinkeLinklogKnowledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeLinklogKnowledgeResponseBody getBody() {
        return this.body;
    }

}
