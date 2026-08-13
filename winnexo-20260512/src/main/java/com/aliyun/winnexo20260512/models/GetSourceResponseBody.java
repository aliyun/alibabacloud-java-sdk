// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetSourceResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>DocumentAgent 解析完成时间，ISO8601 格式</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-01T12:00:00Z</p>
     */
    @NameInMap("completionTime")
    public String completionTime;

    /**
     * <p>数据源描述</p>
     * 
     * <strong>example:</strong>
     * <p>示例描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>创建时间，ISO8601 格式</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>修改时间，ISO8601 格式</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>是否存在备注</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasNotes")
    public Boolean hasNotes;

    /**
     * <p>是否存在 settings 配置</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasSettings")
    public Boolean hasSettings;

    /**
     * <p>是否存在结构化表</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasStructuredTables")
    public Boolean hasStructuredTables;

    /**
     * <p>是否存在非结构化文档</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasUnstructuredDocs")
    public Boolean hasUnstructuredDocs;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>文件名</p>
     * 
     * <strong>example:</strong>
     * <p>示例名称.pdf</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>备注（仅 includeDetails=True）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("notes")
    public String notes;

    @NameInMap("objectBindings")
    public java.util.List<GetSourceResponseBodyObjectBindings> objectBindings;

    /**
     * <p>主对象 ID（兼容字段）</p>
     * 
     * <strong>example:</strong>
     * <p>exampleObjectId</p>
     */
    @NameInMap("objectId")
    public String objectId;

    /**
     * <p>主对象类型（兼容字段）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("objectType")
    public String objectType;

    /**
     * <p>运营对象名称</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>可见范围：PERSONAL / TENANT</p>
     * 
     * <strong>example:</strong>
     * <p>PERSONAL</p>
     */
    @NameInMap("scope")
    public String scope;

    @NameInMap("settings")
    public java.util.Map<String, ?> settings;

    /**
     * <p>技能产出 ID（由产出保存为资源时携带）</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSkillOutputId</p>
     */
    @NameInMap("skillOutputId")
    public String skillOutputId;

    /**
     * <p>数据源 ID</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceId</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>数据源归属类型：normal / aliding_kb_doc</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("sourceKind")
    public String sourceKind;

    /**
     * <p>资源标签 JSON 字符串</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("sourceTags")
    public String sourceTags;

    /**
     * <p>数据源类型</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>数据源状态</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>structuredTables</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("structuredTables")
    public java.util.List<String> structuredTables;

    @NameInMap("unstructuredDocs")
    public java.util.List<GetSourceResponseBodyUnstructuredDocs> unstructuredDocs;

    public static GetSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSourceResponseBody self = new GetSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSourceResponseBody setCompletionTime(String completionTime) {
        this.completionTime = completionTime;
        return this;
    }
    public String getCompletionTime() {
        return this.completionTime;
    }

    public GetSourceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetSourceResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetSourceResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetSourceResponseBody setHasNotes(Boolean hasNotes) {
        this.hasNotes = hasNotes;
        return this;
    }
    public Boolean getHasNotes() {
        return this.hasNotes;
    }

    public GetSourceResponseBody setHasSettings(Boolean hasSettings) {
        this.hasSettings = hasSettings;
        return this;
    }
    public Boolean getHasSettings() {
        return this.hasSettings;
    }

    public GetSourceResponseBody setHasStructuredTables(Boolean hasStructuredTables) {
        this.hasStructuredTables = hasStructuredTables;
        return this;
    }
    public Boolean getHasStructuredTables() {
        return this.hasStructuredTables;
    }

    public GetSourceResponseBody setHasUnstructuredDocs(Boolean hasUnstructuredDocs) {
        this.hasUnstructuredDocs = hasUnstructuredDocs;
        return this;
    }
    public Boolean getHasUnstructuredDocs() {
        return this.hasUnstructuredDocs;
    }

    public GetSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSourceResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetSourceResponseBody setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public GetSourceResponseBody setObjectBindings(java.util.List<GetSourceResponseBodyObjectBindings> objectBindings) {
        this.objectBindings = objectBindings;
        return this;
    }
    public java.util.List<GetSourceResponseBodyObjectBindings> getObjectBindings() {
        return this.objectBindings;
    }

    public GetSourceResponseBody setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public GetSourceResponseBody setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public GetSourceResponseBody setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public GetSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSourceResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public GetSourceResponseBody setSettings(java.util.Map<String, ?> settings) {
        this.settings = settings;
        return this;
    }
    public java.util.Map<String, ?> getSettings() {
        return this.settings;
    }

    public GetSourceResponseBody setSkillOutputId(String skillOutputId) {
        this.skillOutputId = skillOutputId;
        return this;
    }
    public String getSkillOutputId() {
        return this.skillOutputId;
    }

    public GetSourceResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public GetSourceResponseBody setSourceKind(String sourceKind) {
        this.sourceKind = sourceKind;
        return this;
    }
    public String getSourceKind() {
        return this.sourceKind;
    }

    public GetSourceResponseBody setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public GetSourceResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public GetSourceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetSourceResponseBody setStructuredTables(java.util.List<String> structuredTables) {
        this.structuredTables = structuredTables;
        return this;
    }
    public java.util.List<String> getStructuredTables() {
        return this.structuredTables;
    }

    public GetSourceResponseBody setUnstructuredDocs(java.util.List<GetSourceResponseBodyUnstructuredDocs> unstructuredDocs) {
        this.unstructuredDocs = unstructuredDocs;
        return this;
    }
    public java.util.List<GetSourceResponseBodyUnstructuredDocs> getUnstructuredDocs() {
        return this.unstructuredDocs;
    }

    public static class GetSourceResponseBodyObjectBindings extends TeaModel {
        /**
         * <p>对象归属的语义图谱名</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("graphName")
        public String graphName;

        /**
         * <p>对象 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>对象类型</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("objectType")
        public String objectType;

        public static GetSourceResponseBodyObjectBindings build(java.util.Map<String, ?> map) throws Exception {
            GetSourceResponseBodyObjectBindings self = new GetSourceResponseBodyObjectBindings();
            return TeaModel.build(map, self);
        }

        public GetSourceResponseBodyObjectBindings setGraphName(String graphName) {
            this.graphName = graphName;
            return this;
        }
        public String getGraphName() {
            return this.graphName;
        }

        public GetSourceResponseBodyObjectBindings setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public GetSourceResponseBodyObjectBindings setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

    public static class GetSourceResponseBodyUnstructuredDocs extends TeaModel {
        /**
         * <p>DocumentAgent 解析完成时间，ISO8601 格式</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-01T12:00:00Z</p>
         */
        @NameInMap("completionTime")
        public String completionTime;

        /**
         * <p>文件名</p>
         * 
         * <strong>example:</strong>
         * <p>example.pdf</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <p>文件记录 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleFileRecordId</p>
         */
        @NameInMap("fileRecordId")
        public String fileRecordId;

        /**
         * <p>文件类型</p>
         * 
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        @NameInMap("fileType")
        public String fileType;

        /**
         * <p>OSS 远程 URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
         */
        @NameInMap("ossUrl")
        public String ossUrl;

        /**
         * <p>DocumentAgent 语义 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSemanticsId</p>
         */
        @NameInMap("semanticsId")
        public String semanticsId;

        public static GetSourceResponseBodyUnstructuredDocs build(java.util.Map<String, ?> map) throws Exception {
            GetSourceResponseBodyUnstructuredDocs self = new GetSourceResponseBodyUnstructuredDocs();
            return TeaModel.build(map, self);
        }

        public GetSourceResponseBodyUnstructuredDocs setCompletionTime(String completionTime) {
            this.completionTime = completionTime;
            return this;
        }
        public String getCompletionTime() {
            return this.completionTime;
        }

        public GetSourceResponseBodyUnstructuredDocs setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetSourceResponseBodyUnstructuredDocs setFileRecordId(String fileRecordId) {
            this.fileRecordId = fileRecordId;
            return this;
        }
        public String getFileRecordId() {
            return this.fileRecordId;
        }

        public GetSourceResponseBodyUnstructuredDocs setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GetSourceResponseBodyUnstructuredDocs setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

        public GetSourceResponseBodyUnstructuredDocs setSemanticsId(String semanticsId) {
            this.semanticsId = semanticsId;
            return this;
        }
        public String getSemanticsId() {
            return this.semanticsId;
        }

    }

}
