// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ModelInputContentAsyncDetectRequest extends TeaModel {
    @NameInMap("BodyData")
    public ModelInputContentAsyncDetectRequestBodyData bodyData;

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

    public static ModelInputContentAsyncDetectRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelInputContentAsyncDetectRequest self = new ModelInputContentAsyncDetectRequest();
        return TeaModel.build(map, self);
    }

    public ModelInputContentAsyncDetectRequest setBodyData(ModelInputContentAsyncDetectRequestBodyData bodyData) {
        this.bodyData = bodyData;
        return this;
    }
    public ModelInputContentAsyncDetectRequestBodyData getBodyData() {
        return this.bodyData;
    }

    public ModelInputContentAsyncDetectRequest setPolicyIdentifier(String policyIdentifier) {
        this.policyIdentifier = policyIdentifier;
        return this;
    }
    public String getPolicyIdentifier() {
        return this.policyIdentifier;
    }

    public ModelInputContentAsyncDetectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModelInputContentAsyncDetectRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public ModelInputContentAsyncDetectRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public static class ModelInputContentAsyncDetectRequestBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        public static ModelInputContentAsyncDetectRequestBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelInputContentAsyncDetectRequestBodyData self = new ModelInputContentAsyncDetectRequestBodyData();
            return TeaModel.build(map, self);
        }

        public ModelInputContentAsyncDetectRequestBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
