// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ExecuteWorkflowResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ExecuteWorkflowResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ExecuteWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteWorkflowResponseBody self = new ExecuteWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteWorkflowResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ExecuteWorkflowResponseBody setData(ExecuteWorkflowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteWorkflowResponseBodyData getData() {
        return this.data;
    }

    public ExecuteWorkflowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecuteWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteWorkflowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecuteWorkflowResponseBodyData extends TeaModel {
        @NameInMap("WfInstanceId")
        public Long wfInstanceId;

        public static ExecuteWorkflowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteWorkflowResponseBodyData self = new ExecuteWorkflowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteWorkflowResponseBodyData setWfInstanceId(Long wfInstanceId) {
            this.wfInstanceId = wfInstanceId;
            return this;
        }
        public Long getWfInstanceId() {
            return this.wfInstanceId;
        }

    }

}
