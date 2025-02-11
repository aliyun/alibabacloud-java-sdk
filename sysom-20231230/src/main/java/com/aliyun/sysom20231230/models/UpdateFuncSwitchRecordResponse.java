// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateFuncSwitchRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFuncSwitchRecordResponseBody body;

    public static UpdateFuncSwitchRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFuncSwitchRecordResponse self = new UpdateFuncSwitchRecordResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFuncSwitchRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFuncSwitchRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFuncSwitchRecordResponse setBody(UpdateFuncSwitchRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFuncSwitchRecordResponseBody getBody() {
        return this.body;
    }

}
