// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class BatchQueryMotionShopTaskStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BatchQueryMotionShopTaskStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchQueryMotionShopTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryMotionShopTaskStatusResponseBody self = new BatchQueryMotionShopTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchQueryMotionShopTaskStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchQueryMotionShopTaskStatusResponseBody setData(BatchQueryMotionShopTaskStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchQueryMotionShopTaskStatusResponseBodyData getData() {
        return this.data;
    }

    public BatchQueryMotionShopTaskStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchQueryMotionShopTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchQueryMotionShopTaskStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchQueryMotionShopTaskStatusResponseBodyDataTasksResult extends TeaModel {
        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("ShareUrl")
        public String shareUrl;

        @NameInMap("VideoUrl")
        public String videoUrl;

        public static BatchQueryMotionShopTaskStatusResponseBodyDataTasksResult build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryMotionShopTaskStatusResponseBodyDataTasksResult self = new BatchQueryMotionShopTaskStatusResponseBodyDataTasksResult();
            return TeaModel.build(map, self);
        }

        public BatchQueryMotionShopTaskStatusResponseBodyDataTasksResult setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public BatchQueryMotionShopTaskStatusResponseBodyDataTasksResult setShareUrl(String shareUrl) {
            this.shareUrl = shareUrl;
            return this;
        }
        public String getShareUrl() {
            return this.shareUrl;
        }

        public BatchQueryMotionShopTaskStatusResponseBodyDataTasksResult setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

    public static class BatchQueryMotionShopTaskStatusResponseBodyDataTasks extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Result")
        public BatchQueryMotionShopTaskStatusResponseBodyDataTasksResult result;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        public static BatchQueryMotionShopTaskStatusResponseBodyDataTasks build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryMotionShopTaskStatusResponseBodyDataTasks self = new BatchQueryMotionShopTaskStatusResponseBodyDataTasks();
            return TeaModel.build(map, self);
        }

        public BatchQueryMotionShopTaskStatusResponseBodyDataTasks setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public BatchQueryMotionShopTaskStatusResponseBodyDataTasks setResult(BatchQueryMotionShopTaskStatusResponseBodyDataTasksResult result) {
            this.result = result;
            return this;
        }
        public BatchQueryMotionShopTaskStatusResponseBodyDataTasksResult getResult() {
            return this.result;
        }

        public BatchQueryMotionShopTaskStatusResponseBodyDataTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchQueryMotionShopTaskStatusResponseBodyDataTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class BatchQueryMotionShopTaskStatusResponseBodyData extends TeaModel {
        @NameInMap("Tasks")
        public java.util.List<BatchQueryMotionShopTaskStatusResponseBodyDataTasks> tasks;

        public static BatchQueryMotionShopTaskStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryMotionShopTaskStatusResponseBodyData self = new BatchQueryMotionShopTaskStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchQueryMotionShopTaskStatusResponseBodyData setTasks(java.util.List<BatchQueryMotionShopTaskStatusResponseBodyDataTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<BatchQueryMotionShopTaskStatusResponseBodyDataTasks> getTasks() {
            return this.tasks;
        }

    }

}
