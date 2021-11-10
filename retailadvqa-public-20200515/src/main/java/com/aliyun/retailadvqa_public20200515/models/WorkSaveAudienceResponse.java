// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class WorkSaveAudienceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public WorkSaveAudienceResponseBody body;

    public static WorkSaveAudienceResponse build(java.util.Map<String, ?> map) throws Exception {
        WorkSaveAudienceResponse self = new WorkSaveAudienceResponse();
        return TeaModel.build(map, self);
    }

    public WorkSaveAudienceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WorkSaveAudienceResponse setBody(WorkSaveAudienceResponseBody body) {
        this.body = body;
        return this;
    }
    public WorkSaveAudienceResponseBody getBody() {
        return this.body;
    }

}
