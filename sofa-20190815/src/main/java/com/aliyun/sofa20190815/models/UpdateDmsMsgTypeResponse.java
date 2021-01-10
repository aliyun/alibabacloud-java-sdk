// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateDmsMsgTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDmsMsgTypeResponseBody body;

    public static UpdateDmsMsgTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDmsMsgTypeResponse self = new UpdateDmsMsgTypeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDmsMsgTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDmsMsgTypeResponse setBody(UpdateDmsMsgTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDmsMsgTypeResponseBody getBody() {
        return this.body;
    }

}
