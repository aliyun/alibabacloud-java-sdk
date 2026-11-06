// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class UpdateJobPlanRequest extends TeaModel {
    @NameInMap("JobPlanCurrentStep")
    public String jobPlanCurrentStep;

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
        @NameInMap("Key")
        public String key;

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
