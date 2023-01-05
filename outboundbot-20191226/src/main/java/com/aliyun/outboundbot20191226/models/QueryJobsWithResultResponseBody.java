// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class QueryJobsWithResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Jobs")
    public QueryJobsWithResultResponseBodyJobs jobs;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("VariableNames")
    public java.util.List<String> variableNames;

    public static QueryJobsWithResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryJobsWithResultResponseBody self = new QueryJobsWithResultResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryJobsWithResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryJobsWithResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryJobsWithResultResponseBody setJobs(QueryJobsWithResultResponseBodyJobs jobs) {
        this.jobs = jobs;
        return this;
    }
    public QueryJobsWithResultResponseBodyJobs getJobs() {
        return this.jobs;
    }

    public QueryJobsWithResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryJobsWithResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryJobsWithResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryJobsWithResultResponseBody setVariableNames(java.util.List<String> variableNames) {
        this.variableNames = variableNames;
        return this;
    }
    public java.util.List<String> getVariableNames() {
        return this.variableNames;
    }

    public static class QueryJobsWithResultResponseBodyJobsListLatestTaskContact extends TeaModel {
        @NameInMap("Honorific")
        public String honorific;

        @NameInMap("Id")
        public String id;

        @NameInMap("JobUuid")
        public String jobUuid;

        @NameInMap("Name")
        public String name;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("PreferredPhoneNumber")
        public String preferredPhoneNumber;

        @NameInMap("ReferenceId")
        public String referenceId;

        @NameInMap("Role")
        public String role;

        @NameInMap("Round")
        public Integer round;

        @NameInMap("State")
        public String state;

        public static QueryJobsWithResultResponseBodyJobsListLatestTaskContact build(java.util.Map<String, ?> map) throws Exception {
            QueryJobsWithResultResponseBodyJobsListLatestTaskContact self = new QueryJobsWithResultResponseBodyJobsListLatestTaskContact();
            return TeaModel.build(map, self);
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTaskContact setHonorific(String honorific) {
            this.honorific = honorific;
            return this;
        }
        public String getHonorific() {
            return this.honorific;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTaskContact setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTaskContact setJobUuid(String jobUuid) {
            this.jobUuid = jobUuid;
            return this;
        }
        public String getJobUuid() {
            return this.jobUuid;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTaskContact setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTaskContact setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTaskContact setPreferredPhoneNumber(String preferredPhoneNumber) {
            this.preferredPhoneNumber = preferredPhoneNumber;
            return this;
        }
        public String getPreferredPhoneNumber() {
            return this.preferredPhoneNumber;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTaskContact setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTaskContact setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTaskContact setRound(Integer round) {
            this.round = round;
            return this;
        }
        public Integer getRound() {
            return this.round;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTaskContact setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class QueryJobsWithResultResponseBodyJobsListLatestTaskDialExceptionCodes extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Hint")
        public String hint;

        public static QueryJobsWithResultResponseBodyJobsListLatestTaskDialExceptionCodes build(java.util.Map<String, ?> map) throws Exception {
            QueryJobsWithResultResponseBodyJobsListLatestTaskDialExceptionCodes self = new QueryJobsWithResultResponseBodyJobsListLatestTaskDialExceptionCodes();
            return TeaModel.build(map, self);
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTaskDialExceptionCodes setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTaskDialExceptionCodes setHint(String hint) {
            this.hint = hint;
            return this;
        }
        public String getHint() {
            return this.hint;
        }

    }

    public static class QueryJobsWithResultResponseBodyJobsListLatestTaskExtras extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryJobsWithResultResponseBodyJobsListLatestTaskExtras build(java.util.Map<String, ?> map) throws Exception {
            QueryJobsWithResultResponseBodyJobsListLatestTaskExtras self = new QueryJobsWithResultResponseBodyJobsListLatestTaskExtras();
            return TeaModel.build(map, self);
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTaskExtras setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTaskExtras setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryJobsWithResultResponseBodyJobsListLatestTaskTagHits extends TeaModel {
        @NameInMap("TagGroup")
        public String tagGroup;

        @NameInMap("TagName")
        public String tagName;

        public static QueryJobsWithResultResponseBodyJobsListLatestTaskTagHits build(java.util.Map<String, ?> map) throws Exception {
            QueryJobsWithResultResponseBodyJobsListLatestTaskTagHits self = new QueryJobsWithResultResponseBodyJobsListLatestTaskTagHits();
            return TeaModel.build(map, self);
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTaskTagHits setTagGroup(String tagGroup) {
            this.tagGroup = tagGroup;
            return this;
        }
        public String getTagGroup() {
            return this.tagGroup;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTaskTagHits setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class QueryJobsWithResultResponseBodyJobsListLatestTask extends TeaModel {
        @NameInMap("CallDuration")
        public Integer callDuration;

        @NameInMap("CallDurationDisplay")
        public String callDurationDisplay;

        @NameInMap("CallTime")
        public Long callTime;

        @NameInMap("Contact")
        public QueryJobsWithResultResponseBodyJobsListLatestTaskContact contact;

        @NameInMap("DialExceptionCodes")
        public java.util.List<QueryJobsWithResultResponseBodyJobsListLatestTaskDialExceptionCodes> dialExceptionCodes;

        @NameInMap("Extras")
        public java.util.List<QueryJobsWithResultResponseBodyJobsListLatestTaskExtras> extras;

        @NameInMap("HasAnswered")
        public Boolean hasAnswered;

        @NameInMap("HasHangUpByRejection")
        public Boolean hasHangUpByRejection;

        @NameInMap("HasLastPlaybackCompleted")
        public Boolean hasLastPlaybackCompleted;

        @NameInMap("HasReachedEndOfFlow")
        public Boolean hasReachedEndOfFlow;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusName")
        public String statusName;

        @NameInMap("TagHits")
        public java.util.List<QueryJobsWithResultResponseBodyJobsListLatestTaskTagHits> tagHits;

        @NameInMap("TaskEndReason")
        public String taskEndReason;

        public static QueryJobsWithResultResponseBodyJobsListLatestTask build(java.util.Map<String, ?> map) throws Exception {
            QueryJobsWithResultResponseBodyJobsListLatestTask self = new QueryJobsWithResultResponseBodyJobsListLatestTask();
            return TeaModel.build(map, self);
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTask setCallDuration(Integer callDuration) {
            this.callDuration = callDuration;
            return this;
        }
        public Integer getCallDuration() {
            return this.callDuration;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTask setCallDurationDisplay(String callDurationDisplay) {
            this.callDurationDisplay = callDurationDisplay;
            return this;
        }
        public String getCallDurationDisplay() {
            return this.callDurationDisplay;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTask setCallTime(Long callTime) {
            this.callTime = callTime;
            return this;
        }
        public Long getCallTime() {
            return this.callTime;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTask setContact(QueryJobsWithResultResponseBodyJobsListLatestTaskContact contact) {
            this.contact = contact;
            return this;
        }
        public QueryJobsWithResultResponseBodyJobsListLatestTaskContact getContact() {
            return this.contact;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTask setDialExceptionCodes(java.util.List<QueryJobsWithResultResponseBodyJobsListLatestTaskDialExceptionCodes> dialExceptionCodes) {
            this.dialExceptionCodes = dialExceptionCodes;
            return this;
        }
        public java.util.List<QueryJobsWithResultResponseBodyJobsListLatestTaskDialExceptionCodes> getDialExceptionCodes() {
            return this.dialExceptionCodes;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTask setExtras(java.util.List<QueryJobsWithResultResponseBodyJobsListLatestTaskExtras> extras) {
            this.extras = extras;
            return this;
        }
        public java.util.List<QueryJobsWithResultResponseBodyJobsListLatestTaskExtras> getExtras() {
            return this.extras;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTask setHasAnswered(Boolean hasAnswered) {
            this.hasAnswered = hasAnswered;
            return this;
        }
        public Boolean getHasAnswered() {
            return this.hasAnswered;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTask setHasHangUpByRejection(Boolean hasHangUpByRejection) {
            this.hasHangUpByRejection = hasHangUpByRejection;
            return this;
        }
        public Boolean getHasHangUpByRejection() {
            return this.hasHangUpByRejection;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTask setHasLastPlaybackCompleted(Boolean hasLastPlaybackCompleted) {
            this.hasLastPlaybackCompleted = hasLastPlaybackCompleted;
            return this;
        }
        public Boolean getHasLastPlaybackCompleted() {
            return this.hasLastPlaybackCompleted;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTask setHasReachedEndOfFlow(Boolean hasReachedEndOfFlow) {
            this.hasReachedEndOfFlow = hasReachedEndOfFlow;
            return this;
        }
        public Boolean getHasReachedEndOfFlow() {
            return this.hasReachedEndOfFlow;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTask setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTask setTagHits(java.util.List<QueryJobsWithResultResponseBodyJobsListLatestTaskTagHits> tagHits) {
            this.tagHits = tagHits;
            return this;
        }
        public java.util.List<QueryJobsWithResultResponseBodyJobsListLatestTaskTagHits> getTagHits() {
            return this.tagHits;
        }

        public QueryJobsWithResultResponseBodyJobsListLatestTask setTaskEndReason(String taskEndReason) {
            this.taskEndReason = taskEndReason;
            return this;
        }
        public String getTaskEndReason() {
            return this.taskEndReason;
        }

    }

    public static class QueryJobsWithResultResponseBodyJobsList extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("JobFailureReason")
        public String jobFailureReason;

        @NameInMap("LatestTask")
        public QueryJobsWithResultResponseBodyJobsListLatestTask latestTask;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusName")
        public String statusName;

        public static QueryJobsWithResultResponseBodyJobsList build(java.util.Map<String, ?> map) throws Exception {
            QueryJobsWithResultResponseBodyJobsList self = new QueryJobsWithResultResponseBodyJobsList();
            return TeaModel.build(map, self);
        }

        public QueryJobsWithResultResponseBodyJobsList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryJobsWithResultResponseBodyJobsList setJobFailureReason(String jobFailureReason) {
            this.jobFailureReason = jobFailureReason;
            return this;
        }
        public String getJobFailureReason() {
            return this.jobFailureReason;
        }

        public QueryJobsWithResultResponseBodyJobsList setLatestTask(QueryJobsWithResultResponseBodyJobsListLatestTask latestTask) {
            this.latestTask = latestTask;
            return this;
        }
        public QueryJobsWithResultResponseBodyJobsListLatestTask getLatestTask() {
            return this.latestTask;
        }

        public QueryJobsWithResultResponseBodyJobsList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryJobsWithResultResponseBodyJobsList setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

    }

    public static class QueryJobsWithResultResponseBodyJobs extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryJobsWithResultResponseBodyJobsList> list;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("RowCount")
        public Integer rowCount;

        public static QueryJobsWithResultResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            QueryJobsWithResultResponseBodyJobs self = new QueryJobsWithResultResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public QueryJobsWithResultResponseBodyJobs setList(java.util.List<QueryJobsWithResultResponseBodyJobsList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryJobsWithResultResponseBodyJobsList> getList() {
            return this.list;
        }

        public QueryJobsWithResultResponseBodyJobs setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryJobsWithResultResponseBodyJobs setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public QueryJobsWithResultResponseBodyJobs setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryJobsWithResultResponseBodyJobs setRowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Integer getRowCount() {
            return this.rowCount;
        }

    }

}
