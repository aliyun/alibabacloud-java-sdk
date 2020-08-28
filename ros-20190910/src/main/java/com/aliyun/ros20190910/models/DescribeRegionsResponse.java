// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Regions")
    @Validation(required = true)
    public java.util.List<DescribeRegionsResponseRegions> regions;

    public static DescribeRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponse self = new DescribeRegionsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeRegionsResponseRegions extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("LocalName")
        @Validation(required = true)
        public String localName;

        @NameInMap("RegionEndpoint")
        @Validation(required = true)
        public String regionEndpoint;

        public static DescribeRegionsResponseRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseRegions self = new DescribeRegionsResponseRegions();
            return TeaModel.build(map, self);
        }

    }

}
