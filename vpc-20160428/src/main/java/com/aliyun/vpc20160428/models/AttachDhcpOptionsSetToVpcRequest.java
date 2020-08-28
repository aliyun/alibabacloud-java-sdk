// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AttachDhcpOptionsSetToVpcRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DhcpOptionsSetId")
    @Validation(required = true)
    public String dhcpOptionsSetId;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    public static AttachDhcpOptionsSetToVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachDhcpOptionsSetToVpcRequest self = new AttachDhcpOptionsSetToVpcRequest();
        return TeaModel.build(map, self);
    }

}
