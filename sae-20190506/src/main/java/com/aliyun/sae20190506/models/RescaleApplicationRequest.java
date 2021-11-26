// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RescaleApplicationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AutoEnableApplicationScalingRule")
    public Boolean autoEnableApplicationScalingRule;

    @NameInMap("MinReadyInstances")
    public Integer minReadyInstances;

    @NameInMap("Replicas")
    public Integer replicas;

    public static RescaleApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        RescaleApplicationRequest self = new RescaleApplicationRequest();
        return TeaModel.build(map, self);
    }

    public RescaleApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RescaleApplicationRequest setAutoEnableApplicationScalingRule(Boolean autoEnableApplicationScalingRule) {
        this.autoEnableApplicationScalingRule = autoEnableApplicationScalingRule;
        return this;
    }
    public Boolean getAutoEnableApplicationScalingRule() {
        return this.autoEnableApplicationScalingRule;
    }

    public RescaleApplicationRequest setMinReadyInstances(Integer minReadyInstances) {
        this.minReadyInstances = minReadyInstances;
        return this;
    }
    public Integer getMinReadyInstances() {
        return this.minReadyInstances;
    }

    public RescaleApplicationRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

}
