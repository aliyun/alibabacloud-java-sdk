// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinklogKnowledgeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinklogKnowledgeResponseBody body;

    public static UpdateLinkeLinklogKnowledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinklogKnowledgeResponse self = new UpdateLinkeLinklogKnowledgeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinklogKnowledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinklogKnowledgeResponse setBody(UpdateLinkeLinklogKnowledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinklogKnowledgeResponseBody getBody() {
        return this.body;
    }

}
