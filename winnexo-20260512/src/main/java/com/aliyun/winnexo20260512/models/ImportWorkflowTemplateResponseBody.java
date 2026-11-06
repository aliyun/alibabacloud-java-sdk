// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ImportWorkflowTemplateResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The user ID of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("createdByUserId")
    public Long createdByUserId;

    /**
     * <p>The template description.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard process for handling customer complaints</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>节点依赖边；每项包含from/to，引用稳定stepId；显式空数组表示没有依赖</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;from&quot;:&quot;collect&quot;,&quot;to&quot;:&quot;deliver&quot;}]</p>
     */
    @NameInMap("edges")
    public java.util.List<java.util.Map<String, ?>> edges;

    /**
     * <p>The current effective version number of the template. An empty value indicates that only a draft exists and it cannot be used for work items. For imported templates, a v1 draft is created and this field is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("effectiveVersion")
    public String effectiveVersion;

    /**
     * <p>The creation time in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-05T08:00:00Z</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The modification time in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-05T08:00:00Z</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>可选画布布局，按stepId索引；只影响展示，不决定依赖</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;collect&quot;:{&quot;x&quot;:0,&quot;y&quot;:0},&quot;review&quot;:{&quot;x&quot;:240,&quot;y&quot;:0}}</p>
     */
    @NameInMap("layout")
    public java.util.Map<String, ?> layout;

    /**
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>Customer Complaint Handling Process</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>模板结构版本，当前为2，与业务版本vN独立</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("schemaVersion")
    public Long schemaVersion;

    /**
     * <p>The ordered steps.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;stepId\&quot;:\&quot;collect\&quot;,\&quot;sortOrder\&quot;:1,\&quot;name\&quot;:\&quot;收集客户信息\&quot;}]</p>
     */
    @NameInMap("steps")
    public java.util.List<ImportWorkflowTemplateResponseBodySteps> steps;

    /**
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>tpl_9401</p>
     */
    @NameInMap("templateId")
    public String templateId;

    /**
     * <p>The version number generated for this import.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>The version status. Valid values:</p>
     * <ul>
     * <li>DRAFT: draft.</li>
     * <li>SUBMITTED: submitted.
     * The value is fixed to DRAFT for imported templates.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DRAFT</p>
     */
    @NameInMap("versionStatus")
    public String versionStatus;

    public static ImportWorkflowTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportWorkflowTemplateResponseBody self = new ImportWorkflowTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportWorkflowTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImportWorkflowTemplateResponseBody setCreatedByUserId(Long createdByUserId) {
        this.createdByUserId = createdByUserId;
        return this;
    }
    public Long getCreatedByUserId() {
        return this.createdByUserId;
    }

    public ImportWorkflowTemplateResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ImportWorkflowTemplateResponseBody setEdges(java.util.List<java.util.Map<String, ?>> edges) {
        this.edges = edges;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getEdges() {
        return this.edges;
    }

    public ImportWorkflowTemplateResponseBody setEffectiveVersion(String effectiveVersion) {
        this.effectiveVersion = effectiveVersion;
        return this;
    }
    public String getEffectiveVersion() {
        return this.effectiveVersion;
    }

    public ImportWorkflowTemplateResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ImportWorkflowTemplateResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ImportWorkflowTemplateResponseBody setLayout(java.util.Map<String, ?> layout) {
        this.layout = layout;
        return this;
    }
    public java.util.Map<String, ?> getLayout() {
        return this.layout;
    }

    public ImportWorkflowTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportWorkflowTemplateResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ImportWorkflowTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportWorkflowTemplateResponseBody setSchemaVersion(Long schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public Long getSchemaVersion() {
        return this.schemaVersion;
    }

    public ImportWorkflowTemplateResponseBody setSteps(java.util.List<ImportWorkflowTemplateResponseBodySteps> steps) {
        this.steps = steps;
        return this;
    }
    public java.util.List<ImportWorkflowTemplateResponseBodySteps> getSteps() {
        return this.steps;
    }

    public ImportWorkflowTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ImportWorkflowTemplateResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ImportWorkflowTemplateResponseBody setVersionStatus(String versionStatus) {
        this.versionStatus = versionStatus;
        return this;
    }
    public String getVersionStatus() {
        return this.versionStatus;
    }

    public static class ImportWorkflowTemplateResponseBodySteps extends TeaModel {
        /**
         * <p>The model tier.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("modelMode")
        public String modelMode;

        /**
         * <p>The step name.</p>
         * 
         * <strong>example:</strong>
         * <p>Customer Complaint Handling Process</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The name of the digital employee executor.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("ownerAgentName")
        public String ownerAgentName;

        /**
         * <p>The executor type. Valid values:</p>
         * <ul>
         * <li>MEMBER: workspace member.</li>
         * <li>AGENT: digital employee.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MEMBER</p>
         */
        @NameInMap("ownerType")
        public String ownerType;

        /**
         * <p>The user ID of the employee executor.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ownerUserId")
        public Long ownerUserId;

        /**
         * <p>是否人工审核产出物，默认关闭；仅数字员工可开启，审核待办自动发负责人</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("reviewOutput")
        public Boolean reviewOutput;

        /**
         * <p>The list of user IDs of the persons in charge. This field is valid only for steps with a digital employee executor and is always empty for steps with a member executor.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("reviewerUserIds")
        public java.util.List<Long> reviewerUserIds;

        /**
         * <p>The step order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sortOrder")
        public Long sortOrder;

        /**
         * <p>The step processing instructions.</p>
         * 
         * <strong>example:</strong>
         * <p>Collect customer information and submit it to the person in charge for review</p>
         */
        @NameInMap("specification")
        public String specification;

        /**
         * <p>The ordered array of fragments, which supports text, mention, skill, app, files, and web_search. The referenced identities and order are retained.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;type\&quot;:\&quot;text\&quot;,\&quot;text\&quot;:\&quot;收集客户信息\&quot;}]</p>
         */
        @NameInMap("specificationJson")
        public java.util.List<java.util.Map<String, ?>> specificationJson;

        /**
         * <p>The step ID.</p>
         * 
         * <strong>example:</strong>
         * <p>collect</p>
         */
        @NameInMap("stepId")
        public String stepId;

        public static ImportWorkflowTemplateResponseBodySteps build(java.util.Map<String, ?> map) throws Exception {
            ImportWorkflowTemplateResponseBodySteps self = new ImportWorkflowTemplateResponseBodySteps();
            return TeaModel.build(map, self);
        }

        public ImportWorkflowTemplateResponseBodySteps setModelMode(String modelMode) {
            this.modelMode = modelMode;
            return this;
        }
        public String getModelMode() {
            return this.modelMode;
        }

        public ImportWorkflowTemplateResponseBodySteps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ImportWorkflowTemplateResponseBodySteps setOwnerAgentName(String ownerAgentName) {
            this.ownerAgentName = ownerAgentName;
            return this;
        }
        public String getOwnerAgentName() {
            return this.ownerAgentName;
        }

        public ImportWorkflowTemplateResponseBodySteps setOwnerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }
        public String getOwnerType() {
            return this.ownerType;
        }

        public ImportWorkflowTemplateResponseBodySteps setOwnerUserId(Long ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public Long getOwnerUserId() {
            return this.ownerUserId;
        }

        public ImportWorkflowTemplateResponseBodySteps setReviewOutput(Boolean reviewOutput) {
            this.reviewOutput = reviewOutput;
            return this;
        }
        public Boolean getReviewOutput() {
            return this.reviewOutput;
        }

        public ImportWorkflowTemplateResponseBodySteps setReviewerUserIds(java.util.List<Long> reviewerUserIds) {
            this.reviewerUserIds = reviewerUserIds;
            return this;
        }
        public java.util.List<Long> getReviewerUserIds() {
            return this.reviewerUserIds;
        }

        public ImportWorkflowTemplateResponseBodySteps setSortOrder(Long sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        public Long getSortOrder() {
            return this.sortOrder;
        }

        public ImportWorkflowTemplateResponseBodySteps setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public ImportWorkflowTemplateResponseBodySteps setSpecificationJson(java.util.List<java.util.Map<String, ?>> specificationJson) {
            this.specificationJson = specificationJson;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getSpecificationJson() {
            return this.specificationJson;
        }

        public ImportWorkflowTemplateResponseBodySteps setStepId(String stepId) {
            this.stepId = stepId;
            return this;
        }
        public String getStepId() {
            return this.stepId;
        }

    }

}
