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
     * <p>example</p>
     */
    @NameInMap("draft")
    public GenerateWorkflowTemplateDraftResponseBodyDraft draft;

    /**
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request tracking ID.</p>
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
         * <p>example</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The name of the responsible agent.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("ownerAgentName")
        public String ownerAgentName;

        /**
         * <p>The type of the owner. Valid values: MEMBER: Human. AGENT: Agent.</p>
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
         * <p>The list of user IDs of the reviewers.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("reviewerUserIds")
        public java.util.List<Long> reviewerUserIds;

        /**
         * <p>The order of the step.</p>
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
         * <p>example</p>
         */
        @NameInMap("specification")
        public String specification;

        /**
         * <p>The array of structured segments for the step instructions. Supported types include text, mention, skill, app, files, and web_search. The fields and nested attachments of each segment are retained as returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;text&quot;,&quot;content&quot;:&quot;Organize input materials&quot;}]</p>
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
         * <p>example</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ordered steps.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
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

        public GenerateWorkflowTemplateDraftResponseBodyDraft setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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
