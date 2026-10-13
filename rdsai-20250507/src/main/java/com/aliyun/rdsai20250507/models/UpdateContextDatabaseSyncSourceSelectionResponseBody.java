// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateContextDatabaseSyncSourceSelectionResponseBody extends TeaModel {
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
    public UpdateContextDatabaseSyncSourceSelectionResponseBodyData data;

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

    public static UpdateContextDatabaseSyncSourceSelectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextDatabaseSyncSourceSelectionResponseBody self = new UpdateContextDatabaseSyncSourceSelectionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateContextDatabaseSyncSourceSelectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateContextDatabaseSyncSourceSelectionResponseBody setData(UpdateContextDatabaseSyncSourceSelectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateContextDatabaseSyncSourceSelectionResponseBodyData getData() {
        return this.data;
    }

    public UpdateContextDatabaseSyncSourceSelectionResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateContextDatabaseSyncSourceSelectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateContextDatabaseSyncSourceSelectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateContextDatabaseSyncSourceSelectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateContextDatabaseSyncSourceSelectionResponseBodyData extends TeaModel {
        /**
         * <p>The data source ID, which is a system-generated UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        public static UpdateContextDatabaseSyncSourceSelectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateContextDatabaseSyncSourceSelectionResponseBodyData self = new UpdateContextDatabaseSyncSourceSelectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateContextDatabaseSyncSourceSelectionResponseBodyData setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

    }

}
