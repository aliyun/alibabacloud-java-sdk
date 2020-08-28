// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBClusterEndpointRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("EndpointType")
    @Validation(required = true)
    public String endpointType;

    @NameInMap("Nodes")
    public String nodes;

    @NameInMap("ReadWriteMode")
    public String readWriteMode;

    @NameInMap("AutoAddNewNodes")
    public String autoAddNewNodes;

    @NameInMap("EndpointConfig")
    public String endpointConfig;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateDBClusterEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBClusterEndpointRequest self = new CreateDBClusterEndpointRequest();
        return TeaModel.build(map, self);
    }

}
