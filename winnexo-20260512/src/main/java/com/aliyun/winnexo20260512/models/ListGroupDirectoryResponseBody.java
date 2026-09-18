// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListGroupDirectoryResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The immediate subdirectories and resources on the current page. The queried directory itself is not included, and results are not recursively expanded.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("items")
    public java.util.List<ListGroupDirectoryResponseBodyItems> items;

    /**
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
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
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries after filtering and before pagination. This includes both physical content and referenced content that match the filter criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListGroupDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupDirectoryResponseBody self = new ListGroupDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupDirectoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGroupDirectoryResponseBody setItems(java.util.List<ListGroupDirectoryResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListGroupDirectoryResponseBodyItems> getItems() {
        return this.items;
    }

    public ListGroupDirectoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGroupDirectoryResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListGroupDirectoryResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListGroupDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGroupDirectoryResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListGroupDirectoryResponseBodyItemsObjectBindings extends TeaModel {
        /**
         * <p>The name of the knowledge graph to which the binding belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("graphName")
        public String graphName;

        /**
         * <p>The business ID of the object.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>The display name of the object.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("objectName")
        public String objectName;

        /**
         * <p>The object type.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("objectType")
        public String objectType;

        /**
         * <p>The display name of the object type.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("objectTypeName")
        public String objectTypeName;

        public static ListGroupDirectoryResponseBodyItemsObjectBindings build(java.util.Map<String, ?> map) throws Exception {
            ListGroupDirectoryResponseBodyItemsObjectBindings self = new ListGroupDirectoryResponseBodyItemsObjectBindings();
            return TeaModel.build(map, self);
        }

        public ListGroupDirectoryResponseBodyItemsObjectBindings setGraphName(String graphName) {
            this.graphName = graphName;
            return this;
        }
        public String getGraphName() {
            return this.graphName;
        }

        public ListGroupDirectoryResponseBodyItemsObjectBindings setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ListGroupDirectoryResponseBodyItemsObjectBindings setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public ListGroupDirectoryResponseBodyItemsObjectBindings setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public ListGroupDirectoryResponseBodyItemsObjectBindings setObjectTypeName(String objectTypeName) {
            this.objectTypeName = objectTypeName;
            return this;
        }
        public String getObjectTypeName() {
            return this.objectTypeName;
        }

    }

    public static class ListGroupDirectoryResponseBodyItems extends TeaModel {
        /**
         * <p>The name of the directory creator or resource submitter.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("creatorName")
        public String creatorName;

        /**
         * <p>The directory ownership category. This follows the service output, such as normal.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("directoryKind")
        public String directoryKind;

        /**
         * <p>The directory type. Physical directories within the space have a value of GROUP. Reference directories retain their original type.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("directoryType")
        public String directoryType;

        /**
         * <p>The creation timestamp, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>The modification timestamp, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>The directoryId of a directory or the sourceId of a resource.</p>
         * 
         * <strong>example:</strong>
         * <p>source_example</p>
         */
        @NameInMap("itemId")
        public String itemId;

        /**
         * <p>The content type. Valid values: directory (subdirectory) and resource.</p>
         * 
         * <strong>example:</strong>
         * <p>resource</p>
         */
        @NameInMap("itemType")
        public String itemType;

        /**
         * <p>The name of the last modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("modifierName")
        public String modifierName;

        /**
         * <p>The content name.</p>
         * 
         * <strong>example:</strong>
         * <p>Project Resources</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The list of resource object bindings. This may be empty if metadata is missing or for referenced resources.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("objectBindings")
        public java.util.List<ListGroupDirectoryResponseBodyItemsObjectBindings> objectBindings;

        /**
         * <p>Indicates whether the content is a read-only reference. A value of false does not indicate write permissions. Write operations still require creator or space administrator permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        /**
         * <p>The resource ownership category. This follows the service output.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("sourceKind")
        public String sourceKind;

        /**
         * <p>The resource parsing status. This field has a value only for resource items.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("sourceStatus")
        public String sourceStatus;

        /**
         * <p>The resource type. This field has a value only for resource items. The type display rules of the service are used.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        public static ListGroupDirectoryResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListGroupDirectoryResponseBodyItems self = new ListGroupDirectoryResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListGroupDirectoryResponseBodyItems setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListGroupDirectoryResponseBodyItems setDirectoryKind(String directoryKind) {
            this.directoryKind = directoryKind;
            return this;
        }
        public String getDirectoryKind() {
            return this.directoryKind;
        }

        public ListGroupDirectoryResponseBodyItems setDirectoryType(String directoryType) {
            this.directoryType = directoryType;
            return this;
        }
        public String getDirectoryType() {
            return this.directoryType;
        }

        public ListGroupDirectoryResponseBodyItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGroupDirectoryResponseBodyItems setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListGroupDirectoryResponseBodyItems setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public ListGroupDirectoryResponseBodyItems setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public ListGroupDirectoryResponseBodyItems setModifierName(String modifierName) {
            this.modifierName = modifierName;
            return this;
        }
        public String getModifierName() {
            return this.modifierName;
        }

        public ListGroupDirectoryResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGroupDirectoryResponseBodyItems setObjectBindings(java.util.List<ListGroupDirectoryResponseBodyItemsObjectBindings> objectBindings) {
            this.objectBindings = objectBindings;
            return this;
        }
        public java.util.List<ListGroupDirectoryResponseBodyItemsObjectBindings> getObjectBindings() {
            return this.objectBindings;
        }

        public ListGroupDirectoryResponseBodyItems setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public ListGroupDirectoryResponseBodyItems setSourceKind(String sourceKind) {
            this.sourceKind = sourceKind;
            return this;
        }
        public String getSourceKind() {
            return this.sourceKind;
        }

        public ListGroupDirectoryResponseBodyItems setSourceStatus(String sourceStatus) {
            this.sourceStatus = sourceStatus;
            return this;
        }
        public String getSourceStatus() {
            return this.sourceStatus;
        }

        public ListGroupDirectoryResponseBodyItems setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
