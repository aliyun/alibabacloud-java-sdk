// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnConnectionRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CustomerGatewayId")
    @Validation(required = true)
    public String customerGatewayId;

    @NameInMap("VpnGatewayId")
    @Validation(required = true)
    public String vpnGatewayId;

    @NameInMap("Name")
    public String name;

    @NameInMap("LocalSubnet")
    @Validation(required = true)
    public String localSubnet;

    @NameInMap("RemoteSubnet")
    @Validation(required = true)
    public String remoteSubnet;

    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    @NameInMap("IkeConfig")
    public String ikeConfig;

    @NameInMap("IpsecConfig")
    public String ipsecConfig;

    @NameInMap("HealthCheckConfig")
    public String healthCheckConfig;

    @NameInMap("AutoConfigRoute")
    public Boolean autoConfigRoute;

    @NameInMap("EnableDpd")
    public Boolean enableDpd;

    @NameInMap("EnableNatTraversal")
    public Boolean enableNatTraversal;

    @NameInMap("BgpConfig")
    public String bgpConfig;

    public static CreateVpnConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnConnectionRequest self = new CreateVpnConnectionRequest();
        return TeaModel.build(map, self);
    }

}
