// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class TriggerGatewayRemoteSyncResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskId")
    public String taskId;

    public static TriggerGatewayRemoteSyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TriggerGatewayRemoteSyncResponseBody self = new TriggerGatewayRemoteSyncResponseBody();
        return TeaModel.build(map, self);
    }

    public TriggerGatewayRemoteSyncResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TriggerGatewayRemoteSyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TriggerGatewayRemoteSyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TriggerGatewayRemoteSyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TriggerGatewayRemoteSyncResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
