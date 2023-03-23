// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>- **2xx**: The call was successful.</p>
     * <p>- **3xx**: The call was redirected.</p>
     * <p>- **4xx**: The call failed.</p>
     * <p>- **5xx**: A server error occurred.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>No request parameters are required.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Regions")
    public DescribeRegionsResponseBodyRegions regions;

    /**
     * <p>The returned information.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeRegionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRegionsResponseBody setRegions(DescribeRegionsResponseBodyRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeRegionsResponseBodyRegions getRegions() {
        return this.regions;
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRegionsResponseBodyRegionsRegionRecommendZones extends TeaModel {
        @NameInMap("RecommendZone")
        public java.util.List<String> recommendZone;

        public static DescribeRegionsResponseBodyRegionsRegionRecommendZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegionsRegionRecommendZones self = new DescribeRegionsResponseBodyRegionsRegionRecommendZones();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegionsRegionRecommendZones setRecommendZone(java.util.List<String> recommendZone) {
            this.recommendZone = recommendZone;
            return this;
        }
        public java.util.List<String> getRecommendZone() {
            return this.recommendZone;
        }

    }

    public static class DescribeRegionsResponseBodyRegionsRegion extends TeaModel {
        /**
         * <p>The list of regions.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The ID of the region. Valid values:</p>
         * <br>
         * <p>*   **cn-hangzhou**: the ID of the China (Hangzhou) region</p>
         * <p>*   **cn-shanghai**: the ID of the China (Shanghai) region</p>
         * <p>*   **cn-beijing**: the ID of the China (Beijing) region</p>
         * <p>*   **cn-zhangjiakou**: the ID of the China (Zhangjiakou) region</p>
         * <p>*   **cn-shenzhen**: the ID of the China (Shenzhen) region</p>
         * <p>*   **cn-guangzhou**: the ID of the China (Guangzhou) region</p>
         * <p>*   **cn-hongkong**: the ID of the China (Hong Kong) region</p>
         * <p>*   **ap-southeast-1**: the ID of the Singapore region</p>
         * <p>*   **us-west-1**: the ID of the US (Silicon Valley) region</p>
         */
        @NameInMap("RecommendZones")
        public DescribeRegionsResponseBodyRegionsRegionRecommendZones recommendZones;

        /**
         * <p>The name of the region. Valid values:</p>
         * <br>
         * <p>*   **China (Hangzhou)**</p>
         * <p>*   **China (Shanghai)**</p>
         * <p>*   **China (Beijing)**</p>
         * <p>*   **China (Zhangjiakou)**</p>
         * <p>*   **China (Shenzhen)**</p>
         * <p>*   **China (Guangzhou)**</p>
         * <p>*   **China (Hong Kong)**</p>
         * <p>*   **Singapore (Singapore)**</p>
         * <p>*   **US (Silicon Valley)**</p>
         */
        @NameInMap("RegionEndpoint")
        public String regionEndpoint;

        /**
         * <p>The endpoint of the region. Valid values:</p>
         * <br>
         * <p>*   **sae.cn-hangzhou.aliyuncs.com**</p>
         * <p>*   **sae.cn-shanghai.aliyuncs.com**</p>
         * <p>*   **sae.cn-beijing.aliyuncs.com**</p>
         * <p>*   **sae.cn-zhangjiakou.aliyuncs.com**</p>
         * <p>*   **sae.cn-shenzhen.aliyuncs.com**</p>
         * <p>*   **sae.cn-guangzhou.aliyuncs.com**</p>
         * <p>*   **sae.cn-hongkong.aliyuncs.com**</p>
         * <p>*   **sae.ap-southeast-1.aliyuncs.com**</p>
         * <p>*   **sae.us-west-1.aliyuncs.com**</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeRegionsResponseBodyRegionsRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegionsRegion self = new DescribeRegionsResponseBodyRegionsRegion();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegionsRegion setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeRegionsResponseBodyRegionsRegion setRecommendZones(DescribeRegionsResponseBodyRegionsRegionRecommendZones recommendZones) {
            this.recommendZones = recommendZones;
            return this;
        }
        public DescribeRegionsResponseBodyRegionsRegionRecommendZones getRecommendZones() {
            return this.recommendZones;
        }

        public DescribeRegionsResponseBodyRegionsRegion setRegionEndpoint(String regionEndpoint) {
            this.regionEndpoint = regionEndpoint;
            return this;
        }
        public String getRegionEndpoint() {
            return this.regionEndpoint;
        }

        public DescribeRegionsResponseBodyRegionsRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeRegionsResponseBodyRegions extends TeaModel {
        @NameInMap("Region")
        public java.util.List<DescribeRegionsResponseBodyRegionsRegion> region;

        public static DescribeRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegions self = new DescribeRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegions setRegion(java.util.List<DescribeRegionsResponseBodyRegionsRegion> region) {
            this.region = region;
            return this;
        }
        public java.util.List<DescribeRegionsResponseBodyRegionsRegion> getRegion() {
            return this.region;
        }

    }

}
