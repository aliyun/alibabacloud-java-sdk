// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinklogKnowledgefeedbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeLinklogKnowledgefeedbackResponseBody body;

    public static ExecLinkeLinklogKnowledgefeedbackResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinklogKnowledgefeedbackResponse self = new ExecLinkeLinklogKnowledgefeedbackResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinklogKnowledgefeedbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeLinklogKnowledgefeedbackResponse setBody(ExecLinkeLinklogKnowledgefeedbackResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeLinklogKnowledgefeedbackResponseBody getBody() {
        return this.body;
    }

}
