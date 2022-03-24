// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class ListTemplateRevisionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public java.util.List<TemplateRevision> body;

    public static ListTemplateRevisionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateRevisionsResponse self = new ListTemplateRevisionsResponse();
        return TeaModel.build(map, self);
    }

    public ListTemplateRevisionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTemplateRevisionsResponse setBody(java.util.List<TemplateRevision> body) {
        this.body = body;
        return this;
    }
    public java.util.List<TemplateRevision> getBody() {
        return this.body;
    }

}
