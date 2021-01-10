// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktMilestoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinktMilestoneResponseBody body;

    public static UpdateLinkeLinktMilestoneResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktMilestoneResponse self = new UpdateLinkeLinktMilestoneResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktMilestoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinktMilestoneResponse setBody(UpdateLinkeLinktMilestoneResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinktMilestoneResponseBody getBody() {
        return this.body;
    }

}
