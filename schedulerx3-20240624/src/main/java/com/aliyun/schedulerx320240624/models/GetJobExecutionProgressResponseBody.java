// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetJobExecutionProgressResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public GetJobExecutionProgressResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Parameter format error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9B57FDD7-ABBE-5030-B348-86EB9943DB59</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetJobExecutionProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobExecutionProgressResponseBody self = new GetJobExecutionProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobExecutionProgressResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetJobExecutionProgressResponseBody setData(GetJobExecutionProgressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetJobExecutionProgressResponseBodyData getData() {
        return this.data;
    }

    public GetJobExecutionProgressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJobExecutionProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobExecutionProgressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetJobExecutionProgressResponseBodyDataRootProgress extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Finished")
        public Long finished;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetJobExecutionProgressResponseBodyDataRootProgress build(java.util.Map<String, ?> map) throws Exception {
            GetJobExecutionProgressResponseBodyDataRootProgress self = new GetJobExecutionProgressResponseBodyDataRootProgress();
            return TeaModel.build(map, self);
        }

        public GetJobExecutionProgressResponseBodyDataRootProgress setFinished(Long finished) {
            this.finished = finished;
            return this;
        }
        public Long getFinished() {
            return this.finished;
        }

        public GetJobExecutionProgressResponseBodyDataRootProgress setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetJobExecutionProgressResponseBodyDataShardingProgressStatusType extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>TaskStatus.FAILED</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Tips")
        public java.util.Map<String, String> tips;

        public static GetJobExecutionProgressResponseBodyDataShardingProgressStatusType build(java.util.Map<String, ?> map) throws Exception {
            GetJobExecutionProgressResponseBodyDataShardingProgressStatusType self = new GetJobExecutionProgressResponseBodyDataShardingProgressStatusType();
            return TeaModel.build(map, self);
        }

        public GetJobExecutionProgressResponseBodyDataShardingProgressStatusType setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetJobExecutionProgressResponseBodyDataShardingProgressStatusType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetJobExecutionProgressResponseBodyDataShardingProgressStatusType setTips(java.util.Map<String, String> tips) {
            this.tips = tips;
            return this;
        }
        public java.util.Map<String, String> getTips() {
            return this.tips;
        }

    }

    public static class GetJobExecutionProgressResponseBodyDataShardingProgress extends TeaModel {
        /**
         * <p>id</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>1306189481388277762</p>
         */
        @NameInMap("JobExecutionId")
        public String jobExecutionId;

        /**
         * <strong>example:</strong>
         * <p>2,4,6,8,10</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Status")
        public Integer status;

        @NameInMap("StatusType")
        public GetJobExecutionProgressResponseBodyDataShardingProgressStatusType statusType;

        /**
         * <strong>example:</strong>
         * <p><a href="http://192.168.1.9:9999/">http://192.168.1.9:9999/</a></p>
         */
        @NameInMap("WorkerAddr")
        public String workerAddr;

        public static GetJobExecutionProgressResponseBodyDataShardingProgress build(java.util.Map<String, ?> map) throws Exception {
            GetJobExecutionProgressResponseBodyDataShardingProgress self = new GetJobExecutionProgressResponseBodyDataShardingProgress();
            return TeaModel.build(map, self);
        }

        public GetJobExecutionProgressResponseBodyDataShardingProgress setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetJobExecutionProgressResponseBodyDataShardingProgress setJobExecutionId(String jobExecutionId) {
            this.jobExecutionId = jobExecutionId;
            return this;
        }
        public String getJobExecutionId() {
            return this.jobExecutionId;
        }

        public GetJobExecutionProgressResponseBodyDataShardingProgress setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetJobExecutionProgressResponseBodyDataShardingProgress setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetJobExecutionProgressResponseBodyDataShardingProgress setStatusType(GetJobExecutionProgressResponseBodyDataShardingProgressStatusType statusType) {
            this.statusType = statusType;
            return this;
        }
        public GetJobExecutionProgressResponseBodyDataShardingProgressStatusType getStatusType() {
            return this.statusType;
        }

        public GetJobExecutionProgressResponseBodyDataShardingProgress setWorkerAddr(String workerAddr) {
            this.workerAddr = workerAddr;
            return this;
        }
        public String getWorkerAddr() {
            return this.workerAddr;
        }

    }

    public static class GetJobExecutionProgressResponseBodyDataTaskProgress extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Failed")
        public Integer failed;

        /**
         * <strong>example:</strong>
         * <p>calendar_test_2</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Pulled")
        public Integer pulled;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Queue")
        public Integer queue;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Running")
        public Integer running;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Success")
        public Integer success;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static GetJobExecutionProgressResponseBodyDataTaskProgress build(java.util.Map<String, ?> map) throws Exception {
            GetJobExecutionProgressResponseBodyDataTaskProgress self = new GetJobExecutionProgressResponseBodyDataTaskProgress();
            return TeaModel.build(map, self);
        }

        public GetJobExecutionProgressResponseBodyDataTaskProgress setFailed(Integer failed) {
            this.failed = failed;
            return this;
        }
        public Integer getFailed() {
            return this.failed;
        }

        public GetJobExecutionProgressResponseBodyDataTaskProgress setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetJobExecutionProgressResponseBodyDataTaskProgress setPulled(Integer pulled) {
            this.pulled = pulled;
            return this;
        }
        public Integer getPulled() {
            return this.pulled;
        }

        public GetJobExecutionProgressResponseBodyDataTaskProgress setQueue(Integer queue) {
            this.queue = queue;
            return this;
        }
        public Integer getQueue() {
            return this.queue;
        }

        public GetJobExecutionProgressResponseBodyDataTaskProgress setRunning(Integer running) {
            this.running = running;
            return this;
        }
        public Integer getRunning() {
            return this.running;
        }

        public GetJobExecutionProgressResponseBodyDataTaskProgress setSuccess(Integer success) {
            this.success = success;
            return this;
        }
        public Integer getSuccess() {
            return this.success;
        }

        public GetJobExecutionProgressResponseBodyDataTaskProgress setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class GetJobExecutionProgressResponseBodyDataTotalProgress extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Finished")
        public Long finished;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetJobExecutionProgressResponseBodyDataTotalProgress build(java.util.Map<String, ?> map) throws Exception {
            GetJobExecutionProgressResponseBodyDataTotalProgress self = new GetJobExecutionProgressResponseBodyDataTotalProgress();
            return TeaModel.build(map, self);
        }

        public GetJobExecutionProgressResponseBodyDataTotalProgress setFinished(Long finished) {
            this.finished = finished;
            return this;
        }
        public Long getFinished() {
            return this.finished;
        }

        public GetJobExecutionProgressResponseBodyDataTotalProgress setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetJobExecutionProgressResponseBodyDataWorkerProgress extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Failed")
        public Integer failed;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Pulled")
        public Integer pulled;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Queue")
        public Integer queue;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Running")
        public Integer running;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Success")
        public Integer success;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Integer total;

        /**
         * <strong>example:</strong>
         * <p>1a0e97fb17244665327205402dbd6d</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        /**
         * <strong>example:</strong>
         * <p>10.10.116.53:61941</p>
         */
        @NameInMap("WorkerAddr")
        public String workerAddr;

        public static GetJobExecutionProgressResponseBodyDataWorkerProgress build(java.util.Map<String, ?> map) throws Exception {
            GetJobExecutionProgressResponseBodyDataWorkerProgress self = new GetJobExecutionProgressResponseBodyDataWorkerProgress();
            return TeaModel.build(map, self);
        }

        public GetJobExecutionProgressResponseBodyDataWorkerProgress setFailed(Integer failed) {
            this.failed = failed;
            return this;
        }
        public Integer getFailed() {
            return this.failed;
        }

        public GetJobExecutionProgressResponseBodyDataWorkerProgress setPulled(Integer pulled) {
            this.pulled = pulled;
            return this;
        }
        public Integer getPulled() {
            return this.pulled;
        }

        public GetJobExecutionProgressResponseBodyDataWorkerProgress setQueue(Integer queue) {
            this.queue = queue;
            return this;
        }
        public Integer getQueue() {
            return this.queue;
        }

        public GetJobExecutionProgressResponseBodyDataWorkerProgress setRunning(Integer running) {
            this.running = running;
            return this;
        }
        public Integer getRunning() {
            return this.running;
        }

        public GetJobExecutionProgressResponseBodyDataWorkerProgress setSuccess(Integer success) {
            this.success = success;
            return this;
        }
        public Integer getSuccess() {
            return this.success;
        }

        public GetJobExecutionProgressResponseBodyDataWorkerProgress setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public GetJobExecutionProgressResponseBodyDataWorkerProgress setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public GetJobExecutionProgressResponseBodyDataWorkerProgress setWorkerAddr(String workerAddr) {
            this.workerAddr = workerAddr;
            return this;
        }
        public String getWorkerAddr() {
            return this.workerAddr;
        }

    }

    public static class GetJobExecutionProgressResponseBodyData extends TeaModel {
        @NameInMap("JobDescription")
        public String jobDescription;

        @NameInMap("RootProgress")
        public GetJobExecutionProgressResponseBodyDataRootProgress rootProgress;

        @NameInMap("ShardingProgress")
        public java.util.List<GetJobExecutionProgressResponseBodyDataShardingProgress> shardingProgress;

        @NameInMap("TaskProgress")
        public java.util.List<GetJobExecutionProgressResponseBodyDataTaskProgress> taskProgress;

        @NameInMap("TotalProgress")
        public GetJobExecutionProgressResponseBodyDataTotalProgress totalProgress;

        @NameInMap("WorkerProgress")
        public java.util.List<GetJobExecutionProgressResponseBodyDataWorkerProgress> workerProgress;

        public static GetJobExecutionProgressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetJobExecutionProgressResponseBodyData self = new GetJobExecutionProgressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetJobExecutionProgressResponseBodyData setJobDescription(String jobDescription) {
            this.jobDescription = jobDescription;
            return this;
        }
        public String getJobDescription() {
            return this.jobDescription;
        }

        public GetJobExecutionProgressResponseBodyData setRootProgress(GetJobExecutionProgressResponseBodyDataRootProgress rootProgress) {
            this.rootProgress = rootProgress;
            return this;
        }
        public GetJobExecutionProgressResponseBodyDataRootProgress getRootProgress() {
            return this.rootProgress;
        }

        public GetJobExecutionProgressResponseBodyData setShardingProgress(java.util.List<GetJobExecutionProgressResponseBodyDataShardingProgress> shardingProgress) {
            this.shardingProgress = shardingProgress;
            return this;
        }
        public java.util.List<GetJobExecutionProgressResponseBodyDataShardingProgress> getShardingProgress() {
            return this.shardingProgress;
        }

        public GetJobExecutionProgressResponseBodyData setTaskProgress(java.util.List<GetJobExecutionProgressResponseBodyDataTaskProgress> taskProgress) {
            this.taskProgress = taskProgress;
            return this;
        }
        public java.util.List<GetJobExecutionProgressResponseBodyDataTaskProgress> getTaskProgress() {
            return this.taskProgress;
        }

        public GetJobExecutionProgressResponseBodyData setTotalProgress(GetJobExecutionProgressResponseBodyDataTotalProgress totalProgress) {
            this.totalProgress = totalProgress;
            return this;
        }
        public GetJobExecutionProgressResponseBodyDataTotalProgress getTotalProgress() {
            return this.totalProgress;
        }

        public GetJobExecutionProgressResponseBodyData setWorkerProgress(java.util.List<GetJobExecutionProgressResponseBodyDataWorkerProgress> workerProgress) {
            this.workerProgress = workerProgress;
            return this;
        }
        public java.util.List<GetJobExecutionProgressResponseBodyDataWorkerProgress> getWorkerProgress() {
            return this.workerProgress;
        }

    }

}
