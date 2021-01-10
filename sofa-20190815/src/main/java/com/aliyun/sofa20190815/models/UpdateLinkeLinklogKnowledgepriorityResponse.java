// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinklogKnowledgepriorityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinklogKnowledgepriorityResponseBody body;

    public static UpdateLinkeLinklogKnowledgepriorityResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinklogKnowledgepriorityResponse self = new UpdateLinkeLinklogKnowledgepriorityResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinklogKnowledgepriorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinklogKnowledgepriorityResponse setBody(UpdateLinkeLinklogKnowledgepriorityResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinklogKnowledgepriorityResponseBody getBody() {
        return this.body;
    }

}
