// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListLiveRecordVideoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLiveRecordVideoResponseBody body;

    public static ListLiveRecordVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRecordVideoResponse self = new ListLiveRecordVideoResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveRecordVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveRecordVideoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLiveRecordVideoResponse setBody(ListLiveRecordVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveRecordVideoResponseBody getBody() {
        return this.body;
    }

}
