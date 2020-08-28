// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteDBClusterEndpointRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("DBEndpointId")
    @Validation(required = true)
    public String DBEndpointId;

    public static DeleteDBClusterEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBClusterEndpointRequest self = new DeleteDBClusterEndpointRequest();
        return TeaModel.build(map, self);
    }

}
