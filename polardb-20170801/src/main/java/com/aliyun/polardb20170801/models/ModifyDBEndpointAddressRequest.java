// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBEndpointAddressRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("DBEndpointId")
    @Validation(required = true)
    public String DBEndpointId;

    @NameInMap("NetType")
    @Validation(required = true)
    public String netType;

    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    @NameInMap("PrivateZoneAddressPrefix")
    public String privateZoneAddressPrefix;

    @NameInMap("PrivateZoneName")
    public String privateZoneName;

    @NameInMap("Port")
    public String port;

    public static ModifyDBEndpointAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBEndpointAddressRequest self = new ModifyDBEndpointAddressRequest();
        return TeaModel.build(map, self);
    }

}
