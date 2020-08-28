// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceVpcRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("VPCId")
    public String VPCId;

    @NameInMap("VSwitchId")
    public String VSwitchId;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    public static SwitchDBInstanceVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchDBInstanceVpcRequest self = new SwitchDBInstanceVpcRequest();
        return TeaModel.build(map, self);
    }

}
