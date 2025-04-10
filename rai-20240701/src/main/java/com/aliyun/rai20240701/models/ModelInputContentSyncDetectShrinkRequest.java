// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ModelInputContentSyncDetectShrinkRequest extends TeaModel {
    @NameInMap("BodyData")
    public String bodyDataShrink;

    @NameInMap("PolicyIdentifier")
    public String policyIdentifier;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SceneName")
    public String sceneName;

    @NameInMap("ServiceName")
    public String serviceName;

    public static ModelInputContentSyncDetectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelInputContentSyncDetectShrinkRequest self = new ModelInputContentSyncDetectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModelInputContentSyncDetectShrinkRequest setBodyDataShrink(String bodyDataShrink) {
        this.bodyDataShrink = bodyDataShrink;
        return this;
    }
    public String getBodyDataShrink() {
        return this.bodyDataShrink;
    }

    public ModelInputContentSyncDetectShrinkRequest setPolicyIdentifier(String policyIdentifier) {
        this.policyIdentifier = policyIdentifier;
        return this;
    }
    public String getPolicyIdentifier() {
        return this.policyIdentifier;
    }

    public ModelInputContentSyncDetectShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModelInputContentSyncDetectShrinkRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public ModelInputContentSyncDetectShrinkRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
