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

}
