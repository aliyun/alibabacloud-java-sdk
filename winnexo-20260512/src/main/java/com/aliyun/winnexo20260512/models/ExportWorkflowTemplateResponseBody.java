// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ExportWorkflowTemplateResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The simplified template definition that can be re-imported.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;name\&quot;:\&quot;客户投诉处理流程\&quot;,\&quot;schemaVersion\&quot;:2}</p>
     */
    @NameInMap("template")
    public ExportWorkflowTemplateResponseBodyTemplate template;

    public static ExportWorkflowTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportWorkflowTemplateResponseBody self = new ExportWorkflowTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportWorkflowTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExportWorkflowTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExportWorkflowTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportWorkflowTemplateResponseBody setTemplate(ExportWorkflowTemplateResponseBodyTemplate template) {
        this.template = template;
        return this;
    }
    public ExportWorkflowTemplateResponseBodyTemplate getTemplate() {
        return this.template;
    }

    public static class ExportWorkflowTemplateResponseBodyTemplateSteps extends TeaModel {
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
         * <p>The user IDs of the reviewers.</p>
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
         * <p>The step handling instructions.</p>
         * 
         * <strong>example:</strong>
         * <p>Collect customer information and submit it to the owner for review</p>
         */
        @NameInMap("specification")
        public String specification;

        /**
         * <p>The ordered array of fragments. Supports text, mention, skill, app, files, and web_search. Preserves referenced identities and order.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;text&quot;,&quot;content&quot;:&quot;整理输入资料&quot;}]</p>
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

        public static ExportWorkflowTemplateResponseBodyTemplateSteps build(java.util.Map<String, ?> map) throws Exception {
            ExportWorkflowTemplateResponseBodyTemplateSteps self = new ExportWorkflowTemplateResponseBodyTemplateSteps();
            return TeaModel.build(map, self);
        }

        public ExportWorkflowTemplateResponseBodyTemplateSteps setModelMode(String modelMode) {
            this.modelMode = modelMode;
            return this;
        }
        public String getModelMode() {
            return this.modelMode;
        }

        public ExportWorkflowTemplateResponseBodyTemplateSteps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExportWorkflowTemplateResponseBodyTemplateSteps setOwnerAgentName(String ownerAgentName) {
            this.ownerAgentName = ownerAgentName;
            return this;
        }
        public String getOwnerAgentName() {
            return this.ownerAgentName;
        }

        public ExportWorkflowTemplateResponseBodyTemplateSteps setOwnerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }
        public String getOwnerType() {
            return this.ownerType;
        }

        public ExportWorkflowTemplateResponseBodyTemplateSteps setOwnerUserId(Long ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public Long getOwnerUserId() {
            return this.ownerUserId;
        }

        public ExportWorkflowTemplateResponseBodyTemplateSteps setReviewOutput(Boolean reviewOutput) {
            this.reviewOutput = reviewOutput;
            return this;
        }
        public Boolean getReviewOutput() {
            return this.reviewOutput;
        }

        public ExportWorkflowTemplateResponseBodyTemplateSteps setReviewerUserIds(java.util.List<Long> reviewerUserIds) {
            this.reviewerUserIds = reviewerUserIds;
            return this;
        }
        public java.util.List<Long> getReviewerUserIds() {
            return this.reviewerUserIds;
        }

        public ExportWorkflowTemplateResponseBodyTemplateSteps setSortOrder(Long sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        public Long getSortOrder() {
            return this.sortOrder;
        }

        public ExportWorkflowTemplateResponseBodyTemplateSteps setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public ExportWorkflowTemplateResponseBodyTemplateSteps setSpecificationJson(java.util.List<java.util.Map<String, ?>> specificationJson) {
            this.specificationJson = specificationJson;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getSpecificationJson() {
            return this.specificationJson;
        }

        public ExportWorkflowTemplateResponseBodyTemplateSteps setStepId(String stepId) {
            this.stepId = stepId;
            return this;
        }
        public String getStepId() {
            return this.stepId;
        }

    }

    public static class ExportWorkflowTemplateResponseBodyTemplate extends TeaModel {
        /**
         * <p>The template description.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard process for handling customer complaints</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>节点依赖边；每项包含from/to，引用稳定stepId</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("edges")
        public java.util.List<java.util.Map<String, ?>> edges;

        /**
         * <p>可选画布布局，按stepId索引；只影响展示，不决定依赖</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;collect&quot;:{&quot;x&quot;:0,&quot;y&quot;:0},&quot;review&quot;:{&quot;x&quot;:240,&quot;y&quot;:0}}</p>
         */
        @NameInMap("layout")
        public java.util.Map<String, ?> layout;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Customer complaint handling process</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>模板结构版本，当前为2，与业务版本vN独立</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("schemaVersion")
        public Long schemaVersion;

        /**
         * <p>The standardized steps.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;stepId\&quot;:\&quot;collect\&quot;,\&quot;sortOrder\&quot;:1,\&quot;name\&quot;:\&quot;收集客户信息\&quot;}]</p>
         */
        @NameInMap("steps")
        public java.util.List<ExportWorkflowTemplateResponseBodyTemplateSteps> steps;

        public static ExportWorkflowTemplateResponseBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            ExportWorkflowTemplateResponseBodyTemplate self = new ExportWorkflowTemplateResponseBodyTemplate();
            return TeaModel.build(map, self);
        }

        public ExportWorkflowTemplateResponseBodyTemplate setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ExportWorkflowTemplateResponseBodyTemplate setEdges(java.util.List<java.util.Map<String, ?>> edges) {
            this.edges = edges;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getEdges() {
            return this.edges;
        }

        public ExportWorkflowTemplateResponseBodyTemplate setLayout(java.util.Map<String, ?> layout) {
            this.layout = layout;
            return this;
        }
        public java.util.Map<String, ?> getLayout() {
            return this.layout;
        }

        public ExportWorkflowTemplateResponseBodyTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExportWorkflowTemplateResponseBodyTemplate setSchemaVersion(Long schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public Long getSchemaVersion() {
            return this.schemaVersion;
        }

        public ExportWorkflowTemplateResponseBodyTemplate setSteps(java.util.List<ExportWorkflowTemplateResponseBodyTemplateSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<ExportWorkflowTemplateResponseBodyTemplateSteps> getSteps() {
            return this.steps;
        }

    }

}
