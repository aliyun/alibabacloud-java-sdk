// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class StartContextDatabaseSyncSourceDiscoveryResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Example value</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public StartContextDatabaseSyncSourceDiscoveryResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>Example value</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>id-001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static StartContextDatabaseSyncSourceDiscoveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartContextDatabaseSyncSourceDiscoveryResponseBody self = new StartContextDatabaseSyncSourceDiscoveryResponseBody();
        return TeaModel.build(map, self);
    }

    public StartContextDatabaseSyncSourceDiscoveryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartContextDatabaseSyncSourceDiscoveryResponseBody setData(StartContextDatabaseSyncSourceDiscoveryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartContextDatabaseSyncSourceDiscoveryResponseBodyData getData() {
        return this.data;
    }

    public StartContextDatabaseSyncSourceDiscoveryResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public StartContextDatabaseSyncSourceDiscoveryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartContextDatabaseSyncSourceDiscoveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartContextDatabaseSyncSourceDiscoveryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class StartContextDatabaseSyncSourceDiscoveryResponseBodyData extends TeaModel {
        /**
         * <p>The discovery task ID, which is a system-generated UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static StartContextDatabaseSyncSourceDiscoveryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartContextDatabaseSyncSourceDiscoveryResponseBodyData self = new StartContextDatabaseSyncSourceDiscoveryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartContextDatabaseSyncSourceDiscoveryResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
