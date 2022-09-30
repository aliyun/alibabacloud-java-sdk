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
        @NameInMap("MaxCpu")
        public Long maxCpu;

        @NameInMap("MinCpu")
        public Long minCpu;

        @NameInMap("UnitNum")
        public Long unitNum;

        public static DescribeAvailableCpuResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableCpuResourceResponseBodyData self = new DescribeAvailableCpuResourceResponseBodyData();
            return TeaModel.build(map, self);
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

        public DescribeAvailableCpuResourceResponseBodyData setUnitNum(Long unitNum) {
            this.unitNum = unitNum;
            return this;
        }
        public Long getUnitNum() {
            return this.unitNum;
        }

    }

}
