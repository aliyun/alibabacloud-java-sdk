// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class TogglePublicSlbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TogglePublicSlbResponseBody body;

    public static TogglePublicSlbResponse build(java.util.Map<String, ?> map) throws Exception {
        TogglePublicSlbResponse self = new TogglePublicSlbResponse();
        return TeaModel.build(map, self);
    }

    public TogglePublicSlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TogglePublicSlbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TogglePublicSlbResponse setBody(TogglePublicSlbResponseBody body) {
        this.body = body;
        return this;
    }
    public TogglePublicSlbResponseBody getBody() {
        return this.body;
    }

}
