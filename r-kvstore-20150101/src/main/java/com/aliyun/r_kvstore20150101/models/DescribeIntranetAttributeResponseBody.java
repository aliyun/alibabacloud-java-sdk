// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeIntranetAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IntranetBandwidth")
    public Integer intranetBandwidth;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("BandwidthExpireTime")
    public String bandwidthExpireTime;

    public static DescribeIntranetAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIntranetAttributeResponseBody self = new DescribeIntranetAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIntranetAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIntranetAttributeResponseBody setIntranetBandwidth(Integer intranetBandwidth) {
        this.intranetBandwidth = intranetBandwidth;
        return this;
    }
    public Integer getIntranetBandwidth() {
        return this.intranetBandwidth;
    }

    public DescribeIntranetAttributeResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeIntranetAttributeResponseBody setBandwidthExpireTime(String bandwidthExpireTime) {
        this.bandwidthExpireTime = bandwidthExpireTime;
        return this;
    }
    public String getBandwidthExpireTime() {
        return this.bandwidthExpireTime;
    }

}
