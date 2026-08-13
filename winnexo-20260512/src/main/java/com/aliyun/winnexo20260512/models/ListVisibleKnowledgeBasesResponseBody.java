// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListVisibleKnowledgeBasesResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("items")
    public java.util.List<ListVisibleKnowledgeBasesResponseBodyItems> items;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>返回条数（不分页，等于 len(items)）</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListVisibleKnowledgeBasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVisibleKnowledgeBasesResponseBody self = new ListVisibleKnowledgeBasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVisibleKnowledgeBasesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVisibleKnowledgeBasesResponseBody setItems(java.util.List<ListVisibleKnowledgeBasesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListVisibleKnowledgeBasesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListVisibleKnowledgeBasesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVisibleKnowledgeBasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVisibleKnowledgeBasesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListVisibleKnowledgeBasesResponseBodyItems extends TeaModel {
        /**
         * <p>目录创建者姓名（来自 rbj_user_tenant_mapping.user_display_name）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("creatorName")
        public String creatorName;

        /**
         * <p>目录描述</p>
         * 
         * <strong>example:</strong>
         * <p>示例描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>目录唯一标识（租户内唯一）</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDirectoryId</p>
         */
        @NameInMap("directoryId")
        public String directoryId;

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
         * <p>文件名</p>
         * 
         * <strong>example:</strong>
         * <p>示例名称.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>文件 OSS URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/oss/file.pdf">https://example.com/oss/file.pdf</a></p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>目录及子目录下状态为 FAILED 的资源数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceFailedCount")
        public Long sourceFailedCount;

        /**
         * <p>目录及子目录下状态为 READY 的资源数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceReadyCount")
        public Long sourceReadyCount;

        /**
         * <p>目录及子目录下的资源总数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceTotalCount")
        public Long sourceTotalCount;

        public static ListVisibleKnowledgeBasesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListVisibleKnowledgeBasesResponseBodyItems self = new ListVisibleKnowledgeBasesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListVisibleKnowledgeBasesResponseBodyItems setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListVisibleKnowledgeBasesResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListVisibleKnowledgeBasesResponseBodyItems setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public ListVisibleKnowledgeBasesResponseBodyItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListVisibleKnowledgeBasesResponseBodyItems setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListVisibleKnowledgeBasesResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVisibleKnowledgeBasesResponseBodyItems setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListVisibleKnowledgeBasesResponseBodyItems setSourceFailedCount(Long sourceFailedCount) {
            this.sourceFailedCount = sourceFailedCount;
            return this;
        }
        public Long getSourceFailedCount() {
            return this.sourceFailedCount;
        }

        public ListVisibleKnowledgeBasesResponseBodyItems setSourceReadyCount(Long sourceReadyCount) {
            this.sourceReadyCount = sourceReadyCount;
            return this;
        }
        public Long getSourceReadyCount() {
            return this.sourceReadyCount;
        }

        public ListVisibleKnowledgeBasesResponseBodyItems setSourceTotalCount(Long sourceTotalCount) {
            this.sourceTotalCount = sourceTotalCount;
            return this;
        }
        public Long getSourceTotalCount() {
            return this.sourceTotalCount;
        }

    }

}
