// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateSyncQualityCheckDataResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public UpdateSyncQualityCheckDataResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateSyncQualityCheckDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSyncQualityCheckDataResponseBody self = new UpdateSyncQualityCheckDataResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSyncQualityCheckDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateSyncQualityCheckDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSyncQualityCheckDataResponseBody setData(UpdateSyncQualityCheckDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateSyncQualityCheckDataResponseBodyData getData() {
        return this.data;
    }

    public UpdateSyncQualityCheckDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateSyncQualityCheckDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateSyncQualityCheckDataResponseBodyData extends TeaModel {
        @NameInMap("Tid")
        public String tid;

        @NameInMap("TaskId")
        public String taskId;

        public static UpdateSyncQualityCheckDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateSyncQualityCheckDataResponseBodyData self = new UpdateSyncQualityCheckDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateSyncQualityCheckDataResponseBodyData setTid(String tid) {
            this.tid = tid;
            return this;
        }
        public String getTid() {
            return this.tid;
        }

        public UpdateSyncQualityCheckDataResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
