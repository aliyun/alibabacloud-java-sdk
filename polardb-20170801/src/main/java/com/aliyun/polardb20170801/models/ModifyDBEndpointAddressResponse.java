// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBEndpointAddressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBEndpointAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBEndpointAddressResponse self = new ModifyDBEndpointAddressResponse();
        return TeaModel.build(map, self);
    }

}
