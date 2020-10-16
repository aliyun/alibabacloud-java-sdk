// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class StopMonitorResponse extends TeaModel {
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

    public static StopMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        StopMonitorResponse self = new StopMonitorResponse();
        return TeaModel.build(map, self);
    }

    public StopMonitorResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopMonitorResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public StopMonitorResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopMonitorResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
