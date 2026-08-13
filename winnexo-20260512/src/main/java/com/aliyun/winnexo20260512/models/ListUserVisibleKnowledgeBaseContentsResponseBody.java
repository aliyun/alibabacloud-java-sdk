// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListUserVisibleKnowledgeBaseContentsResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("items")
    public java.util.List<ListUserVisibleKnowledgeBaseContentsResponseBodyItems> items;

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
     * <p>命中总数</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListUserVisibleKnowledgeBaseContentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserVisibleKnowledgeBaseContentsResponseBody self = new ListUserVisibleKnowledgeBaseContentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserVisibleKnowledgeBaseContentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUserVisibleKnowledgeBaseContentsResponseBody setItems(java.util.List<ListUserVisibleKnowledgeBaseContentsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListUserVisibleKnowledgeBaseContentsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListUserVisibleKnowledgeBaseContentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUserVisibleKnowledgeBaseContentsResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListUserVisibleKnowledgeBaseContentsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListUserVisibleKnowledgeBaseContentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserVisibleKnowledgeBaseContentsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListUserVisibleKnowledgeBaseContentsResponseBodyItemsShareInfos extends TeaModel {
        /**
         * <p>知识库提交审批单 ID</p>
         * 
         * <strong>example:</strong>
         * <p>submission_example</p>
         */
        @NameInMap("submissionId")
        public String submissionId;

        /**
         * <p>提交人用户 ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("submitterId")
        public Long submitterId;

        /**
         * <p>提交人名称</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("submitterName")
        public String submitterName;

        /**
         * <p>目标目录 ID</p>
         * 
         * <strong>example:</strong>
         * <p>dir_target</p>
         */
        @NameInMap("targetDirectoryId")
        public String targetDirectoryId;

        /**
         * <p>目标目录名称</p>
         * 
         * <strong>example:</strong>
         * <p>共享目录</p>
         */
        @NameInMap("targetDirectoryName")
        public String targetDirectoryName;

        /**
         * <p>目标企业知识库根目录 ID</p>
         * 
         * <strong>example:</strong>
         * <p>dir_kb_root</p>
         */
        @NameInMap("targetKbRootDirectoryId")
        public String targetKbRootDirectoryId;

        /**
         * <p>目标企业知识库名称</p>
         * 
         * <strong>example:</strong>
         * <p>产品知识库</p>
         */
        @NameInMap("targetKbRootDirectoryName")
        public String targetKbRootDirectoryName;

        public static ListUserVisibleKnowledgeBaseContentsResponseBodyItemsShareInfos build(java.util.Map<String, ?> map) throws Exception {
            ListUserVisibleKnowledgeBaseContentsResponseBodyItemsShareInfos self = new ListUserVisibleKnowledgeBaseContentsResponseBodyItemsShareInfos();
            return TeaModel.build(map, self);
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItemsShareInfos setSubmissionId(String submissionId) {
            this.submissionId = submissionId;
            return this;
        }
        public String getSubmissionId() {
            return this.submissionId;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItemsShareInfos setSubmitterId(Long submitterId) {
            this.submitterId = submitterId;
            return this;
        }
        public Long getSubmitterId() {
            return this.submitterId;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItemsShareInfos setSubmitterName(String submitterName) {
            this.submitterName = submitterName;
            return this;
        }
        public String getSubmitterName() {
            return this.submitterName;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItemsShareInfos setTargetDirectoryId(String targetDirectoryId) {
            this.targetDirectoryId = targetDirectoryId;
            return this;
        }
        public String getTargetDirectoryId() {
            return this.targetDirectoryId;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItemsShareInfos setTargetDirectoryName(String targetDirectoryName) {
            this.targetDirectoryName = targetDirectoryName;
            return this;
        }
        public String getTargetDirectoryName() {
            return this.targetDirectoryName;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItemsShareInfos setTargetKbRootDirectoryId(String targetKbRootDirectoryId) {
            this.targetKbRootDirectoryId = targetKbRootDirectoryId;
            return this;
        }
        public String getTargetKbRootDirectoryId() {
            return this.targetKbRootDirectoryId;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItemsShareInfos setTargetKbRootDirectoryName(String targetKbRootDirectoryName) {
            this.targetKbRootDirectoryName = targetKbRootDirectoryName;
            return this;
        }
        public String getTargetKbRootDirectoryName() {
            return this.targetKbRootDirectoryName;
        }

    }

    public static class ListUserVisibleKnowledgeBaseContentsResponseBodyItems extends TeaModel {
        /**
         * <p>创建人名称</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("creatorName")
        public String creatorName;

        /**
         * <p>知识库描述</p>
         * 
         * <strong>example:</strong>
         * <p>产品资料与使用说明</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>目录归属类型</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("directoryKind")
        public String directoryKind;

        /**
         * <p>目录类型</p>
         * 
         * <strong>example:</strong>
         * <p>TENANT</p>
         */
        @NameInMap("directoryType")
        public String directoryType;

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
         * <p>目录 ID 或资源 ID</p>
         * 
         * <strong>example:</strong>
         * <p>source_example</p>
         */
        @NameInMap("itemId")
        public String itemId;

        /**
         * <p>内容类型：directory 或 resource</p>
         * 
         * <strong>example:</strong>
         * <p>resource</p>
         */
        @NameInMap("itemType")
        public String itemType;

        /**
         * <p>资源是否存在待审批的知识库提交记录</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("kbSubmissionPending")
        public Boolean kbSubmissionPending;

        /**
         * <p>更新人名称</p>
         * 
         * <strong>example:</strong>
         * <p>李四</p>
         */
        @NameInMap("modifierName")
        public String modifierName;

        /**
         * <p>目录或资源名称</p>
         * 
         * <strong>example:</strong>
         * <p>产品说明.pdf</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("objectBindings")
        public java.util.List<java.util.Map<String, ?>> objectBindings;

        /**
         * <p>知识库对数字员工的可见模式</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("ooVisibilityMode")
        public String ooVisibilityMode;

        /**
         * <p>是否为只读关联内容</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        @NameInMap("shareInfos")
        public java.util.List<ListUserVisibleKnowledgeBaseContentsResponseBodyItemsShareInfos> shareInfos;

        /**
         * <p>是否已直接共享到企业知识库</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("shared")
        public Boolean shared;

        /**
         * <p>目录 FAILED 资源数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("sourceFailedCount")
        public Long sourceFailedCount;

        /**
         * <p>资源归属类型</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("sourceKind")
        public String sourceKind;

        /**
         * <p>目录 READY 资源数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceReadyCount")
        public Long sourceReadyCount;

        /**
         * <p>资源状态；本接口只返回 READY 资源</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("sourceStatus")
        public String sourceStatus;

        /**
         * <p>目录资源总数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceTotalCount")
        public Long sourceTotalCount;

        /**
         * <p>资源类型，目录项为空</p>
         * 
         * <strong>example:</strong>
         * <p>FILE</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        public static ListUserVisibleKnowledgeBaseContentsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListUserVisibleKnowledgeBaseContentsResponseBodyItems self = new ListUserVisibleKnowledgeBaseContentsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItems setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItems setDirectoryKind(String directoryKind) {
            this.directoryKind = directoryKind;
            return this;
        }
        public String getDirectoryKind() {
            return this.directoryKind;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItems setDirectoryType(String directoryType) {
            this.directoryType = directoryType;
            return this;
        }
        public String getDirectoryType() {
            return this.directoryType;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItems setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItems setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItems setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItems setKbSubmissionPending(Boolean kbSubmissionPending) {
            this.kbSubmissionPending = kbSubmissionPending;
            return this;
        }
        public Boolean getKbSubmissionPending() {
            return this.kbSubmissionPending;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItems setModifierName(String modifierName) {
            this.modifierName = modifierName;
            return this;
        }
        public String getModifierName() {
            return this.modifierName;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItems setObjectBindings(java.util.List<java.util.Map<String, ?>> objectBindings) {
            this.objectBindings = objectBindings;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getObjectBindings() {
            return this.objectBindings;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItems setOoVisibilityMode(String ooVisibilityMode) {
            this.ooVisibilityMode = ooVisibilityMode;
            return this;
        }
        public String getOoVisibilityMode() {
            return this.ooVisibilityMode;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItems setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItems setShareInfos(java.util.List<ListUserVisibleKnowledgeBaseContentsResponseBodyItemsShareInfos> shareInfos) {
            this.shareInfos = shareInfos;
            return this;
        }
        public java.util.List<ListUserVisibleKnowledgeBaseContentsResponseBodyItemsShareInfos> getShareInfos() {
            return this.shareInfos;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItems setShared(Boolean shared) {
            this.shared = shared;
            return this;
        }
        public Boolean getShared() {
            return this.shared;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItems setSourceFailedCount(Long sourceFailedCount) {
            this.sourceFailedCount = sourceFailedCount;
            return this;
        }
        public Long getSourceFailedCount() {
            return this.sourceFailedCount;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItems setSourceKind(String sourceKind) {
            this.sourceKind = sourceKind;
            return this;
        }
        public String getSourceKind() {
            return this.sourceKind;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItems setSourceReadyCount(Long sourceReadyCount) {
            this.sourceReadyCount = sourceReadyCount;
            return this;
        }
        public Long getSourceReadyCount() {
            return this.sourceReadyCount;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItems setSourceStatus(String sourceStatus) {
            this.sourceStatus = sourceStatus;
            return this;
        }
        public String getSourceStatus() {
            return this.sourceStatus;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItems setSourceTotalCount(Long sourceTotalCount) {
            this.sourceTotalCount = sourceTotalCount;
            return this;
        }
        public Long getSourceTotalCount() {
            return this.sourceTotalCount;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBodyItems setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
