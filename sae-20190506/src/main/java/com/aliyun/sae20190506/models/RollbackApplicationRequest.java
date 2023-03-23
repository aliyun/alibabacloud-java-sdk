// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RollbackApplicationRequest extends TeaModel {
    /**
     * <p>017f39b8-dfa4-4e16-a84b-1dcee4b1\*\*\*\*</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>true</p>
     */
    @NameInMap("AutoEnableApplicationScalingRule")
    public String autoEnableApplicationScalingRule;

    /**
     * <p>10</p>
     */
    @NameInMap("BatchWaitTime")
    public Integer batchWaitTime;

    /**
     * <p>\-1</p>
     */
    @NameInMap("MinReadyInstanceRatio")
    public Integer minReadyInstanceRatio;

    /**
     * <p>1</p>
     */
    @NameInMap("MinReadyInstances")
    public Integer minReadyInstances;

    /**
     * <p>{"type":"GrayBatchUpdate","batchUpdate":{"batch":2,"releaseType":"auto","batchWaitTime":1},"grayUpdate":{"gray":1}}</p>
     */
    @NameInMap("UpdateStrategy")
    public String updateStrategy;

    /**
     * <p>0026ff7f-2b57-4127-bdd0-9bf202bb9\*\*\*\*</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static RollbackApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackApplicationRequest self = new RollbackApplicationRequest();
        return TeaModel.build(map, self);
    }

    public RollbackApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RollbackApplicationRequest setAutoEnableApplicationScalingRule(String autoEnableApplicationScalingRule) {
        this.autoEnableApplicationScalingRule = autoEnableApplicationScalingRule;
        return this;
    }
    public String getAutoEnableApplicationScalingRule() {
        return this.autoEnableApplicationScalingRule;
    }

    public RollbackApplicationRequest setBatchWaitTime(Integer batchWaitTime) {
        this.batchWaitTime = batchWaitTime;
        return this;
    }
    public Integer getBatchWaitTime() {
        return this.batchWaitTime;
    }

    public RollbackApplicationRequest setMinReadyInstanceRatio(Integer minReadyInstanceRatio) {
        this.minReadyInstanceRatio = minReadyInstanceRatio;
        return this;
    }
    public Integer getMinReadyInstanceRatio() {
        return this.minReadyInstanceRatio;
    }

    public RollbackApplicationRequest setMinReadyInstances(Integer minReadyInstances) {
        this.minReadyInstances = minReadyInstances;
        return this;
    }
    public Integer getMinReadyInstances() {
        return this.minReadyInstances;
    }

    public RollbackApplicationRequest setUpdateStrategy(String updateStrategy) {
        this.updateStrategy = updateStrategy;
        return this;
    }
    public String getUpdateStrategy() {
        return this.updateStrategy;
    }

    public RollbackApplicationRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
