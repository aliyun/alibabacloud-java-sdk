// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMqSofamqWarnResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMqSofamqWarnResponseBody body;

    public static UpdateMqSofamqWarnResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMqSofamqWarnResponse self = new UpdateMqSofamqWarnResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMqSofamqWarnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMqSofamqWarnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMqSofamqWarnResponse setBody(UpdateMqSofamqWarnResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMqSofamqWarnResponseBody getBody() {
        return this.body;
    }

}
