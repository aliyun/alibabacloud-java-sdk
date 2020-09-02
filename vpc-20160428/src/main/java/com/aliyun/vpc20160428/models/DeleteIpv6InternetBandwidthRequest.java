// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIpv6InternetBandwidthRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Ipv6AddressId")
    public String ipv6AddressId;

    @NameInMap("Ipv6InternetBandwidthId")
    public String ipv6InternetBandwidthId;

    public static DeleteIpv6InternetBandwidthRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpv6InternetBandwidthRequest self = new DeleteIpv6InternetBandwidthRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIpv6InternetBandwidthRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteIpv6InternetBandwidthRequest setIpv6AddressId(String ipv6AddressId) {
        this.ipv6AddressId = ipv6AddressId;
        return this;
    }
    public String getIpv6AddressId() {
        return this.ipv6AddressId;
    }

    public DeleteIpv6InternetBandwidthRequest setIpv6InternetBandwidthId(String ipv6InternetBandwidthId) {
        this.ipv6InternetBandwidthId = ipv6InternetBandwidthId;
        return this;
    }
    public String getIpv6InternetBandwidthId() {
        return this.ipv6InternetBandwidthId;
    }

}
