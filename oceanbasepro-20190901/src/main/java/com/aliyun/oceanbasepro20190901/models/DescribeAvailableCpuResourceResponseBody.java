// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAvailableCpuResourceResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeAvailableCpuResourceResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAvailableCpuResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableCpuResourceResponseBody self = new DescribeAvailableCpuResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableCpuResourceResponseBody setData(java.util.List<DescribeAvailableCpuResourceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAvailableCpuResourceResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAvailableCpuResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAvailableCpuResourceResponseBodyData extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        @NameInMap("MaxCpu")
        public Long maxCpu;

        @NameInMap("MinCpu")
        public Long minCpu;

        @NameInMap("ReviewCode")
        public String reviewCode;

        @NameInMap("UnitNum")
        public Long unitNum;

        public static DescribeAvailableCpuResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableCpuResourceResponseBodyData self = new DescribeAvailableCpuResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableCpuResourceResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeAvailableCpuResourceResponseBodyData setMaxCpu(Long maxCpu) {
            this.maxCpu = maxCpu;
            return this;
        }
        public Long getMaxCpu() {
            return this.maxCpu;
        }

        public DescribeAvailableCpuResourceResponseBodyData setMinCpu(Long minCpu) {
            this.minCpu = minCpu;
            return this;
        }
        public Long getMinCpu() {
            return this.minCpu;
        }

        public DescribeAvailableCpuResourceResponseBodyData setReviewCode(String reviewCode) {
            this.reviewCode = reviewCode;
            return this;
        }
        public String getReviewCode() {
            return this.reviewCode;
        }

        public DescribeAvailableCpuResourceResponseBodyData setUnitNum(Long unitNum) {
            this.unitNum = unitNum;
            return this;
        }
        public Long getUnitNum() {
            return this.unitNum;
        }

    }

}
