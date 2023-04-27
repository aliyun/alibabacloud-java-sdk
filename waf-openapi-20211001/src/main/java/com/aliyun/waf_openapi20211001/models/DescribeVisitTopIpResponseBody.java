// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeVisitTopIpResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The array of the top 10 IP addresses from which requests are sent.</p>
     */
    @NameInMap("TopIp")
    public java.util.List<DescribeVisitTopIpResponseBodyTopIp> topIp;

    public static DescribeVisitTopIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVisitTopIpResponseBody self = new DescribeVisitTopIpResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVisitTopIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVisitTopIpResponseBody setTopIp(java.util.List<DescribeVisitTopIpResponseBodyTopIp> topIp) {
        this.topIp = topIp;
        return this;
    }
    public java.util.List<DescribeVisitTopIpResponseBodyTopIp> getTopIp() {
        return this.topIp;
    }

    public static class DescribeVisitTopIpResponseBodyTopIp extends TeaModel {
        /**
         * <p>The ordinal number of the area to which the IP address belongs.</p>
         */
        @NameInMap("Area")
        public String area;

        /**
         * <p>The total number of requests that are sent from the IP address.</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The IP address.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The ISP.</p>
         */
        @NameInMap("Isp")
        public String isp;

        public static DescribeVisitTopIpResponseBodyTopIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeVisitTopIpResponseBodyTopIp self = new DescribeVisitTopIpResponseBodyTopIp();
            return TeaModel.build(map, self);
        }

        public DescribeVisitTopIpResponseBodyTopIp setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public DescribeVisitTopIpResponseBodyTopIp setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeVisitTopIpResponseBodyTopIp setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeVisitTopIpResponseBodyTopIp setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

    }

}
