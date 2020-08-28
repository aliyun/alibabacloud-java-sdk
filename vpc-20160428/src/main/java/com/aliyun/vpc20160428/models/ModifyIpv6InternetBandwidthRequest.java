// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIpv6InternetBandwidthRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Ipv6AddressId")
    public String ipv6AddressId;

    @NameInMap("Ipv6InternetBandwidthId")
    public String ipv6InternetBandwidthId;

    @NameInMap("Bandwidth")
    @Validation(required = true)
    public Long bandwidth;

    @NameInMap("ClientToken")
    public String clientToken;

    public static ModifyIpv6InternetBandwidthRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpv6InternetBandwidthRequest self = new ModifyIpv6InternetBandwidthRequest();
        return TeaModel.build(map, self);
    }

}
