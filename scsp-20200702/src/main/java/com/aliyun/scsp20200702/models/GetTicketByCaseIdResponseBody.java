// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetTicketByCaseIdResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public GetTicketByCaseIdResponseBodyData data;

    public static GetTicketByCaseIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTicketByCaseIdResponseBody self = new GetTicketByCaseIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTicketByCaseIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTicketByCaseIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTicketByCaseIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTicketByCaseIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTicketByCaseIdResponseBody setData(GetTicketByCaseIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTicketByCaseIdResponseBodyData getData() {
        return this.data;
    }

    public static class GetTicketByCaseIdResponseBodyData extends TeaModel {
        @NameInMap("MemberId")
        public Long memberId;

        @NameInMap("QuestionId")
        public String questionId;

        @NameInMap("QuestionInfo")
        public String questionInfo;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("SopCateId")
        public Long sopCateId;

        @NameInMap("CaseType")
        public Integer caseType;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ExtAttrs")
        public java.util.Map<String, ?> extAttrs;

        @NameInMap("BuId")
        public Long buId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("SrType")
        public Long srType;

        @NameInMap("Owner")
        public Long owner;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("CaseStatus")
        public Integer caseStatus;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("DepartmentId")
        public Long departmentId;

        @NameInMap("FromInfo")
        public String fromInfo;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("CaseId")
        public Long caseId;

        public static GetTicketByCaseIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTicketByCaseIdResponseBodyData self = new GetTicketByCaseIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTicketByCaseIdResponseBodyData setMemberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }
        public Long getMemberId() {
            return this.memberId;
        }

        public GetTicketByCaseIdResponseBodyData setQuestionId(String questionId) {
            this.questionId = questionId;
            return this;
        }
        public String getQuestionId() {
            return this.questionId;
        }

        public GetTicketByCaseIdResponseBodyData setQuestionInfo(String questionInfo) {
            this.questionInfo = questionInfo;
            return this;
        }
        public String getQuestionInfo() {
            return this.questionInfo;
        }

        public GetTicketByCaseIdResponseBodyData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public GetTicketByCaseIdResponseBodyData setSopCateId(Long sopCateId) {
            this.sopCateId = sopCateId;
            return this;
        }
        public Long getSopCateId() {
            return this.sopCateId;
        }

        public GetTicketByCaseIdResponseBodyData setCaseType(Integer caseType) {
            this.caseType = caseType;
            return this;
        }
        public Integer getCaseType() {
            return this.caseType;
        }

        public GetTicketByCaseIdResponseBodyData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetTicketByCaseIdResponseBodyData setExtAttrs(java.util.Map<String, ?> extAttrs) {
            this.extAttrs = extAttrs;
            return this;
        }
        public java.util.Map<String, ?> getExtAttrs() {
            return this.extAttrs;
        }

        public GetTicketByCaseIdResponseBodyData setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public GetTicketByCaseIdResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetTicketByCaseIdResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetTicketByCaseIdResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetTicketByCaseIdResponseBodyData setSrType(Long srType) {
            this.srType = srType;
            return this;
        }
        public Long getSrType() {
            return this.srType;
        }

        public GetTicketByCaseIdResponseBodyData setOwner(Long owner) {
            this.owner = owner;
            return this;
        }
        public Long getOwner() {
            return this.owner;
        }

        public GetTicketByCaseIdResponseBodyData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetTicketByCaseIdResponseBodyData setCaseStatus(Integer caseStatus) {
            this.caseStatus = caseStatus;
            return this;
        }
        public Integer getCaseStatus() {
            return this.caseStatus;
        }

        public GetTicketByCaseIdResponseBodyData setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public GetTicketByCaseIdResponseBodyData setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public GetTicketByCaseIdResponseBodyData setFromInfo(String fromInfo) {
            this.fromInfo = fromInfo;
            return this;
        }
        public String getFromInfo() {
            return this.fromInfo;
        }

        public GetTicketByCaseIdResponseBodyData setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public GetTicketByCaseIdResponseBodyData setCaseId(Long caseId) {
            this.caseId = caseId;
            return this;
        }
        public Long getCaseId() {
            return this.caseId;
        }

    }

}
