// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListIndexRecoverRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIndexRecoverRecordsResponseBody body;

    public static ListIndexRecoverRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIndexRecoverRecordsResponse self = new ListIndexRecoverRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListIndexRecoverRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIndexRecoverRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIndexRecoverRecordsResponse setBody(ListIndexRecoverRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIndexRecoverRecordsResponseBody getBody() {
        return this.body;
    }

}
