// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociateVpcCidrBlockRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("SecondaryCidrBlock")
    public String secondaryCidrBlock;

    public static UnassociateVpcCidrBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassociateVpcCidrBlockRequest self = new UnassociateVpcCidrBlockRequest();
        return TeaModel.build(map, self);
    }

}
