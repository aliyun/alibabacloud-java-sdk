// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ModelInputContentSyncDetectRequest extends TeaModel {
    @NameInMap("BodyData")
    public ModelInputContentSyncDetectRequestBodyData bodyData;

    @NameInMap("PolicyIdentifier")
    public String policyIdentifier;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SceneName")
    public String sceneName;

    @NameInMap("ServiceName")
    public String serviceName;

    public static ModelInputContentSyncDetectRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelInputContentSyncDetectRequest self = new ModelInputContentSyncDetectRequest();
        return TeaModel.build(map, self);
    }

    public ModelInputContentSyncDetectRequest setBodyData(ModelInputContentSyncDetectRequestBodyData bodyData) {
        this.bodyData = bodyData;
        return this;
    }
    public ModelInputContentSyncDetectRequestBodyData getBodyData() {
        return this.bodyData;
    }

    public ModelInputContentSyncDetectRequest setPolicyIdentifier(String policyIdentifier) {
        this.policyIdentifier = policyIdentifier;
        return this;
    }
    public String getPolicyIdentifier() {
        return this.policyIdentifier;
    }

    public ModelInputContentSyncDetectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModelInputContentSyncDetectRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public ModelInputContentSyncDetectRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public static class ModelInputContentSyncDetectRequestBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        public static ModelInputContentSyncDetectRequestBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelInputContentSyncDetectRequestBodyData self = new ModelInputContentSyncDetectRequestBodyData();
            return TeaModel.build(map, self);
        }

        public ModelInputContentSyncDetectRequestBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
