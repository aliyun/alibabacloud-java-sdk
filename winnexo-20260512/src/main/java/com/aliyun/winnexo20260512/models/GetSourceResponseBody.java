// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetSourceResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The completion time, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-01T12:00:00Z</p>
     */
    @NameInMap("completionTime")
    public String completionTime;

    /**
     * <p>The description of the to-do card type.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The last modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>Indicates whether notes exist.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasNotes")
    public Boolean hasNotes;

    /**
     * <p>Indicates whether settings configuration exists.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasSettings")
    public Boolean hasSettings;

    /**
     * <p>Indicates whether structured tables exist.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasStructuredTables")
    public Boolean hasStructuredTables;

    /**
     * <p>Indicates whether unstructured documents exist.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasUnstructuredDocs")
    public Boolean hasUnstructuredDocs;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleName.pdf</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The meeting notes content (optional), which participates in auxiliary analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("notes")
    public String notes;

    /**
     * <p>The object bindings.</p>
     */
    @NameInMap("objectBindings")
    public java.util.List<GetSourceResponseBodyObjectBindings> objectBindings;

    /**
     * <p>The associated variable ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleObjectId</p>
     */
    @NameInMap("objectId")
    public String objectId;

    /**
     * <p>The object type, such as customer. This field has a value when type is set to mention.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("objectType")
    public String objectType;

    /**
     * <p>The digital employee name (operating object name, optional).</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The task scope.</p>
     * 
     * <strong>example:</strong>
     * <p>PERSONAL</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>The user profile card settings.</p>
     */
    @NameInMap("settings")
    public java.util.Map<String, ?> settings;

    /**
     * <p>The skill output ID (carried when the output is saved as a resource).</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSkillOutputId</p>
     */
    @NameInMap("skillOutputId")
    public String skillOutputId;

    /**
     * <p>The data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceId</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The knowledge base affiliation type. Valid values:</p>
     * <ul>
     * <li>aliding_kb_doc: DingTalk knowledge base document.</li>
     * <li>normal: common knowledge.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("sourceKind")
    public String sourceKind;

    /**
     * <p>The resource tags (optional, a JSON string list such as [&quot;tagA&quot;,&quot;tagB&quot;]).</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("sourceTags")
    public String sourceTags;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>The final status of the message.</p>
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

    /**
     * <p>The unstructured documents.</p>
     */
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
         * <p>The semantic graph name to which the object belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("graphName")
        public String graphName;

        /**
         * <p>The ID of the recommended item, which can be a <strong>feedId</strong> or a micro-application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>The object type, such as customer. This field has a value when type is set to mention.</p>
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
         * <p>The completion time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-01T12:00:00Z</p>
         */
        @NameInMap("completionTime")
        public String completionTime;

        /**
         * <p>The file name, including the file name extension.</p>
         * 
         * <strong>example:</strong>
         * <p>example.pdf</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <p>The file record ID (optional, corresponding to settings.file_record_id).</p>
         * 
         * <strong>example:</strong>
         * <p>exampleFileRecordId</p>
         */
        @NameInMap("fileRecordId")
        public String fileRecordId;

        /**
         * <p>The file type. Valid values:</p>
         * <ul>
         * <li><strong>file</strong>: file.</li>
         * <li><strong>folder</strong>: folder.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        @NameInMap("fileType")
        public String fileType;

        /**
         * <p>The session analysis result in OSS URL format. The URL expires in one hour.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
         */
        @NameInMap("ossUrl")
        public String ossUrl;

        /**
         * <p>The DocumentAgent semantic ID.</p>
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
