// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateIpv6InternetBandwidthResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Ipv6AddressId")
    @Validation(required = true)
    public String ipv6AddressId;

    @NameInMap("InternetBandwidthId")
    @Validation(required = true)
    public String internetBandwidthId;

    public static AllocateIpv6InternetBandwidthResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateIpv6InternetBandwidthResponse self = new AllocateIpv6InternetBandwidthResponse();
        return TeaModel.build(map, self);
    }

    public AllocateIpv6InternetBandwidthResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AllocateIpv6InternetBandwidthResponse setIpv6AddressId(String ipv6AddressId) {
        this.ipv6AddressId = ipv6AddressId;
        return this;
    }
    public String getIpv6AddressId() {
        return this.ipv6AddressId;
    }

    public AllocateIpv6InternetBandwidthResponse setInternetBandwidthId(String internetBandwidthId) {
        this.internetBandwidthId = internetBandwidthId;
        return this;
    }
    public String getInternetBandwidthId() {
        return this.internetBandwidthId;
    }

}
