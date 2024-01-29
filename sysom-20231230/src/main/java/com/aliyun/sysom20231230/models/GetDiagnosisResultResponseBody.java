// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetDiagnosisResultResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetDiagnosisResultResponseBodyData data;

    @NameInMap("message")
    public String message;

    @NameInMap("request_id")
    public String requestId;

    public static GetDiagnosisResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDiagnosisResultResponseBody self = new GetDiagnosisResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDiagnosisResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDiagnosisResultResponseBody setData(GetDiagnosisResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDiagnosisResultResponseBodyData getData() {
        return this.data;
    }

    public GetDiagnosisResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDiagnosisResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDiagnosisResultResponseBodyData extends TeaModel {
        @NameInMap("code")
        public Integer code;

        @NameInMap("command")
        public Object command;

        @NameInMap("err_msg")
        public String errMsg;

        @NameInMap("params")
        public Object params;

        @NameInMap("result")
        public Object result;

        @NameInMap("service_name")
        public String serviceName;

        @NameInMap("status")
        public String status;

        @NameInMap("task_id")
        public String taskId;

        @NameInMap("url")
        public String url;

        public static GetDiagnosisResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDiagnosisResultResponseBodyData self = new GetDiagnosisResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDiagnosisResultResponseBodyData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public GetDiagnosisResultResponseBodyData setCommand(Object command) {
            this.command = command;
            return this;
        }
        public Object getCommand() {
            return this.command;
        }

        public GetDiagnosisResultResponseBodyData setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public GetDiagnosisResultResponseBodyData setParams(Object params) {
            this.params = params;
            return this;
        }
        public Object getParams() {
            return this.params;
        }

        public GetDiagnosisResultResponseBodyData setResult(Object result) {
            this.result = result;
            return this;
        }
        public Object getResult() {
            return this.result;
        }

        public GetDiagnosisResultResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetDiagnosisResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDiagnosisResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetDiagnosisResultResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
