// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteHaVipRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("HaVipId")
    @Validation(required = true)
    public String haVipId;

    public static DeleteHaVipRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHaVipRequest self = new DeleteHaVipRequest();
        return TeaModel.build(map, self);
    }

}
