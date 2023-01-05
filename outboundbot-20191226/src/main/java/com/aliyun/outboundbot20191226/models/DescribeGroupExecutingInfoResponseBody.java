// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeGroupExecutingInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ExecutingInfo")
    public DescribeGroupExecutingInfoResponseBodyExecutingInfo executingInfo;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeGroupExecutingInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupExecutingInfoResponseBody self = new DescribeGroupExecutingInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupExecutingInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGroupExecutingInfoResponseBody setExecutingInfo(DescribeGroupExecutingInfoResponseBodyExecutingInfo executingInfo) {
        this.executingInfo = executingInfo;
        return this;
    }
    public DescribeGroupExecutingInfoResponseBodyExecutingInfo getExecutingInfo() {
        return this.executingInfo;
    }

    public DescribeGroupExecutingInfoResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeGroupExecutingInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeGroupExecutingInfoResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeGroupExecutingInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGroupExecutingInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGroupExecutingInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeGroupExecutingInfoResponseBodyExecutingInfoJobsProgress extends TeaModel {
        @NameInMap("CancelledNum")
        public Integer cancelledNum;

        @NameInMap("ExecutingNum")
        public Integer executingNum;

        @NameInMap("FailedNum")
        public Integer failedNum;

        @NameInMap("PausedNum")
        public Integer pausedNum;

        @NameInMap("SchedulingNum")
        public Integer schedulingNum;

        @NameInMap("TotalCompletedNum")
        public Integer totalCompletedNum;

        @NameInMap("TotalJobs")
        public Integer totalJobs;

        @NameInMap("TotalNotAnsweredNum")
        public Integer totalNotAnsweredNum;

        public static DescribeGroupExecutingInfoResponseBodyExecutingInfoJobsProgress build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupExecutingInfoResponseBodyExecutingInfoJobsProgress self = new DescribeGroupExecutingInfoResponseBodyExecutingInfoJobsProgress();
            return TeaModel.build(map, self);
        }

        public DescribeGroupExecutingInfoResponseBodyExecutingInfoJobsProgress setCancelledNum(Integer cancelledNum) {
            this.cancelledNum = cancelledNum;
            return this;
        }
        public Integer getCancelledNum() {
            return this.cancelledNum;
        }

        public DescribeGroupExecutingInfoResponseBodyExecutingInfoJobsProgress setExecutingNum(Integer executingNum) {
            this.executingNum = executingNum;
            return this;
        }
        public Integer getExecutingNum() {
            return this.executingNum;
        }

        public DescribeGroupExecutingInfoResponseBodyExecutingInfoJobsProgress setFailedNum(Integer failedNum) {
            this.failedNum = failedNum;
            return this;
        }
        public Integer getFailedNum() {
            return this.failedNum;
        }

        public DescribeGroupExecutingInfoResponseBodyExecutingInfoJobsProgress setPausedNum(Integer pausedNum) {
            this.pausedNum = pausedNum;
            return this;
        }
        public Integer getPausedNum() {
            return this.pausedNum;
        }

        public DescribeGroupExecutingInfoResponseBodyExecutingInfoJobsProgress setSchedulingNum(Integer schedulingNum) {
            this.schedulingNum = schedulingNum;
            return this;
        }
        public Integer getSchedulingNum() {
            return this.schedulingNum;
        }

        public DescribeGroupExecutingInfoResponseBodyExecutingInfoJobsProgress setTotalCompletedNum(Integer totalCompletedNum) {
            this.totalCompletedNum = totalCompletedNum;
            return this;
        }
        public Integer getTotalCompletedNum() {
            return this.totalCompletedNum;
        }

        public DescribeGroupExecutingInfoResponseBodyExecutingInfoJobsProgress setTotalJobs(Integer totalJobs) {
            this.totalJobs = totalJobs;
            return this;
        }
        public Integer getTotalJobs() {
            return this.totalJobs;
        }

        public DescribeGroupExecutingInfoResponseBodyExecutingInfoJobsProgress setTotalNotAnsweredNum(Integer totalNotAnsweredNum) {
            this.totalNotAnsweredNum = totalNotAnsweredNum;
            return this;
        }
        public Integer getTotalNotAnsweredNum() {
            return this.totalNotAnsweredNum;
        }

    }

    public static class DescribeGroupExecutingInfoResponseBodyExecutingInfo extends TeaModel {
        @NameInMap("CallFailedNum")
        public Integer callFailedNum;

        @NameInMap("CallNum")
        public Integer callNum;

        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("FinishedNum")
        public Integer finishedNum;

        @NameInMap("HangUpByClientNum")
        public Integer hangUpByClientNum;

        @NameInMap("JobsProgress")
        public DescribeGroupExecutingInfoResponseBodyExecutingInfoJobsProgress jobsProgress;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("TransferByIntentNum")
        public Integer transferByIntentNum;

        @NameInMap("TransferByNoAnswer")
        public Integer transferByNoAnswer;

        public static DescribeGroupExecutingInfoResponseBodyExecutingInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupExecutingInfoResponseBodyExecutingInfo self = new DescribeGroupExecutingInfoResponseBodyExecutingInfo();
            return TeaModel.build(map, self);
        }

        public DescribeGroupExecutingInfoResponseBodyExecutingInfo setCallFailedNum(Integer callFailedNum) {
            this.callFailedNum = callFailedNum;
            return this;
        }
        public Integer getCallFailedNum() {
            return this.callFailedNum;
        }

        public DescribeGroupExecutingInfoResponseBodyExecutingInfo setCallNum(Integer callNum) {
            this.callNum = callNum;
            return this;
        }
        public Integer getCallNum() {
            return this.callNum;
        }

        public DescribeGroupExecutingInfoResponseBodyExecutingInfo setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public DescribeGroupExecutingInfoResponseBodyExecutingInfo setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeGroupExecutingInfoResponseBodyExecutingInfo setFinishedNum(Integer finishedNum) {
            this.finishedNum = finishedNum;
            return this;
        }
        public Integer getFinishedNum() {
            return this.finishedNum;
        }

        public DescribeGroupExecutingInfoResponseBodyExecutingInfo setHangUpByClientNum(Integer hangUpByClientNum) {
            this.hangUpByClientNum = hangUpByClientNum;
            return this;
        }
        public Integer getHangUpByClientNum() {
            return this.hangUpByClientNum;
        }

        public DescribeGroupExecutingInfoResponseBodyExecutingInfo setJobsProgress(DescribeGroupExecutingInfoResponseBodyExecutingInfoJobsProgress jobsProgress) {
            this.jobsProgress = jobsProgress;
            return this;
        }
        public DescribeGroupExecutingInfoResponseBodyExecutingInfoJobsProgress getJobsProgress() {
            return this.jobsProgress;
        }

        public DescribeGroupExecutingInfoResponseBodyExecutingInfo setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeGroupExecutingInfoResponseBodyExecutingInfo setTransferByIntentNum(Integer transferByIntentNum) {
            this.transferByIntentNum = transferByIntentNum;
            return this;
        }
        public Integer getTransferByIntentNum() {
            return this.transferByIntentNum;
        }

        public DescribeGroupExecutingInfoResponseBodyExecutingInfo setTransferByNoAnswer(Integer transferByNoAnswer) {
            this.transferByNoAnswer = transferByNoAnswer;
            return this;
        }
        public Integer getTransferByNoAnswer() {
            return this.transferByNoAnswer;
        }

    }

}
