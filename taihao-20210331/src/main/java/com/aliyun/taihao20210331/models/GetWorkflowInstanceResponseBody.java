// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetWorkflowInstanceResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Data data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetWorkflowInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowInstanceResponseBody self = new GetWorkflowInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkflowInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWorkflowInstanceResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public GetWorkflowInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkflowInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkflowInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Data extends TeaModel {
        @NameInMap("namespace")
        public String namespace;

        @NameInMap("parentActivityId")
        public Long parentActivityId;

        @NameInMap("parentWorkflowInstanceId")
        public Long parentWorkflowInstanceId;

        @NameInMap("token")
        public String token;

        @NameInMap("workflowDefinitionId")
        public Long workflowDefinitionId;

        @NameInMap("workflowInstanceDisplayName")
        public String workflowInstanceDisplayName;

        @NameInMap("workflowInstanceId")
        public Long workflowInstanceId;

        @NameInMap("workflowInstanceName")
        public String workflowInstanceName;

        @NameInMap("workflowInstanceStatus")
        public String workflowInstanceStatus;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public Data setParentActivityId(Long parentActivityId) {
            this.parentActivityId = parentActivityId;
            return this;
        }
        public Long getParentActivityId() {
            return this.parentActivityId;
        }

        public Data setParentWorkflowInstanceId(Long parentWorkflowInstanceId) {
            this.parentWorkflowInstanceId = parentWorkflowInstanceId;
            return this;
        }
        public Long getParentWorkflowInstanceId() {
            return this.parentWorkflowInstanceId;
        }

        public Data setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public Data setWorkflowDefinitionId(Long workflowDefinitionId) {
            this.workflowDefinitionId = workflowDefinitionId;
            return this;
        }
        public Long getWorkflowDefinitionId() {
            return this.workflowDefinitionId;
        }

        public Data setWorkflowInstanceDisplayName(String workflowInstanceDisplayName) {
            this.workflowInstanceDisplayName = workflowInstanceDisplayName;
            return this;
        }
        public String getWorkflowInstanceDisplayName() {
            return this.workflowInstanceDisplayName;
        }

        public Data setWorkflowInstanceId(Long workflowInstanceId) {
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }
        public Long getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

        public Data setWorkflowInstanceName(String workflowInstanceName) {
            this.workflowInstanceName = workflowInstanceName;
            return this;
        }
        public String getWorkflowInstanceName() {
            return this.workflowInstanceName;
        }

        public Data setWorkflowInstanceStatus(String workflowInstanceStatus) {
            this.workflowInstanceStatus = workflowInstanceStatus;
            return this;
        }
        public String getWorkflowInstanceStatus() {
            return this.workflowInstanceStatus;
        }

    }

}
