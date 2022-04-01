// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListNodeGroupMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNodeGroupMetaResponseBody body;

    public static ListNodeGroupMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodeGroupMetaResponse self = new ListNodeGroupMetaResponse();
        return TeaModel.build(map, self);
    }

    public ListNodeGroupMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodeGroupMetaResponse setBody(ListNodeGroupMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodeGroupMetaResponseBody getBody() {
        return this.body;
    }

}
