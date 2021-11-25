// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class SearchTicketByIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SearchTicketByIdResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SearchTicketByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchTicketByIdResponseBody self = new SearchTicketByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchTicketByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchTicketByIdResponseBody setData(SearchTicketByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchTicketByIdResponseBodyData getData() {
        return this.data;
    }

    public SearchTicketByIdResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SearchTicketByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchTicketByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchTicketByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchTicketByIdResponseBodyDataActivities extends TeaModel {
        @NameInMap("ActivityCode")
        public String activityCode;

        @NameInMap("ActivityFormData")
        public String activityFormData;

        public static SearchTicketByIdResponseBodyDataActivities build(java.util.Map<String, ?> map) throws Exception {
            SearchTicketByIdResponseBodyDataActivities self = new SearchTicketByIdResponseBodyDataActivities();
            return TeaModel.build(map, self);
        }

        public SearchTicketByIdResponseBodyDataActivities setActivityCode(String activityCode) {
            this.activityCode = activityCode;
            return this;
        }
        public String getActivityCode() {
            return this.activityCode;
        }

        public SearchTicketByIdResponseBodyDataActivities setActivityFormData(String activityFormData) {
            this.activityFormData = activityFormData;
            return this;
        }
        public String getActivityFormData() {
            return this.activityFormData;
        }

    }

    public static class SearchTicketByIdResponseBodyDataActivityRecords extends TeaModel {
        @NameInMap("ActionCode")
        public String actionCode;

        @NameInMap("ActionCodeDesc")
        public String actionCodeDesc;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("OperatorName")
        public String operatorName;

        public static SearchTicketByIdResponseBodyDataActivityRecords build(java.util.Map<String, ?> map) throws Exception {
            SearchTicketByIdResponseBodyDataActivityRecords self = new SearchTicketByIdResponseBodyDataActivityRecords();
            return TeaModel.build(map, self);
        }

        public SearchTicketByIdResponseBodyDataActivityRecords setActionCode(String actionCode) {
            this.actionCode = actionCode;
            return this;
        }
        public String getActionCode() {
            return this.actionCode;
        }

        public SearchTicketByIdResponseBodyDataActivityRecords setActionCodeDesc(String actionCodeDesc) {
            this.actionCodeDesc = actionCodeDesc;
            return this;
        }
        public String getActionCodeDesc() {
            return this.actionCodeDesc;
        }

        public SearchTicketByIdResponseBodyDataActivityRecords setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public SearchTicketByIdResponseBodyDataActivityRecords setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public SearchTicketByIdResponseBodyDataActivityRecords setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

    }

    public static class SearchTicketByIdResponseBodyData extends TeaModel {
        @NameInMap("Activities")
        public java.util.List<SearchTicketByIdResponseBodyDataActivities> activities;

        @NameInMap("ActivityRecords")
        public java.util.List<SearchTicketByIdResponseBodyDataActivityRecords> activityRecords;

        @NameInMap("CarbonCopy")
        public String carbonCopy;

        @NameInMap("CaseStatus")
        public Integer caseStatus;

        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("CreatorType")
        public Integer creatorType;

        @NameInMap("FormData")
        public String formData;

        @NameInMap("FromInfo")
        public String fromInfo;

        @NameInMap("MemberId")
        public Long memberId;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ServiceId")
        public Long serviceId;

        @NameInMap("TemplateId")
        public Long templateId;

        @NameInMap("TicketId")
        public Long ticketId;

        @NameInMap("TicketName")
        public String ticketName;

        public static SearchTicketByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchTicketByIdResponseBodyData self = new SearchTicketByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchTicketByIdResponseBodyData setActivities(java.util.List<SearchTicketByIdResponseBodyDataActivities> activities) {
            this.activities = activities;
            return this;
        }
        public java.util.List<SearchTicketByIdResponseBodyDataActivities> getActivities() {
            return this.activities;
        }

        public SearchTicketByIdResponseBodyData setActivityRecords(java.util.List<SearchTicketByIdResponseBodyDataActivityRecords> activityRecords) {
            this.activityRecords = activityRecords;
            return this;
        }
        public java.util.List<SearchTicketByIdResponseBodyDataActivityRecords> getActivityRecords() {
            return this.activityRecords;
        }

        public SearchTicketByIdResponseBodyData setCarbonCopy(String carbonCopy) {
            this.carbonCopy = carbonCopy;
            return this;
        }
        public String getCarbonCopy() {
            return this.carbonCopy;
        }

        public SearchTicketByIdResponseBodyData setCaseStatus(Integer caseStatus) {
            this.caseStatus = caseStatus;
            return this;
        }
        public Integer getCaseStatus() {
            return this.caseStatus;
        }

        public SearchTicketByIdResponseBodyData setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public SearchTicketByIdResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SearchTicketByIdResponseBodyData setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public SearchTicketByIdResponseBodyData setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public SearchTicketByIdResponseBodyData setCreatorType(Integer creatorType) {
            this.creatorType = creatorType;
            return this;
        }
        public Integer getCreatorType() {
            return this.creatorType;
        }

        public SearchTicketByIdResponseBodyData setFormData(String formData) {
            this.formData = formData;
            return this;
        }
        public String getFormData() {
            return this.formData;
        }

        public SearchTicketByIdResponseBodyData setFromInfo(String fromInfo) {
            this.fromInfo = fromInfo;
            return this;
        }
        public String getFromInfo() {
            return this.fromInfo;
        }

        public SearchTicketByIdResponseBodyData setMemberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }
        public Long getMemberId() {
            return this.memberId;
        }

        public SearchTicketByIdResponseBodyData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public SearchTicketByIdResponseBodyData setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public SearchTicketByIdResponseBodyData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public SearchTicketByIdResponseBodyData setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public SearchTicketByIdResponseBodyData setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public SearchTicketByIdResponseBodyData setTicketId(Long ticketId) {
            this.ticketId = ticketId;
            return this;
        }
        public Long getTicketId() {
            return this.ticketId;
        }

        public SearchTicketByIdResponseBodyData setTicketName(String ticketName) {
            this.ticketName = ticketName;
            return this;
        }
        public String getTicketName() {
            return this.ticketName;
        }

    }

}
