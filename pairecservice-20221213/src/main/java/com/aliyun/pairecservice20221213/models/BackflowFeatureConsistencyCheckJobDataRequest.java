// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class BackflowFeatureConsistencyCheckJobDataRequest extends TeaModel {
    @NameInMap("FeatureConsistencyCheckJobConfigId")
    public String featureConsistencyCheckJobConfigId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ItemFeatures")
    public String itemFeatures;

    @NameInMap("LogItemId")
    public String logItemId;

    @NameInMap("LogRequestId")
    public String logRequestId;

    @NameInMap("LogRequestTime")
    public Long logRequestTime;

    @NameInMap("LogUserId")
    public String logUserId;

    @NameInMap("SceneName")
    public String sceneName;

    @NameInMap("Scores")
    public String scores;

    @NameInMap("UserFeatures")
    public String userFeatures;

    public static BackflowFeatureConsistencyCheckJobDataRequest build(java.util.Map<String, ?> map) throws Exception {
        BackflowFeatureConsistencyCheckJobDataRequest self = new BackflowFeatureConsistencyCheckJobDataRequest();
        return TeaModel.build(map, self);
    }

    public BackflowFeatureConsistencyCheckJobDataRequest setFeatureConsistencyCheckJobConfigId(String featureConsistencyCheckJobConfigId) {
        this.featureConsistencyCheckJobConfigId = featureConsistencyCheckJobConfigId;
        return this;
    }
    public String getFeatureConsistencyCheckJobConfigId() {
        return this.featureConsistencyCheckJobConfigId;
    }

    public BackflowFeatureConsistencyCheckJobDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BackflowFeatureConsistencyCheckJobDataRequest setItemFeatures(String itemFeatures) {
        this.itemFeatures = itemFeatures;
        return this;
    }
    public String getItemFeatures() {
        return this.itemFeatures;
    }

    public BackflowFeatureConsistencyCheckJobDataRequest setLogItemId(String logItemId) {
        this.logItemId = logItemId;
        return this;
    }
    public String getLogItemId() {
        return this.logItemId;
    }

    public BackflowFeatureConsistencyCheckJobDataRequest setLogRequestId(String logRequestId) {
        this.logRequestId = logRequestId;
        return this;
    }
    public String getLogRequestId() {
        return this.logRequestId;
    }

    public BackflowFeatureConsistencyCheckJobDataRequest setLogRequestTime(Long logRequestTime) {
        this.logRequestTime = logRequestTime;
        return this;
    }
    public Long getLogRequestTime() {
        return this.logRequestTime;
    }

    public BackflowFeatureConsistencyCheckJobDataRequest setLogUserId(String logUserId) {
        this.logUserId = logUserId;
        return this;
    }
    public String getLogUserId() {
        return this.logUserId;
    }

    public BackflowFeatureConsistencyCheckJobDataRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public BackflowFeatureConsistencyCheckJobDataRequest setScores(String scores) {
        this.scores = scores;
        return this;
    }
    public String getScores() {
        return this.scores;
    }

    public BackflowFeatureConsistencyCheckJobDataRequest setUserFeatures(String userFeatures) {
        this.userFeatures = userFeatures;
        return this;
    }
    public String getUserFeatures() {
        return this.userFeatures;
    }

}
