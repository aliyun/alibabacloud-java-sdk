// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowStartformmodelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Current")
    public Long current;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    @NameInMap("Data")
    public GetLinkelinkflowLinkflowStartformmodelResponseBodyData data;

    public static GetLinkelinkflowLinkflowStartformmodelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowStartformmodelResponseBody self = new GetLinkelinkflowLinkflowStartformmodelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowStartformmodelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkelinkflowLinkflowStartformmodelResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkelinkflowLinkflowStartformmodelResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkelinkflowLinkflowStartformmodelResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public GetLinkelinkflowLinkflowStartformmodelResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetLinkelinkflowLinkflowStartformmodelResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetLinkelinkflowLinkflowStartformmodelResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetLinkelinkflowLinkflowStartformmodelResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkelinkflowLinkflowStartformmodelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkelinkflowLinkflowStartformmodelResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetLinkelinkflowLinkflowStartformmodelResponseBody setData(GetLinkelinkflowLinkflowStartformmodelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLinkelinkflowLinkflowStartformmodelResponseBodyData getData() {
        return this.data;
    }

    public static class GetLinkelinkflowLinkflowStartformmodelResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("FormInstanceId")
        public String formInstanceId;

        @NameInMap("FormModel")
        public String formModel;

        @NameInMap("Id")
        public String id;

        @NameInMap("Key")
        public String key;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProcessDefinitionId")
        public String processDefinitionId;

        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        @NameInMap("ScopeDefinitionId")
        public String scopeDefinitionId;

        @NameInMap("ScopeId")
        public String scopeId;

        @NameInMap("ScopeType")
        public String scopeType;

        @NameInMap("SelectedOutcome")
        public String selectedOutcome;

        @NameInMap("SubmittedBy")
        public String submittedBy;

        @NameInMap("SubmittedDate")
        public Long submittedDate;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Version")
        public Long version;

        public static GetLinkelinkflowLinkflowStartformmodelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLinkelinkflowLinkflowStartformmodelResponseBodyData self = new GetLinkelinkflowLinkflowStartformmodelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLinkelinkflowLinkflowStartformmodelResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLinkelinkflowLinkflowStartformmodelResponseBodyData setFormInstanceId(String formInstanceId) {
            this.formInstanceId = formInstanceId;
            return this;
        }
        public String getFormInstanceId() {
            return this.formInstanceId;
        }

        public GetLinkelinkflowLinkflowStartformmodelResponseBodyData setFormModel(String formModel) {
            this.formModel = formModel;
            return this;
        }
        public String getFormModel() {
            return this.formModel;
        }

        public GetLinkelinkflowLinkflowStartformmodelResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkelinkflowLinkflowStartformmodelResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLinkelinkflowLinkflowStartformmodelResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkelinkflowLinkflowStartformmodelResponseBodyData setProcessDefinitionId(String processDefinitionId) {
            this.processDefinitionId = processDefinitionId;
            return this;
        }
        public String getProcessDefinitionId() {
            return this.processDefinitionId;
        }

        public GetLinkelinkflowLinkflowStartformmodelResponseBodyData setProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        public GetLinkelinkflowLinkflowStartformmodelResponseBodyData setScopeDefinitionId(String scopeDefinitionId) {
            this.scopeDefinitionId = scopeDefinitionId;
            return this;
        }
        public String getScopeDefinitionId() {
            return this.scopeDefinitionId;
        }

        public GetLinkelinkflowLinkflowStartformmodelResponseBodyData setScopeId(String scopeId) {
            this.scopeId = scopeId;
            return this;
        }
        public String getScopeId() {
            return this.scopeId;
        }

        public GetLinkelinkflowLinkflowStartformmodelResponseBodyData setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
        }

        public GetLinkelinkflowLinkflowStartformmodelResponseBodyData setSelectedOutcome(String selectedOutcome) {
            this.selectedOutcome = selectedOutcome;
            return this;
        }
        public String getSelectedOutcome() {
            return this.selectedOutcome;
        }

        public GetLinkelinkflowLinkflowStartformmodelResponseBodyData setSubmittedBy(String submittedBy) {
            this.submittedBy = submittedBy;
            return this;
        }
        public String getSubmittedBy() {
            return this.submittedBy;
        }

        public GetLinkelinkflowLinkflowStartformmodelResponseBodyData setSubmittedDate(Long submittedDate) {
            this.submittedDate = submittedDate;
            return this;
        }
        public Long getSubmittedDate() {
            return this.submittedDate;
        }

        public GetLinkelinkflowLinkflowStartformmodelResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetLinkelinkflowLinkflowStartformmodelResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetLinkelinkflowLinkflowStartformmodelResponseBodyData setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
