// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableCrossRegionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Regions")
    @Validation(required = true)
    public DescribeAvailableCrossRegionResponseRegions regions;

    public static DescribeAvailableCrossRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableCrossRegionResponse self = new DescribeAvailableCrossRegionResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeAvailableCrossRegionResponseRegions extends TeaModel {
        @NameInMap("Region")
        @Validation(required = true)
        public java.util.List<String> region;

        public static DescribeAvailableCrossRegionResponseRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableCrossRegionResponseRegions self = new DescribeAvailableCrossRegionResponseRegions();
            return TeaModel.build(map, self);
        }

    }

}
