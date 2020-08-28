// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnGatewayAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VpnGatewayId")
    @Validation(required = true)
    public String vpnGatewayId;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("VSwitchId")
    @Validation(required = true)
    public String vSwitchId;

    @NameInMap("InternetIp")
    @Validation(required = true)
    public String internetIp;

    @NameInMap("IntranetIp")
    @Validation(required = true)
    public String intranetIp;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public Long createTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public Long endTime;

    @NameInMap("Spec")
    @Validation(required = true)
    public String spec;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("BusinessStatus")
    @Validation(required = true)
    public String businessStatus;

    @NameInMap("EnableBgp")
    @Validation(required = true)
    public Boolean enableBgp;

    @NameInMap("AutoPropagate")
    @Validation(required = true)
    public Boolean autoPropagate;

    public static ModifyVpnGatewayAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnGatewayAttributeResponse self = new ModifyVpnGatewayAttributeResponse();
        return TeaModel.build(map, self);
    }

}
