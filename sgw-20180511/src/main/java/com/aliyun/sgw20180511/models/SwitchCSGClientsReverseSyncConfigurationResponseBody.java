// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class SwitchCSGClientsReverseSyncConfigurationResponseBody extends TeaModel {
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

    public static SwitchCSGClientsReverseSyncConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchCSGClientsReverseSyncConfigurationResponseBody self = new SwitchCSGClientsReverseSyncConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchCSGClientsReverseSyncConfigurationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SwitchCSGClientsReverseSyncConfigurationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SwitchCSGClientsReverseSyncConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SwitchCSGClientsReverseSyncConfigurationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SwitchCSGClientsReverseSyncConfigurationResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
