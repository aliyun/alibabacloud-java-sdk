// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ModelInputContentSyncDetectRequest extends TeaModel {
    /**
     * <p>Request object</p>
     */
    @NameInMap("BodyData")
    public ModelInputContentSyncDetectRequestBodyData bodyData;

    /**
     * <p>Policy Identifier</p>
     * 
     * <strong>example:</strong>
     * <p>x1bc5xgs4uhx</p>
     */
    @NameInMap("PolicyIdentifier")
    public String policyIdentifier;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Scene name.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("SceneName")
    public String sceneName;

    /**
     * <p>Service name</p>
     * 
     * <strong>example:</strong>
     * <p>textDetection
     * imageDetection</p>
     */
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
        /**
         * <ol>
         * <li>The text content to be checked, with a maximum limit of 10,000 characters (including English and Chinese).</li>
         * <li>Or the URL address of the image to be checked.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>要检测的内容</p>
         */
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
