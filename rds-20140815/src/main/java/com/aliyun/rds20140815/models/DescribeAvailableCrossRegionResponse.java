// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableCrossRegionResponse extends TeaModel {
    // description: 请求ID。; 
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

    public DescribeAvailableCrossRegionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableCrossRegionResponse setRegions(DescribeAvailableCrossRegionResponseRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeAvailableCrossRegionResponseRegions getRegions() {
        return this.regions;
    }

    public static class DescribeAvailableCrossRegionResponseRegions extends TeaModel {
        @NameInMap("Region")
        @Validation(required = true)
        public java.util.List<String> region;

        public static DescribeAvailableCrossRegionResponseRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableCrossRegionResponseRegions self = new DescribeAvailableCrossRegionResponseRegions();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableCrossRegionResponseRegions setRegion(java.util.List<String> region) {
            this.region = region;
            return this;
        }
        public java.util.List<String> getRegion() {
            return this.region;
        }

    }

}
