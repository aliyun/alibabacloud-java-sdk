// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateContextDatabaseSyncJobScheduleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateContextDatabaseSyncJobScheduleResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>id-001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateContextDatabaseSyncJobScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextDatabaseSyncJobScheduleResponseBody self = new UpdateContextDatabaseSyncJobScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateContextDatabaseSyncJobScheduleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateContextDatabaseSyncJobScheduleResponseBody setData(UpdateContextDatabaseSyncJobScheduleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateContextDatabaseSyncJobScheduleResponseBodyData getData() {
        return this.data;
    }

    public UpdateContextDatabaseSyncJobScheduleResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateContextDatabaseSyncJobScheduleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateContextDatabaseSyncJobScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateContextDatabaseSyncJobScheduleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateContextDatabaseSyncJobScheduleResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static UpdateContextDatabaseSyncJobScheduleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateContextDatabaseSyncJobScheduleResponseBodyData self = new UpdateContextDatabaseSyncJobScheduleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateContextDatabaseSyncJobScheduleResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
