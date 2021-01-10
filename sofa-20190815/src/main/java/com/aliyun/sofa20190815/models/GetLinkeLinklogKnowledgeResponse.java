// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogKnowledgeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinklogKnowledgeResponseBody body;

    public static GetLinkeLinklogKnowledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogKnowledgeResponse self = new GetLinkeLinklogKnowledgeResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogKnowledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinklogKnowledgeResponse setBody(GetLinkeLinklogKnowledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinklogKnowledgeResponseBody getBody() {
        return this.body;
    }

}
