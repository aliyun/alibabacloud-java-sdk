// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class DeleteConsumerGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DeleteConsumerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConsumerGroupResponse self = new DeleteConsumerGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConsumerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
