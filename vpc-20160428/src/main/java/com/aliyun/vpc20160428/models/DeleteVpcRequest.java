// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpcRequest extends TeaModel {
    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcRequest self = new DeleteVpcRequest();
        return TeaModel.build(map, self);
    }

}
