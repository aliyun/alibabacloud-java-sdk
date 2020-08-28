// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteDBEndpointAddressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteDBEndpointAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBEndpointAddressResponse self = new DeleteDBEndpointAddressResponse();
        return TeaModel.build(map, self);
    }

}
