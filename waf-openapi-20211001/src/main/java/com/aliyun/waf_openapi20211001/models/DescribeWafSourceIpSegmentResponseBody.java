// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeWafSourceIpSegmentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WafSourceIp")
    public DescribeWafSourceIpSegmentResponseBodyWafSourceIp wafSourceIp;

    public static DescribeWafSourceIpSegmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWafSourceIpSegmentResponseBody self = new DescribeWafSourceIpSegmentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWafSourceIpSegmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWafSourceIpSegmentResponseBody setWafSourceIp(DescribeWafSourceIpSegmentResponseBodyWafSourceIp wafSourceIp) {
        this.wafSourceIp = wafSourceIp;
        return this;
    }
    public DescribeWafSourceIpSegmentResponseBodyWafSourceIp getWafSourceIp() {
        return this.wafSourceIp;
    }

    public static class DescribeWafSourceIpSegmentResponseBodyWafSourceIp extends TeaModel {
        @NameInMap("IPv4")
        public java.util.List<String> IPv4;

        @NameInMap("IPv6")
        public java.util.List<String> IPv6;

        public static DescribeWafSourceIpSegmentResponseBodyWafSourceIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeWafSourceIpSegmentResponseBodyWafSourceIp self = new DescribeWafSourceIpSegmentResponseBodyWafSourceIp();
            return TeaModel.build(map, self);
        }

        public DescribeWafSourceIpSegmentResponseBodyWafSourceIp setIPv4(java.util.List<String> IPv4) {
            this.IPv4 = IPv4;
            return this;
        }
        public java.util.List<String> getIPv4() {
            return this.IPv4;
        }

        public DescribeWafSourceIpSegmentResponseBodyWafSourceIp setIPv6(java.util.List<String> IPv6) {
            this.IPv6 = IPv6;
            return this;
        }
        public java.util.List<String> getIPv6() {
            return this.IPv6;
        }

    }

}
