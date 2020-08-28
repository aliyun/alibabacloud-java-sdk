// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VpnConnectionId")
    @Validation(required = true)
    public String vpnConnectionId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public Long createTime;

    public static CreateVpnConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnConnectionResponse self = new CreateVpnConnectionResponse();
        return TeaModel.build(map, self);
    }

}
