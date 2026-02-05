// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeGroupExecutingInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExecutingInfo")
    public DescribeGroupExecutingInfoResponseBodyExecutingInfo executingInfo;

    /**
     * <strong>example:</strong>
     * <p>b24d321a-2a74-4dd1-a0ba-4ab09cef6652</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>c46001bc-3ead-4bfd-9a69-4b5b66a4a3f4</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CancelledNum")
        public Integer cancelledNum;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ExecutingNum")
        public Integer executingNum;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("FailedNum")
        public Integer failedNum;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("PausedNum")
        public Integer pausedNum;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SchedulingNum")
        public Integer schedulingNum;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalCompletedNum")
        public Integer totalCompletedNum;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalJobs")
        public Integer totalJobs;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
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
        @NameInMap("AvgTalkTime")
        public Integer avgTalkTime;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CallFailedNum")
        public Integer callFailedNum;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CallNum")
        public Integer callNum;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("DurationDistribution")
        public String durationDistribution;

        /**
         * <strong>example:</strong>
         * <p>1640087774563</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("FinishedNum")
        public Integer finishedNum;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HangUpByClientNum")
        public Integer hangUpByClientNum;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("JobsProgress")
        public DescribeGroupExecutingInfoResponseBodyExecutingInfoJobsProgress jobsProgress;

        @NameInMap("NoInteractionNum")
        public Integer noInteractionNum;

        /**
         * <strong>example:</strong>
         * <p>1640087774563</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("TalkTurnsDistribution")
        public String talkTurnsDistribution;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TransferByIntentNum")
        public Integer transferByIntentNum;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TransferByNoAnswer")
        public Integer transferByNoAnswer;

        public static DescribeGroupExecutingInfoResponseBodyExecutingInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupExecutingInfoResponseBodyExecutingInfo self = new DescribeGroupExecutingInfoResponseBodyExecutingInfo();
            return TeaModel.build(map, self);
        }

        public DescribeGroupExecutingInfoResponseBodyExecutingInfo setAvgTalkTime(Integer avgTalkTime) {
            this.avgTalkTime = avgTalkTime;
            return this;
        }
        public Integer getAvgTalkTime() {
            return this.avgTalkTime;
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

        public DescribeGroupExecutingInfoResponseBodyExecutingInfo setDurationDistribution(String durationDistribution) {
            this.durationDistribution = durationDistribution;
            return this;
        }
        public String getDurationDistribution() {
            return this.durationDistribution;
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

        public DescribeGroupExecutingInfoResponseBodyExecutingInfo setNoInteractionNum(Integer noInteractionNum) {
            this.noInteractionNum = noInteractionNum;
            return this;
        }
        public Integer getNoInteractionNum() {
            return this.noInteractionNum;
        }

        public DescribeGroupExecutingInfoResponseBodyExecutingInfo setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeGroupExecutingInfoResponseBodyExecutingInfo setTalkTurnsDistribution(String talkTurnsDistribution) {
            this.talkTurnsDistribution = talkTurnsDistribution;
            return this;
        }
        public String getTalkTurnsDistribution() {
            return this.talkTurnsDistribution;
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
