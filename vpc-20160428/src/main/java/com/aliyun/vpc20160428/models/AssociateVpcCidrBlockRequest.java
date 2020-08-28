// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateVpcCidrBlockRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("SecondaryCidrBlock")
    public String secondaryCidrBlock;

    public static AssociateVpcCidrBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateVpcCidrBlockRequest self = new AssociateVpcCidrBlockRequest();
        return TeaModel.build(map, self);
    }

}
