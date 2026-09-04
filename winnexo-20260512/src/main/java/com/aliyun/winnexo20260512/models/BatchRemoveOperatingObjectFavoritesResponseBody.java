// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class BatchRemoveOperatingObjectFavoritesResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The graph name.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("graphName")
    public String graphName;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The object type, such as customer. This parameter has a value when type is set to mention.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("objectType")
    public String objectType;

    /**
     * <p>The digital employee name (operating object name, optional).</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The number of remaining favorited objects within the specified scope.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("remainingCount")
    public Long remainingCount;

    /**
     * <p>The number of physical favorite records that are actually deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("removedCount")
    public Long removedCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p><strong>The number of requested members before deduplication.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("requestedCount")
    public Long requestedCount;

    /**
     * <p>The relationships between internal and external DingTalk users that failed to be created.</p>
     */
    @NameInMap("results")
    public java.util.List<BatchRemoveOperatingObjectFavoritesResponseBodyResults> results;

    public static BatchRemoveOperatingObjectFavoritesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchRemoveOperatingObjectFavoritesResponseBody self = new BatchRemoveOperatingObjectFavoritesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchRemoveOperatingObjectFavoritesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchRemoveOperatingObjectFavoritesResponseBody setGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }
    public String getGraphName() {
        return this.graphName;
    }

    public BatchRemoveOperatingObjectFavoritesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchRemoveOperatingObjectFavoritesResponseBody setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public BatchRemoveOperatingObjectFavoritesResponseBody setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public BatchRemoveOperatingObjectFavoritesResponseBody setRemainingCount(Long remainingCount) {
        this.remainingCount = remainingCount;
        return this;
    }
    public Long getRemainingCount() {
        return this.remainingCount;
    }

    public BatchRemoveOperatingObjectFavoritesResponseBody setRemovedCount(Long removedCount) {
        this.removedCount = removedCount;
        return this;
    }
    public Long getRemovedCount() {
        return this.removedCount;
    }

    public BatchRemoveOperatingObjectFavoritesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchRemoveOperatingObjectFavoritesResponseBody setRequestedCount(Long requestedCount) {
        this.requestedCount = requestedCount;
        return this;
    }
    public Long getRequestedCount() {
        return this.requestedCount;
    }

    public BatchRemoveOperatingObjectFavoritesResponseBody setResults(java.util.List<BatchRemoveOperatingObjectFavoritesResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<BatchRemoveOperatingObjectFavoritesResponseBodyResults> getResults() {
        return this.results;
    }

    public static class BatchRemoveOperatingObjectFavoritesResponseBodyResults extends TeaModel {
        /**
         * <p>Indicates whether the object is favorited after the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isFavorited")
        public Boolean isFavorited;

        /**
         * <p>The aligned object ID: target ID or KR ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>Indicates whether the request has been processed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("processed")
        public Boolean processed;

        public static BatchRemoveOperatingObjectFavoritesResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            BatchRemoveOperatingObjectFavoritesResponseBodyResults self = new BatchRemoveOperatingObjectFavoritesResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public BatchRemoveOperatingObjectFavoritesResponseBodyResults setIsFavorited(Boolean isFavorited) {
            this.isFavorited = isFavorited;
            return this;
        }
        public Boolean getIsFavorited() {
            return this.isFavorited;
        }

        public BatchRemoveOperatingObjectFavoritesResponseBodyResults setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public BatchRemoveOperatingObjectFavoritesResponseBodyResults setProcessed(Boolean processed) {
            this.processed = processed;
            return this;
        }
        public Boolean getProcessed() {
            return this.processed;
        }

    }

}
