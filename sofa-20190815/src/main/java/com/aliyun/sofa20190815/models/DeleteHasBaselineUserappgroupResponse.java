// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasBaselineUserappgroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasBaselineUserappgroupResponseBody body;

    public static DeleteHasBaselineUserappgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasBaselineUserappgroupResponse self = new DeleteHasBaselineUserappgroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasBaselineUserappgroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasBaselineUserappgroupResponse setBody(DeleteHasBaselineUserappgroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasBaselineUserappgroupResponseBody getBody() {
        return this.body;
    }

}
