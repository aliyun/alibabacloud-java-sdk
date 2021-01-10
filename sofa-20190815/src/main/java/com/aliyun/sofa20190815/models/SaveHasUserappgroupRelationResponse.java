// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveHasUserappgroupRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveHasUserappgroupRelationResponseBody body;

    public static SaveHasUserappgroupRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveHasUserappgroupRelationResponse self = new SaveHasUserappgroupRelationResponse();
        return TeaModel.build(map, self);
    }

    public SaveHasUserappgroupRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveHasUserappgroupRelationResponse setBody(SaveHasUserappgroupRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveHasUserappgroupRelationResponseBody getBody() {
        return this.body;
    }

}
