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

    }

    public static class DescribeRegionsResponseRegions extends TeaModel {
        @NameInMap("RDSRegion")
        @Validation(required = true)
        public java.util.List<DescribeRegionsResponseRegionsRDSRegion> RDSRegion;

        public static DescribeRegionsResponseRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseRegions self = new DescribeRegionsResponseRegions();
            return TeaModel.build(map, self);
        }

    }

}
