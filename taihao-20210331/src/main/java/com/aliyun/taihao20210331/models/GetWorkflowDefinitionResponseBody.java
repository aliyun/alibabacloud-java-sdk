// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetWorkflowDefinitionResponseBody extends TeaModel {
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

    public static GetWorkflowDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowDefinitionResponseBody self = new GetWorkflowDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkflowDefinitionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWorkflowDefinitionResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public GetWorkflowDefinitionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkflowDefinitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkflowDefinitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Data extends TeaModel {
        @NameInMap("definitionVariables")
        public String definitionVariables;

        @NameInMap("description")
        public String description;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("workflowDAG")
        public String workflowDAG;

        @NameInMap("workflowDefinitionDisplayName")
        public String workflowDefinitionDisplayName;

        @NameInMap("workflowDefinitionId")
        public Long workflowDefinitionId;

        @NameInMap("workflowDefinitionLabel")
        public String workflowDefinitionLabel;

        @NameInMap("workflowDefinitionName")
        public String workflowDefinitionName;

        @NameInMap("workflowDefinitionVersion")
        public String workflowDefinitionVersion;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setDefinitionVariables(String definitionVariables) {
            this.definitionVariables = definitionVariables;
            return this;
        }
        public String getDefinitionVariables() {
            return this.definitionVariables;
        }

        public Data setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public Data setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public Data setWorkflowDAG(String workflowDAG) {
            this.workflowDAG = workflowDAG;
            return this;
        }
        public String getWorkflowDAG() {
            return this.workflowDAG;
        }

        public Data setWorkflowDefinitionDisplayName(String workflowDefinitionDisplayName) {
            this.workflowDefinitionDisplayName = workflowDefinitionDisplayName;
            return this;
        }
        public String getWorkflowDefinitionDisplayName() {
            return this.workflowDefinitionDisplayName;
        }

        public Data setWorkflowDefinitionId(Long workflowDefinitionId) {
            this.workflowDefinitionId = workflowDefinitionId;
            return this;
        }
        public Long getWorkflowDefinitionId() {
            return this.workflowDefinitionId;
        }

        public Data setWorkflowDefinitionLabel(String workflowDefinitionLabel) {
            this.workflowDefinitionLabel = workflowDefinitionLabel;
            return this;
        }
        public String getWorkflowDefinitionLabel() {
            return this.workflowDefinitionLabel;
        }

        public Data setWorkflowDefinitionName(String workflowDefinitionName) {
            this.workflowDefinitionName = workflowDefinitionName;
            return this;
        }
        public String getWorkflowDefinitionName() {
            return this.workflowDefinitionName;
        }

        public Data setWorkflowDefinitionVersion(String workflowDefinitionVersion) {
            this.workflowDefinitionVersion = workflowDefinitionVersion;
            return this;
        }
        public String getWorkflowDefinitionVersion() {
            return this.workflowDefinitionVersion;
        }

    }

}
