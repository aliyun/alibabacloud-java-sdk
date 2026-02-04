// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyParameterTimedScheduleTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyParameterTimedScheduleTaskResponseBody body;

    public static ModifyParameterTimedScheduleTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyParameterTimedScheduleTaskResponse self = new ModifyParameterTimedScheduleTaskResponse();
        return TeaModel.build(map, self);
    }

    public ModifyParameterTimedScheduleTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyParameterTimedScheduleTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyParameterTimedScheduleTaskResponse setBody(ModifyParameterTimedScheduleTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyParameterTimedScheduleTaskResponseBody getBody() {
        return this.body;
    }

}
