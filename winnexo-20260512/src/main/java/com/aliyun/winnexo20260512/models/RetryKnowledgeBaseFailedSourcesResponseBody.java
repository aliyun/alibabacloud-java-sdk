// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RetryKnowledgeBaseFailedSourcesResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success. A failure returns a backend error code (ERR.* / InvalidParameter.*).</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The enterprise knowledge base directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The number of resources successfully enqueued for retry.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("enqueuedCount")
    public Long enqueuedCount;

    /**
     * <p>enqueuedIds。</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("enqueuedIds")
    public java.util.List<String> enqueuedIds;

    /**
     * <p>The total number of failed resources under the directory.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("failedCount")
    public Long failedCount;

    /**
     * <p>The list of failed data sources.</p>
     */
    @NameInMap("failedSources")
    public java.util.List<RetryKnowledgeBaseFailedSourcesResponseBodyFailedSources> failedSources;

    /**
     * <p>The error description. This value is empty on success.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The number of resources skipped because they are not in FAILED status.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("skippedCount")
    public Long skippedCount;

    public static RetryKnowledgeBaseFailedSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryKnowledgeBaseFailedSourcesResponseBody self = new RetryKnowledgeBaseFailedSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryKnowledgeBaseFailedSourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RetryKnowledgeBaseFailedSourcesResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public RetryKnowledgeBaseFailedSourcesResponseBody setEnqueuedCount(Long enqueuedCount) {
        this.enqueuedCount = enqueuedCount;
        return this;
    }
    public Long getEnqueuedCount() {
        return this.enqueuedCount;
    }

    public RetryKnowledgeBaseFailedSourcesResponseBody setEnqueuedIds(java.util.List<String> enqueuedIds) {
        this.enqueuedIds = enqueuedIds;
        return this;
    }
    public java.util.List<String> getEnqueuedIds() {
        return this.enqueuedIds;
    }

    public RetryKnowledgeBaseFailedSourcesResponseBody setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Long getFailedCount() {
        return this.failedCount;
    }

    public RetryKnowledgeBaseFailedSourcesResponseBody setFailedSources(java.util.List<RetryKnowledgeBaseFailedSourcesResponseBodyFailedSources> failedSources) {
        this.failedSources = failedSources;
        return this;
    }
    public java.util.List<RetryKnowledgeBaseFailedSourcesResponseBodyFailedSources> getFailedSources() {
        return this.failedSources;
    }

    public RetryKnowledgeBaseFailedSourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RetryKnowledgeBaseFailedSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RetryKnowledgeBaseFailedSourcesResponseBody setSkippedCount(Long skippedCount) {
        this.skippedCount = skippedCount;
        return this;
    }
    public Long getSkippedCount() {
        return this.skippedCount;
    }

    public static class RetryKnowledgeBaseFailedSourcesResponseBodyFailedSources extends TeaModel {
        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleName.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSourceId</p>
         */
        @NameInMap("sourceId")
        public String sourceId;

        /**
         * <p>The data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        public static RetryKnowledgeBaseFailedSourcesResponseBodyFailedSources build(java.util.Map<String, ?> map) throws Exception {
            RetryKnowledgeBaseFailedSourcesResponseBodyFailedSources self = new RetryKnowledgeBaseFailedSourcesResponseBodyFailedSources();
            return TeaModel.build(map, self);
        }

        public RetryKnowledgeBaseFailedSourcesResponseBodyFailedSources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RetryKnowledgeBaseFailedSourcesResponseBodyFailedSources setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public RetryKnowledgeBaseFailedSourcesResponseBodyFailedSources setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
