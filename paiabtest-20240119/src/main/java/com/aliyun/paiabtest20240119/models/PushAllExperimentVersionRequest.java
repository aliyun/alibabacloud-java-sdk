// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class PushAllExperimentVersionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FeatureName")
    public String featureName;

    public static PushAllExperimentVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        PushAllExperimentVersionRequest self = new PushAllExperimentVersionRequest();
        return TeaModel.build(map, self);
    }

    public PushAllExperimentVersionRequest setFeatureName(String featureName) {
        this.featureName = featureName;
        return this;
    }
    public String getFeatureName() {
        return this.featureName;
    }

}
