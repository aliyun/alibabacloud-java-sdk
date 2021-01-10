// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateRmsResourcegroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRmsResourcegroupResponseBody body;

    public static UpdateRmsResourcegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRmsResourcegroupResponse self = new UpdateRmsResourcegroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRmsResourcegroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRmsResourcegroupResponse setBody(UpdateRmsResourcegroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRmsResourcegroupResponseBody getBody() {
        return this.body;
    }

}
