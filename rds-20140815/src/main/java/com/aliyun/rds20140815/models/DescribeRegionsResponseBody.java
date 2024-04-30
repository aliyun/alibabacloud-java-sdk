// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    /**
     * <p>The available regions and zones.</p>
     */
    @NameInMap("Regions")
    public DescribeRegionsResponseBodyRegions regions;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
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

    public static class DescribeRegionsResponseBodyRegionsRDSRegion extends TeaModel {
        /**
         * <p>The region name. The return value of this parameter is in the language that is specified by the **AcceptLanguage** parameter. For example, if the value of the RegionId parameter in the response is cn-hangzhou, the following values are returned for the LocalName parameter:</p>
         * <br>
         * <p>*   If the value of the **AcceptLanguage** parameter is **zh-CN**, the value  1（）is returned for the LocalName parameter.</p>
         * <p>*   If the value of the **AcceptLanguage** parameter is **en-US**, the value China (Hangzhou) is returned for the LocalName parameter.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The endpoint that is used to connect to Alibaba Cloud services in the region. For more information, see [Endpoints](~~610370~~).</p>
         */
        @NameInMap("RegionEndpoint")
        public String regionEndpoint;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The zone ID.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The zone name. The return value of this parameter is in the language that is specified by the **AcceptLanguage** parameter. For example, if the value of the ZoneId parameter in the response is cn-hangzhou-h, the following values are returned for the ZoneName parameter:</p>
         * <br>
         * <p>*   If the value of the **AcceptLanguage** parameter is **zh-CN**, the value   H is returned for the ZoneName parameter.</p>
         * <p>*   If the value of the **AcceptLanguage** parameter is **en-US**, the value Hangzhou Zone H is returned for the ZoneName parameter.</p>
         */
        @NameInMap("ZoneName")
        public String zoneName;

        public static DescribeRegionsResponseBodyRegionsRDSRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegionsRDSRegion self = new DescribeRegionsResponseBodyRegionsRDSRegion();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegionsRDSRegion setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeRegionsResponseBodyRegionsRDSRegion setRegionEndpoint(String regionEndpoint) {
            this.regionEndpoint = regionEndpoint;
            return this;
        }
        public String getRegionEndpoint() {
            return this.regionEndpoint;
        }

        public DescribeRegionsResponseBodyRegionsRDSRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRegionsResponseBodyRegionsRDSRegion setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeRegionsResponseBodyRegionsRDSRegion setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

    public static class DescribeRegionsResponseBodyRegions extends TeaModel {
        @NameInMap("RDSRegion")
        public java.util.List<DescribeRegionsResponseBodyRegionsRDSRegion> RDSRegion;

        public static DescribeRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegions self = new DescribeRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegions setRDSRegion(java.util.List<DescribeRegionsResponseBodyRegionsRDSRegion> RDSRegion) {
            this.RDSRegion = RDSRegion;
            return this;
        }
        public java.util.List<DescribeRegionsResponseBodyRegionsRDSRegion> getRDSRegion() {
            return this.RDSRegion;
        }

    }

}
