// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEipSegmentResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("EipSegments")
    @Validation(required = true)
    public DescribeEipSegmentResponseEipSegments eipSegments;

    public static DescribeEipSegmentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipSegmentResponse self = new DescribeEipSegmentResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeEipSegmentResponseEipSegmentsEipSegment extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Segment")
        @Validation(required = true)
        public String segment;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("IpCount")
        @Validation(required = true)
        public String ipCount;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Descritpion")
        @Validation(required = true)
        public String descritpion;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        public static DescribeEipSegmentResponseEipSegmentsEipSegment build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipSegmentResponseEipSegmentsEipSegment self = new DescribeEipSegmentResponseEipSegmentsEipSegment();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEipSegmentResponseEipSegments extends TeaModel {
        @NameInMap("EipSegment")
        @Validation(required = true)
        public java.util.List<DescribeEipSegmentResponseEipSegmentsEipSegment> eipSegment;

        public static DescribeEipSegmentResponseEipSegments build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipSegmentResponseEipSegments self = new DescribeEipSegmentResponseEipSegments();
            return TeaModel.build(map, self);
        }

    }

}
