// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class SyncFeatureConsistencyCheckJobReplayLogRequest extends TeaModel {
    @NameInMap("ContextFeatures")
    public String contextFeatures;

    @NameInMap("FeatureConsistencyCheckJobConfigId")
    public String featureConsistencyCheckJobConfigId;

    @NameInMap("GeneratedFeatures")
    public String generatedFeatures;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LogItemId")
    public String logItemId;

    @NameInMap("LogRequestId")
    public String logRequestId;

    @NameInMap("LogRequestTime")
    public Long logRequestTime;

    @NameInMap("LogUserId")
    public String logUserId;

    @NameInMap("RawFeatures")
    public String rawFeatures;

    @NameInMap("SceneName")
    public String sceneName;

    public static SyncFeatureConsistencyCheckJobReplayLogRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncFeatureConsistencyCheckJobReplayLogRequest self = new SyncFeatureConsistencyCheckJobReplayLogRequest();
        return TeaModel.build(map, self);
    }

    public SyncFeatureConsistencyCheckJobReplayLogRequest setContextFeatures(String contextFeatures) {
        this.contextFeatures = contextFeatures;
        return this;
    }
    public String getContextFeatures() {
        return this.contextFeatures;
    }

    public SyncFeatureConsistencyCheckJobReplayLogRequest setFeatureConsistencyCheckJobConfigId(String featureConsistencyCheckJobConfigId) {
        this.featureConsistencyCheckJobConfigId = featureConsistencyCheckJobConfigId;
        return this;
    }
    public String getFeatureConsistencyCheckJobConfigId() {
        return this.featureConsistencyCheckJobConfigId;
    }

    public SyncFeatureConsistencyCheckJobReplayLogRequest setGeneratedFeatures(String generatedFeatures) {
        this.generatedFeatures = generatedFeatures;
        return this;
    }
    public String getGeneratedFeatures() {
        return this.generatedFeatures;
    }

    public SyncFeatureConsistencyCheckJobReplayLogRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SyncFeatureConsistencyCheckJobReplayLogRequest setLogItemId(String logItemId) {
        this.logItemId = logItemId;
        return this;
    }
    public String getLogItemId() {
        return this.logItemId;
    }

    public SyncFeatureConsistencyCheckJobReplayLogRequest setLogRequestId(String logRequestId) {
        this.logRequestId = logRequestId;
        return this;
    }
    public String getLogRequestId() {
        return this.logRequestId;
    }

    public SyncFeatureConsistencyCheckJobReplayLogRequest setLogRequestTime(Long logRequestTime) {
        this.logRequestTime = logRequestTime;
        return this;
    }
    public Long getLogRequestTime() {
        return this.logRequestTime;
    }

    public SyncFeatureConsistencyCheckJobReplayLogRequest setLogUserId(String logUserId) {
        this.logUserId = logUserId;
        return this;
    }
    public String getLogUserId() {
        return this.logUserId;
    }

    public SyncFeatureConsistencyCheckJobReplayLogRequest setRawFeatures(String rawFeatures) {
        this.rawFeatures = rawFeatures;
        return this;
    }
    public String getRawFeatures() {
        return this.rawFeatures;
    }

    public SyncFeatureConsistencyCheckJobReplayLogRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

}
