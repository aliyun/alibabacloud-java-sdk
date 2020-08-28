// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnGatewayAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("VpnGatewayId")
    @Validation(required = true)
    public String vpnGatewayId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("AutoPropagate")
    public Boolean autoPropagate;

    public static ModifyVpnGatewayAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnGatewayAttributeRequest self = new ModifyVpnGatewayAttributeRequest();
        return TeaModel.build(map, self);
    }

}
