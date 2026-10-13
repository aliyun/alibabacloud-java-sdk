// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseSyncSourceSelectionResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample value</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetContextDatabaseSyncSourceSelectionResponseBodyData data;

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
     * <p>Sample value</p>
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
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetContextDatabaseSyncSourceSelectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseSyncSourceSelectionResponseBody self = new GetContextDatabaseSyncSourceSelectionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseSyncSourceSelectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetContextDatabaseSyncSourceSelectionResponseBody setData(GetContextDatabaseSyncSourceSelectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetContextDatabaseSyncSourceSelectionResponseBodyData getData() {
        return this.data;
    }

    public GetContextDatabaseSyncSourceSelectionResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetContextDatabaseSyncSourceSelectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetContextDatabaseSyncSourceSelectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContextDatabaseSyncSourceSelectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetContextDatabaseSyncSourceSelectionResponseBodyData extends TeaModel {
        /**
         * <p>The confirmation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("ConfirmedAt")
        public String confirmedAt;

        /**
         * <p>The list of selected node identifiers.</p>
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
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("UpdatedAt")
        public String updatedAt;

        public static GetContextDatabaseSyncSourceSelectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetContextDatabaseSyncSourceSelectionResponseBodyData self = new GetContextDatabaseSyncSourceSelectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetContextDatabaseSyncSourceSelectionResponseBodyData setConfirmedAt(String confirmedAt) {
            this.confirmedAt = confirmedAt;
            return this;
        }
        public String getConfirmedAt() {
            return this.confirmedAt;
        }

        public GetContextDatabaseSyncSourceSelectionResponseBodyData setSelectedNodeKeys(java.util.List<String> selectedNodeKeys) {
            this.selectedNodeKeys = selectedNodeKeys;
            return this;
        }
        public java.util.List<String> getSelectedNodeKeys() {
            return this.selectedNodeKeys;
        }

        public GetContextDatabaseSyncSourceSelectionResponseBodyData setSelectionPolicy(String selectionPolicy) {
            this.selectionPolicy = selectionPolicy;
            return this;
        }
        public String getSelectionPolicy() {
            return this.selectionPolicy;
        }

        public GetContextDatabaseSyncSourceSelectionResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
