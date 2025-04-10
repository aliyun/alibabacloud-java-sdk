// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ContentAsyncDetectRequest extends TeaModel {
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
    public ContentAsyncDetectRequestServiceParameter serviceParameter;

    public static ContentAsyncDetectRequest build(java.util.Map<String, ?> map) throws Exception {
        ContentAsyncDetectRequest self = new ContentAsyncDetectRequest();
        return TeaModel.build(map, self);
    }

    public ContentAsyncDetectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ContentAsyncDetectRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public ContentAsyncDetectRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ContentAsyncDetectRequest setServiceParameter(ContentAsyncDetectRequestServiceParameter serviceParameter) {
        this.serviceParameter = serviceParameter;
        return this;
    }
    public ContentAsyncDetectRequestServiceParameter getServiceParameter() {
        return this.serviceParameter;
    }

    public static class ContentAsyncDetectRequestServiceParameter extends TeaModel {
        @NameInMap("content")
        public String content;

        public static ContentAsyncDetectRequestServiceParameter build(java.util.Map<String, ?> map) throws Exception {
            ContentAsyncDetectRequestServiceParameter self = new ContentAsyncDetectRequestServiceParameter();
            return TeaModel.build(map, self);
        }

        public ContentAsyncDetectRequestServiceParameter setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
