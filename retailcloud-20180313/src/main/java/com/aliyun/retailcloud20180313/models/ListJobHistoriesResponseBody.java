// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListJobHistoriesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListJobHistoriesResponseBodyData> data;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListJobHistoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobHistoriesResponseBody self = new ListJobHistoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobHistoriesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListJobHistoriesResponseBody setData(java.util.List<ListJobHistoriesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListJobHistoriesResponseBodyData> getData() {
        return this.data;
    }

    public ListJobHistoriesResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListJobHistoriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobHistoriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobHistoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobHistoriesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListJobHistoriesResponseBodyData extends TeaModel {
        @NameInMap("ActiveDeadlineSeconds")
        public Integer activeDeadlineSeconds;

        @NameInMap("BackoffLimit")
        public Integer backoffLimit;

        @NameInMap("CompletionTime")
        public String completionTime;

        @NameInMap("Completions")
        public Integer completions;

        @NameInMap("Failed")
        public Integer failed;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("Parallelism")
        public Integer parallelism;

        @NameInMap("PodList")
        public java.util.List<String> podList;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Succeeded")
        public Integer succeeded;

        public static ListJobHistoriesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListJobHistoriesResponseBodyData self = new ListJobHistoriesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListJobHistoriesResponseBodyData setActiveDeadlineSeconds(Integer activeDeadlineSeconds) {
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }
        public Integer getActiveDeadlineSeconds() {
            return this.activeDeadlineSeconds;
        }

        public ListJobHistoriesResponseBodyData setBackoffLimit(Integer backoffLimit) {
            this.backoffLimit = backoffLimit;
            return this;
        }
        public Integer getBackoffLimit() {
            return this.backoffLimit;
        }

        public ListJobHistoriesResponseBodyData setCompletionTime(String completionTime) {
            this.completionTime = completionTime;
            return this;
        }
        public String getCompletionTime() {
            return this.completionTime;
        }

        public ListJobHistoriesResponseBodyData setCompletions(Integer completions) {
            this.completions = completions;
            return this;
        }
        public Integer getCompletions() {
            return this.completions;
        }

        public ListJobHistoriesResponseBodyData setFailed(Integer failed) {
            this.failed = failed;
            return this;
        }
        public Integer getFailed() {
            return this.failed;
        }

        public ListJobHistoriesResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListJobHistoriesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListJobHistoriesResponseBodyData setParallelism(Integer parallelism) {
            this.parallelism = parallelism;
            return this;
        }
        public Integer getParallelism() {
            return this.parallelism;
        }

        public ListJobHistoriesResponseBodyData setPodList(java.util.List<String> podList) {
            this.podList = podList;
            return this;
        }
        public java.util.List<String> getPodList() {
            return this.podList;
        }

        public ListJobHistoriesResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListJobHistoriesResponseBodyData setSucceeded(Integer succeeded) {
            this.succeeded = succeeded;
            return this;
        }
        public Integer getSucceeded() {
            return this.succeeded;
        }

    }

}
