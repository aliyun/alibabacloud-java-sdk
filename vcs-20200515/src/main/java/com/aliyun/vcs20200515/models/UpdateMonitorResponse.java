// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateMonitorResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMonitorResponse self = new UpdateMonitorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMonitorResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateMonitorResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateMonitorResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateMonitorResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
