// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DisableVpcClassicLinkRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DisableVpcClassicLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableVpcClassicLinkRequest self = new DisableVpcClassicLinkRequest();
        return TeaModel.build(map, self);
    }

}
