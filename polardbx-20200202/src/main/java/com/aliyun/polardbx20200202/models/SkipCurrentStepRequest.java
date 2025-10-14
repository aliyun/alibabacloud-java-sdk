// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class SkipCurrentStepRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PRE_CHECK</p>
     */
    @NameInMap("CurrentStep")
    public String currentStep;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>etx-szr2rr6i*****</p>
     */
    @NameInMap("SlinkTaskId")
    public String slinkTaskId;

    public static SkipCurrentStepRequest build(java.util.Map<String, ?> map) throws Exception {
        SkipCurrentStepRequest self = new SkipCurrentStepRequest();
        return TeaModel.build(map, self);
    }

    public SkipCurrentStepRequest setCurrentStep(String currentStep) {
        this.currentStep = currentStep;
        return this;
    }
    public String getCurrentStep() {
        return this.currentStep;
    }

    public SkipCurrentStepRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SkipCurrentStepRequest setSlinkTaskId(String slinkTaskId) {
        this.slinkTaskId = slinkTaskId;
        return this;
    }
    public String getSlinkTaskId() {
        return this.slinkTaskId;
    }

}
