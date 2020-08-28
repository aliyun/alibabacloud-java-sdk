// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterSSLRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("SSLEnabled")
    @Validation(required = true)
    public String SSLEnabled;

    @NameInMap("DBEndpointId")
    public String DBEndpointId;

    @NameInMap("NetType")
    public String netType;

    public static ModifyDBClusterSSLRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterSSLRequest self = new ModifyDBClusterSSLRequest();
        return TeaModel.build(map, self);
    }

}
