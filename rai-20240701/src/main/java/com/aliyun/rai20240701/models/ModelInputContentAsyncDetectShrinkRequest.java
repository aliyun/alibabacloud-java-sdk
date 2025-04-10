// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ModelInputContentAsyncDetectShrinkRequest extends TeaModel {
    @NameInMap("BodyData")
    public String bodyDataShrink;

    /**
     * <strong>example:</strong>
     * <p>x1bc5xgs4uhx</p>
     */
    @NameInMap("PolicyIdentifier")
    public String policyIdentifier;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("SceneName")
    public String sceneName;

    /**
     * <strong>example:</strong>
     * <p>textDetection</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    public static ModelInputContentAsyncDetectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelInputContentAsyncDetectShrinkRequest self = new ModelInputContentAsyncDetectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModelInputContentAsyncDetectShrinkRequest setBodyDataShrink(String bodyDataShrink) {
        this.bodyDataShrink = bodyDataShrink;
        return this;
    }
    public String getBodyDataShrink() {
        return this.bodyDataShrink;
    }

    public ModelInputContentAsyncDetectShrinkRequest setPolicyIdentifier(String policyIdentifier) {
        this.policyIdentifier = policyIdentifier;
        return this;
    }
    public String getPolicyIdentifier() {
        return this.policyIdentifier;
    }

    public ModelInputContentAsyncDetectShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModelInputContentAsyncDetectShrinkRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public ModelInputContentAsyncDetectShrinkRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
