// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryRelationTicketsResponseBody extends TeaModel {
    @NameInMap("CnePageSize")
    public Integer cnePageSize;

    @NameInMap("Code")
    public String code;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public java.util.List<QueryRelationTicketsResponseBodyData> data;

    @NameInMap("FirstResult")
    public Integer firstResult;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextPage")
    public Integer nextPage;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalPage")
    public Integer totalPage;

    @NameInMap("TotalResults")
    public Integer totalResults;

    public static QueryRelationTicketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRelationTicketsResponseBody self = new QueryRelationTicketsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRelationTicketsResponseBody setCnePageSize(Integer cnePageSize) {
        this.cnePageSize = cnePageSize;
        return this;
    }
    public Integer getCnePageSize() {
        return this.cnePageSize;
    }

    public QueryRelationTicketsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRelationTicketsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryRelationTicketsResponseBody setData(java.util.List<QueryRelationTicketsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryRelationTicketsResponseBodyData> getData() {
        return this.data;
    }

    public QueryRelationTicketsResponseBody setFirstResult(Integer firstResult) {
        this.firstResult = firstResult;
        return this;
    }
    public Integer getFirstResult() {
        return this.firstResult;
    }

    public QueryRelationTicketsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRelationTicketsResponseBody setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Integer getNextPage() {
        return this.nextPage;
    }

    public QueryRelationTicketsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRelationTicketsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRelationTicketsResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public QueryRelationTicketsResponseBody setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
        return this;
    }
    public Integer getTotalResults() {
        return this.totalResults;
    }

    public static class QueryRelationTicketsResponseBodyDataRelationCase extends TeaModel {
        @NameInMap("AssignTime")
        public Long assignTime;

        @NameInMap("BuId")
        public Long buId;

        @NameInMap("CaseBuId")
        public Long caseBuId;

        @NameInMap("CaseDepartmentId")
        public Long caseDepartmentId;

        @NameInMap("CaseGmtCreate")
        public Long caseGmtCreate;

        @NameInMap("CaseGmtModified")
        public Long caseGmtModified;

        @NameInMap("CaseId")
        public Long caseId;

        @NameInMap("CaseStatus")
        public Integer caseStatus;

        @NameInMap("CaseType")
        public Integer caseType;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ChannelType")
        public Integer channelType;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("DeadLine")
        public Long deadLine;

        @NameInMap("DealId")
        public Long dealId;

        @NameInMap("DealTime")
        public Long dealTime;

        @NameInMap("DepartmentId")
        public Long departmentId;

        @NameInMap("ExtAttrs")
        public java.util.Map<String, ?> extAttrs;

        @NameInMap("FormId")
        public Long formId;

        @NameInMap("FromInfo")
        public String fromInfo;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("MemberId")
        public Long memberId;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("Owner")
        public Long owner;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("QuestionId")
        public String questionId;

        @NameInMap("QuestionInfoQuestionInfo")
        public String questionInfoQuestionInfo;

        @NameInMap("RefCaseId")
        public Long refCaseId;

        @NameInMap("ServiceType")
        public Integer serviceType;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("TaskStatus")
        public Integer taskStatus;

        @NameInMap("TaskType")
        public Integer taskType;

        @NameInMap("TemplateId")
        public Long templateId;

        @NameInMap("Title")
        public String title;

        @NameInMap("UserServiceId")
        public Long userServiceId;

        public static QueryRelationTicketsResponseBodyDataRelationCase build(java.util.Map<String, ?> map) throws Exception {
            QueryRelationTicketsResponseBodyDataRelationCase self = new QueryRelationTicketsResponseBodyDataRelationCase();
            return TeaModel.build(map, self);
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setAssignTime(Long assignTime) {
            this.assignTime = assignTime;
            return this;
        }
        public Long getAssignTime() {
            return this.assignTime;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setCaseBuId(Long caseBuId) {
            this.caseBuId = caseBuId;
            return this;
        }
        public Long getCaseBuId() {
            return this.caseBuId;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setCaseDepartmentId(Long caseDepartmentId) {
            this.caseDepartmentId = caseDepartmentId;
            return this;
        }
        public Long getCaseDepartmentId() {
            return this.caseDepartmentId;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setCaseGmtCreate(Long caseGmtCreate) {
            this.caseGmtCreate = caseGmtCreate;
            return this;
        }
        public Long getCaseGmtCreate() {
            return this.caseGmtCreate;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setCaseGmtModified(Long caseGmtModified) {
            this.caseGmtModified = caseGmtModified;
            return this;
        }
        public Long getCaseGmtModified() {
            return this.caseGmtModified;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setCaseId(Long caseId) {
            this.caseId = caseId;
            return this;
        }
        public Long getCaseId() {
            return this.caseId;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setCaseStatus(Integer caseStatus) {
            this.caseStatus = caseStatus;
            return this;
        }
        public Integer getCaseStatus() {
            return this.caseStatus;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setCaseType(Integer caseType) {
            this.caseType = caseType;
            return this;
        }
        public Integer getCaseType() {
            return this.caseType;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setChannelType(Integer channelType) {
            this.channelType = channelType;
            return this;
        }
        public Integer getChannelType() {
            return this.channelType;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setDeadLine(Long deadLine) {
            this.deadLine = deadLine;
            return this;
        }
        public Long getDeadLine() {
            return this.deadLine;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setDealId(Long dealId) {
            this.dealId = dealId;
            return this;
        }
        public Long getDealId() {
            return this.dealId;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setDealTime(Long dealTime) {
            this.dealTime = dealTime;
            return this;
        }
        public Long getDealTime() {
            return this.dealTime;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setExtAttrs(java.util.Map<String, ?> extAttrs) {
            this.extAttrs = extAttrs;
            return this;
        }
        public java.util.Map<String, ?> getExtAttrs() {
            return this.extAttrs;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setFormId(Long formId) {
            this.formId = formId;
            return this;
        }
        public Long getFormId() {
            return this.formId;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setFromInfo(String fromInfo) {
            this.fromInfo = fromInfo;
            return this;
        }
        public String getFromInfo() {
            return this.fromInfo;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setMemberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }
        public Long getMemberId() {
            return this.memberId;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setOwner(Long owner) {
            this.owner = owner;
            return this;
        }
        public Long getOwner() {
            return this.owner;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setQuestionId(String questionId) {
            this.questionId = questionId;
            return this;
        }
        public String getQuestionId() {
            return this.questionId;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setQuestionInfoQuestionInfo(String questionInfoQuestionInfo) {
            this.questionInfoQuestionInfo = questionInfoQuestionInfo;
            return this;
        }
        public String getQuestionInfoQuestionInfo() {
            return this.questionInfoQuestionInfo;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setRefCaseId(Long refCaseId) {
            this.refCaseId = refCaseId;
            return this;
        }
        public Long getRefCaseId() {
            return this.refCaseId;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setServiceType(Integer serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public Integer getServiceType() {
            return this.serviceType;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryRelationTicketsResponseBodyDataRelationCase setUserServiceId(Long userServiceId) {
            this.userServiceId = userServiceId;
            return this;
        }
        public Long getUserServiceId() {
            return this.userServiceId;
        }

    }

    public static class QueryRelationTicketsResponseBodyData extends TeaModel {
        @NameInMap("AssignTime")
        public Long assignTime;

        @NameInMap("BuId")
        public Long buId;

        @NameInMap("CaseBuId")
        public Long caseBuId;

        @NameInMap("CaseDepartmentId")
        public Long caseDepartmentId;

        @NameInMap("CaseGmtCreate")
        public Long caseGmtCreate;

        @NameInMap("CaseId")
        public Long caseId;

        @NameInMap("CaseStatus")
        public Integer caseStatus;

        @NameInMap("CaseType")
        public Integer caseType;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ChannelType")
        public Integer channelType;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("DeadLine")
        public Long deadLine;

        @NameInMap("DealId")
        public Long dealId;

        @NameInMap("DealTime")
        public Long dealTime;

        @NameInMap("DepartmentId")
        public Long departmentId;

        @NameInMap("ExtAttrs")
        public java.util.Map<String, ?> extAttrs;

        @NameInMap("FormId")
        public Long formId;

        @NameInMap("FromInfo")
        public String fromInfo;

        @NameInMap("GaseGmtModified")
        public Long gaseGmtModified;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("MemberId")
        public Long memberId;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("Owner")
        public Long owner;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("QuestionId")
        public String questionId;

        @NameInMap("QuestionInfo")
        public String questionInfo;

        @NameInMap("RefCaseId")
        public Long refCaseId;

        @NameInMap("RelationCase")
        public java.util.List<QueryRelationTicketsResponseBodyDataRelationCase> relationCase;

        @NameInMap("ServiceType")
        public Integer serviceType;

        @NameInMap("SrType")
        public Long srType;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("TaskStatus")
        public Integer taskStatus;

        @NameInMap("TaskType")
        public Integer taskType;

        @NameInMap("TemplateId")
        public Long templateId;

        @NameInMap("Title")
        public String title;

        @NameInMap("UserServiceId")
        public Long userServiceId;

        public static QueryRelationTicketsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRelationTicketsResponseBodyData self = new QueryRelationTicketsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRelationTicketsResponseBodyData setAssignTime(Long assignTime) {
            this.assignTime = assignTime;
            return this;
        }
        public Long getAssignTime() {
            return this.assignTime;
        }

        public QueryRelationTicketsResponseBodyData setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public QueryRelationTicketsResponseBodyData setCaseBuId(Long caseBuId) {
            this.caseBuId = caseBuId;
            return this;
        }
        public Long getCaseBuId() {
            return this.caseBuId;
        }

        public QueryRelationTicketsResponseBodyData setCaseDepartmentId(Long caseDepartmentId) {
            this.caseDepartmentId = caseDepartmentId;
            return this;
        }
        public Long getCaseDepartmentId() {
            return this.caseDepartmentId;
        }

        public QueryRelationTicketsResponseBodyData setCaseGmtCreate(Long caseGmtCreate) {
            this.caseGmtCreate = caseGmtCreate;
            return this;
        }
        public Long getCaseGmtCreate() {
            return this.caseGmtCreate;
        }

        public QueryRelationTicketsResponseBodyData setCaseId(Long caseId) {
            this.caseId = caseId;
            return this;
        }
        public Long getCaseId() {
            return this.caseId;
        }

        public QueryRelationTicketsResponseBodyData setCaseStatus(Integer caseStatus) {
            this.caseStatus = caseStatus;
            return this;
        }
        public Integer getCaseStatus() {
            return this.caseStatus;
        }

        public QueryRelationTicketsResponseBodyData setCaseType(Integer caseType) {
            this.caseType = caseType;
            return this;
        }
        public Integer getCaseType() {
            return this.caseType;
        }

        public QueryRelationTicketsResponseBodyData setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public QueryRelationTicketsResponseBodyData setChannelType(Integer channelType) {
            this.channelType = channelType;
            return this;
        }
        public Integer getChannelType() {
            return this.channelType;
        }

        public QueryRelationTicketsResponseBodyData setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public QueryRelationTicketsResponseBodyData setDeadLine(Long deadLine) {
            this.deadLine = deadLine;
            return this;
        }
        public Long getDeadLine() {
            return this.deadLine;
        }

        public QueryRelationTicketsResponseBodyData setDealId(Long dealId) {
            this.dealId = dealId;
            return this;
        }
        public Long getDealId() {
            return this.dealId;
        }

        public QueryRelationTicketsResponseBodyData setDealTime(Long dealTime) {
            this.dealTime = dealTime;
            return this;
        }
        public Long getDealTime() {
            return this.dealTime;
        }

        public QueryRelationTicketsResponseBodyData setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public QueryRelationTicketsResponseBodyData setExtAttrs(java.util.Map<String, ?> extAttrs) {
            this.extAttrs = extAttrs;
            return this;
        }
        public java.util.Map<String, ?> getExtAttrs() {
            return this.extAttrs;
        }

        public QueryRelationTicketsResponseBodyData setFormId(Long formId) {
            this.formId = formId;
            return this;
        }
        public Long getFormId() {
            return this.formId;
        }

        public QueryRelationTicketsResponseBodyData setFromInfo(String fromInfo) {
            this.fromInfo = fromInfo;
            return this;
        }
        public String getFromInfo() {
            return this.fromInfo;
        }

        public QueryRelationTicketsResponseBodyData setGaseGmtModified(Long gaseGmtModified) {
            this.gaseGmtModified = gaseGmtModified;
            return this;
        }
        public Long getGaseGmtModified() {
            return this.gaseGmtModified;
        }

        public QueryRelationTicketsResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryRelationTicketsResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryRelationTicketsResponseBodyData setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public QueryRelationTicketsResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryRelationTicketsResponseBodyData setMemberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }
        public Long getMemberId() {
            return this.memberId;
        }

        public QueryRelationTicketsResponseBodyData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public QueryRelationTicketsResponseBodyData setOwner(Long owner) {
            this.owner = owner;
            return this;
        }
        public Long getOwner() {
            return this.owner;
        }

        public QueryRelationTicketsResponseBodyData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public QueryRelationTicketsResponseBodyData setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public QueryRelationTicketsResponseBodyData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryRelationTicketsResponseBodyData setQuestionId(String questionId) {
            this.questionId = questionId;
            return this;
        }
        public String getQuestionId() {
            return this.questionId;
        }

        public QueryRelationTicketsResponseBodyData setQuestionInfo(String questionInfo) {
            this.questionInfo = questionInfo;
            return this;
        }
        public String getQuestionInfo() {
            return this.questionInfo;
        }

        public QueryRelationTicketsResponseBodyData setRefCaseId(Long refCaseId) {
            this.refCaseId = refCaseId;
            return this;
        }
        public Long getRefCaseId() {
            return this.refCaseId;
        }

        public QueryRelationTicketsResponseBodyData setRelationCase(java.util.List<QueryRelationTicketsResponseBodyDataRelationCase> relationCase) {
            this.relationCase = relationCase;
            return this;
        }
        public java.util.List<QueryRelationTicketsResponseBodyDataRelationCase> getRelationCase() {
            return this.relationCase;
        }

        public QueryRelationTicketsResponseBodyData setServiceType(Integer serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public Integer getServiceType() {
            return this.serviceType;
        }

        public QueryRelationTicketsResponseBodyData setSrType(Long srType) {
            this.srType = srType;
            return this;
        }
        public Long getSrType() {
            return this.srType;
        }

        public QueryRelationTicketsResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public QueryRelationTicketsResponseBodyData setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public QueryRelationTicketsResponseBodyData setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

        public QueryRelationTicketsResponseBodyData setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public QueryRelationTicketsResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryRelationTicketsResponseBodyData setUserServiceId(Long userServiceId) {
            this.userServiceId = userServiceId;
            return this;
        }
        public Long getUserServiceId() {
            return this.userServiceId;
        }

    }

}
