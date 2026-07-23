// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class SyncFeatureConsistencyCheckJobReplayLogRequest extends TeaModel {
    /**
     * <p>The context features.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;Value\&quot;:{\&quot;FloatFeature\&quot;:0.1}}]</p>
     */
    @NameInMap("ContextFeatures")
    public String contextFeatures;

    /**
     * <p>The feature consistency check job configuration ID. To obtain this ID, see <a href="https://help.aliyun.com/document_detail/2557567.html">ListFeatureConsistencyCheckJobConfigs</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("FeatureConsistencyCheckJobConfigId")
    public String featureConsistencyCheckJobConfigId;

    /**
     * <p>The generated features.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>week_day:1 | userid:3 | itemid:9001 | cate:cat1 | click_5_seq__cate:cat1</p>
     */
    @NameInMap("GeneratedFeatures")
    public String generatedFeatures;

    /**
     * <p>The instance ID. To obtain this ID, see <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The item ID from the log.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9010</p>
     */
    @NameInMap("LogItemId")
    public String logItemId;

    /**
     * <p>The request ID from the log.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("LogRequestId")
    public String logRequestId;

    /**
     * <p>The request time from the log, provided as a UNIX epoch timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1693900981465</p>
     */
    @NameInMap("LogRequestTime")
    public Long logRequestTime;

    /**
     * <p>The user ID from the log.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1010</p>
     */
    @NameInMap("LogUserId")
    public String logUserId;

    /**
     * <p>The raw features.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>author__kv_city_expr_cnt_15d：北京市 | tem__min_age_15d:28</p>
     */
    @NameInMap("RawFeatures")
    public String rawFeatures;

    /**
     * <p>The scene name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>video-feed</p>
     */
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
