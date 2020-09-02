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

    public DescribeEipSegmentResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEipSegmentResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeEipSegmentResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEipSegmentResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEipSegmentResponse setEipSegments(DescribeEipSegmentResponseEipSegments eipSegments) {
        this.eipSegments = eipSegments;
        return this;
    }
    public DescribeEipSegmentResponseEipSegments getEipSegments() {
        return this.eipSegments;
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

        public DescribeEipSegmentResponseEipSegmentsEipSegment setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeEipSegmentResponseEipSegmentsEipSegment setSegment(String segment) {
            this.segment = segment;
            return this;
        }
        public String getSegment() {
            return this.segment;
        }

        public DescribeEipSegmentResponseEipSegmentsEipSegment setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeEipSegmentResponseEipSegmentsEipSegment setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEipSegmentResponseEipSegmentsEipSegment setIpCount(String ipCount) {
            this.ipCount = ipCount;
            return this;
        }
        public String getIpCount() {
            return this.ipCount;
        }

        public DescribeEipSegmentResponseEipSegmentsEipSegment setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEipSegmentResponseEipSegmentsEipSegment setDescritpion(String descritpion) {
            this.descritpion = descritpion;
            return this;
        }
        public String getDescritpion() {
            return this.descritpion;
        }

        public DescribeEipSegmentResponseEipSegmentsEipSegment setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
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

        public DescribeEipSegmentResponseEipSegments setEipSegment(java.util.List<DescribeEipSegmentResponseEipSegmentsEipSegment> eipSegment) {
            this.eipSegment = eipSegment;
            return this;
        }
        public java.util.List<DescribeEipSegmentResponseEipSegmentsEipSegment> getEipSegment() {
            return this.eipSegment;
        }

    }

}
