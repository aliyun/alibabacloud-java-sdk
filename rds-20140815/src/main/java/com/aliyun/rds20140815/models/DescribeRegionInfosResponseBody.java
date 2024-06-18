// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRegionInfosResponseBody extends TeaModel {
    /**
     * <p>A list of regions.</p>
     */
    @NameInMap("Regions")
    public DescribeRegionInfosResponseBodyRegions regions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5414A4E5-4C36-4461-95FC-************</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRegionInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionInfosResponseBody self = new DescribeRegionInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionInfosResponseBody setRegions(DescribeRegionInfosResponseBodyRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeRegionInfosResponseBodyRegions getRegions() {
        return this.regions;
    }

    public DescribeRegionInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRegionInfosResponseBodyRegionsRDSRegion extends TeaModel {
        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeRegionInfosResponseBodyRegionsRDSRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionInfosResponseBodyRegionsRDSRegion self = new DescribeRegionInfosResponseBodyRegionsRDSRegion();
            return TeaModel.build(map, self);
        }

        public DescribeRegionInfosResponseBodyRegionsRDSRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeRegionInfosResponseBodyRegions extends TeaModel {
        @NameInMap("RDSRegion")
        public java.util.List<DescribeRegionInfosResponseBodyRegionsRDSRegion> RDSRegion;

        public static DescribeRegionInfosResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionInfosResponseBodyRegions self = new DescribeRegionInfosResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionInfosResponseBodyRegions setRDSRegion(java.util.List<DescribeRegionInfosResponseBodyRegionsRDSRegion> RDSRegion) {
            this.RDSRegion = RDSRegion;
            return this;
        }
        public java.util.List<DescribeRegionInfosResponseBodyRegionsRDSRegion> getRDSRegion() {
            return this.RDSRegion;
        }

    }

}
