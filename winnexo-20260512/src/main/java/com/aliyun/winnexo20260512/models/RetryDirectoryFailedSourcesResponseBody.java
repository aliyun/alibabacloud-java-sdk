// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RetryDirectoryFailedSourcesResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The ID of the enterprise knowledge base folder. Failed resources in the folder and its subfolders are included recursively.</p>
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
     * <p>The total number of failed resources in the folder.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("failedCount")
    public Long failedCount;

    /**
     * <p>The list of failed data source IDs.</p>
     */
    @NameInMap("failedSources")
    public java.util.List<RetryDirectoryFailedSourcesResponseBodyFailedSources> failedSources;

    /**
     * <p>The description of the status code.</p>
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

    public static RetryDirectoryFailedSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryDirectoryFailedSourcesResponseBody self = new RetryDirectoryFailedSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryDirectoryFailedSourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RetryDirectoryFailedSourcesResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public RetryDirectoryFailedSourcesResponseBody setEnqueuedCount(Long enqueuedCount) {
        this.enqueuedCount = enqueuedCount;
        return this;
    }
    public Long getEnqueuedCount() {
        return this.enqueuedCount;
    }

    public RetryDirectoryFailedSourcesResponseBody setEnqueuedIds(java.util.List<String> enqueuedIds) {
        this.enqueuedIds = enqueuedIds;
        return this;
    }
    public java.util.List<String> getEnqueuedIds() {
        return this.enqueuedIds;
    }

    public RetryDirectoryFailedSourcesResponseBody setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Long getFailedCount() {
        return this.failedCount;
    }

    public RetryDirectoryFailedSourcesResponseBody setFailedSources(java.util.List<RetryDirectoryFailedSourcesResponseBodyFailedSources> failedSources) {
        this.failedSources = failedSources;
        return this;
    }
    public java.util.List<RetryDirectoryFailedSourcesResponseBodyFailedSources> getFailedSources() {
        return this.failedSources;
    }

    public RetryDirectoryFailedSourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RetryDirectoryFailedSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RetryDirectoryFailedSourcesResponseBody setSkippedCount(Long skippedCount) {
        this.skippedCount = skippedCount;
        return this;
    }
    public Long getSkippedCount() {
        return this.skippedCount;
    }

    public static class RetryDirectoryFailedSourcesResponseBodyFailedSources extends TeaModel {
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

        public static RetryDirectoryFailedSourcesResponseBodyFailedSources build(java.util.Map<String, ?> map) throws Exception {
            RetryDirectoryFailedSourcesResponseBodyFailedSources self = new RetryDirectoryFailedSourcesResponseBodyFailedSources();
            return TeaModel.build(map, self);
        }

        public RetryDirectoryFailedSourcesResponseBodyFailedSources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RetryDirectoryFailedSourcesResponseBodyFailedSources setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public RetryDirectoryFailedSourcesResponseBodyFailedSources setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
