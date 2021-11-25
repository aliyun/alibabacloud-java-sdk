// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class SearchTicketListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SearchTicketListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("OnePageSize")
    public Integer onePageSize;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalPage")
    public Integer totalPage;

    @NameInMap("TotalResults")
    public Integer totalResults;

    public static SearchTicketListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchTicketListResponseBody self = new SearchTicketListResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchTicketListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchTicketListResponseBody setData(java.util.List<SearchTicketListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SearchTicketListResponseBodyData> getData() {
        return this.data;
    }

    public SearchTicketListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchTicketListResponseBody setOnePageSize(Integer onePageSize) {
        this.onePageSize = onePageSize;
        return this;
    }
    public Integer getOnePageSize() {
        return this.onePageSize;
    }

    public SearchTicketListResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public SearchTicketListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchTicketListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchTicketListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public SearchTicketListResponseBody setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
        return this;
    }
    public Integer getTotalResults() {
        return this.totalResults;
    }

    public static class SearchTicketListResponseBodyData extends TeaModel {
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

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("TemplateId")
        public Long templateId;

        @NameInMap("TicketId")
        public Long ticketId;

        public static SearchTicketListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchTicketListResponseBodyData self = new SearchTicketListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchTicketListResponseBodyData setCarbonCopy(String carbonCopy) {
            this.carbonCopy = carbonCopy;
            return this;
        }
        public String getCarbonCopy() {
            return this.carbonCopy;
        }

        public SearchTicketListResponseBodyData setCaseStatus(Integer caseStatus) {
            this.caseStatus = caseStatus;
            return this;
        }
        public Integer getCaseStatus() {
            return this.caseStatus;
        }

        public SearchTicketListResponseBodyData setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public SearchTicketListResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SearchTicketListResponseBodyData setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public SearchTicketListResponseBodyData setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public SearchTicketListResponseBodyData setCreatorType(Integer creatorType) {
            this.creatorType = creatorType;
            return this;
        }
        public Integer getCreatorType() {
            return this.creatorType;
        }

        public SearchTicketListResponseBodyData setFormData(String formData) {
            this.formData = formData;
            return this;
        }
        public String getFormData() {
            return this.formData;
        }

        public SearchTicketListResponseBodyData setFromInfo(String fromInfo) {
            this.fromInfo = fromInfo;
            return this;
        }
        public String getFromInfo() {
            return this.fromInfo;
        }

        public SearchTicketListResponseBodyData setMemberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }
        public Long getMemberId() {
            return this.memberId;
        }

        public SearchTicketListResponseBodyData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public SearchTicketListResponseBodyData setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public SearchTicketListResponseBodyData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public SearchTicketListResponseBodyData setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public SearchTicketListResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public SearchTicketListResponseBodyData setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public SearchTicketListResponseBodyData setTicketId(Long ticketId) {
            this.ticketId = ticketId;
            return this;
        }
        public Long getTicketId() {
            return this.ticketId;
        }

    }

}
