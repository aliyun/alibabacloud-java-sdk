// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEipSegmentResponseBody extends TeaModel {
    @NameInMap("EipSegments")
    public DescribeEipSegmentResponseBodyEipSegments eipSegments;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeEipSegmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipSegmentResponseBody self = new DescribeEipSegmentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEipSegmentResponseBody setEipSegments(DescribeEipSegmentResponseBodyEipSegments eipSegments) {
        this.eipSegments = eipSegments;
        return this;
    }
    public DescribeEipSegmentResponseBodyEipSegments getEipSegments() {
        return this.eipSegments;
    }

    public DescribeEipSegmentResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEipSegmentResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEipSegmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEipSegmentResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEipSegmentResponseBodyEipSegmentsEipSegment extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Descritpion")
        public String descritpion;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IpCount")
        public String ipCount;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Segment")
        public String segment;

        @NameInMap("Status")
        public String status;

        public static DescribeEipSegmentResponseBodyEipSegmentsEipSegment build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipSegmentResponseBodyEipSegmentsEipSegment self = new DescribeEipSegmentResponseBodyEipSegmentsEipSegment();
            return TeaModel.build(map, self);
        }

        public DescribeEipSegmentResponseBodyEipSegmentsEipSegment setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeEipSegmentResponseBodyEipSegmentsEipSegment setDescritpion(String descritpion) {
            this.descritpion = descritpion;
            return this;
        }
        public String getDescritpion() {
            return this.descritpion;
        }

        public DescribeEipSegmentResponseBodyEipSegmentsEipSegment setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeEipSegmentResponseBodyEipSegmentsEipSegment setIpCount(String ipCount) {
            this.ipCount = ipCount;
            return this;
        }
        public String getIpCount() {
            return this.ipCount;
        }

        public DescribeEipSegmentResponseBodyEipSegmentsEipSegment setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEipSegmentResponseBodyEipSegmentsEipSegment setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEipSegmentResponseBodyEipSegmentsEipSegment setSegment(String segment) {
            this.segment = segment;
            return this;
        }
        public String getSegment() {
            return this.segment;
        }

        public DescribeEipSegmentResponseBodyEipSegmentsEipSegment setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeEipSegmentResponseBodyEipSegments extends TeaModel {
        @NameInMap("EipSegment")
        public java.util.List<DescribeEipSegmentResponseBodyEipSegmentsEipSegment> eipSegment;

        public static DescribeEipSegmentResponseBodyEipSegments build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipSegmentResponseBodyEipSegments self = new DescribeEipSegmentResponseBodyEipSegments();
            return TeaModel.build(map, self);
        }

        public DescribeEipSegmentResponseBodyEipSegments setEipSegment(java.util.List<DescribeEipSegmentResponseBodyEipSegmentsEipSegment> eipSegment) {
            this.eipSegment = eipSegment;
            return this;
        }
        public java.util.List<DescribeEipSegmentResponseBodyEipSegmentsEipSegment> getEipSegment() {
            return this.eipSegment;
        }

    }

}
