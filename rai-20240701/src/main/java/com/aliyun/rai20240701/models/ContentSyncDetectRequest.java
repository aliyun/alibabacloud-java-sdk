// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ContentSyncDetectRequest extends TeaModel {
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

    @NameInMap("serviceParameter")
    public ContentSyncDetectRequestServiceParameter serviceParameter;

    public static ContentSyncDetectRequest build(java.util.Map<String, ?> map) throws Exception {
        ContentSyncDetectRequest self = new ContentSyncDetectRequest();
        return TeaModel.build(map, self);
    }

    public ContentSyncDetectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ContentSyncDetectRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public ContentSyncDetectRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ContentSyncDetectRequest setServiceParameter(ContentSyncDetectRequestServiceParameter serviceParameter) {
        this.serviceParameter = serviceParameter;
        return this;
    }
    public ContentSyncDetectRequestServiceParameter getServiceParameter() {
        return this.serviceParameter;
    }

    public static class ContentSyncDetectRequestServiceParameter extends TeaModel {
        @NameInMap("content")
        public String content;

        public static ContentSyncDetectRequestServiceParameter build(java.util.Map<String, ?> map) throws Exception {
            ContentSyncDetectRequestServiceParameter self = new ContentSyncDetectRequestServiceParameter();
            return TeaModel.build(map, self);
        }

        public ContentSyncDetectRequestServiceParameter setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
