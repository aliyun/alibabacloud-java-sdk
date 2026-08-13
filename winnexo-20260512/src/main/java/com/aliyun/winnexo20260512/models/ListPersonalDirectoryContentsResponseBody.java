// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListPersonalDirectoryContentsResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("items")
    public java.util.List<ListPersonalDirectoryContentsResponseBodyItems> items;

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
     * <p>总数（不分页前的命中行数）</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListPersonalDirectoryContentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPersonalDirectoryContentsResponseBody self = new ListPersonalDirectoryContentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPersonalDirectoryContentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPersonalDirectoryContentsResponseBody setItems(java.util.List<ListPersonalDirectoryContentsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListPersonalDirectoryContentsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListPersonalDirectoryContentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPersonalDirectoryContentsResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListPersonalDirectoryContentsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPersonalDirectoryContentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPersonalDirectoryContentsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListPersonalDirectoryContentsResponseBodyItemsObjectBindings extends TeaModel {
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

        public static ListPersonalDirectoryContentsResponseBodyItemsObjectBindings build(java.util.Map<String, ?> map) throws Exception {
            ListPersonalDirectoryContentsResponseBodyItemsObjectBindings self = new ListPersonalDirectoryContentsResponseBodyItemsObjectBindings();
            return TeaModel.build(map, self);
        }

        public ListPersonalDirectoryContentsResponseBodyItemsObjectBindings setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ListPersonalDirectoryContentsResponseBodyItemsObjectBindings setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public ListPersonalDirectoryContentsResponseBodyItemsObjectBindings setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public ListPersonalDirectoryContentsResponseBodyItemsObjectBindings setObjectTypeName(String objectTypeName) {
            this.objectTypeName = objectTypeName;
            return this;
        }
        public String getObjectTypeName() {
            return this.objectTypeName;
        }

    }

    public static class ListPersonalDirectoryContentsResponseBodyItems extends TeaModel {
        /**
         * <p>目录创建者姓名（仅 directoryId=&quot;root&quot; 列表时返回）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("creatorName")
        public String creatorName;

        /**
         * <p>知识库描述（仅 directoryId=&quot;root&quot; 列表时返回）</p>
         * 
         * <strong>example:</strong>
         * <p>示例描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>目录 KB 归属类型（itemType=directory 时有值）：aliding_kb_root / aliding_kb_internal / normal</p>
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
         * <p>唯一标识（目录为 directoryId，资源为 sourceId）</p>
         * 
         * <strong>example:</strong>
         * <p>exampleItemId</p>
         */
        @NameInMap("itemId")
        public String itemId;

        /**
         * <p>类型: directory 或 resource</p>
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
        public java.util.List<ListPersonalDirectoryContentsResponseBodyItemsObjectBindings> objectBindings;

        /**
         * <p>目录下失败资源数（含子目录，仅 directoryId=&quot;root&quot; 列表时返回）</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceFailedCount")
        public Long sourceFailedCount;

        /**
         * <p>Source KB 归属类型（itemType=resource 时有值）：aliding_kb_doc / normal</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("sourceKind")
        public String sourceKind;

        /**
         * <p>目录下成功资源数（含子目录，仅 directoryId=&quot;root&quot; 列表时返回）</p>
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
         * <p>目录下资源总数（含子目录，仅 directoryId=&quot;root&quot; 列表时返回）</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceTotalCount")
        public Long sourceTotalCount;

        /**
         * <p>资源类型（itemType=resource 时有值；产出保存类资源会被反刷为 OUTPUT）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        public static ListPersonalDirectoryContentsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListPersonalDirectoryContentsResponseBodyItems self = new ListPersonalDirectoryContentsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListPersonalDirectoryContentsResponseBodyItems setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListPersonalDirectoryContentsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPersonalDirectoryContentsResponseBodyItems setDirectoryKind(String directoryKind) {
            this.directoryKind = directoryKind;
            return this;
        }
        public String getDirectoryKind() {
            return this.directoryKind;
        }

        public ListPersonalDirectoryContentsResponseBodyItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListPersonalDirectoryContentsResponseBodyItems setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListPersonalDirectoryContentsResponseBodyItems setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public ListPersonalDirectoryContentsResponseBodyItems setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public ListPersonalDirectoryContentsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPersonalDirectoryContentsResponseBodyItems setObjectBindings(java.util.List<ListPersonalDirectoryContentsResponseBodyItemsObjectBindings> objectBindings) {
            this.objectBindings = objectBindings;
            return this;
        }
        public java.util.List<ListPersonalDirectoryContentsResponseBodyItemsObjectBindings> getObjectBindings() {
            return this.objectBindings;
        }

        public ListPersonalDirectoryContentsResponseBodyItems setSourceFailedCount(Long sourceFailedCount) {
            this.sourceFailedCount = sourceFailedCount;
            return this;
        }
        public Long getSourceFailedCount() {
            return this.sourceFailedCount;
        }

        public ListPersonalDirectoryContentsResponseBodyItems setSourceKind(String sourceKind) {
            this.sourceKind = sourceKind;
            return this;
        }
        public String getSourceKind() {
            return this.sourceKind;
        }

        public ListPersonalDirectoryContentsResponseBodyItems setSourceReadyCount(Long sourceReadyCount) {
            this.sourceReadyCount = sourceReadyCount;
            return this;
        }
        public Long getSourceReadyCount() {
            return this.sourceReadyCount;
        }

        public ListPersonalDirectoryContentsResponseBodyItems setSourceStatus(String sourceStatus) {
            this.sourceStatus = sourceStatus;
            return this;
        }
        public String getSourceStatus() {
            return this.sourceStatus;
        }

        public ListPersonalDirectoryContentsResponseBodyItems setSourceTotalCount(Long sourceTotalCount) {
            this.sourceTotalCount = sourceTotalCount;
            return this;
        }
        public Long getSourceTotalCount() {
            return this.sourceTotalCount;
        }

        public ListPersonalDirectoryContentsResponseBodyItems setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
