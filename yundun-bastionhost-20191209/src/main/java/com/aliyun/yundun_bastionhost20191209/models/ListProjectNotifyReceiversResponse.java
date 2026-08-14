// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListProjectNotifyReceiversResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProjectNotifyReceiversResponseBody body;

    public static ListProjectNotifyReceiversResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectNotifyReceiversResponse self = new ListProjectNotifyReceiversResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectNotifyReceiversResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectNotifyReceiversResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectNotifyReceiversResponse setBody(ListProjectNotifyReceiversResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectNotifyReceiversResponseBody getBody() {
        return this.body;
    }

}
