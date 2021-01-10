// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinklogKnowledgeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeLinklogKnowledgeResponseBody body;

    public static ListLinkeLinklogKnowledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinklogKnowledgeResponse self = new ListLinkeLinklogKnowledgeResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinklogKnowledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeLinklogKnowledgeResponse setBody(ListLinkeLinklogKnowledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeLinklogKnowledgeResponseBody getBody() {
        return this.body;
    }

}
