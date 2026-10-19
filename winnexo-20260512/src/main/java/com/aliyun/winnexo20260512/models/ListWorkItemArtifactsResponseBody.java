// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListWorkItemArtifactsResponseBody extends TeaModel {
    /**
     * <p>业务状态码；成功为200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>历史产物列表</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("items")
    public java.util.List<ListWorkItemArtifactsResponseBodyItems> items;

    /**
     * <p>错误描述</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>返回产物数量</p>
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
         * <p>产物ID</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>引用类型</p>
         * 
         * <strong>example:</strong>
         * <p>WORK_ITEM_ARTIFACT</p>
         */
        @NameInMap("kind")
        public String kind;

        /**
         * <p>OpenAPI 产物访问入口</p>
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
         * <p>产物ID</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("artifactId")
        public String artifactId;

        /**
         * <p>产物键</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("artifactKey")
        public String artifactKey;

        /**
         * <p>节点尝试序号</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("attemptSeq")
        public Long attemptSeq;

        /**
         * <p>内容类型</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <p>创建时间(ISO8601)</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>节点键</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("nodeKey")
        public String nodeKey;

        /**
         * <p>计划ID</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("planId")
        public String planId;

        /**
         * <p>引用信息</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("ref")
        public ListWorkItemArtifactsResponseBodyItemsRef ref;

        /**
         * <p>运行ID</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("runId")
        public String runId;

        /**
         * <p>内容SHA-256</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("sha256")
        public String sha256;

        /**
         * <p>产物大小(字节)</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sizeBytes")
        public Long sizeBytes;

        /**
         * <p>产物摘要</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("summary")
        public String summary;

        /**
         * <p>产物标题</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>会话轮次序号</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("turnSeq")
        public Long turnSeq;

        /**
         * <p>产物类型</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>工作项ID</p>
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
