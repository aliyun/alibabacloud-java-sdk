// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyEndpointAddressRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("DBProxyEndpointId")
    @Validation(required = true)
    public String DBProxyEndpointId;

    @NameInMap("DBProxyNewConnectString")
    public String DBProxyNewConnectString;

    @NameInMap("DBProxyNewConnectStringPort")
    public String DBProxyNewConnectStringPort;

    @NameInMap("DBProxyConnectStringNetType")
    public String DBProxyConnectStringNetType;

    public static ModifyDBProxyEndpointAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyEndpointAddressRequest self = new ModifyDBProxyEndpointAddressRequest();
        return TeaModel.build(map, self);
    }

}
