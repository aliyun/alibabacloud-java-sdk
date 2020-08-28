// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterEndpointRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("DBEndpointId")
    @Validation(required = true)
    public String DBEndpointId;

    @NameInMap("Nodes")
    public String nodes;

    @NameInMap("ReadWriteMode")
    public String readWriteMode;

    @NameInMap("AutoAddNewNodes")
    public String autoAddNewNodes;

    @NameInMap("EndpointConfig")
    public String endpointConfig;

    public static ModifyDBClusterEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterEndpointRequest self = new ModifyDBClusterEndpointRequest();
        return TeaModel.build(map, self);
    }

}
