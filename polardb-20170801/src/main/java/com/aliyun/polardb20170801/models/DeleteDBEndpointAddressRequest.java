// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteDBEndpointAddressRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("DBEndpointId")
    @Validation(required = true)
    public String DBEndpointId;

    @NameInMap("NetType")
    @Validation(required = true)
    public String netType;

    public static DeleteDBEndpointAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBEndpointAddressRequest self = new DeleteDBEndpointAddressRequest();
        return TeaModel.build(map, self);
    }

}
