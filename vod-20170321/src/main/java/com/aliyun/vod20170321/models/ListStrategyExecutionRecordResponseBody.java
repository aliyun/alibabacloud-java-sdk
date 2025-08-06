// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListStrategyExecutionRecordResponseBody extends TeaModel {
    @NameInMap("ExecutionRecordList")
    public java.util.List<ListStrategyExecutionRecordResponseBodyExecutionRecordList> executionRecordList;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static ListStrategyExecutionRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStrategyExecutionRecordResponseBody self = new ListStrategyExecutionRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStrategyExecutionRecordResponseBody setExecutionRecordList(java.util.List<ListStrategyExecutionRecordResponseBodyExecutionRecordList> executionRecordList) {
        this.executionRecordList = executionRecordList;
        return this;
    }
    public java.util.List<ListStrategyExecutionRecordResponseBodyExecutionRecordList> getExecutionRecordList() {
        return this.executionRecordList;
    }

    public ListStrategyExecutionRecordResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListStrategyExecutionRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStrategyExecutionRecordResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListStrategyExecutionRecordResponseBodyExecutionRecordList extends TeaModel {
        @NameInMap("CompleteTime")
        public String completeTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ExecuteTime")
        public String executeTime;

        @NameInMap("JobParams")
        public String jobParams;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("MediaName")
        public String mediaName;

        @NameInMap("Status")
        public String status;

        @NameInMap("StrategyId")
        public String strategyId;

        @NameInMap("StrategyName")
        public String strategyName;

        @NameInMap("StrategyType")
        public String strategyType;

        public static ListStrategyExecutionRecordResponseBodyExecutionRecordList build(java.util.Map<String, ?> map) throws Exception {
            ListStrategyExecutionRecordResponseBodyExecutionRecordList self = new ListStrategyExecutionRecordResponseBodyExecutionRecordList();
            return TeaModel.build(map, self);
        }

        public ListStrategyExecutionRecordResponseBodyExecutionRecordList setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public ListStrategyExecutionRecordResponseBodyExecutionRecordList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListStrategyExecutionRecordResponseBodyExecutionRecordList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListStrategyExecutionRecordResponseBodyExecutionRecordList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListStrategyExecutionRecordResponseBodyExecutionRecordList setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public ListStrategyExecutionRecordResponseBodyExecutionRecordList setJobParams(String jobParams) {
            this.jobParams = jobParams;
            return this;
        }
        public String getJobParams() {
            return this.jobParams;
        }

        public ListStrategyExecutionRecordResponseBodyExecutionRecordList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListStrategyExecutionRecordResponseBodyExecutionRecordList setMediaName(String mediaName) {
            this.mediaName = mediaName;
            return this;
        }
        public String getMediaName() {
            return this.mediaName;
        }

        public ListStrategyExecutionRecordResponseBodyExecutionRecordList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStrategyExecutionRecordResponseBodyExecutionRecordList setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public ListStrategyExecutionRecordResponseBodyExecutionRecordList setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public ListStrategyExecutionRecordResponseBodyExecutionRecordList setStrategyType(String strategyType) {
            this.strategyType = strategyType;
            return this;
        }
        public String getStrategyType() {
            return this.strategyType;
        }

    }

}
