// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateIpv6InternetBandwidthRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Ipv6GatewayId")
    @Validation(required = true)
    public String ipv6GatewayId;

    @NameInMap("Ipv6AddressId")
    @Validation(required = true)
    public String ipv6AddressId;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("Bandwidth")
    @Validation(required = true)
    public Integer bandwidth;

    @NameInMap("ClientToken")
    public String clientToken;

    public static AllocateIpv6InternetBandwidthRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateIpv6InternetBandwidthRequest self = new AllocateIpv6InternetBandwidthRequest();
        return TeaModel.build(map, self);
    }

}
