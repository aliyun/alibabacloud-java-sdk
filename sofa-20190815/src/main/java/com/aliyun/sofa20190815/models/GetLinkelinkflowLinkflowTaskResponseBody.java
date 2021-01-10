// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowTaskResponseBody extends TeaModel {
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
    public GetLinkelinkflowLinkflowTaskResponseBodyData data;

    public static GetLinkelinkflowLinkflowTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowTaskResponseBody self = new GetLinkelinkflowLinkflowTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkelinkflowLinkflowTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkelinkflowLinkflowTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkelinkflowLinkflowTaskResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public GetLinkelinkflowLinkflowTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetLinkelinkflowLinkflowTaskResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetLinkelinkflowLinkflowTaskResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetLinkelinkflowLinkflowTaskResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkelinkflowLinkflowTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkelinkflowLinkflowTaskResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetLinkelinkflowLinkflowTaskResponseBody setData(GetLinkelinkflowLinkflowTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLinkelinkflowLinkflowTaskResponseBodyData getData() {
        return this.data;
    }

    public static class GetLinkelinkflowLinkflowTaskResponseBodyData extends TeaModel {
        @NameInMap("AssignedUser")
        public String assignedUser;

        @NameInMap("Assignee")
        public String assignee;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Finished")
        public Boolean finished;

        @NameInMap("FormKey")
        public String formKey;

        @NameInMap("Id")
        public String id;

        @NameInMap("Key")
        public String key;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProcessDefinitionId")
        public String processDefinitionId;

        @NameInMap("ProcessInstance")
        public String processInstance;

        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Candidates")
        public java.util.List<String> candidates;

        @NameInMap("CandidateGroups")
        public java.util.List<String> candidateGroups;

        @NameInMap("CandidateGroupUsers")
        public java.util.List<String> candidateGroupUsers;

        @NameInMap("CandidateUsers")
        public java.util.List<String> candidateUsers;

        public static GetLinkelinkflowLinkflowTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLinkelinkflowLinkflowTaskResponseBodyData self = new GetLinkelinkflowLinkflowTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLinkelinkflowLinkflowTaskResponseBodyData setAssignedUser(String assignedUser) {
            this.assignedUser = assignedUser;
            return this;
        }
        public String getAssignedUser() {
            return this.assignedUser;
        }

        public GetLinkelinkflowLinkflowTaskResponseBodyData setAssignee(String assignee) {
            this.assignee = assignee;
            return this;
        }
        public String getAssignee() {
            return this.assignee;
        }

        public GetLinkelinkflowLinkflowTaskResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetLinkelinkflowLinkflowTaskResponseBodyData setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public GetLinkelinkflowLinkflowTaskResponseBodyData setFormKey(String formKey) {
            this.formKey = formKey;
            return this;
        }
        public String getFormKey() {
            return this.formKey;
        }

        public GetLinkelinkflowLinkflowTaskResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkelinkflowLinkflowTaskResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLinkelinkflowLinkflowTaskResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkelinkflowLinkflowTaskResponseBodyData setProcessDefinitionId(String processDefinitionId) {
            this.processDefinitionId = processDefinitionId;
            return this;
        }
        public String getProcessDefinitionId() {
            return this.processDefinitionId;
        }

        public GetLinkelinkflowLinkflowTaskResponseBodyData setProcessInstance(String processInstance) {
            this.processInstance = processInstance;
            return this;
        }
        public String getProcessInstance() {
            return this.processInstance;
        }

        public GetLinkelinkflowLinkflowTaskResponseBodyData setProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        public GetLinkelinkflowLinkflowTaskResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetLinkelinkflowLinkflowTaskResponseBodyData setCandidates(java.util.List<String> candidates) {
            this.candidates = candidates;
            return this;
        }
        public java.util.List<String> getCandidates() {
            return this.candidates;
        }

        public GetLinkelinkflowLinkflowTaskResponseBodyData setCandidateGroups(java.util.List<String> candidateGroups) {
            this.candidateGroups = candidateGroups;
            return this;
        }
        public java.util.List<String> getCandidateGroups() {
            return this.candidateGroups;
        }

        public GetLinkelinkflowLinkflowTaskResponseBodyData setCandidateGroupUsers(java.util.List<String> candidateGroupUsers) {
            this.candidateGroupUsers = candidateGroupUsers;
            return this;
        }
        public java.util.List<String> getCandidateGroupUsers() {
            return this.candidateGroupUsers;
        }

        public GetLinkelinkflowLinkflowTaskResponseBodyData setCandidateUsers(java.util.List<String> candidateUsers) {
            this.candidateUsers = candidateUsers;
            return this;
        }
        public java.util.List<String> getCandidateUsers() {
            return this.candidateUsers;
        }

    }

}
