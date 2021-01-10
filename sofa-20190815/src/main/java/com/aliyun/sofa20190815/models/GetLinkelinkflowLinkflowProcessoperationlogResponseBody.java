// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowProcessoperationlogResponseBody extends TeaModel {
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
    public java.util.List<GetLinkelinkflowLinkflowProcessoperationlogResponseBodyData> data;

    public static GetLinkelinkflowLinkflowProcessoperationlogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowProcessoperationlogResponseBody self = new GetLinkelinkflowLinkflowProcessoperationlogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowProcessoperationlogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkelinkflowLinkflowProcessoperationlogResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkelinkflowLinkflowProcessoperationlogResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkelinkflowLinkflowProcessoperationlogResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public GetLinkelinkflowLinkflowProcessoperationlogResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetLinkelinkflowLinkflowProcessoperationlogResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetLinkelinkflowLinkflowProcessoperationlogResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetLinkelinkflowLinkflowProcessoperationlogResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkelinkflowLinkflowProcessoperationlogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkelinkflowLinkflowProcessoperationlogResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetLinkelinkflowLinkflowProcessoperationlogResponseBody setData(java.util.List<GetLinkelinkflowLinkflowProcessoperationlogResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetLinkelinkflowLinkflowProcessoperationlogResponseBodyData> getData() {
        return this.data;
    }

    public static class GetLinkelinkflowLinkflowProcessoperationlogResponseBodyData extends TeaModel {
        @NameInMap("ActivityId")
        public String activityId;

        @NameInMap("ActivityName")
        public String activityName;

        @NameInMap("ActivityType")
        public String activityType;

        @NameInMap("Assignee")
        public String assignee;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("ProcessDefinitionId")
        public String processDefinitionId;

        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("TaskId")
        public String taskId;

        public static GetLinkelinkflowLinkflowProcessoperationlogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLinkelinkflowLinkflowProcessoperationlogResponseBodyData self = new GetLinkelinkflowLinkflowProcessoperationlogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLinkelinkflowLinkflowProcessoperationlogResponseBodyData setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public GetLinkelinkflowLinkflowProcessoperationlogResponseBodyData setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public GetLinkelinkflowLinkflowProcessoperationlogResponseBodyData setActivityType(String activityType) {
            this.activityType = activityType;
            return this;
        }
        public String getActivityType() {
            return this.activityType;
        }

        public GetLinkelinkflowLinkflowProcessoperationlogResponseBodyData setAssignee(String assignee) {
            this.assignee = assignee;
            return this;
        }
        public String getAssignee() {
            return this.assignee;
        }

        public GetLinkelinkflowLinkflowProcessoperationlogResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetLinkelinkflowLinkflowProcessoperationlogResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetLinkelinkflowLinkflowProcessoperationlogResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetLinkelinkflowLinkflowProcessoperationlogResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkelinkflowLinkflowProcessoperationlogResponseBodyData setProcessDefinitionId(String processDefinitionId) {
            this.processDefinitionId = processDefinitionId;
            return this;
        }
        public String getProcessDefinitionId() {
            return this.processDefinitionId;
        }

        public GetLinkelinkflowLinkflowProcessoperationlogResponseBodyData setProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        public GetLinkelinkflowLinkflowProcessoperationlogResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetLinkelinkflowLinkflowProcessoperationlogResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
