// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ReleaseEipAddressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ReleaseEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseEipAddressResponse self = new ReleaseEipAddressResponse();
        return TeaModel.build(map, self);
    }

}
