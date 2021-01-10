// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMqSofamqTopicRemarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMqSofamqTopicRemarkResponseBody body;

    public static UpdateMqSofamqTopicRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMqSofamqTopicRemarkResponse self = new UpdateMqSofamqTopicRemarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMqSofamqTopicRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMqSofamqTopicRemarkResponse setBody(UpdateMqSofamqTopicRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMqSofamqTopicRemarkResponseBody getBody() {
        return this.body;
    }

}
