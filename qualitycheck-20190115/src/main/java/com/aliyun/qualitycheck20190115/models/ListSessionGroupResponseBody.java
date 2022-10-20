// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListSessionGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public ListSessionGroupResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("LastDataId")
    public String lastDataId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public ListSessionGroupResponseBodyMessages messages;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCountId")
    public String resultCountId;

    @NameInMap("Success")
    public Boolean success;

    public static ListSessionGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSessionGroupResponseBody self = new ListSessionGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSessionGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSessionGroupResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListSessionGroupResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListSessionGroupResponseBody setData(ListSessionGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSessionGroupResponseBodyData getData() {
        return this.data;
    }

    public ListSessionGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSessionGroupResponseBody setLastDataId(String lastDataId) {
        this.lastDataId = lastDataId;
        return this;
    }
    public String getLastDataId() {
        return this.lastDataId;
    }

    public ListSessionGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSessionGroupResponseBody setMessages(ListSessionGroupResponseBodyMessages messages) {
        this.messages = messages;
        return this;
    }
    public ListSessionGroupResponseBodyMessages getMessages() {
        return this.messages;
    }

    public ListSessionGroupResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSessionGroupResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSessionGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSessionGroupResponseBody setResultCountId(String resultCountId) {
        this.resultCountId = resultCountId;
        return this;
    }
    public String getResultCountId() {
        return this.resultCountId;
    }

    public ListSessionGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSessionGroupResponseBodyDataDataCallerList extends TeaModel {
        @NameInMap("CallerList")
        public java.util.List<String> callerList;

        public static ListSessionGroupResponseBodyDataDataCallerList build(java.util.Map<String, ?> map) throws Exception {
            ListSessionGroupResponseBodyDataDataCallerList self = new ListSessionGroupResponseBodyDataDataCallerList();
            return TeaModel.build(map, self);
        }

        public ListSessionGroupResponseBodyDataDataCallerList setCallerList(java.util.List<String> callerList) {
            this.callerList = callerList;
            return this;
        }
        public java.util.List<String> getCallerList() {
            return this.callerList;
        }

    }

    public static class ListSessionGroupResponseBodyDataDataCustomerIdList extends TeaModel {
        @NameInMap("CustomerIdList")
        public java.util.List<String> customerIdList;

        public static ListSessionGroupResponseBodyDataDataCustomerIdList build(java.util.Map<String, ?> map) throws Exception {
            ListSessionGroupResponseBodyDataDataCustomerIdList self = new ListSessionGroupResponseBodyDataDataCustomerIdList();
            return TeaModel.build(map, self);
        }

        public ListSessionGroupResponseBodyDataDataCustomerIdList setCustomerIdList(java.util.List<String> customerIdList) {
            this.customerIdList = customerIdList;
            return this;
        }
        public java.util.List<String> getCustomerIdList() {
            return this.customerIdList;
        }

    }

    public static class ListSessionGroupResponseBodyDataDataCustomerNameList extends TeaModel {
        @NameInMap("CustomerNameList")
        public java.util.List<String> customerNameList;

        public static ListSessionGroupResponseBodyDataDataCustomerNameList build(java.util.Map<String, ?> map) throws Exception {
            ListSessionGroupResponseBodyDataDataCustomerNameList self = new ListSessionGroupResponseBodyDataDataCustomerNameList();
            return TeaModel.build(map, self);
        }

        public ListSessionGroupResponseBodyDataDataCustomerNameList setCustomerNameList(java.util.List<String> customerNameList) {
            this.customerNameList = customerNameList;
            return this;
        }
        public java.util.List<String> getCustomerNameList() {
            return this.customerNameList;
        }

    }

    public static class ListSessionGroupResponseBodyDataDataCustomerServiceIdList extends TeaModel {
        @NameInMap("CustomerServiceIdList")
        public java.util.List<String> customerServiceIdList;

        public static ListSessionGroupResponseBodyDataDataCustomerServiceIdList build(java.util.Map<String, ?> map) throws Exception {
            ListSessionGroupResponseBodyDataDataCustomerServiceIdList self = new ListSessionGroupResponseBodyDataDataCustomerServiceIdList();
            return TeaModel.build(map, self);
        }

        public ListSessionGroupResponseBodyDataDataCustomerServiceIdList setCustomerServiceIdList(java.util.List<String> customerServiceIdList) {
            this.customerServiceIdList = customerServiceIdList;
            return this;
        }
        public java.util.List<String> getCustomerServiceIdList() {
            return this.customerServiceIdList;
        }

    }

    public static class ListSessionGroupResponseBodyDataDataCustomerServiceNameList extends TeaModel {
        @NameInMap("CustomerServiceNameList")
        public java.util.List<String> customerServiceNameList;

        public static ListSessionGroupResponseBodyDataDataCustomerServiceNameList build(java.util.Map<String, ?> map) throws Exception {
            ListSessionGroupResponseBodyDataDataCustomerServiceNameList self = new ListSessionGroupResponseBodyDataDataCustomerServiceNameList();
            return TeaModel.build(map, self);
        }

        public ListSessionGroupResponseBodyDataDataCustomerServiceNameList setCustomerServiceNameList(java.util.List<String> customerServiceNameList) {
            this.customerServiceNameList = customerServiceNameList;
            return this;
        }
        public java.util.List<String> getCustomerServiceNameList() {
            return this.customerServiceNameList;
        }

    }

    public static class ListSessionGroupResponseBodyDataDataReviewerList extends TeaModel {
        @NameInMap("ReviewerList")
        public java.util.List<String> reviewerList;

        public static ListSessionGroupResponseBodyDataDataReviewerList build(java.util.Map<String, ?> map) throws Exception {
            ListSessionGroupResponseBodyDataDataReviewerList self = new ListSessionGroupResponseBodyDataDataReviewerList();
            return TeaModel.build(map, self);
        }

        public ListSessionGroupResponseBodyDataDataReviewerList setReviewerList(java.util.List<String> reviewerList) {
            this.reviewerList = reviewerList;
            return this;
        }
        public java.util.List<String> getReviewerList() {
            return this.reviewerList;
        }

    }

    public static class ListSessionGroupResponseBodyDataDataSkillGroupNameList extends TeaModel {
        @NameInMap("SkillGroupNameList")
        public java.util.List<String> skillGroupNameList;

        public static ListSessionGroupResponseBodyDataDataSkillGroupNameList build(java.util.Map<String, ?> map) throws Exception {
            ListSessionGroupResponseBodyDataDataSkillGroupNameList self = new ListSessionGroupResponseBodyDataDataSkillGroupNameList();
            return TeaModel.build(map, self);
        }

        public ListSessionGroupResponseBodyDataDataSkillGroupNameList setSkillGroupNameList(java.util.List<String> skillGroupNameList) {
            this.skillGroupNameList = skillGroupNameList;
            return this;
        }
        public java.util.List<String> getSkillGroupNameList() {
            return this.skillGroupNameList;
        }

    }

    public static class ListSessionGroupResponseBodyDataData extends TeaModel {
        @NameInMap("AssignStatus")
        public Integer assignStatus;

        @NameInMap("CallStartTime")
        public String callStartTime;

        @NameInMap("CallerList")
        public ListSessionGroupResponseBodyDataDataCallerList callerList;

        @NameInMap("CustomerIdList")
        public ListSessionGroupResponseBodyDataDataCustomerIdList customerIdList;

        @NameInMap("CustomerNameList")
        public ListSessionGroupResponseBodyDataDataCustomerNameList customerNameList;

        @NameInMap("CustomerServiceIdList")
        public ListSessionGroupResponseBodyDataDataCustomerServiceIdList customerServiceIdList;

        @NameInMap("CustomerServiceNameList")
        public ListSessionGroupResponseBodyDataDataCustomerServiceNameList customerServiceNameList;

        @NameInMap("HitSessionCount")
        public Integer hitSessionCount;

        @NameInMap("LastDataId")
        public String lastDataId;

        @NameInMap("ReviewStatus")
        public Integer reviewStatus;

        @NameInMap("ReviewerList")
        public ListSessionGroupResponseBodyDataDataReviewerList reviewerList;

        @NameInMap("SchemeTaskConfigId")
        public Long schemeTaskConfigId;

        @NameInMap("SchemeTaskConfigName")
        public String schemeTaskConfigName;

        @NameInMap("Score")
        public Long score;

        @NameInMap("SessionCount")
        public Integer sessionCount;

        @NameInMap("SessionGroupId")
        public String sessionGroupId;

        @NameInMap("SessionGroupReviewedOrComplained")
        public Boolean sessionGroupReviewedOrComplained;

        @NameInMap("SkillGroupNameList")
        public ListSessionGroupResponseBodyDataDataSkillGroupNameList skillGroupNameList;

        public static ListSessionGroupResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            ListSessionGroupResponseBodyDataData self = new ListSessionGroupResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public ListSessionGroupResponseBodyDataData setAssignStatus(Integer assignStatus) {
            this.assignStatus = assignStatus;
            return this;
        }
        public Integer getAssignStatus() {
            return this.assignStatus;
        }

        public ListSessionGroupResponseBodyDataData setCallStartTime(String callStartTime) {
            this.callStartTime = callStartTime;
            return this;
        }
        public String getCallStartTime() {
            return this.callStartTime;
        }

        public ListSessionGroupResponseBodyDataData setCallerList(ListSessionGroupResponseBodyDataDataCallerList callerList) {
            this.callerList = callerList;
            return this;
        }
        public ListSessionGroupResponseBodyDataDataCallerList getCallerList() {
            return this.callerList;
        }

        public ListSessionGroupResponseBodyDataData setCustomerIdList(ListSessionGroupResponseBodyDataDataCustomerIdList customerIdList) {
            this.customerIdList = customerIdList;
            return this;
        }
        public ListSessionGroupResponseBodyDataDataCustomerIdList getCustomerIdList() {
            return this.customerIdList;
        }

        public ListSessionGroupResponseBodyDataData setCustomerNameList(ListSessionGroupResponseBodyDataDataCustomerNameList customerNameList) {
            this.customerNameList = customerNameList;
            return this;
        }
        public ListSessionGroupResponseBodyDataDataCustomerNameList getCustomerNameList() {
            return this.customerNameList;
        }

        public ListSessionGroupResponseBodyDataData setCustomerServiceIdList(ListSessionGroupResponseBodyDataDataCustomerServiceIdList customerServiceIdList) {
            this.customerServiceIdList = customerServiceIdList;
            return this;
        }
        public ListSessionGroupResponseBodyDataDataCustomerServiceIdList getCustomerServiceIdList() {
            return this.customerServiceIdList;
        }

        public ListSessionGroupResponseBodyDataData setCustomerServiceNameList(ListSessionGroupResponseBodyDataDataCustomerServiceNameList customerServiceNameList) {
            this.customerServiceNameList = customerServiceNameList;
            return this;
        }
        public ListSessionGroupResponseBodyDataDataCustomerServiceNameList getCustomerServiceNameList() {
            return this.customerServiceNameList;
        }

        public ListSessionGroupResponseBodyDataData setHitSessionCount(Integer hitSessionCount) {
            this.hitSessionCount = hitSessionCount;
            return this;
        }
        public Integer getHitSessionCount() {
            return this.hitSessionCount;
        }

        public ListSessionGroupResponseBodyDataData setLastDataId(String lastDataId) {
            this.lastDataId = lastDataId;
            return this;
        }
        public String getLastDataId() {
            return this.lastDataId;
        }

        public ListSessionGroupResponseBodyDataData setReviewStatus(Integer reviewStatus) {
            this.reviewStatus = reviewStatus;
            return this;
        }
        public Integer getReviewStatus() {
            return this.reviewStatus;
        }

        public ListSessionGroupResponseBodyDataData setReviewerList(ListSessionGroupResponseBodyDataDataReviewerList reviewerList) {
            this.reviewerList = reviewerList;
            return this;
        }
        public ListSessionGroupResponseBodyDataDataReviewerList getReviewerList() {
            return this.reviewerList;
        }

        public ListSessionGroupResponseBodyDataData setSchemeTaskConfigId(Long schemeTaskConfigId) {
            this.schemeTaskConfigId = schemeTaskConfigId;
            return this;
        }
        public Long getSchemeTaskConfigId() {
            return this.schemeTaskConfigId;
        }

        public ListSessionGroupResponseBodyDataData setSchemeTaskConfigName(String schemeTaskConfigName) {
            this.schemeTaskConfigName = schemeTaskConfigName;
            return this;
        }
        public String getSchemeTaskConfigName() {
            return this.schemeTaskConfigName;
        }

        public ListSessionGroupResponseBodyDataData setScore(Long score) {
            this.score = score;
            return this;
        }
        public Long getScore() {
            return this.score;
        }

        public ListSessionGroupResponseBodyDataData setSessionCount(Integer sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Integer getSessionCount() {
            return this.sessionCount;
        }

        public ListSessionGroupResponseBodyDataData setSessionGroupId(String sessionGroupId) {
            this.sessionGroupId = sessionGroupId;
            return this;
        }
        public String getSessionGroupId() {
            return this.sessionGroupId;
        }

        public ListSessionGroupResponseBodyDataData setSessionGroupReviewedOrComplained(Boolean sessionGroupReviewedOrComplained) {
            this.sessionGroupReviewedOrComplained = sessionGroupReviewedOrComplained;
            return this;
        }
        public Boolean getSessionGroupReviewedOrComplained() {
            return this.sessionGroupReviewedOrComplained;
        }

        public ListSessionGroupResponseBodyDataData setSkillGroupNameList(ListSessionGroupResponseBodyDataDataSkillGroupNameList skillGroupNameList) {
            this.skillGroupNameList = skillGroupNameList;
            return this;
        }
        public ListSessionGroupResponseBodyDataDataSkillGroupNameList getSkillGroupNameList() {
            return this.skillGroupNameList;
        }

    }

    public static class ListSessionGroupResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListSessionGroupResponseBodyDataData> data;

        public static ListSessionGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSessionGroupResponseBodyData self = new ListSessionGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSessionGroupResponseBodyData setData(java.util.List<ListSessionGroupResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListSessionGroupResponseBodyDataData> getData() {
            return this.data;
        }

    }

    public static class ListSessionGroupResponseBodyMessages extends TeaModel {
        @NameInMap("Message")
        public java.util.List<String> message;

        public static ListSessionGroupResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            ListSessionGroupResponseBodyMessages self = new ListSessionGroupResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public ListSessionGroupResponseBodyMessages setMessage(java.util.List<String> message) {
            this.message = message;
            return this;
        }
        public java.util.List<String> getMessage() {
            return this.message;
        }

    }

}
