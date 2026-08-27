// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListActiveAnnouncementsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListActiveAnnouncementsResponseBody body;

    public static ListActiveAnnouncementsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListActiveAnnouncementsResponse self = new ListActiveAnnouncementsResponse();
        return TeaModel.build(map, self);
    }

    public ListActiveAnnouncementsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListActiveAnnouncementsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListActiveAnnouncementsResponse setBody(ListActiveAnnouncementsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListActiveAnnouncementsResponseBody getBody() {
        return this.body;
    }

}
