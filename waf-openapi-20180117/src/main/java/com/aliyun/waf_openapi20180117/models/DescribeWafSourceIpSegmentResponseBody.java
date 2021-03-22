// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class DescribeWafSourceIpSegmentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Ips")
    public String ips;

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

    public DescribeWafSourceIpSegmentResponseBody setIps(String ips) {
        this.ips = ips;
        return this;
    }
    public String getIps() {
        return this.ips;
    }

}
