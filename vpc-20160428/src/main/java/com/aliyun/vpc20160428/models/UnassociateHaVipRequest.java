// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociateHaVipRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("HaVipId")
    @Validation(required = true)
    public String haVipId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("Force")
    public String force;

    public static UnassociateHaVipRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassociateHaVipRequest self = new UnassociateHaVipRequest();
        return TeaModel.build(map, self);
    }

}
