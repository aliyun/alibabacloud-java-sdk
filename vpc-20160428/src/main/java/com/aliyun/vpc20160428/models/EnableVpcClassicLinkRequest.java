// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class EnableVpcClassicLinkRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static EnableVpcClassicLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableVpcClassicLinkRequest self = new EnableVpcClassicLinkRequest();
        return TeaModel.build(map, self);
    }

}
