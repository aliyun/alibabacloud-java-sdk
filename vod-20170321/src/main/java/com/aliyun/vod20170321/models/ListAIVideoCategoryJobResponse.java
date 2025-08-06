// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIVideoCategoryJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAIVideoCategoryJobResponseBody body;

    public static ListAIVideoCategoryJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoCategoryJobResponse self = new ListAIVideoCategoryJobResponse();
        return TeaModel.build(map, self);
    }

    public ListAIVideoCategoryJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAIVideoCategoryJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAIVideoCategoryJobResponse setBody(ListAIVideoCategoryJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAIVideoCategoryJobResponseBody getBody() {
        return this.body;
    }

}
