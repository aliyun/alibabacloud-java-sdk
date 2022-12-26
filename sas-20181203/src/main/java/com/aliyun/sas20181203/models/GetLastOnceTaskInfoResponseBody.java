// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetLastOnceTaskInfoResponseBody extends TeaModel {
    @NameInMap("CollectTime")
    public Long collectTime;

    @NameInMap("FinishCount")
    public Integer finishCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("TaskInfo")
    public GetLastOnceTaskInfoResponseBodyTaskInfo taskInfo;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetLastOnceTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLastOnceTaskInfoResponseBody self = new GetLastOnceTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLastOnceTaskInfoResponseBody setCollectTime(Long collectTime) {
        this.collectTime = collectTime;
        return this;
    }
    public Long getCollectTime() {
        return this.collectTime;
    }

    public GetLastOnceTaskInfoResponseBody setFinishCount(Integer finishCount) {
        this.finishCount = finishCount;
        return this;
    }
    public Integer getFinishCount() {
        return this.finishCount;
    }

    public GetLastOnceTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLastOnceTaskInfoResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public GetLastOnceTaskInfoResponseBody setTaskInfo(GetLastOnceTaskInfoResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public GetLastOnceTaskInfoResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public GetLastOnceTaskInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetLastOnceTaskInfoResponseBodyTaskInfo extends TeaModel {
        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("Result")
        public String result;

        @NameInMap("Status")
        public String status;

        public static GetLastOnceTaskInfoResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            GetLastOnceTaskInfoResponseBodyTaskInfo self = new GetLastOnceTaskInfoResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public GetLastOnceTaskInfoResponseBodyTaskInfo setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public GetLastOnceTaskInfoResponseBodyTaskInfo setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetLastOnceTaskInfoResponseBodyTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
