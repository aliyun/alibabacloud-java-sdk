// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListInstancePatchStatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInstancePatchStatesResponseBody body;

    public static ListInstancePatchStatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstancePatchStatesResponse self = new ListInstancePatchStatesResponse();
        return TeaModel.build(map, self);
    }

    public ListInstancePatchStatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstancePatchStatesResponse setBody(ListInstancePatchStatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstancePatchStatesResponseBody getBody() {
        return this.body;
    }

}
