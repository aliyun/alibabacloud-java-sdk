// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateFeatureConsistencyCheckJobRequest extends TeaModel {
    @NameInMap("Environment")
    public String environment;

    @NameInMap("FeatureConsistencyCheckJobConfigId")
    public String featureConsistencyCheckJobConfigId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SamplingDuration")
    public Integer samplingDuration;

    public static CreateFeatureConsistencyCheckJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFeatureConsistencyCheckJobRequest self = new CreateFeatureConsistencyCheckJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateFeatureConsistencyCheckJobRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public CreateFeatureConsistencyCheckJobRequest setFeatureConsistencyCheckJobConfigId(String featureConsistencyCheckJobConfigId) {
        this.featureConsistencyCheckJobConfigId = featureConsistencyCheckJobConfigId;
        return this;
    }
    public String getFeatureConsistencyCheckJobConfigId() {
        return this.featureConsistencyCheckJobConfigId;
    }

    public CreateFeatureConsistencyCheckJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateFeatureConsistencyCheckJobRequest setSamplingDuration(Integer samplingDuration) {
        this.samplingDuration = samplingDuration;
        return this;
    }
    public Integer getSamplingDuration() {
        return this.samplingDuration;
    }

}
