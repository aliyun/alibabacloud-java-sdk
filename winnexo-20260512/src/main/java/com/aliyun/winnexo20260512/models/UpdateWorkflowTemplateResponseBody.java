// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateWorkflowTemplateResponseBody extends TeaModel {
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
     * <p>example</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The current effective version number of the template. An empty value indicates that only a draft exists and it cannot be used for work items.</p>
     * 
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("effectiveVersion")
    public String effectiveVersion;

    /**
     * <p>The creation time in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The modification time in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

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
     * <p>example</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The ordered steps.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("steps")
    public java.util.List<UpdateWorkflowTemplateResponseBodySteps> steps;

    /**
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>tpl_example</p>
     */
    @NameInMap("templateId")
    public String templateId;

    /**
     * <p>The version number to which the returned content belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>The change description of the version. An empty value indicates that no description is provided.</p>
     * 
     * <strong>example:</strong>
     * <p>Add a review step</p>
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

    public static UpdateWorkflowTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowTemplateResponseBody self = new UpdateWorkflowTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateWorkflowTemplateResponseBody setCreatedByUserId(Long createdByUserId) {
        this.createdByUserId = createdByUserId;
        return this;
    }
    public Long getCreatedByUserId() {
        return this.createdByUserId;
    }

    public UpdateWorkflowTemplateResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateWorkflowTemplateResponseBody setEffectiveVersion(String effectiveVersion) {
        this.effectiveVersion = effectiveVersion;
        return this;
    }
    public String getEffectiveVersion() {
        return this.effectiveVersion;
    }

    public UpdateWorkflowTemplateResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public UpdateWorkflowTemplateResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public UpdateWorkflowTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateWorkflowTemplateResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateWorkflowTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWorkflowTemplateResponseBody setSteps(java.util.List<UpdateWorkflowTemplateResponseBodySteps> steps) {
        this.steps = steps;
        return this;
    }
    public java.util.List<UpdateWorkflowTemplateResponseBodySteps> getSteps() {
        return this.steps;
    }

    public UpdateWorkflowTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateWorkflowTemplateResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public UpdateWorkflowTemplateResponseBody setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }
    public String getVersionDescription() {
        return this.versionDescription;
    }

    public UpdateWorkflowTemplateResponseBody setVersionStatus(String versionStatus) {
        this.versionStatus = versionStatus;
        return this;
    }
    public String getVersionStatus() {
        return this.versionStatus;
    }

    public static class UpdateWorkflowTemplateResponseBodySteps extends TeaModel {
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
         * <p>The list of user IDs of the reviewers.</p>
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
         * <p>example</p>
         */
        @NameInMap("specification")
        public String specification;

        /**
         * <p>The array of structured segments for the step instructions. Supports text, mention, skill, app, files, and web_search. The fields and nested attachments of each segment are retained as returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;text&quot;,&quot;content&quot;:&quot;Organize input materials&quot;}]</p>
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

        public static UpdateWorkflowTemplateResponseBodySteps build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowTemplateResponseBodySteps self = new UpdateWorkflowTemplateResponseBodySteps();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowTemplateResponseBodySteps setModelMode(String modelMode) {
            this.modelMode = modelMode;
            return this;
        }
        public String getModelMode() {
            return this.modelMode;
        }

        public UpdateWorkflowTemplateResponseBodySteps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateWorkflowTemplateResponseBodySteps setOwnerAgentName(String ownerAgentName) {
            this.ownerAgentName = ownerAgentName;
            return this;
        }
        public String getOwnerAgentName() {
            return this.ownerAgentName;
        }

        public UpdateWorkflowTemplateResponseBodySteps setOwnerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }
        public String getOwnerType() {
            return this.ownerType;
        }

        public UpdateWorkflowTemplateResponseBodySteps setOwnerUserId(Long ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public Long getOwnerUserId() {
            return this.ownerUserId;
        }

        public UpdateWorkflowTemplateResponseBodySteps setReviewerUserIds(java.util.List<Long> reviewerUserIds) {
            this.reviewerUserIds = reviewerUserIds;
            return this;
        }
        public java.util.List<Long> getReviewerUserIds() {
            return this.reviewerUserIds;
        }

        public UpdateWorkflowTemplateResponseBodySteps setSortOrder(Long sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        public Long getSortOrder() {
            return this.sortOrder;
        }

        public UpdateWorkflowTemplateResponseBodySteps setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public UpdateWorkflowTemplateResponseBodySteps setSpecificationJson(java.util.List<java.util.Map<String, ?>> specificationJson) {
            this.specificationJson = specificationJson;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getSpecificationJson() {
            return this.specificationJson;
        }

        public UpdateWorkflowTemplateResponseBodySteps setStepId(String stepId) {
            this.stepId = stepId;
            return this;
        }
        public String getStepId() {
            return this.stepId;
        }

    }

}
