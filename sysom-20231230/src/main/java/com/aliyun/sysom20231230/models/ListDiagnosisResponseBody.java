// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListDiagnosisResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListDiagnosisResponseBodyData> data;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SysomOpenAPIAssumeRoleException: EntityNotExist.Role The role not exists: acs:ram::xxxxx:role/aliyunserviceroleforsysom</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("total")
    public Long total;

    public static ListDiagnosisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnosisResponseBody self = new ListDiagnosisResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDiagnosisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDiagnosisResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDiagnosisResponseBody setData(java.util.List<ListDiagnosisResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDiagnosisResponseBodyData> getData() {
        return this.data;
    }

    public ListDiagnosisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDiagnosisResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListDiagnosisResponseBodyData extends TeaModel {
        @NameInMap("code")
        public Integer code;

        @NameInMap("command")
        public Object command;

        @NameInMap("created_at")
        public String createdAt;

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

        @NameInMap("updated_at")
        public String updatedAt;

        @NameInMap("url")
        public String url;

        public static ListDiagnosisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDiagnosisResponseBodyData self = new ListDiagnosisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDiagnosisResponseBodyData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public ListDiagnosisResponseBodyData setCommand(Object command) {
            this.command = command;
            return this;
        }
        public Object getCommand() {
            return this.command;
        }

        public ListDiagnosisResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListDiagnosisResponseBodyData setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public ListDiagnosisResponseBodyData setParams(Object params) {
            this.params = params;
            return this;
        }
        public Object getParams() {
            return this.params;
        }

        public ListDiagnosisResponseBodyData setResult(Object result) {
            this.result = result;
            return this;
        }
        public Object getResult() {
            return this.result;
        }

        public ListDiagnosisResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListDiagnosisResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDiagnosisResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListDiagnosisResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListDiagnosisResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
