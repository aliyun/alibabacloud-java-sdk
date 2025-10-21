// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ModelOutputContentSyncDetectRequest extends TeaModel {
    /**
     * <p>Request object</p>
     */
    @NameInMap("BodyData")
    public ModelOutputContentSyncDetectRequestBodyData bodyData;

    /**
     * <p>Policy ID</p>
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

    public static ModelOutputContentSyncDetectRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelOutputContentSyncDetectRequest self = new ModelOutputContentSyncDetectRequest();
        return TeaModel.build(map, self);
    }

    public ModelOutputContentSyncDetectRequest setBodyData(ModelOutputContentSyncDetectRequestBodyData bodyData) {
        this.bodyData = bodyData;
        return this;
    }
    public ModelOutputContentSyncDetectRequestBodyData getBodyData() {
        return this.bodyData;
    }

    public ModelOutputContentSyncDetectRequest setPolicyIdentifier(String policyIdentifier) {
        this.policyIdentifier = policyIdentifier;
        return this;
    }
    public String getPolicyIdentifier() {
        return this.policyIdentifier;
    }

    public ModelOutputContentSyncDetectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModelOutputContentSyncDetectRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public ModelOutputContentSyncDetectRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public static class ModelOutputContentSyncDetectRequestBodyData extends TeaModel {
        /**
         * <ol>
         * <li>The text content to be reviewed, with a maximum limit of 10,000 characters (including English and Chinese).</li>
         * <li>Or the URL address of the image to be reviewed.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>the content to be checked</p>
         */
        @NameInMap("Content")
        public String content;

        public static ModelOutputContentSyncDetectRequestBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelOutputContentSyncDetectRequestBodyData self = new ModelOutputContentSyncDetectRequestBodyData();
            return TeaModel.build(map, self);
        }

        public ModelOutputContentSyncDetectRequestBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
