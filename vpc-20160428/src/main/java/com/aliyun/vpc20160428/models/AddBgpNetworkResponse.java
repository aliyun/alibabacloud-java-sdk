// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddBgpNetworkResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddBgpNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBgpNetworkResponse self = new AddBgpNetworkResponse();
        return TeaModel.build(map, self);
    }

}
