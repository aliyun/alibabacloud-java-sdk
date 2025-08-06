// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIVideoCoverJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAIVideoCoverJobResponseBody body;

    public static ListAIVideoCoverJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoCoverJobResponse self = new ListAIVideoCoverJobResponse();
        return TeaModel.build(map, self);
    }

    public ListAIVideoCoverJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAIVideoCoverJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAIVideoCoverJobResponse setBody(ListAIVideoCoverJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAIVideoCoverJobResponseBody getBody() {
        return this.body;
    }

}
