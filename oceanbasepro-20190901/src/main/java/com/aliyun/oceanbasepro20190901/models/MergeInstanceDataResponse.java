// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class MergeInstanceDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MergeInstanceDataResponseBody body;

    public static MergeInstanceDataResponse build(java.util.Map<String, ?> map) throws Exception {
        MergeInstanceDataResponse self = new MergeInstanceDataResponse();
        return TeaModel.build(map, self);
    }

    public MergeInstanceDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MergeInstanceDataResponse setBody(MergeInstanceDataResponseBody body) {
        this.body = body;
        return this;
    }
    public MergeInstanceDataResponseBody getBody() {
        return this.body;
    }

}
