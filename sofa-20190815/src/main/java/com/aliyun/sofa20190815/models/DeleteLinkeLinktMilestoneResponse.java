// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinktMilestoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeLinktMilestoneResponseBody body;

    public static DeleteLinkeLinktMilestoneResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinktMilestoneResponse self = new DeleteLinkeLinktMilestoneResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinktMilestoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeLinktMilestoneResponse setBody(DeleteLinkeLinktMilestoneResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeLinktMilestoneResponseBody getBody() {
        return this.body;
    }

}
