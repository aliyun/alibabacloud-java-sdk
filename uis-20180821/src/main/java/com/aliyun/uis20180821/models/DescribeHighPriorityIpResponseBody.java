// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DescribeHighPriorityIpResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("HighPriorityIps")
    public DescribeHighPriorityIpResponseBodyHighPriorityIps highPriorityIps;

    public static DescribeHighPriorityIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHighPriorityIpResponseBody self = new DescribeHighPriorityIpResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHighPriorityIpResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeHighPriorityIpResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHighPriorityIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHighPriorityIpResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHighPriorityIpResponseBody setHighPriorityIps(DescribeHighPriorityIpResponseBodyHighPriorityIps highPriorityIps) {
        this.highPriorityIps = highPriorityIps;
        return this;
    }
    public DescribeHighPriorityIpResponseBodyHighPriorityIps getHighPriorityIps() {
        return this.highPriorityIps;
    }

    public static class DescribeHighPriorityIpResponseBodyHighPriorityIpsHighPriorityIp extends TeaModel {
        @NameInMap("StaticOffAreaId")
        public String staticOffAreaId;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("DynamicOffAreaId")
        public String dynamicOffAreaId;

        @NameInMap("State")
        public String state;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("BoardAreaId")
        public String boardAreaId;

        public static DescribeHighPriorityIpResponseBodyHighPriorityIpsHighPriorityIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeHighPriorityIpResponseBodyHighPriorityIpsHighPriorityIp self = new DescribeHighPriorityIpResponseBodyHighPriorityIpsHighPriorityIp();
            return TeaModel.build(map, self);
        }

        public DescribeHighPriorityIpResponseBodyHighPriorityIpsHighPriorityIp setStaticOffAreaId(String staticOffAreaId) {
            this.staticOffAreaId = staticOffAreaId;
            return this;
        }
        public String getStaticOffAreaId() {
            return this.staticOffAreaId;
        }

        public DescribeHighPriorityIpResponseBodyHighPriorityIpsHighPriorityIp setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeHighPriorityIpResponseBodyHighPriorityIpsHighPriorityIp setDynamicOffAreaId(String dynamicOffAreaId) {
            this.dynamicOffAreaId = dynamicOffAreaId;
            return this;
        }
        public String getDynamicOffAreaId() {
            return this.dynamicOffAreaId;
        }

        public DescribeHighPriorityIpResponseBodyHighPriorityIpsHighPriorityIp setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeHighPriorityIpResponseBodyHighPriorityIpsHighPriorityIp setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeHighPriorityIpResponseBodyHighPriorityIpsHighPriorityIp setBoardAreaId(String boardAreaId) {
            this.boardAreaId = boardAreaId;
            return this;
        }
        public String getBoardAreaId() {
            return this.boardAreaId;
        }

    }

    public static class DescribeHighPriorityIpResponseBodyHighPriorityIps extends TeaModel {
        @NameInMap("HighPriorityIp")
        public java.util.List<DescribeHighPriorityIpResponseBodyHighPriorityIpsHighPriorityIp> highPriorityIp;

        public static DescribeHighPriorityIpResponseBodyHighPriorityIps build(java.util.Map<String, ?> map) throws Exception {
            DescribeHighPriorityIpResponseBodyHighPriorityIps self = new DescribeHighPriorityIpResponseBodyHighPriorityIps();
            return TeaModel.build(map, self);
        }

        public DescribeHighPriorityIpResponseBodyHighPriorityIps setHighPriorityIp(java.util.List<DescribeHighPriorityIpResponseBodyHighPriorityIpsHighPriorityIp> highPriorityIp) {
            this.highPriorityIp = highPriorityIp;
            return this;
        }
        public java.util.List<DescribeHighPriorityIpResponseBodyHighPriorityIpsHighPriorityIp> getHighPriorityIp() {
            return this.highPriorityIp;
        }

    }

}
