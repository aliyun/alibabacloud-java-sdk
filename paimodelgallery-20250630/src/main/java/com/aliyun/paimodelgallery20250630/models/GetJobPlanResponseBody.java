// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class GetJobPlanResponseBody extends TeaModel {
    /**
     * <p>The creation time of the job plan.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-18 10:00:00</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The last modified time of the job plan.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-18 10:30:00</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The current step.</p>
     * 
     * <strong>example:</strong>
     * <p>DatasetSynthesis</p>
     */
    @NameInMap("JobPlanCurrentStep")
    public String jobPlanCurrentStep;

    /**
     * <p>The job plan ID.</p>
     * 
     * <strong>example:</strong>
     * <p>jp-xxxxxx</p>
     */
    @NameInMap("JobPlanId")
    public String jobPlanId;

    /**
     * <p>The job plan name, which is unique within the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>ModelGalleryxxx</p>
     */
    @NameInMap("JobPlanName")
    public String jobPlanName;

    /**
     * <p>The job plan steps.</p>
     */
    @NameInMap("JobPlanSteps")
    public java.util.List<GetJobPlanResponseBodyJobPlanSteps> jobPlanSteps;

    /**
     * <p>The job plan type.</p>
     * 
     * <strong>example:</strong>
     * <p>Distillation</p>
     */
    @NameInMap("JobPlanType")
    public String jobPlanType;

    /**
     * <p>The Alibaba Cloud account ID that owns the job plan.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82-9624-EC2B1779848E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetJobPlanResponseBodyTags> tags;

    /**
     * <p>The distillation template ID used to create the job plan. An empty value indicates that this is not a scenario-based distillation task.</p>
     * 
     * <strong>example:</strong>
     * <p>advanced_cot_distill</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The display name of the distillation template, localized based on the requested language.</p>
     * 
     * <strong>example:</strong>
     * <p>思维链推理蒸馏</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The Alibaba Cloud account ID that created the job plan.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>62469</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetJobPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobPlanResponseBody self = new GetJobPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobPlanResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetJobPlanResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetJobPlanResponseBody setJobPlanCurrentStep(String jobPlanCurrentStep) {
        this.jobPlanCurrentStep = jobPlanCurrentStep;
        return this;
    }
    public String getJobPlanCurrentStep() {
        return this.jobPlanCurrentStep;
    }

    public GetJobPlanResponseBody setJobPlanId(String jobPlanId) {
        this.jobPlanId = jobPlanId;
        return this;
    }
    public String getJobPlanId() {
        return this.jobPlanId;
    }

    public GetJobPlanResponseBody setJobPlanName(String jobPlanName) {
        this.jobPlanName = jobPlanName;
        return this;
    }
    public String getJobPlanName() {
        return this.jobPlanName;
    }

    public GetJobPlanResponseBody setJobPlanSteps(java.util.List<GetJobPlanResponseBodyJobPlanSteps> jobPlanSteps) {
        this.jobPlanSteps = jobPlanSteps;
        return this;
    }
    public java.util.List<GetJobPlanResponseBodyJobPlanSteps> getJobPlanSteps() {
        return this.jobPlanSteps;
    }

    public GetJobPlanResponseBody setJobPlanType(String jobPlanType) {
        this.jobPlanType = jobPlanType;
        return this;
    }
    public String getJobPlanType() {
        return this.jobPlanType;
    }

    public GetJobPlanResponseBody setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public GetJobPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobPlanResponseBody setTags(java.util.List<GetJobPlanResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetJobPlanResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetJobPlanResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetJobPlanResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetJobPlanResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetJobPlanResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class GetJobPlanResponseBodyJobPlanSteps extends TeaModel {
        /**
         * <p>The generated PAIFlow PipelineRunId.</p>
         * 
         * <strong>example:</strong>
         * <p>pipeline-xxxxx</p>
         */
        @NameInMap("JobPlanStepId")
        public String jobPlanStepId;

        /**
         * <p>The job plan step name.</p>
         * 
         * <strong>example:</strong>
         * <p>DistillationDatasetSynthesis</p>
         */
        @NameInMap("JobPlanStepName")
        public String jobPlanStepName;

        /**
         * <p>The job plan step configuration.</p>
         */
        @NameInMap("JobPlanStepSpec")
        public java.util.Map<String, ?> jobPlanStepSpec;

        /**
         * <p>The job plan step type.</p>
         * 
         * <strong>example:</strong>
         * <p>PAIFlow</p>
         */
        @NameInMap("JobPlanStepType")
        public String jobPlanStepType;

        public static GetJobPlanResponseBodyJobPlanSteps build(java.util.Map<String, ?> map) throws Exception {
            GetJobPlanResponseBodyJobPlanSteps self = new GetJobPlanResponseBodyJobPlanSteps();
            return TeaModel.build(map, self);
        }

        public GetJobPlanResponseBodyJobPlanSteps setJobPlanStepId(String jobPlanStepId) {
            this.jobPlanStepId = jobPlanStepId;
            return this;
        }
        public String getJobPlanStepId() {
            return this.jobPlanStepId;
        }

        public GetJobPlanResponseBodyJobPlanSteps setJobPlanStepName(String jobPlanStepName) {
            this.jobPlanStepName = jobPlanStepName;
            return this;
        }
        public String getJobPlanStepName() {
            return this.jobPlanStepName;
        }

        public GetJobPlanResponseBodyJobPlanSteps setJobPlanStepSpec(java.util.Map<String, ?> jobPlanStepSpec) {
            this.jobPlanStepSpec = jobPlanStepSpec;
            return this;
        }
        public java.util.Map<String, ?> getJobPlanStepSpec() {
            return this.jobPlanStepSpec;
        }

        public GetJobPlanResponseBodyJobPlanSteps setJobPlanStepType(String jobPlanStepType) {
            this.jobPlanStepType = jobPlanStepType;
            return this;
        }
        public String getJobPlanStepType() {
            return this.jobPlanStepType;
        }

    }

    public static class GetJobPlanResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>bar</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetJobPlanResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetJobPlanResponseBodyTags self = new GetJobPlanResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetJobPlanResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetJobPlanResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
