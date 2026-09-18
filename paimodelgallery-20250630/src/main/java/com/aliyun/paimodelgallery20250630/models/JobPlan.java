// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class JobPlan extends TeaModel {
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("JobPlanCurrentStep")
    public String jobPlanCurrentStep;

    @NameInMap("JobPlanId")
    public String jobPlanId;

    @NameInMap("JobPlanName")
    public String jobPlanName;

    @NameInMap("JobPlanSteps")
    public java.util.List<JobPlanJobPlanSteps> jobPlanSteps;

    @NameInMap("JobPlanType")
    public String jobPlanType;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("Tags")
    public java.util.List<JobPlanTags> tags;

    /**
     * <p>The distillation template ID used when creating the task plan. An empty value indicates that this is not a scenario-specific distillation task.</p>
     * 
     * <strong>example:</strong>
     * <p>advanced_cot_distill</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The display name of the distillation template used, localized based on the language specified in the request.</p>
     * 
     * <strong>example:</strong>
     * <p>Chain-of-Thought Reasoning Distillation</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static JobPlan build(java.util.Map<String, ?> map) throws Exception {
        JobPlan self = new JobPlan();
        return TeaModel.build(map, self);
    }

    public JobPlan setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public JobPlan setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public JobPlan setJobPlanCurrentStep(String jobPlanCurrentStep) {
        this.jobPlanCurrentStep = jobPlanCurrentStep;
        return this;
    }
    public String getJobPlanCurrentStep() {
        return this.jobPlanCurrentStep;
    }

    public JobPlan setJobPlanId(String jobPlanId) {
        this.jobPlanId = jobPlanId;
        return this;
    }
    public String getJobPlanId() {
        return this.jobPlanId;
    }

    public JobPlan setJobPlanName(String jobPlanName) {
        this.jobPlanName = jobPlanName;
        return this;
    }
    public String getJobPlanName() {
        return this.jobPlanName;
    }

    public JobPlan setJobPlanSteps(java.util.List<JobPlanJobPlanSteps> jobPlanSteps) {
        this.jobPlanSteps = jobPlanSteps;
        return this;
    }
    public java.util.List<JobPlanJobPlanSteps> getJobPlanSteps() {
        return this.jobPlanSteps;
    }

    public JobPlan setJobPlanType(String jobPlanType) {
        this.jobPlanType = jobPlanType;
        return this;
    }
    public String getJobPlanType() {
        return this.jobPlanType;
    }

    public JobPlan setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public JobPlan setTags(java.util.List<JobPlanTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<JobPlanTags> getTags() {
        return this.tags;
    }

    public JobPlan setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public JobPlan setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public JobPlan setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public JobPlan setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class JobPlanJobPlanSteps extends TeaModel {
        @NameInMap("JobPlanStepId")
        public String jobPlanStepId;

        @NameInMap("JobPlanStepName")
        public String jobPlanStepName;

        @NameInMap("JobPlanStepSpec")
        public java.util.Map<String, ?> jobPlanStepSpec;

        @NameInMap("JobPlanStepType")
        public String jobPlanStepType;

        public static JobPlanJobPlanSteps build(java.util.Map<String, ?> map) throws Exception {
            JobPlanJobPlanSteps self = new JobPlanJobPlanSteps();
            return TeaModel.build(map, self);
        }

        public JobPlanJobPlanSteps setJobPlanStepId(String jobPlanStepId) {
            this.jobPlanStepId = jobPlanStepId;
            return this;
        }
        public String getJobPlanStepId() {
            return this.jobPlanStepId;
        }

        public JobPlanJobPlanSteps setJobPlanStepName(String jobPlanStepName) {
            this.jobPlanStepName = jobPlanStepName;
            return this;
        }
        public String getJobPlanStepName() {
            return this.jobPlanStepName;
        }

        public JobPlanJobPlanSteps setJobPlanStepSpec(java.util.Map<String, ?> jobPlanStepSpec) {
            this.jobPlanStepSpec = jobPlanStepSpec;
            return this;
        }
        public java.util.Map<String, ?> getJobPlanStepSpec() {
            return this.jobPlanStepSpec;
        }

        public JobPlanJobPlanSteps setJobPlanStepType(String jobPlanStepType) {
            this.jobPlanStepType = jobPlanStepType;
            return this;
        }
        public String getJobPlanStepType() {
            return this.jobPlanStepType;
        }

    }

    public static class JobPlanTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static JobPlanTags build(java.util.Map<String, ?> map) throws Exception {
            JobPlanTags self = new JobPlanTags();
            return TeaModel.build(map, self);
        }

        public JobPlanTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public JobPlanTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
