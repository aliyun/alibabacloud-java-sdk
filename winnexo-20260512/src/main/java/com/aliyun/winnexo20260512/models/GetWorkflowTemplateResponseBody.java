// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetWorkflowTemplateResponseBody extends TeaModel {
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
     * <p>The description of the template.</p>
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
     * <p>The current effective version number of the template. An empty value indicates that only a draft exists and it cannot be used for work items.</p>
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
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The name of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>Customer complaint handling process</p>
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
    public java.util.List<GetWorkflowTemplateResponseBodySteps> steps;

    /**
     * <p>The ID of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>tpl_9401</p>
     */
    @NameInMap("templateId")
    public String templateId;

    /**
     * <p>The optimistic version number.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>The version description.</p>
     * 
     * <strong>example:</strong>
     * <p>Added a review step</p>
     */
    @NameInMap("versionDescription")
    public String versionDescription;

    /**
     * <p>The version status. Valid values:</p>
     * <ul>
     * <li>DRAFT: Draft.</li>
     * <li>SUBMITTED: Submitted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SUBMITTED</p>
     */
    @NameInMap("versionStatus")
    public String versionStatus;

    public static GetWorkflowTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowTemplateResponseBody self = new GetWorkflowTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkflowTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWorkflowTemplateResponseBody setCreatedByUserId(Long createdByUserId) {
        this.createdByUserId = createdByUserId;
        return this;
    }
    public Long getCreatedByUserId() {
        return this.createdByUserId;
    }

    public GetWorkflowTemplateResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetWorkflowTemplateResponseBody setEdges(java.util.List<java.util.Map<String, ?>> edges) {
        this.edges = edges;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getEdges() {
        return this.edges;
    }

    public GetWorkflowTemplateResponseBody setEffectiveVersion(String effectiveVersion) {
        this.effectiveVersion = effectiveVersion;
        return this;
    }
    public String getEffectiveVersion() {
        return this.effectiveVersion;
    }

    public GetWorkflowTemplateResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetWorkflowTemplateResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetWorkflowTemplateResponseBody setLayout(java.util.Map<String, ?> layout) {
        this.layout = layout;
        return this;
    }
    public java.util.Map<String, ?> getLayout() {
        return this.layout;
    }

    public GetWorkflowTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkflowTemplateResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetWorkflowTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkflowTemplateResponseBody setSchemaVersion(Long schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public Long getSchemaVersion() {
        return this.schemaVersion;
    }

    public GetWorkflowTemplateResponseBody setSteps(java.util.List<GetWorkflowTemplateResponseBodySteps> steps) {
        this.steps = steps;
        return this;
    }
    public java.util.List<GetWorkflowTemplateResponseBodySteps> getSteps() {
        return this.steps;
    }

    public GetWorkflowTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetWorkflowTemplateResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetWorkflowTemplateResponseBody setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }
    public String getVersionDescription() {
        return this.versionDescription;
    }

    public GetWorkflowTemplateResponseBody setVersionStatus(String versionStatus) {
        this.versionStatus = versionStatus;
        return this;
    }
    public String getVersionStatus() {
        return this.versionStatus;
    }

    public static class GetWorkflowTemplateResponseBodySteps extends TeaModel {
        /**
         * <p>The model tier.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("modelMode")
        public String modelMode;

        /**
         * <p>The name of the step.</p>
         * 
         * <strong>example:</strong>
         * <p>Customer complaint handling process</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The name of the agent owner.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("ownerAgentName")
        public String ownerAgentName;

        /**
         * <p>The owner type. Valid values:</p>
         * <ul>
         * <li>MEMBER: Human.</li>
         * <li>AGENT: Agent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MEMBER</p>
         */
        @NameInMap("ownerType")
        public String ownerType;

        /**
         * <p>The user ID of the human owner.</p>
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
         * <p>The list of user IDs of the reviewers.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("reviewerUserIds")
        public java.util.List<Long> reviewerUserIds;

        /**
         * <p>The sort order of the step.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sortOrder")
        public Long sortOrder;

        /**
         * <p>The processing instructions for the step.</p>
         * 
         * <strong>example:</strong>
         * <p>Collect customer information and submit it to the owner for review</p>
         */
        @NameInMap("specification")
        public String specification;

        /**
         * <p>The array of structured segments for the step instructions. Supported types include text, mention, skill, app, files, and web_search. The fields and nested attachments of each segment are preserved exactly as returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;text&quot;,&quot;content&quot;:&quot;整理输入资料&quot;}]</p>
         */
        @NameInMap("specificationJson")
        public java.util.List<java.util.Map<String, ?>> specificationJson;

        /**
         * <p>The ID of the step.</p>
         * 
         * <strong>example:</strong>
         * <p>collect</p>
         */
        @NameInMap("stepId")
        public String stepId;

        public static GetWorkflowTemplateResponseBodySteps build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowTemplateResponseBodySteps self = new GetWorkflowTemplateResponseBodySteps();
            return TeaModel.build(map, self);
        }

        public GetWorkflowTemplateResponseBodySteps setModelMode(String modelMode) {
            this.modelMode = modelMode;
            return this;
        }
        public String getModelMode() {
            return this.modelMode;
        }

        public GetWorkflowTemplateResponseBodySteps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkflowTemplateResponseBodySteps setOwnerAgentName(String ownerAgentName) {
            this.ownerAgentName = ownerAgentName;
            return this;
        }
        public String getOwnerAgentName() {
            return this.ownerAgentName;
        }

        public GetWorkflowTemplateResponseBodySteps setOwnerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }
        public String getOwnerType() {
            return this.ownerType;
        }

        public GetWorkflowTemplateResponseBodySteps setOwnerUserId(Long ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public Long getOwnerUserId() {
            return this.ownerUserId;
        }

        public GetWorkflowTemplateResponseBodySteps setReviewOutput(Boolean reviewOutput) {
            this.reviewOutput = reviewOutput;
            return this;
        }
        public Boolean getReviewOutput() {
            return this.reviewOutput;
        }

        public GetWorkflowTemplateResponseBodySteps setReviewerUserIds(java.util.List<Long> reviewerUserIds) {
            this.reviewerUserIds = reviewerUserIds;
            return this;
        }
        public java.util.List<Long> getReviewerUserIds() {
            return this.reviewerUserIds;
        }

        public GetWorkflowTemplateResponseBodySteps setSortOrder(Long sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        public Long getSortOrder() {
            return this.sortOrder;
        }

        public GetWorkflowTemplateResponseBodySteps setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public GetWorkflowTemplateResponseBodySteps setSpecificationJson(java.util.List<java.util.Map<String, ?>> specificationJson) {
            this.specificationJson = specificationJson;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getSpecificationJson() {
            return this.specificationJson;
        }

        public GetWorkflowTemplateResponseBodySteps setStepId(String stepId) {
            this.stepId = stepId;
            return this;
        }
        public String getStepId() {
            return this.stepId;
        }

    }

}
