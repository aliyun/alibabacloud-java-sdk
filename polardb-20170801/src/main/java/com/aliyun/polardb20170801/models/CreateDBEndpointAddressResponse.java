// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBEndpointAddressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateDBEndpointAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBEndpointAddressResponse self = new CreateDBEndpointAddressResponse();
        return TeaModel.build(map, self);
    }

}
