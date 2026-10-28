// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateFeatureConsistencyCheckJobRequest extends TeaModel {
    /**
     * <p>The runtime environment. Valid values:</p>
     * <ul>
     * <li>Daily: daily environment</li>
     * <li>Pre: staging environment</li>
     * <li>Prod: production environment</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Pre</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <p>The feature consistency check job configuration ID. For information about how to obtain the configuration ID, see <a href="https://help.aliyun.com/document_detail/2557567.html">ListFeatureConsistencyCheckJobConfigs</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("FeatureConsistencyCheckJobConfigId")
    public String featureConsistencyCheckJobConfigId;

    /**
     * <p>The instance ID. For information about how to obtain the instance ID, see <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The sampling duration in minutes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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
