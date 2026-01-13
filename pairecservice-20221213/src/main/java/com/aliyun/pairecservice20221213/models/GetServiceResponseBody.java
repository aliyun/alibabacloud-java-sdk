// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>this is a test rec engine</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("EngineConfigId")
    public String engineConfigId;

    /**
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtReleasedTime")
    public String gmtReleasedTime;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ImageAuth")
    public String imageAuth;

    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("LatestProdReleaseOrder")
    public GetServiceResponseBodyLatestProdReleaseOrder latestProdReleaseOrder;

    /**
     * <strong>example:</strong>
     * <p>test_rec</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <strong>example:</strong>
     * <p>D75C43DC-3D3A-5CC8-9AAC-8C77306C433B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;Port&quot;:8080}</p>
     */
    @NameInMap("ServiceConfig")
    public String serviceConfig;

    /**
     * <strong>example:</strong>
     * <p>eas-resource-xxx</p>
     */
    @NameInMap("ServiceResourceUri")
    public String serviceResourceUri;

    public static GetServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceResponseBody self = new GetServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetServiceResponseBody setEngineConfigId(String engineConfigId) {
        this.engineConfigId = engineConfigId;
        return this;
    }
    public String getEngineConfigId() {
        return this.engineConfigId;
    }

    public GetServiceResponseBody setGmtReleasedTime(String gmtReleasedTime) {
        this.gmtReleasedTime = gmtReleasedTime;
        return this;
    }
    public String getGmtReleasedTime() {
        return this.gmtReleasedTime;
    }

    public GetServiceResponseBody setImageAuth(String imageAuth) {
        this.imageAuth = imageAuth;
        return this;
    }
    public String getImageAuth() {
        return this.imageAuth;
    }

    public GetServiceResponseBody setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public GetServiceResponseBody setLatestProdReleaseOrder(GetServiceResponseBodyLatestProdReleaseOrder latestProdReleaseOrder) {
        this.latestProdReleaseOrder = latestProdReleaseOrder;
        return this;
    }
    public GetServiceResponseBodyLatestProdReleaseOrder getLatestProdReleaseOrder() {
        return this.latestProdReleaseOrder;
    }

    public GetServiceResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetServiceResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceResponseBody setServiceConfig(String serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }
    public String getServiceConfig() {
        return this.serviceConfig;
    }

    public GetServiceResponseBody setServiceResourceUri(String serviceResourceUri) {
        this.serviceResourceUri = serviceResourceUri;
        return this;
    }
    public String getServiceResourceUri() {
        return this.serviceResourceUri;
    }

    public static class GetServiceResponseBodyLatestProdReleaseOrder extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>update golang version to 1.22</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>2.0.0</p>
         */
        @NameInMap("ImageVersion")
        public String imageVersion;

        /**
         * <strong>example:</strong>
         * <p>{
         *     &quot;Pre&quot;: {
         *     &quot;Status&quot;: &quot;Released&quot;,
         *     &quot;GmtReleasedTime&quot; : &quot;2021-12-15T23:24:33.132+08:00&quot;,
         *   },
         *   &quot;Prod&quot;: {
         *     &quot;Status&quot;: &quot;Released&quot;,
         *     &quot;GmtReleasedTime&quot; : &quot;2021-12-15T23:24:33.132+08:00&quot;,
         *   }
         * }</p>
         */
        @NameInMap("ReleaseInfo")
        public String releaseInfo;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ReleaseOrderId")
        public String releaseOrderId;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:E-xxx.xxx-@xxx.onaliyun.com">E-xxx.xxx-@xxx.onaliyun.com</a></p>
         */
        @NameInMap("Releaser")
        public String releaser;

        /**
         * <strong>example:</strong>
         * <p>update version</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static GetServiceResponseBodyLatestProdReleaseOrder build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyLatestProdReleaseOrder self = new GetServiceResponseBodyLatestProdReleaseOrder();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyLatestProdReleaseOrder setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetServiceResponseBodyLatestProdReleaseOrder setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public GetServiceResponseBodyLatestProdReleaseOrder setReleaseInfo(String releaseInfo) {
            this.releaseInfo = releaseInfo;
            return this;
        }
        public String getReleaseInfo() {
            return this.releaseInfo;
        }

        public GetServiceResponseBodyLatestProdReleaseOrder setReleaseOrderId(String releaseOrderId) {
            this.releaseOrderId = releaseOrderId;
            return this;
        }
        public String getReleaseOrderId() {
            return this.releaseOrderId;
        }

        public GetServiceResponseBodyLatestProdReleaseOrder setReleaser(String releaser) {
            this.releaser = releaser;
            return this;
        }
        public String getReleaser() {
            return this.releaser;
        }

        public GetServiceResponseBodyLatestProdReleaseOrder setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

}
