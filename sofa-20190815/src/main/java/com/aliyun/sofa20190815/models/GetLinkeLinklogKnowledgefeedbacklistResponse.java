// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogKnowledgefeedbacklistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinklogKnowledgefeedbacklistResponseBody body;

    public static GetLinkeLinklogKnowledgefeedbacklistResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogKnowledgefeedbacklistResponse self = new GetLinkeLinklogKnowledgefeedbacklistResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogKnowledgefeedbacklistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinklogKnowledgefeedbacklistResponse setBody(GetLinkeLinklogKnowledgefeedbacklistResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinklogKnowledgefeedbacklistResponseBody getBody() {
        return this.body;
    }

}
