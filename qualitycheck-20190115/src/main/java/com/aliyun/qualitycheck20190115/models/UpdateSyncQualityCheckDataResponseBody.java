// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateSyncQualityCheckDataResponseBody extends TeaModel {
    /**
     * <p>The Result code. A value of 200 indicates Succeeded. Any other value indicates failed. The API caller can determine the cause of failure based on this field.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The complete response Content.</p>
     */
    @NameInMap("Data")
    public UpdateSyncQualityCheckDataResponseBodyData data;

    /**
     * <p>Details of the error when an error occurs; &quot;successful&quot; when the operation succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID, which is the UUID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>76DB5D8C-5BD9-42A7-B527-5AF3A5F8***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the Request succeeded. The API caller can use this field to determine whether the Request succeeded: true indicates success; false or null indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateSyncQualityCheckDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSyncQualityCheckDataResponseBody self = new UpdateSyncQualityCheckDataResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSyncQualityCheckDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateSyncQualityCheckDataResponseBody setData(UpdateSyncQualityCheckDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateSyncQualityCheckDataResponseBodyData getData() {
        return this.data;
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

    public UpdateSyncQualityCheckDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateSyncQualityCheckDataResponseBodyData extends TeaModel {
        /**
         * <p>The Job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123123D8C-5BD9-42A7-B527-1235F8**</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The UUID of the call.</p>
         * 
         * <strong>example:</strong>
         * <p>20210101-1212121***</p>
         */
        @NameInMap("Tid")
        public String tid;

        public static UpdateSyncQualityCheckDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateSyncQualityCheckDataResponseBodyData self = new UpdateSyncQualityCheckDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateSyncQualityCheckDataResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public UpdateSyncQualityCheckDataResponseBodyData setTid(String tid) {
            this.tid = tid;
            return this;
        }
        public String getTid() {
            return this.tid;
        }

    }

}
