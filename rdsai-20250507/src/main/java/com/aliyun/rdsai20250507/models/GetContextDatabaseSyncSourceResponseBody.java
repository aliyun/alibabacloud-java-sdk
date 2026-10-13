// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseSyncSourceResponseBody extends TeaModel {
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
    public GetContextDatabaseSyncSourceResponseBodyData data;

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

    public static GetContextDatabaseSyncSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseSyncSourceResponseBody self = new GetContextDatabaseSyncSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseSyncSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetContextDatabaseSyncSourceResponseBody setData(GetContextDatabaseSyncSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetContextDatabaseSyncSourceResponseBodyData getData() {
        return this.data;
    }

    public GetContextDatabaseSyncSourceResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetContextDatabaseSyncSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetContextDatabaseSyncSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContextDatabaseSyncSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetContextDatabaseSyncSourceResponseBodyData extends TeaModel {
        /**
         * <p>The confirmation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("ConfirmedAt")
        public String confirmedAt;

        /**
         * <p>The connection ID, which is a system-generated UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("ConnectionId")
        public String connectionId;

        /**
         * <p>The data source ID, which is a system-generated UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D team document scope</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of selected node keys.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;doc:1234567890&quot;]</p>
         */
        @NameInMap("SelectedNodeKeys")
        public java.util.List<String> selectedNodeKeys;

        /**
         * <p>The selection policy.</p>
         * 
         * <strong>example:</strong>
         * <p>subtree</p>
         */
        @NameInMap("SelectionPolicy")
        public String selectionPolicy;

        /**
         * <p>The datasource config, which varies by plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;folderIds&quot;:[&quot;<a href="https://alidocs.dingtalk.com/i/p/p2N9kLmQxYz****%22%5D,%22pageSize%22:50,%22maxDepth%22:5%7D">https://alidocs.dingtalk.com/i/p/p2N9kLmQxYz****&quot;],&quot;pageSize&quot;:50,&quot;maxDepth&quot;:5}</a></p>
         */
        @NameInMap("SourceConfig")
        public String sourceConfig;

        public static GetContextDatabaseSyncSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetContextDatabaseSyncSourceResponseBodyData self = new GetContextDatabaseSyncSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetContextDatabaseSyncSourceResponseBodyData setConfirmedAt(String confirmedAt) {
            this.confirmedAt = confirmedAt;
            return this;
        }
        public String getConfirmedAt() {
            return this.confirmedAt;
        }

        public GetContextDatabaseSyncSourceResponseBodyData setConnectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public String getConnectionId() {
            return this.connectionId;
        }

        public GetContextDatabaseSyncSourceResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetContextDatabaseSyncSourceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetContextDatabaseSyncSourceResponseBodyData setSelectedNodeKeys(java.util.List<String> selectedNodeKeys) {
            this.selectedNodeKeys = selectedNodeKeys;
            return this;
        }
        public java.util.List<String> getSelectedNodeKeys() {
            return this.selectedNodeKeys;
        }

        public GetContextDatabaseSyncSourceResponseBodyData setSelectionPolicy(String selectionPolicy) {
            this.selectionPolicy = selectionPolicy;
            return this;
        }
        public String getSelectionPolicy() {
            return this.selectionPolicy;
        }

        public GetContextDatabaseSyncSourceResponseBodyData setSourceConfig(String sourceConfig) {
            this.sourceConfig = sourceConfig;
            return this;
        }
        public String getSourceConfig() {
            return this.sourceConfig;
        }

    }

}
