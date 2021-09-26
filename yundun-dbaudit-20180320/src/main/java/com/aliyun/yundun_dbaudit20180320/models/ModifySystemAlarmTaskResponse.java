// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ModifySystemAlarmTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySystemAlarmTaskResponseBody body;

    public static ModifySystemAlarmTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySystemAlarmTaskResponse self = new ModifySystemAlarmTaskResponse();
        return TeaModel.build(map, self);
    }

    public ModifySystemAlarmTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySystemAlarmTaskResponse setBody(ModifySystemAlarmTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySystemAlarmTaskResponseBody getBody() {
        return this.body;
    }

}
