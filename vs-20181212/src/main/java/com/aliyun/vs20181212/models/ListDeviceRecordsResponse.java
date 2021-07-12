// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListDeviceRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeviceRecordsResponseBody body;

    public static ListDeviceRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceRecordsResponse self = new ListDeviceRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeviceRecordsResponse setBody(ListDeviceRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceRecordsResponseBody getBody() {
        return this.body;
    }

}
