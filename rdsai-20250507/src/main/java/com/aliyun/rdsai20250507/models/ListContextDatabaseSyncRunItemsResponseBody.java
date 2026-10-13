// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseSyncRunItemsResponseBody extends TeaModel {
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
    public ListContextDatabaseSyncRunItemsResponseBodyData data;

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
     * <p>Indicates whether the request succeeded.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListContextDatabaseSyncRunItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseSyncRunItemsResponseBody self = new ListContextDatabaseSyncRunItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseSyncRunItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListContextDatabaseSyncRunItemsResponseBody setData(ListContextDatabaseSyncRunItemsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListContextDatabaseSyncRunItemsResponseBodyData getData() {
        return this.data;
    }

    public ListContextDatabaseSyncRunItemsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListContextDatabaseSyncRunItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListContextDatabaseSyncRunItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContextDatabaseSyncRunItemsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListContextDatabaseSyncRunItemsResponseBodyDataItems extends TeaModel {
        /**
         * <p>The document shard index.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ArtifactIndex")
        public Integer artifactIndex;

        /**
         * <p>The ContextDB document ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cd-as1llqmkol****</p>
         */
        @NameInMap("CtxdbDocumentId")
        public String ctxdbDocumentId;

        /**
         * <p>The fine-grained execution status of the current synchronization item, which indicates the processing result of a single document in the current run. Common valid values include uploaded, uploaded-pending-review, upload-accepted, upload-busy, metadata-updating, metadata-updated, migrated, failed, source-failed, replace, warning, deferred, resume, skip, skipped, unsupported, and cancelled.</p>
         * 
         * <strong>example:</strong>
         * <p>uploaded</p>
         */
        @NameInMap("Decision")
        public String decision;

        /**
         * <p>The aggregated display status of the current synchronization item. Known mappings include success, failure, processing, and skipped. Unknown Decision values are passed through as-is.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("DecisionCategory")
        public String decisionCategory;

        /**
         * <p>The source document ID.</p>
         * 
         * <strong>example:</strong>
         * <p>doc-1234567890</p>
         */
        @NameInMap("ProviderDocumentId")
        public String providerDocumentId;

        /**
         * <p>The processing reason or failure reason.</p>
         * 
         * <strong>example:</strong>
         * <p>The data source authorization has expired</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The size in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        /**
         * <p>The source path.</p>
         * 
         * <strong>example:</strong>
         * <p>/Development Documents/Project Plan</p>
         */
        @NameInMap("SourcePath")
        public String sourcePath;

        /**
         * <p>The source record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sr-as1llqmkol****</p>
         */
        @NameInMap("SourceRecordId")
        public String sourceRecordId;

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>Project Plan</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("UpdatedAt")
        public String updatedAt;

        public static ListContextDatabaseSyncRunItemsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListContextDatabaseSyncRunItemsResponseBodyDataItems self = new ListContextDatabaseSyncRunItemsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListContextDatabaseSyncRunItemsResponseBodyDataItems setArtifactIndex(Integer artifactIndex) {
            this.artifactIndex = artifactIndex;
            return this;
        }
        public Integer getArtifactIndex() {
            return this.artifactIndex;
        }

        public ListContextDatabaseSyncRunItemsResponseBodyDataItems setCtxdbDocumentId(String ctxdbDocumentId) {
            this.ctxdbDocumentId = ctxdbDocumentId;
            return this;
        }
        public String getCtxdbDocumentId() {
            return this.ctxdbDocumentId;
        }

        public ListContextDatabaseSyncRunItemsResponseBodyDataItems setDecision(String decision) {
            this.decision = decision;
            return this;
        }
        public String getDecision() {
            return this.decision;
        }

        public ListContextDatabaseSyncRunItemsResponseBodyDataItems setDecisionCategory(String decisionCategory) {
            this.decisionCategory = decisionCategory;
            return this;
        }
        public String getDecisionCategory() {
            return this.decisionCategory;
        }

        public ListContextDatabaseSyncRunItemsResponseBodyDataItems setProviderDocumentId(String providerDocumentId) {
            this.providerDocumentId = providerDocumentId;
            return this;
        }
        public String getProviderDocumentId() {
            return this.providerDocumentId;
        }

        public ListContextDatabaseSyncRunItemsResponseBodyDataItems setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListContextDatabaseSyncRunItemsResponseBodyDataItems setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public ListContextDatabaseSyncRunItemsResponseBodyDataItems setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

        public ListContextDatabaseSyncRunItemsResponseBodyDataItems setSourceRecordId(String sourceRecordId) {
            this.sourceRecordId = sourceRecordId;
            return this;
        }
        public String getSourceRecordId() {
            return this.sourceRecordId;
        }

        public ListContextDatabaseSyncRunItemsResponseBodyDataItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListContextDatabaseSyncRunItemsResponseBodyDataItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class ListContextDatabaseSyncRunItemsResponseBodyData extends TeaModel {
        /**
         * <p>The data list.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;SourceRecordId&quot;:&quot;sr-as1llqmkol****&quot;, &quot;ArtifactIndex&quot;:0, &quot;ProviderDocumentId&quot;:&quot;doc-1234567890&quot;, &quot;Title&quot;:&quot;Project Plan&quot;}]</p>
         */
        @NameInMap("Items")
        public java.util.List<ListContextDatabaseSyncRunItemsResponseBodyDataItems> items;

        /**
         * <p>The page number. Pages start from 1.</p>
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

        public static ListContextDatabaseSyncRunItemsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListContextDatabaseSyncRunItemsResponseBodyData self = new ListContextDatabaseSyncRunItemsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListContextDatabaseSyncRunItemsResponseBodyData setItems(java.util.List<ListContextDatabaseSyncRunItemsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListContextDatabaseSyncRunItemsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListContextDatabaseSyncRunItemsResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListContextDatabaseSyncRunItemsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListContextDatabaseSyncRunItemsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
