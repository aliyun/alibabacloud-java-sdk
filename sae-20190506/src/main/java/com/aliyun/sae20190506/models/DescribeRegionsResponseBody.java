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
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Regions")
    public DescribeRegionsResponseBodyRegions regions;

    /**
     * <p>The request ID.</p>
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
        @NameInMap("LocalName")
        public String localName;

        @NameInMap("RecommendZones")
        public DescribeRegionsResponseBodyRegionsRegionRecommendZones recommendZones;

        @NameInMap("RegionEndpoint")
        public String regionEndpoint;

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
