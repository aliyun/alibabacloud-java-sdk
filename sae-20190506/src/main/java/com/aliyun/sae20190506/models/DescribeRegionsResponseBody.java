// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: The call was successful.</li>
     * <li><strong>3xx</strong>: The call was redirected.</li>
     * <li><strong>4xx</strong>: The call failed.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>No request parameters are required.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
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
     * 
     * <strong>example:</strong>
     * <p>DDE85827-B0B3-4E56-86E8-17C42009****</p>
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
         * <ul>
         * <li><strong>cn-hangzhou</strong>: the ID of the China (Hangzhou) region</li>
         * <li><strong>cn-shanghai</strong>: the ID of the China (Shanghai) region</li>
         * <li><strong>cn-beijing</strong>: the ID of the China (Beijing) region</li>
         * <li><strong>cn-zhangjiakou</strong>: the ID of the China (Zhangjiakou) region</li>
         * <li><strong>cn-shenzhen</strong>: the ID of the China (Shenzhen) region</li>
         * <li><strong>cn-guangzhou</strong>: the ID of the China (Guangzhou) region</li>
         * <li><strong>cn-hongkong</strong>: the ID of the China (Hong Kong) region</li>
         * <li><strong>ap-southeast-1</strong>: the ID of the Singapore region</li>
         * <li><strong>us-west-1</strong>: the ID of the US (Silicon Valley) region</li>
         * </ul>
         */
        @NameInMap("RecommendZones")
        public DescribeRegionsResponseBodyRegionsRegionRecommendZones recommendZones;

        /**
         * <p>The name of the region. Valid values:</p>
         * <ul>
         * <li><strong>China (Hangzhou)</strong></li>
         * <li><strong>China (Shanghai)</strong></li>
         * <li><strong>China (Beijing)</strong></li>
         * <li><strong>China (Zhangjiakou)</strong></li>
         * <li><strong>China (Shenzhen)</strong></li>
         * <li><strong>China (Guangzhou)</strong></li>
         * <li><strong>China (Hong Kong)</strong></li>
         * <li><strong>Singapore (Singapore)</strong></li>
         * <li><strong>US (Silicon Valley)</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sae.cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("RegionEndpoint")
        public String regionEndpoint;

        /**
         * <p>The endpoint of the region. Valid values:</p>
         * <ul>
         * <li><strong>sae.cn-hangzhou.aliyuncs.com</strong></li>
         * <li><strong>sae.cn-shanghai.aliyuncs.com</strong></li>
         * <li><strong>sae.cn-beijing.aliyuncs.com</strong></li>
         * <li><strong>sae.cn-zhangjiakou.aliyuncs.com</strong></li>
         * <li><strong>sae.cn-shenzhen.aliyuncs.com</strong></li>
         * <li><strong>sae.cn-guangzhou.aliyuncs.com</strong></li>
         * <li><strong>sae.cn-hongkong.aliyuncs.com</strong></li>
         * <li><strong>sae.ap-southeast-1.aliyuncs.com</strong></li>
         * <li><strong>sae.us-west-1.aliyuncs.com</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
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
