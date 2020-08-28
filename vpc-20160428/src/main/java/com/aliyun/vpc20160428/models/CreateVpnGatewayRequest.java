// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnGatewayRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Name")
    public String name;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("Bandwidth")
    @Validation(required = true)
    public Integer bandwidth;

    @NameInMap("EnableIpsec")
    public Boolean enableIpsec;

    @NameInMap("EnableSsl")
    public Boolean enableSsl;

    @NameInMap("SslConnections")
    public Integer sslConnections;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateVpnGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnGatewayRequest self = new CreateVpnGatewayRequest();
        return TeaModel.build(map, self);
    }

}
