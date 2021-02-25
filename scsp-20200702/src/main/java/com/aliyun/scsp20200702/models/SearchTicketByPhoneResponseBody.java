// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class SearchTicketByPhoneResponseBody extends TeaModel {
    @NameInMap("OnePageSize")
    public Integer onePageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("TotalPage")
    public Integer totalPage;

    @NameInMap("TotalResults")
    public Integer totalResults;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("Data")
    public java.util.List<SearchTicketByPhoneResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static SearchTicketByPhoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchTicketByPhoneResponseBody self = new SearchTicketByPhoneResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchTicketByPhoneResponseBody setOnePageSize(Integer onePageSize) {
        this.onePageSize = onePageSize;
        return this;
    }
    public Integer getOnePageSize() {
        return this.onePageSize;
    }

    public SearchTicketByPhoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchTicketByPhoneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchTicketByPhoneResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public SearchTicketByPhoneResponseBody setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
        return this;
    }
    public Integer getTotalResults() {
        return this.totalResults;
    }

    public SearchTicketByPhoneResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public SearchTicketByPhoneResponseBody setData(java.util.List<SearchTicketByPhoneResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SearchTicketByPhoneResponseBodyData> getData() {
        return this.data;
    }

    public SearchTicketByPhoneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchTicketByPhoneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchTicketByPhoneResponseBodyData extends TeaModel {
        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("CarbonCopy")
        public String carbonCopy;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ServiceId")
        public Long serviceId;

        @NameInMap("TicketId")
        public Long ticketId;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("FormData")
        public String formData;

        @NameInMap("FromInfo")
        public String fromInfo;

        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("CreatorType")
        public Integer creatorType;

        @NameInMap("MemberId")
        public Long memberId;

        @NameInMap("CaseStatus")
        public Integer caseStatus;

        @NameInMap("TemplateId")
        public Long templateId;

        public static SearchTicketByPhoneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchTicketByPhoneResponseBodyData self = new SearchTicketByPhoneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchTicketByPhoneResponseBodyData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public SearchTicketByPhoneResponseBodyData setCarbonCopy(String carbonCopy) {
            this.carbonCopy = carbonCopy;
            return this;
        }
        public String getCarbonCopy() {
            return this.carbonCopy;
        }

        public SearchTicketByPhoneResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SearchTicketByPhoneResponseBodyData setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public SearchTicketByPhoneResponseBodyData setTicketId(Long ticketId) {
            this.ticketId = ticketId;
            return this;
        }
        public Long getTicketId() {
            return this.ticketId;
        }

        public SearchTicketByPhoneResponseBodyData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public SearchTicketByPhoneResponseBodyData setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public SearchTicketByPhoneResponseBodyData setFormData(String formData) {
            this.formData = formData;
            return this;
        }
        public String getFormData() {
            return this.formData;
        }

        public SearchTicketByPhoneResponseBodyData setFromInfo(String fromInfo) {
            this.fromInfo = fromInfo;
            return this;
        }
        public String getFromInfo() {
            return this.fromInfo;
        }

        public SearchTicketByPhoneResponseBodyData setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public SearchTicketByPhoneResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public SearchTicketByPhoneResponseBodyData setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public SearchTicketByPhoneResponseBodyData setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public SearchTicketByPhoneResponseBodyData setCreatorType(Integer creatorType) {
            this.creatorType = creatorType;
            return this;
        }
        public Integer getCreatorType() {
            return this.creatorType;
        }

        public SearchTicketByPhoneResponseBodyData setMemberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }
        public Long getMemberId() {
            return this.memberId;
        }

        public SearchTicketByPhoneResponseBodyData setCaseStatus(Integer caseStatus) {
            this.caseStatus = caseStatus;
            return this;
        }
        public Integer getCaseStatus() {
            return this.caseStatus;
        }

        public SearchTicketByPhoneResponseBodyData setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

}
