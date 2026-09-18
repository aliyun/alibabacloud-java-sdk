// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class UpdateJobPlanRequest extends TeaModel {
    /**
     * <p>The current step of the task plan. Set this parameter to <code>DatasetSynthesisAndModelTrain</code> for the full process or <code>DatasetSynthesisModelTrain</code> for step-by-step execution.</p>
     * 
     * <strong>example:</strong>
     * <p>DatasetSynthesisAndModelTrain</p>
     */
    @NameInMap("JobPlanCurrentStep")
    public String jobPlanCurrentStep;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<UpdateJobPlanRequestTag> tag;

    public static UpdateJobPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobPlanRequest self = new UpdateJobPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJobPlanRequest setJobPlanCurrentStep(String jobPlanCurrentStep) {
        this.jobPlanCurrentStep = jobPlanCurrentStep;
        return this;
    }
    public String getJobPlanCurrentStep() {
        return this.jobPlanCurrentStep;
    }

    public UpdateJobPlanRequest setTag(java.util.List<UpdateJobPlanRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<UpdateJobPlanRequestTag> getTag() {
        return this.tag;
    }

    public static class UpdateJobPlanRequestTag extends TeaModel {
        /**
         * <p>The tag key. If the tag key already exists, the tag is updated. Otherwise, a new tag is added.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag key. If the tag key already exists, the tag is updated. Otherwise, a new tag is added.</p>
         * 
         * <strong>example:</strong>
         * <p>bar</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateJobPlanRequestTag build(java.util.Map<String, ?> map) throws Exception {
            UpdateJobPlanRequestTag self = new UpdateJobPlanRequestTag();
            return TeaModel.build(map, self);
        }

        public UpdateJobPlanRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateJobPlanRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
