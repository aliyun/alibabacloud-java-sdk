// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseSyncJobDocumentsResponseBody extends TeaModel {
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
    public ListContextDatabaseSyncJobDocumentsResponseBodyData data;

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

    public static ListContextDatabaseSyncJobDocumentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseSyncJobDocumentsResponseBody self = new ListContextDatabaseSyncJobDocumentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseSyncJobDocumentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListContextDatabaseSyncJobDocumentsResponseBody setData(ListContextDatabaseSyncJobDocumentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListContextDatabaseSyncJobDocumentsResponseBodyData getData() {
        return this.data;
    }

    public ListContextDatabaseSyncJobDocumentsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListContextDatabaseSyncJobDocumentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListContextDatabaseSyncJobDocumentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContextDatabaseSyncJobDocumentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListContextDatabaseSyncJobDocumentsResponseBodyDataDocuments extends TeaModel {
        /**
         * <p>The content hash.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256:4b3b7b2e5f6a1c9d8e0f1234567890abcdef1234567890abcdef1234567890ab</p>
         */
        @NameInMap("ContentHash")
        public String contentHash;

        /**
         * <p>The ContextDB document ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cd-as1llqmkol****</p>
         */
        @NameInMap("CtxdbDocumentId")
        public String ctxdbDocumentId;

        /**
         * <p>The source document ID.</p>
         * 
         * <strong>example:</strong>
         * <p>doc-1234567890</p>
         */
        @NameInMap("ProviderDocumentId")
        public String providerDocumentId;

        /**
         * <p>The retirement time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("RetiredAt")
        public String retiredAt;

        /**
         * <p>The source update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("SourceUpdateTime")
        public String sourceUpdateTime;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>completed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("UpdatedAt")
        public String updatedAt;

        public static ListContextDatabaseSyncJobDocumentsResponseBodyDataDocuments build(java.util.Map<String, ?> map) throws Exception {
            ListContextDatabaseSyncJobDocumentsResponseBodyDataDocuments self = new ListContextDatabaseSyncJobDocumentsResponseBodyDataDocuments();
            return TeaModel.build(map, self);
        }

        public ListContextDatabaseSyncJobDocumentsResponseBodyDataDocuments setContentHash(String contentHash) {
            this.contentHash = contentHash;
            return this;
        }
        public String getContentHash() {
            return this.contentHash;
        }

        public ListContextDatabaseSyncJobDocumentsResponseBodyDataDocuments setCtxdbDocumentId(String ctxdbDocumentId) {
            this.ctxdbDocumentId = ctxdbDocumentId;
            return this;
        }
        public String getCtxdbDocumentId() {
            return this.ctxdbDocumentId;
        }

        public ListContextDatabaseSyncJobDocumentsResponseBodyDataDocuments setProviderDocumentId(String providerDocumentId) {
            this.providerDocumentId = providerDocumentId;
            return this;
        }
        public String getProviderDocumentId() {
            return this.providerDocumentId;
        }

        public ListContextDatabaseSyncJobDocumentsResponseBodyDataDocuments setRetiredAt(String retiredAt) {
            this.retiredAt = retiredAt;
            return this;
        }
        public String getRetiredAt() {
            return this.retiredAt;
        }

        public ListContextDatabaseSyncJobDocumentsResponseBodyDataDocuments setSourceUpdateTime(String sourceUpdateTime) {
            this.sourceUpdateTime = sourceUpdateTime;
            return this;
        }
        public String getSourceUpdateTime() {
            return this.sourceUpdateTime;
        }

        public ListContextDatabaseSyncJobDocumentsResponseBodyDataDocuments setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListContextDatabaseSyncJobDocumentsResponseBodyDataDocuments setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class ListContextDatabaseSyncJobDocumentsResponseBodyData extends TeaModel {
        /**
         * <p>The list of documents.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ProviderDocumentId&quot;:&quot;doc-1234567890&quot;, &quot;Status&quot;:&quot;completed&quot;, &quot;ContentHash&quot;:&quot;sha256:4b3b7b2e5f6a1c9d8e0f1234567890abcdef1234567890abcdef1234567890ab&quot;, &quot;SourceUpdateTime&quot;:&quot;2026-09-23T10:00:00+08:00&quot;}]</p>
         */
        @NameInMap("Documents")
        public java.util.List<ListContextDatabaseSyncJobDocumentsResponseBodyDataDocuments> documents;

        /**
         * <p>The page number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListContextDatabaseSyncJobDocumentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListContextDatabaseSyncJobDocumentsResponseBodyData self = new ListContextDatabaseSyncJobDocumentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListContextDatabaseSyncJobDocumentsResponseBodyData setDocuments(java.util.List<ListContextDatabaseSyncJobDocumentsResponseBodyDataDocuments> documents) {
            this.documents = documents;
            return this;
        }
        public java.util.List<ListContextDatabaseSyncJobDocumentsResponseBodyDataDocuments> getDocuments() {
            return this.documents;
        }

        public ListContextDatabaseSyncJobDocumentsResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListContextDatabaseSyncJobDocumentsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListContextDatabaseSyncJobDocumentsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
