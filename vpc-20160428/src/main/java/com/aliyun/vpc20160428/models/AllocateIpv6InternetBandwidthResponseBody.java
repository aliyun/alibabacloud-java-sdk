// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateIpv6InternetBandwidthResponseBody extends TeaModel {
    @NameInMap("InternetBandwidthId")
    public String internetBandwidthId;

    @NameInMap("Ipv6AddressId")
    public String ipv6AddressId;

    @NameInMap("RequestId")
    public String requestId;

    public static AllocateIpv6InternetBandwidthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateIpv6InternetBandwidthResponseBody self = new AllocateIpv6InternetBandwidthResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateIpv6InternetBandwidthResponseBody setInternetBandwidthId(String internetBandwidthId) {
        this.internetBandwidthId = internetBandwidthId;
        return this;
    }
    public String getInternetBandwidthId() {
        return this.internetBandwidthId;
    }

    public AllocateIpv6InternetBandwidthResponseBody setIpv6AddressId(String ipv6AddressId) {
        this.ipv6AddressId = ipv6AddressId;
        return this;
    }
    public String getIpv6AddressId() {
        return this.ipv6AddressId;
    }

    public AllocateIpv6InternetBandwidthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
