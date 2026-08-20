// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListVisibleKnowledgeBaseContentsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The list of MCP cards.</p>
     */
    @NameInMap("items")
    public java.util.List<ListVisibleKnowledgeBaseContentsResponseBodyItems> items;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C474BFC7-7B11-5D92-971E-74AA82EC495B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of context libraries that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListVisibleKnowledgeBaseContentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVisibleKnowledgeBaseContentsResponseBody self = new ListVisibleKnowledgeBaseContentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVisibleKnowledgeBaseContentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVisibleKnowledgeBaseContentsResponseBody setItems(java.util.List<ListVisibleKnowledgeBaseContentsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListVisibleKnowledgeBaseContentsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListVisibleKnowledgeBaseContentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVisibleKnowledgeBaseContentsResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListVisibleKnowledgeBaseContentsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListVisibleKnowledgeBaseContentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVisibleKnowledgeBaseContentsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListVisibleKnowledgeBaseContentsResponseBodyItemsObjectBindings extends TeaModel {
        /**
         * <p>The semantic graph name to which the object belongs. The object_id is unique within this graph.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("graphName")
        public String graphName;

        /**
         * <p>The ID of the recommended item, which can be a <strong>feedId</strong> or a micro-application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2676</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>The object name.</p>
         * 
         * <strong>example:</strong>
         * <p>0bf4cf71-a55d-43f7-9d1e-3f9a6110ae6b</p>
         */
        @NameInMap("objectName")
        public String objectName;

        /**
         * <p>The data type.</p>
         * 
         * <strong>example:</strong>
         * <p>table</p>
         */
        @NameInMap("objectType")
        public String objectType;

        /**
         * <p>The display name of the object type (such as &quot;Customer&quot;), parsed from the graph schema. The value is null when the cache is missed.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("objectTypeName")
        public String objectTypeName;

        public static ListVisibleKnowledgeBaseContentsResponseBodyItemsObjectBindings build(java.util.Map<String, ?> map) throws Exception {
            ListVisibleKnowledgeBaseContentsResponseBodyItemsObjectBindings self = new ListVisibleKnowledgeBaseContentsResponseBodyItemsObjectBindings();
            return TeaModel.build(map, self);
        }

        public ListVisibleKnowledgeBaseContentsResponseBodyItemsObjectBindings setGraphName(String graphName) {
            this.graphName = graphName;
            return this;
        }
        public String getGraphName() {
            return this.graphName;
        }

        public ListVisibleKnowledgeBaseContentsResponseBodyItemsObjectBindings setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ListVisibleKnowledgeBaseContentsResponseBodyItemsObjectBindings setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public ListVisibleKnowledgeBaseContentsResponseBodyItemsObjectBindings setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public ListVisibleKnowledgeBaseContentsResponseBodyItemsObjectBindings setObjectTypeName(String objectTypeName) {
            this.objectTypeName = objectTypeName;
            return this;
        }
        public String getObjectTypeName() {
            return this.objectTypeName;
        }

    }

    public static class ListVisibleKnowledgeBaseContentsResponseBodyItems extends TeaModel {
        /**
         * <p>The name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("creatorName")
        public String creatorName;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Created by taishan-module-recovery</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The directory type.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("directoryKind")
        public String directoryKind;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-14T02:18:27Z</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-26T08:46:25Z</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>The ID of the data item. When tabId and orgId are the same, itemId uniquely identifies a data item. The maximum length is 128 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>8525934734583554048_prod</p>
         */
        @NameInMap("itemId")
        public String itemId;

        /**
         * <p>The item type.</p>
         * 
         * <strong>example:</strong>
         * <p>item</p>
         */
        @NameInMap("itemType")
        public String itemType;

        /**
         * <p>The skill name.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-default-umodel-1782181212383_k8s.metric.k8s_csi_node_pv_node_cn-heyuan-acdr-1/c80cf3a4f9d6c496781591bd17d006c6f</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The object bindings.</p>
         */
        @NameInMap("objectBindings")
        public java.util.List<ListVisibleKnowledgeBaseContentsResponseBodyItemsObjectBindings> objectBindings;

        /**
         * <p>The number of resources in the FAILED state. This field is returned only when listing top-level knowledge base directories.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceFailedCount")
        public Long sourceFailedCount;

        /**
         * <p>The knowledge base affiliation type. Valid values: aliding_kb_doc (DingTalk knowledge base document) and normal (common knowledge).</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("sourceKind")
        public String sourceKind;

        /**
         * <p>The number of resources in the READY state. This field is returned only when listing top-level knowledge base directories.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceReadyCount")
        public Long sourceReadyCount;

        /**
         * <p>The resource status. This field has a value only when itemType is resource.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("sourceStatus")
        public String sourceStatus;

        /**
         * <p>The total number of resources under the directory and its subdirectories. This field is returned only when listing top-level knowledge base directories.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceTotalCount")
        public Long sourceTotalCount;

        /**
         * <p>The source type.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        public static ListVisibleKnowledgeBaseContentsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListVisibleKnowledgeBaseContentsResponseBodyItems self = new ListVisibleKnowledgeBaseContentsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListVisibleKnowledgeBaseContentsResponseBodyItems setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListVisibleKnowledgeBaseContentsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListVisibleKnowledgeBaseContentsResponseBodyItems setDirectoryKind(String directoryKind) {
            this.directoryKind = directoryKind;
            return this;
        }
        public String getDirectoryKind() {
            return this.directoryKind;
        }

        public ListVisibleKnowledgeBaseContentsResponseBodyItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListVisibleKnowledgeBaseContentsResponseBodyItems setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListVisibleKnowledgeBaseContentsResponseBodyItems setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public ListVisibleKnowledgeBaseContentsResponseBodyItems setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public ListVisibleKnowledgeBaseContentsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVisibleKnowledgeBaseContentsResponseBodyItems setObjectBindings(java.util.List<ListVisibleKnowledgeBaseContentsResponseBodyItemsObjectBindings> objectBindings) {
            this.objectBindings = objectBindings;
            return this;
        }
        public java.util.List<ListVisibleKnowledgeBaseContentsResponseBodyItemsObjectBindings> getObjectBindings() {
            return this.objectBindings;
        }

        public ListVisibleKnowledgeBaseContentsResponseBodyItems setSourceFailedCount(Long sourceFailedCount) {
            this.sourceFailedCount = sourceFailedCount;
            return this;
        }
        public Long getSourceFailedCount() {
            return this.sourceFailedCount;
        }

        public ListVisibleKnowledgeBaseContentsResponseBodyItems setSourceKind(String sourceKind) {
            this.sourceKind = sourceKind;
            return this;
        }
        public String getSourceKind() {
            return this.sourceKind;
        }

        public ListVisibleKnowledgeBaseContentsResponseBodyItems setSourceReadyCount(Long sourceReadyCount) {
            this.sourceReadyCount = sourceReadyCount;
            return this;
        }
        public Long getSourceReadyCount() {
            return this.sourceReadyCount;
        }

        public ListVisibleKnowledgeBaseContentsResponseBodyItems setSourceStatus(String sourceStatus) {
            this.sourceStatus = sourceStatus;
            return this;
        }
        public String getSourceStatus() {
            return this.sourceStatus;
        }

        public ListVisibleKnowledgeBaseContentsResponseBodyItems setSourceTotalCount(Long sourceTotalCount) {
            this.sourceTotalCount = sourceTotalCount;
            return this;
        }
        public Long getSourceTotalCount() {
            return this.sourceTotalCount;
        }

        public ListVisibleKnowledgeBaseContentsResponseBodyItems setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
