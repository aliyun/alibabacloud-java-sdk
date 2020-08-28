// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

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

    public static class DescribeRegionsResponseRegionsRegion extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("LocalName")
        @Validation(required = true)
        public String localName;

        @NameInMap("RegionEndpoint")
        @Validation(required = true)
        public String regionEndpoint;

        public static DescribeRegionsResponseRegionsRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseRegionsRegion self = new DescribeRegionsResponseRegionsRegion();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRegionsResponseRegions extends TeaModel {
        @NameInMap("Region")
        @Validation(required = true)
        public java.util.List<DescribeRegionsResponseRegionsRegion> region;

        public static DescribeRegionsResponseRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseRegions self = new DescribeRegionsResponseRegions();
            return TeaModel.build(map, self);
        }

    }

}
