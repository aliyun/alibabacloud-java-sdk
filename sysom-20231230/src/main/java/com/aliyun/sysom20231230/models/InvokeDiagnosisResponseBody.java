// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InvokeDiagnosisResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public InvokeDiagnosisResponseBodyData data;

    @NameInMap("message")
    public String message;

    @NameInMap("request_id")
    public String requestId;

    public static InvokeDiagnosisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeDiagnosisResponseBody self = new InvokeDiagnosisResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeDiagnosisResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InvokeDiagnosisResponseBody setData(InvokeDiagnosisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InvokeDiagnosisResponseBodyData getData() {
        return this.data;
    }

    public InvokeDiagnosisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InvokeDiagnosisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InvokeDiagnosisResponseBodyData extends TeaModel {
        @NameInMap("task_id")
        public String taskId;

        public static InvokeDiagnosisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InvokeDiagnosisResponseBodyData self = new InvokeDiagnosisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InvokeDiagnosisResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
