// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DescribeHighPriorityIpsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("HighPriorityIps")
    public DescribeHighPriorityIpsResponseBodyHighPriorityIps highPriorityIps;

    public static DescribeHighPriorityIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHighPriorityIpsResponseBody self = new DescribeHighPriorityIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHighPriorityIpsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeHighPriorityIpsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHighPriorityIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHighPriorityIpsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHighPriorityIpsResponseBody setHighPriorityIps(DescribeHighPriorityIpsResponseBodyHighPriorityIps highPriorityIps) {
        this.highPriorityIps = highPriorityIps;
        return this;
    }
    public DescribeHighPriorityIpsResponseBodyHighPriorityIps getHighPriorityIps() {
        return this.highPriorityIps;
    }

    public static class DescribeHighPriorityIpsResponseBodyHighPriorityIpsHighPriorityIp extends TeaModel {
        @NameInMap("AreaId")
        public String areaId;

        @NameInMap("Destination")
        public String destination;

        public static DescribeHighPriorityIpsResponseBodyHighPriorityIpsHighPriorityIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeHighPriorityIpsResponseBodyHighPriorityIpsHighPriorityIp self = new DescribeHighPriorityIpsResponseBodyHighPriorityIpsHighPriorityIp();
            return TeaModel.build(map, self);
        }

        public DescribeHighPriorityIpsResponseBodyHighPriorityIpsHighPriorityIp setAreaId(String areaId) {
            this.areaId = areaId;
            return this;
        }
        public String getAreaId() {
            return this.areaId;
        }

        public DescribeHighPriorityIpsResponseBodyHighPriorityIpsHighPriorityIp setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

    }

    public static class DescribeHighPriorityIpsResponseBodyHighPriorityIps extends TeaModel {
        @NameInMap("HighPriorityIp")
        public java.util.List<DescribeHighPriorityIpsResponseBodyHighPriorityIpsHighPriorityIp> highPriorityIp;

        public static DescribeHighPriorityIpsResponseBodyHighPriorityIps build(java.util.Map<String, ?> map) throws Exception {
            DescribeHighPriorityIpsResponseBodyHighPriorityIps self = new DescribeHighPriorityIpsResponseBodyHighPriorityIps();
            return TeaModel.build(map, self);
        }

        public DescribeHighPriorityIpsResponseBodyHighPriorityIps setHighPriorityIp(java.util.List<DescribeHighPriorityIpsResponseBodyHighPriorityIpsHighPriorityIp> highPriorityIp) {
            this.highPriorityIp = highPriorityIp;
            return this;
        }
        public java.util.List<DescribeHighPriorityIpsResponseBodyHighPriorityIpsHighPriorityIp> getHighPriorityIp() {
            return this.highPriorityIp;
        }

    }

}
