// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktMilestonestatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinktMilestonestatusResponseBody body;

    public static UpdateLinkeLinktMilestonestatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktMilestonestatusResponse self = new UpdateLinkeLinktMilestonestatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktMilestonestatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinktMilestonestatusResponse setBody(UpdateLinkeLinktMilestonestatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinktMilestonestatusResponseBody getBody() {
        return this.body;
    }

}
