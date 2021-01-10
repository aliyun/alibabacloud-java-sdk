// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowTaskformmodelResponseBody extends TeaModel {
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
    public GetLinkelinkflowLinkflowTaskformmodelResponseBodyData data;

    public static GetLinkelinkflowLinkflowTaskformmodelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowTaskformmodelResponseBody self = new GetLinkelinkflowLinkflowTaskformmodelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowTaskformmodelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkelinkflowLinkflowTaskformmodelResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkelinkflowLinkflowTaskformmodelResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkelinkflowLinkflowTaskformmodelResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public GetLinkelinkflowLinkflowTaskformmodelResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetLinkelinkflowLinkflowTaskformmodelResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetLinkelinkflowLinkflowTaskformmodelResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetLinkelinkflowLinkflowTaskformmodelResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkelinkflowLinkflowTaskformmodelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkelinkflowLinkflowTaskformmodelResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetLinkelinkflowLinkflowTaskformmodelResponseBody setData(GetLinkelinkflowLinkflowTaskformmodelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLinkelinkflowLinkflowTaskformmodelResponseBodyData getData() {
        return this.data;
    }

    public static class GetLinkelinkflowLinkflowTaskformmodelResponseBodyData extends TeaModel {
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

        public static GetLinkelinkflowLinkflowTaskformmodelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLinkelinkflowLinkflowTaskformmodelResponseBodyData self = new GetLinkelinkflowLinkflowTaskformmodelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLinkelinkflowLinkflowTaskformmodelResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLinkelinkflowLinkflowTaskformmodelResponseBodyData setFormInstanceId(String formInstanceId) {
            this.formInstanceId = formInstanceId;
            return this;
        }
        public String getFormInstanceId() {
            return this.formInstanceId;
        }

        public GetLinkelinkflowLinkflowTaskformmodelResponseBodyData setFormModel(String formModel) {
            this.formModel = formModel;
            return this;
        }
        public String getFormModel() {
            return this.formModel;
        }

        public GetLinkelinkflowLinkflowTaskformmodelResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkelinkflowLinkflowTaskformmodelResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLinkelinkflowLinkflowTaskformmodelResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkelinkflowLinkflowTaskformmodelResponseBodyData setProcessDefinitionId(String processDefinitionId) {
            this.processDefinitionId = processDefinitionId;
            return this;
        }
        public String getProcessDefinitionId() {
            return this.processDefinitionId;
        }

        public GetLinkelinkflowLinkflowTaskformmodelResponseBodyData setProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        public GetLinkelinkflowLinkflowTaskformmodelResponseBodyData setScopeDefinitionId(String scopeDefinitionId) {
            this.scopeDefinitionId = scopeDefinitionId;
            return this;
        }
        public String getScopeDefinitionId() {
            return this.scopeDefinitionId;
        }

        public GetLinkelinkflowLinkflowTaskformmodelResponseBodyData setScopeId(String scopeId) {
            this.scopeId = scopeId;
            return this;
        }
        public String getScopeId() {
            return this.scopeId;
        }

        public GetLinkelinkflowLinkflowTaskformmodelResponseBodyData setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
        }

        public GetLinkelinkflowLinkflowTaskformmodelResponseBodyData setSelectedOutcome(String selectedOutcome) {
            this.selectedOutcome = selectedOutcome;
            return this;
        }
        public String getSelectedOutcome() {
            return this.selectedOutcome;
        }

        public GetLinkelinkflowLinkflowTaskformmodelResponseBodyData setSubmittedBy(String submittedBy) {
            this.submittedBy = submittedBy;
            return this;
        }
        public String getSubmittedBy() {
            return this.submittedBy;
        }

        public GetLinkelinkflowLinkflowTaskformmodelResponseBodyData setSubmittedDate(Long submittedDate) {
            this.submittedDate = submittedDate;
            return this;
        }
        public Long getSubmittedDate() {
            return this.submittedDate;
        }

        public GetLinkelinkflowLinkflowTaskformmodelResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetLinkelinkflowLinkflowTaskformmodelResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetLinkelinkflowLinkflowTaskformmodelResponseBodyData setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
