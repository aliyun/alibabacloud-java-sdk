// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateHaVipResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("HaVipId")
    @Validation(required = true)
    public String haVipId;

    @NameInMap("IpAddress")
    @Validation(required = true)
    public String ipAddress;

    public static CreateHaVipResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHaVipResponse self = new CreateHaVipResponse();
        return TeaModel.build(map, self);
    }

}
