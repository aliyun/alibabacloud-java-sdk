// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableCrossRegionResponseBody extends TeaModel {
    /**
     * <p>An array that consists of destination regions for cross-region backups.</p>
     */
    @NameInMap("Regions")
    public DescribeAvailableCrossRegionResponseBodyRegions regions;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>39265F46-EC77-4036-8AC4-F035F32F6BE2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAvailableCrossRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableCrossRegionResponseBody self = new DescribeAvailableCrossRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableCrossRegionResponseBody setRegions(DescribeAvailableCrossRegionResponseBodyRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeAvailableCrossRegionResponseBodyRegions getRegions() {
        return this.regions;
    }

    public DescribeAvailableCrossRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAvailableCrossRegionResponseBodyRegions extends TeaModel {
        @NameInMap("Region")
        public java.util.List<String> region;

        public static DescribeAvailableCrossRegionResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableCrossRegionResponseBodyRegions self = new DescribeAvailableCrossRegionResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableCrossRegionResponseBodyRegions setRegion(java.util.List<String> region) {
            this.region = region;
            return this;
        }
        public java.util.List<String> getRegion() {
            return this.region;
        }

    }

}
