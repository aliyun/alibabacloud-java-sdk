// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseSyncDiscoveryTaskResponseBody extends TeaModel {
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
    public GetContextDatabaseSyncDiscoveryTaskResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>The response message.</p>
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

    public static GetContextDatabaseSyncDiscoveryTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseSyncDiscoveryTaskResponseBody self = new GetContextDatabaseSyncDiscoveryTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseSyncDiscoveryTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetContextDatabaseSyncDiscoveryTaskResponseBody setData(GetContextDatabaseSyncDiscoveryTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetContextDatabaseSyncDiscoveryTaskResponseBodyData getData() {
        return this.data;
    }

    public GetContextDatabaseSyncDiscoveryTaskResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetContextDatabaseSyncDiscoveryTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetContextDatabaseSyncDiscoveryTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContextDatabaseSyncDiscoveryTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetContextDatabaseSyncDiscoveryTaskResponseBodyData extends TeaModel {
        /**
         * <p>The time when the cancellation was requested.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("CancelRequestedAt")
        public String cancelRequestedAt;

        /**
         * <p>The connection ID, which is a system-generated UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("ConnectionId")
        public String connectionId;

        /**
         * <p>The number of containers.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000000000000</p>
         */
        @NameInMap("Containers")
        public Long containers;

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>File size exceeds the limit</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <p>The plug-in reference.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:dingtalk@1.0.0">dingtalk@1.0.0</a></p>
         */
        @NameInMap("PluginRef")
        public String pluginRef;

        /**
         * <p>The number of scanned items.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000000000000</p>
         */
        @NameInMap("Scanned")
        public Long scanned;

        /**
         * <p>The datasource config. The structure varies depending on the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;folderIds&quot;:[&quot;<a href="https://alidocs.dingtalk.com/i/p/p2N9kLmQxYz****%22%5D,%22pageSize%22:50,%22maxDepth%22:5%7D">https://alidocs.dingtalk.com/i/p/p2N9kLmQxYz****&quot;],&quot;pageSize&quot;:50,&quot;maxDepth&quot;:5}</a></p>
         */
        @NameInMap("SourceConfig")
        public String sourceConfig;

        /**
         * <p>The data source ID, which is a system-generated UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <p>The discovery task status. Valid values: queued, running, succeeded, cancelled, and failed.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The discovery task ID, which is a system-generated UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The time when the task was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("UpdatedAt")
        public String updatedAt;

        public static GetContextDatabaseSyncDiscoveryTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetContextDatabaseSyncDiscoveryTaskResponseBodyData self = new GetContextDatabaseSyncDiscoveryTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetContextDatabaseSyncDiscoveryTaskResponseBodyData setCancelRequestedAt(String cancelRequestedAt) {
            this.cancelRequestedAt = cancelRequestedAt;
            return this;
        }
        public String getCancelRequestedAt() {
            return this.cancelRequestedAt;
        }

        public GetContextDatabaseSyncDiscoveryTaskResponseBodyData setConnectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public String getConnectionId() {
            return this.connectionId;
        }

        public GetContextDatabaseSyncDiscoveryTaskResponseBodyData setContainers(Long containers) {
            this.containers = containers;
            return this;
        }
        public Long getContainers() {
            return this.containers;
        }

        public GetContextDatabaseSyncDiscoveryTaskResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetContextDatabaseSyncDiscoveryTaskResponseBodyData setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetContextDatabaseSyncDiscoveryTaskResponseBodyData setPluginRef(String pluginRef) {
            this.pluginRef = pluginRef;
            return this;
        }
        public String getPluginRef() {
            return this.pluginRef;
        }

        public GetContextDatabaseSyncDiscoveryTaskResponseBodyData setScanned(Long scanned) {
            this.scanned = scanned;
            return this;
        }
        public Long getScanned() {
            return this.scanned;
        }

        public GetContextDatabaseSyncDiscoveryTaskResponseBodyData setSourceConfig(String sourceConfig) {
            this.sourceConfig = sourceConfig;
            return this;
        }
        public String getSourceConfig() {
            return this.sourceConfig;
        }

        public GetContextDatabaseSyncDiscoveryTaskResponseBodyData setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public GetContextDatabaseSyncDiscoveryTaskResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetContextDatabaseSyncDiscoveryTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetContextDatabaseSyncDiscoveryTaskResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
