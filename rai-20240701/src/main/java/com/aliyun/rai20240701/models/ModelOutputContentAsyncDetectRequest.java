// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ModelOutputContentAsyncDetectRequest extends TeaModel {
    @NameInMap("BodyData")
    public ModelOutputContentAsyncDetectRequestBodyData bodyData;

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

    public static ModelOutputContentAsyncDetectRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelOutputContentAsyncDetectRequest self = new ModelOutputContentAsyncDetectRequest();
        return TeaModel.build(map, self);
    }

    public ModelOutputContentAsyncDetectRequest setBodyData(ModelOutputContentAsyncDetectRequestBodyData bodyData) {
        this.bodyData = bodyData;
        return this;
    }
    public ModelOutputContentAsyncDetectRequestBodyData getBodyData() {
        return this.bodyData;
    }

    public ModelOutputContentAsyncDetectRequest setPolicyIdentifier(String policyIdentifier) {
        this.policyIdentifier = policyIdentifier;
        return this;
    }
    public String getPolicyIdentifier() {
        return this.policyIdentifier;
    }

    public ModelOutputContentAsyncDetectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModelOutputContentAsyncDetectRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public ModelOutputContentAsyncDetectRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public static class ModelOutputContentAsyncDetectRequestBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        public static ModelOutputContentAsyncDetectRequestBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelOutputContentAsyncDetectRequestBodyData self = new ModelOutputContentAsyncDetectRequestBodyData();
            return TeaModel.build(map, self);
        }

        public ModelOutputContentAsyncDetectRequestBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
