// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseSyncSourceTreeNodesResponseBody extends TeaModel {
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
    public java.util.List<ListContextDatabaseSyncSourceTreeNodesResponseBodyData> data;

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
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListContextDatabaseSyncSourceTreeNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseSyncSourceTreeNodesResponseBody self = new ListContextDatabaseSyncSourceTreeNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseSyncSourceTreeNodesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListContextDatabaseSyncSourceTreeNodesResponseBody setData(java.util.List<ListContextDatabaseSyncSourceTreeNodesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListContextDatabaseSyncSourceTreeNodesResponseBodyData> getData() {
        return this.data;
    }

    public ListContextDatabaseSyncSourceTreeNodesResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListContextDatabaseSyncSourceTreeNodesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListContextDatabaseSyncSourceTreeNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContextDatabaseSyncSourceTreeNodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListContextDatabaseSyncSourceTreeNodesResponseBodyData extends TeaModel {
        /**
         * <p>The discovery time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("DiscoveredAt")
        public String discoveredAt;

        /**
         * <p>The file name extension.</p>
         * 
         * <strong>example:</strong>
         * <p>.docx</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>Indicates whether the node has child nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasChildren")
        public Boolean hasChildren;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>folder</p>
         */
        @NameInMap("Kind")
        public String kind;

        /**
         * <p>The node identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>doc:1234567890</p>
         */
        @NameInMap("NodeKey")
        public String nodeKey;

        /**
         * <p>The parent node identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>folder:9876543210</p>
         */
        @NameInMap("ParentKey")
        public String parentKey;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("StaleAt")
        public String staleAt;

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>Project plan</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The reason why the operation is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>The current plugin does not support this operation</p>
         */
        @NameInMap("UnsupportedReason")
        public String unsupportedReason;

        public static ListContextDatabaseSyncSourceTreeNodesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListContextDatabaseSyncSourceTreeNodesResponseBodyData self = new ListContextDatabaseSyncSourceTreeNodesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListContextDatabaseSyncSourceTreeNodesResponseBodyData setDiscoveredAt(String discoveredAt) {
            this.discoveredAt = discoveredAt;
            return this;
        }
        public String getDiscoveredAt() {
            return this.discoveredAt;
        }

        public ListContextDatabaseSyncSourceTreeNodesResponseBodyData setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ListContextDatabaseSyncSourceTreeNodesResponseBodyData setHasChildren(Boolean hasChildren) {
            this.hasChildren = hasChildren;
            return this;
        }
        public Boolean getHasChildren() {
            return this.hasChildren;
        }

        public ListContextDatabaseSyncSourceTreeNodesResponseBodyData setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public ListContextDatabaseSyncSourceTreeNodesResponseBodyData setNodeKey(String nodeKey) {
            this.nodeKey = nodeKey;
            return this;
        }
        public String getNodeKey() {
            return this.nodeKey;
        }

        public ListContextDatabaseSyncSourceTreeNodesResponseBodyData setParentKey(String parentKey) {
            this.parentKey = parentKey;
            return this;
        }
        public String getParentKey() {
            return this.parentKey;
        }

        public ListContextDatabaseSyncSourceTreeNodesResponseBodyData setStaleAt(String staleAt) {
            this.staleAt = staleAt;
            return this;
        }
        public String getStaleAt() {
            return this.staleAt;
        }

        public ListContextDatabaseSyncSourceTreeNodesResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListContextDatabaseSyncSourceTreeNodesResponseBodyData setUnsupportedReason(String unsupportedReason) {
            this.unsupportedReason = unsupportedReason;
            return this;
        }
        public String getUnsupportedReason() {
            return this.unsupportedReason;
        }

    }

}
