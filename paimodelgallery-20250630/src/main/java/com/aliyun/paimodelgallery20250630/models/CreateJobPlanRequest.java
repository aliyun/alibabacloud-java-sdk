// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class CreateJobPlanRequest extends TeaModel {
    /**
     * <p>The name of the job plan.</p>
     * 
     * <strong>example:</strong>
     * <p>ModelGalleryxxx</p>
     */
    @NameInMap("JobPlanName")
    public String jobPlanName;

    /**
     * <p>The steps of the job plan.</p>
     */
    @NameInMap("JobPlanSteps")
    public java.util.List<CreateJobPlanRequestJobPlanSteps> jobPlanSteps;

    /**
     * <p>The type of the job plan.</p>
     * 
     * <strong>example:</strong>
     * <p>Distillation</p>
     */
    @NameInMap("JobPlanType")
    public String jobPlanType;

    /**
     * <p>Note: According to the Alibaba Cloud tag system specification, this parameter name is in singular form.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateJobPlanRequestTag> tag;

    /**
     * <p>The ID of the scenario-specific distillation template, obtained from ListDistillationTemplates. If this parameter is not specified, a general-purpose job plan is created.</p>
     * 
     * <strong>example:</strong>
     * <p>advanced_cot_distill</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>62469</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateJobPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobPlanRequest self = new CreateJobPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobPlanRequest setJobPlanName(String jobPlanName) {
        this.jobPlanName = jobPlanName;
        return this;
    }
    public String getJobPlanName() {
        return this.jobPlanName;
    }

    public CreateJobPlanRequest setJobPlanSteps(java.util.List<CreateJobPlanRequestJobPlanSteps> jobPlanSteps) {
        this.jobPlanSteps = jobPlanSteps;
        return this;
    }
    public java.util.List<CreateJobPlanRequestJobPlanSteps> getJobPlanSteps() {
        return this.jobPlanSteps;
    }

    public CreateJobPlanRequest setJobPlanType(String jobPlanType) {
        this.jobPlanType = jobPlanType;
        return this;
    }
    public String getJobPlanType() {
        return this.jobPlanType;
    }

    public CreateJobPlanRequest setTag(java.util.List<CreateJobPlanRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateJobPlanRequestTag> getTag() {
        return this.tag;
    }

    public CreateJobPlanRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateJobPlanRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateJobPlanRequestJobPlanSteps extends TeaModel {
        /**
         * <p>The name of the job plan step.</p>
         * 
         * <strong>example:</strong>
         * <p>DatasetSynthesis</p>
         */
        @NameInMap("JobPlanStepName")
        public String jobPlanStepName;

        /**
         * <p>The detailed configuration of the job plan step.</p>
         */
        @NameInMap("JobPlanStepSpec")
        public java.util.Map<String, ?> jobPlanStepSpec;

        /**
         * <p>The type of the job plan step.</p>
         * 
         * <strong>example:</strong>
         * <p>PAIFlow</p>
         */
        @NameInMap("JobPlanStepType")
        public String jobPlanStepType;

        public static CreateJobPlanRequestJobPlanSteps build(java.util.Map<String, ?> map) throws Exception {
            CreateJobPlanRequestJobPlanSteps self = new CreateJobPlanRequestJobPlanSteps();
            return TeaModel.build(map, self);
        }

        public CreateJobPlanRequestJobPlanSteps setJobPlanStepName(String jobPlanStepName) {
            this.jobPlanStepName = jobPlanStepName;
            return this;
        }
        public String getJobPlanStepName() {
            return this.jobPlanStepName;
        }

        public CreateJobPlanRequestJobPlanSteps setJobPlanStepSpec(java.util.Map<String, ?> jobPlanStepSpec) {
            this.jobPlanStepSpec = jobPlanStepSpec;
            return this;
        }
        public java.util.Map<String, ?> getJobPlanStepSpec() {
            return this.jobPlanStepSpec;
        }

        public CreateJobPlanRequestJobPlanSteps setJobPlanStepType(String jobPlanStepType) {
            this.jobPlanStepType = jobPlanStepType;
            return this;
        }
        public String getJobPlanStepType() {
            return this.jobPlanStepType;
        }

    }

    public static class CreateJobPlanRequestTag extends TeaModel {
        /**
         * <p><strong>Key</strong></p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p><strong>Value</strong></p>
         * 
         * <strong>example:</strong>
         * <p>bar</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateJobPlanRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateJobPlanRequestTag self = new CreateJobPlanRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateJobPlanRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateJobPlanRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
