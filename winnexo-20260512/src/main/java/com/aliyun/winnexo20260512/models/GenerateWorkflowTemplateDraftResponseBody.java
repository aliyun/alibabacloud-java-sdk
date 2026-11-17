// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GenerateWorkflowTemplateDraftResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The generated non-persistent template draft.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;schemaVersion\&quot;:2,\&quot;steps\&quot;:[]}</p>
     */
    @NameInMap("draft")
    public GenerateWorkflowTemplateDraftResponseBodyDraft draft;

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

    public static GenerateWorkflowTemplateDraftResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateWorkflowTemplateDraftResponseBody self = new GenerateWorkflowTemplateDraftResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateWorkflowTemplateDraftResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateWorkflowTemplateDraftResponseBody setDraft(GenerateWorkflowTemplateDraftResponseBodyDraft draft) {
        this.draft = draft;
        return this;
    }
    public GenerateWorkflowTemplateDraftResponseBodyDraft getDraft() {
        return this.draft;
    }

    public GenerateWorkflowTemplateDraftResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateWorkflowTemplateDraftResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateWorkflowTemplateDraftResponseBodyDraftSteps extends TeaModel {
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
         * <p>The type of the owner. Valid values:</p>
         * <ul>
         * <li>MEMBER: Human user.</li>
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
         * <p>Specifies whether to manually review the output. Default value: false. This feature can only be enabled for digital workers. When enabled, review tasks are automatically sent to the owner.</p>
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
         * <p>The ordered array of fragments. Supported types include text, mention, skill, app, files, and web_search. This field preserves the referenced identities and the order.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;text&quot;,&quot;text&quot;:&quot;Collect customer information&quot;}]</p>
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

        public static GenerateWorkflowTemplateDraftResponseBodyDraftSteps build(java.util.Map<String, ?> map) throws Exception {
            GenerateWorkflowTemplateDraftResponseBodyDraftSteps self = new GenerateWorkflowTemplateDraftResponseBodyDraftSteps();
            return TeaModel.build(map, self);
        }

        public GenerateWorkflowTemplateDraftResponseBodyDraftSteps setModelMode(String modelMode) {
            this.modelMode = modelMode;
            return this;
        }
        public String getModelMode() {
            return this.modelMode;
        }

        public GenerateWorkflowTemplateDraftResponseBodyDraftSteps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GenerateWorkflowTemplateDraftResponseBodyDraftSteps setOwnerAgentName(String ownerAgentName) {
            this.ownerAgentName = ownerAgentName;
            return this;
        }
        public String getOwnerAgentName() {
            return this.ownerAgentName;
        }

        public GenerateWorkflowTemplateDraftResponseBodyDraftSteps setOwnerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }
        public String getOwnerType() {
            return this.ownerType;
        }

        public GenerateWorkflowTemplateDraftResponseBodyDraftSteps setOwnerUserId(Long ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public Long getOwnerUserId() {
            return this.ownerUserId;
        }

        public GenerateWorkflowTemplateDraftResponseBodyDraftSteps setReviewOutput(Boolean reviewOutput) {
            this.reviewOutput = reviewOutput;
            return this;
        }
        public Boolean getReviewOutput() {
            return this.reviewOutput;
        }

        public GenerateWorkflowTemplateDraftResponseBodyDraftSteps setReviewerUserIds(java.util.List<Long> reviewerUserIds) {
            this.reviewerUserIds = reviewerUserIds;
            return this;
        }
        public java.util.List<Long> getReviewerUserIds() {
            return this.reviewerUserIds;
        }

        public GenerateWorkflowTemplateDraftResponseBodyDraftSteps setSortOrder(Long sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        public Long getSortOrder() {
            return this.sortOrder;
        }

        public GenerateWorkflowTemplateDraftResponseBodyDraftSteps setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public GenerateWorkflowTemplateDraftResponseBodyDraftSteps setSpecificationJson(java.util.List<java.util.Map<String, ?>> specificationJson) {
            this.specificationJson = specificationJson;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getSpecificationJson() {
            return this.specificationJson;
        }

        public GenerateWorkflowTemplateDraftResponseBodyDraftSteps setStepId(String stepId) {
            this.stepId = stepId;
            return this;
        }
        public String getStepId() {
            return this.stepId;
        }

    }

    public static class GenerateWorkflowTemplateDraftResponseBodyDraft extends TeaModel {
        /**
         * <p>The description of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard process for handling customer complaints</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The node dependency edges. Each item contains a from field and a to field, which reference stable step IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("edges")
        public java.util.List<java.util.Map<String, ?>> edges;

        /**
         * <p>The optional canvas layout, indexed by step ID. This field only affects the display and does not determine dependencies.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;collect&quot;:{&quot;x&quot;:0,&quot;y&quot;:0},&quot;review&quot;:{&quot;x&quot;:240,&quot;y&quot;:0}}</p>
         */
        @NameInMap("layout")
        public java.util.Map<String, ?> layout;

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Customer complaint handling process</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The schema version of the template. The current value is 2, which is independent of the business version vN.</p>
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
         * <p>[{&quot;stepId&quot;:&quot;collect&quot;,&quot;sortOrder&quot;:1,&quot;name&quot;:&quot;Collect customer information&quot;}]</p>
         */
        @NameInMap("steps")
        public java.util.List<GenerateWorkflowTemplateDraftResponseBodyDraftSteps> steps;

        public static GenerateWorkflowTemplateDraftResponseBodyDraft build(java.util.Map<String, ?> map) throws Exception {
            GenerateWorkflowTemplateDraftResponseBodyDraft self = new GenerateWorkflowTemplateDraftResponseBodyDraft();
            return TeaModel.build(map, self);
        }

        public GenerateWorkflowTemplateDraftResponseBodyDraft setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GenerateWorkflowTemplateDraftResponseBodyDraft setEdges(java.util.List<java.util.Map<String, ?>> edges) {
            this.edges = edges;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getEdges() {
            return this.edges;
        }

        public GenerateWorkflowTemplateDraftResponseBodyDraft setLayout(java.util.Map<String, ?> layout) {
            this.layout = layout;
            return this;
        }
        public java.util.Map<String, ?> getLayout() {
            return this.layout;
        }

        public GenerateWorkflowTemplateDraftResponseBodyDraft setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GenerateWorkflowTemplateDraftResponseBodyDraft setSchemaVersion(Long schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public Long getSchemaVersion() {
            return this.schemaVersion;
        }

        public GenerateWorkflowTemplateDraftResponseBodyDraft setSteps(java.util.List<GenerateWorkflowTemplateDraftResponseBodyDraftSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<GenerateWorkflowTemplateDraftResponseBodyDraftSteps> getSteps() {
            return this.steps;
        }

    }

}
