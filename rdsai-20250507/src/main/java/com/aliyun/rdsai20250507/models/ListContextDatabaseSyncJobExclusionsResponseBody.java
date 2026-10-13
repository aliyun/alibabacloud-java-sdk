// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseSyncJobExclusionsResponseBody extends TeaModel {
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
    public ListContextDatabaseSyncJobExclusionsResponseBodyData data;

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

    public static ListContextDatabaseSyncJobExclusionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseSyncJobExclusionsResponseBody self = new ListContextDatabaseSyncJobExclusionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseSyncJobExclusionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListContextDatabaseSyncJobExclusionsResponseBody setData(ListContextDatabaseSyncJobExclusionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListContextDatabaseSyncJobExclusionsResponseBodyData getData() {
        return this.data;
    }

    public ListContextDatabaseSyncJobExclusionsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListContextDatabaseSyncJobExclusionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListContextDatabaseSyncJobExclusionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContextDatabaseSyncJobExclusionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListContextDatabaseSyncJobExclusionsResponseBodyData extends TeaModel {
        /**
         * <p>The list of document IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;doc-as1llqmkol****&quot;]</p>
         */
        @NameInMap("DocumentIds")
        public java.util.List<String> documentIds;

        public static ListContextDatabaseSyncJobExclusionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListContextDatabaseSyncJobExclusionsResponseBodyData self = new ListContextDatabaseSyncJobExclusionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListContextDatabaseSyncJobExclusionsResponseBodyData setDocumentIds(java.util.List<String> documentIds) {
            this.documentIds = documentIds;
            return this;
        }
        public java.util.List<String> getDocumentIds() {
            return this.documentIds;
        }

    }

}
