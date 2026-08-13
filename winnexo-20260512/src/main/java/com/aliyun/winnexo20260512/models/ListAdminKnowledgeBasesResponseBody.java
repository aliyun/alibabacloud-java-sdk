// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAdminKnowledgeBasesResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("items")
    public java.util.List<ListAdminKnowledgeBasesResponseBodyItems> items;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>当前页码</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>每页数量</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>符合条件的总数（应用 keyword/sourceTypes 后，分页前）</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListAdminKnowledgeBasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAdminKnowledgeBasesResponseBody self = new ListAdminKnowledgeBasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAdminKnowledgeBasesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAdminKnowledgeBasesResponseBody setItems(java.util.List<ListAdminKnowledgeBasesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListAdminKnowledgeBasesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListAdminKnowledgeBasesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAdminKnowledgeBasesResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListAdminKnowledgeBasesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAdminKnowledgeBasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAdminKnowledgeBasesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListAdminKnowledgeBasesResponseBodyItemsObjectBindings extends TeaModel {
        /**
         * <p>对象归属的语义图谱名（object_id 在该 graph 下唯一）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("graphName")
        public String graphName;

        /**
         * <p>对象唯一 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>对象显示名（如客户名称），由图谱 schema 解析；缓存缺失时为 null</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("objectName")
        public String objectName;

        /**
         * <p>对象类型（如 customer / opportunity），对应图谱 schema 中的 object_type</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("objectType")
        public String objectType;

        /**
         * <p>对象类型显示名（如&quot;客户&quot;），由图谱 schema 解析；缓存缺失时为 null</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("objectTypeName")
        public String objectTypeName;

        public static ListAdminKnowledgeBasesResponseBodyItemsObjectBindings build(java.util.Map<String, ?> map) throws Exception {
            ListAdminKnowledgeBasesResponseBodyItemsObjectBindings self = new ListAdminKnowledgeBasesResponseBodyItemsObjectBindings();
            return TeaModel.build(map, self);
        }

        public ListAdminKnowledgeBasesResponseBodyItemsObjectBindings setGraphName(String graphName) {
            this.graphName = graphName;
            return this;
        }
        public String getGraphName() {
            return this.graphName;
        }

        public ListAdminKnowledgeBasesResponseBodyItemsObjectBindings setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ListAdminKnowledgeBasesResponseBodyItemsObjectBindings setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public ListAdminKnowledgeBasesResponseBodyItemsObjectBindings setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public ListAdminKnowledgeBasesResponseBodyItemsObjectBindings setObjectTypeName(String objectTypeName) {
            this.objectTypeName = objectTypeName;
            return this;
        }
        public String getObjectTypeName() {
            return this.objectTypeName;
        }

    }

    public static class ListAdminKnowledgeBasesResponseBodyItems extends TeaModel {
        /**
         * <p>目录创建者姓名（仅 KB 顶层目录列表时返回）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("creatorName")
        public String creatorName;

        /**
         * <p>描述（仅 KB 顶层目录列表时返回）</p>
         * 
         * <strong>example:</strong>
         * <p>示例描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>目录归属类型（itemType=directory 时有值）：normal / aliding_kb_root / aliding_kb_internal</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("directoryKind")
        public String directoryKind;

        /**
         * <p>创建时间戳（毫秒）</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>修改时间戳（毫秒）</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>唯一标识（itemType=directory 时为 directory_id；itemType=resource 时为 source_id）</p>
         * 
         * <strong>example:</strong>
         * <p>exampleItemId</p>
         */
        @NameInMap("itemId")
        public String itemId;

        /**
         * <p>类型：directory / resource</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("itemType")
        public String itemType;

        /**
         * <p>文件名</p>
         * 
         * <strong>example:</strong>
         * <p>示例名称.pdf</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("objectBindings")
        public java.util.List<ListAdminKnowledgeBasesResponseBodyItemsObjectBindings> objectBindings;

        /**
         * <p>状态为 FAILED 的资源数（仅 KB 顶层目录列表时返回）</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceFailedCount")
        public Long sourceFailedCount;

        /**
         * <p>资源归属类型（itemType=resource 时有值）：aliding_kb_doc / normal</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("sourceKind")
        public String sourceKind;

        /**
         * <p>状态为 READY 的资源数（仅 KB 顶层目录列表时返回）</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceReadyCount")
        public Long sourceReadyCount;

        /**
         * <p>资源状态（itemType=resource 时有值）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("sourceStatus")
        public String sourceStatus;

        /**
         * <p>目录及子目录下资源总数（仅 KB 顶层目录列表时返回）</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceTotalCount")
        public Long sourceTotalCount;

        /**
         * <p>资源类型（itemType=resource 时有值）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        public static ListAdminKnowledgeBasesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListAdminKnowledgeBasesResponseBodyItems self = new ListAdminKnowledgeBasesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListAdminKnowledgeBasesResponseBodyItems setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListAdminKnowledgeBasesResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAdminKnowledgeBasesResponseBodyItems setDirectoryKind(String directoryKind) {
            this.directoryKind = directoryKind;
            return this;
        }
        public String getDirectoryKind() {
            return this.directoryKind;
        }

        public ListAdminKnowledgeBasesResponseBodyItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAdminKnowledgeBasesResponseBodyItems setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListAdminKnowledgeBasesResponseBodyItems setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public ListAdminKnowledgeBasesResponseBodyItems setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public ListAdminKnowledgeBasesResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAdminKnowledgeBasesResponseBodyItems setObjectBindings(java.util.List<ListAdminKnowledgeBasesResponseBodyItemsObjectBindings> objectBindings) {
            this.objectBindings = objectBindings;
            return this;
        }
        public java.util.List<ListAdminKnowledgeBasesResponseBodyItemsObjectBindings> getObjectBindings() {
            return this.objectBindings;
        }

        public ListAdminKnowledgeBasesResponseBodyItems setSourceFailedCount(Long sourceFailedCount) {
            this.sourceFailedCount = sourceFailedCount;
            return this;
        }
        public Long getSourceFailedCount() {
            return this.sourceFailedCount;
        }

        public ListAdminKnowledgeBasesResponseBodyItems setSourceKind(String sourceKind) {
            this.sourceKind = sourceKind;
            return this;
        }
        public String getSourceKind() {
            return this.sourceKind;
        }

        public ListAdminKnowledgeBasesResponseBodyItems setSourceReadyCount(Long sourceReadyCount) {
            this.sourceReadyCount = sourceReadyCount;
            return this;
        }
        public Long getSourceReadyCount() {
            return this.sourceReadyCount;
        }

        public ListAdminKnowledgeBasesResponseBodyItems setSourceStatus(String sourceStatus) {
            this.sourceStatus = sourceStatus;
            return this;
        }
        public String getSourceStatus() {
            return this.sourceStatus;
        }

        public ListAdminKnowledgeBasesResponseBodyItems setSourceTotalCount(Long sourceTotalCount) {
            this.sourceTotalCount = sourceTotalCount;
            return this;
        }
        public Long getSourceTotalCount() {
            return this.sourceTotalCount;
        }

        public ListAdminKnowledgeBasesResponseBodyItems setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
