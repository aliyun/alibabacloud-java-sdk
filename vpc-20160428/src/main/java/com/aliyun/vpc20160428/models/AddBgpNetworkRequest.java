// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddBgpNetworkRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DstCidrBlock")
    @Validation(required = true)
    public String dstCidrBlock;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("RouterId")
    @Validation(required = true)
    public String routerId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static AddBgpNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBgpNetworkRequest self = new AddBgpNetworkRequest();
        return TeaModel.build(map, self);
    }

}
