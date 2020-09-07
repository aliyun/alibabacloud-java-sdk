// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Regions")
    @Validation(required = true)
    public DescribeRegionsResponseRegions regions;

    public static DescribeRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponse self = new DescribeRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionsResponse setRegions(DescribeRegionsResponseRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeRegionsResponseRegions getRegions() {
        return this.regions;
    }

    public static class DescribeRegionsResponseRegionsRDSRegion extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        public static DescribeRegionsResponseRegionsRDSRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseRegionsRDSRegion self = new DescribeRegionsResponseRegionsRDSRegion();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseRegionsRDSRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRegionsResponseRegionsRDSRegion setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeRegionsResponseRegions extends TeaModel {
        @NameInMap("RDSRegion")
        @Validation(required = true)
        public java.util.List<DescribeRegionsResponseRegionsRDSRegion> RDSRegion;

        public static DescribeRegionsResponseRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseRegions self = new DescribeRegionsResponseRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseRegions setRDSRegion(java.util.List<DescribeRegionsResponseRegionsRDSRegion> RDSRegion) {
            this.RDSRegion = RDSRegion;
            return this;
        }
        public java.util.List<DescribeRegionsResponseRegionsRDSRegion> getRDSRegion() {
            return this.RDSRegion;
        }

    }

}
