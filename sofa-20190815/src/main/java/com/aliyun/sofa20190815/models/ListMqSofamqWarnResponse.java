// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqWarnResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMqSofamqWarnResponseBody body;

    public static ListMqSofamqWarnResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqWarnResponse self = new ListMqSofamqWarnResponse();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqWarnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMqSofamqWarnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMqSofamqWarnResponse setBody(ListMqSofamqWarnResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMqSofamqWarnResponseBody getBody() {
        return this.body;
    }

}
