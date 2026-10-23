// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListWorkItemArtifactsResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The list of historical artifacts.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("items")
    public java.util.List<ListWorkItemArtifactsResponseBodyItems> items;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
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
     * <p>The total number of returned artifacts.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListWorkItemArtifactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkItemArtifactsResponseBody self = new ListWorkItemArtifactsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkItemArtifactsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListWorkItemArtifactsResponseBody setItems(java.util.List<ListWorkItemArtifactsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListWorkItemArtifactsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListWorkItemArtifactsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWorkItemArtifactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkItemArtifactsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListWorkItemArtifactsResponseBodyItemsRef extends TeaModel {
        /**
         * <p>The artifact ID.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The reference data type.</p>
         * 
         * <strong>example:</strong>
         * <p>WORK_ITEM_ARTIFACT</p>
         */
        @NameInMap("kind")
        public String kind;

        /**
         * <p>The OpenAPI artifact access endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("url")
        public String url;

        public static ListWorkItemArtifactsResponseBodyItemsRef build(java.util.Map<String, ?> map) throws Exception {
            ListWorkItemArtifactsResponseBodyItemsRef self = new ListWorkItemArtifactsResponseBodyItemsRef();
            return TeaModel.build(map, self);
        }

        public ListWorkItemArtifactsResponseBodyItemsRef setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListWorkItemArtifactsResponseBodyItemsRef setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public ListWorkItemArtifactsResponseBodyItemsRef setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListWorkItemArtifactsResponseBodyItems extends TeaModel {
        /**
         * <p>The artifact ID.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("artifactId")
        public String artifactId;

        /**
         * <p>The artifact key.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("artifactKey")
        public String artifactKey;

        /**
         * <p>The node attempt sequence number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("attemptSeq")
        public Long attemptSeq;

        /**
         * <p>The content type.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <p>The creation time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The node key.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("nodeKey")
        public String nodeKey;

        /**
         * <p>The plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("planId")
        public String planId;

        /**
         * <p>The reference information.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("ref")
        public ListWorkItemArtifactsResponseBodyItemsRef ref;

        /**
         * <p>The run ID.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("runId")
        public String runId;

        /**
         * <p>The SHA-256 hash of the content.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("sha256")
        public String sha256;

        /**
         * <p>The artifact size in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sizeBytes")
        public Long sizeBytes;

        /**
         * <p>The artifact summary.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("summary")
        public String summary;

        /**
         * <p>The artifact title.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>The session turn sequence number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("turnSeq")
        public Long turnSeq;

        /**
         * <p>The artifact type.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The work item ID.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("workItemId")
        public String workItemId;

        public static ListWorkItemArtifactsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListWorkItemArtifactsResponseBodyItems self = new ListWorkItemArtifactsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListWorkItemArtifactsResponseBodyItems setArtifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }
        public String getArtifactId() {
            return this.artifactId;
        }

        public ListWorkItemArtifactsResponseBodyItems setArtifactKey(String artifactKey) {
            this.artifactKey = artifactKey;
            return this;
        }
        public String getArtifactKey() {
            return this.artifactKey;
        }

        public ListWorkItemArtifactsResponseBodyItems setAttemptSeq(Long attemptSeq) {
            this.attemptSeq = attemptSeq;
            return this;
        }
        public Long getAttemptSeq() {
            return this.attemptSeq;
        }

        public ListWorkItemArtifactsResponseBodyItems setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListWorkItemArtifactsResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListWorkItemArtifactsResponseBodyItems setNodeKey(String nodeKey) {
            this.nodeKey = nodeKey;
            return this;
        }
        public String getNodeKey() {
            return this.nodeKey;
        }

        public ListWorkItemArtifactsResponseBodyItems setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public ListWorkItemArtifactsResponseBodyItems setRef(ListWorkItemArtifactsResponseBodyItemsRef ref) {
            this.ref = ref;
            return this;
        }
        public ListWorkItemArtifactsResponseBodyItemsRef getRef() {
            return this.ref;
        }

        public ListWorkItemArtifactsResponseBodyItems setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public ListWorkItemArtifactsResponseBodyItems setSha256(String sha256) {
            this.sha256 = sha256;
            return this;
        }
        public String getSha256() {
            return this.sha256;
        }

        public ListWorkItemArtifactsResponseBodyItems setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public ListWorkItemArtifactsResponseBodyItems setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ListWorkItemArtifactsResponseBodyItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListWorkItemArtifactsResponseBodyItems setTurnSeq(Long turnSeq) {
            this.turnSeq = turnSeq;
            return this;
        }
        public Long getTurnSeq() {
            return this.turnSeq;
        }

        public ListWorkItemArtifactsResponseBodyItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListWorkItemArtifactsResponseBodyItems setWorkItemId(String workItemId) {
            this.workItemId = workItemId;
            return this;
        }
        public String getWorkItemId() {
            return this.workItemId;
        }

    }

}
