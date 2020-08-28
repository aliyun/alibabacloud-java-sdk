// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstancePayTypeRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("UsedTime")
    public Integer usedTime;

    @NameInMap("PayType")
    @Validation(required = true)
    public String payType;

    @NameInMap("Period")
    @Validation(required = true)
    public String period;

    public static ModifyDBInstancePayTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstancePayTypeRequest self = new ModifyDBInstancePayTypeRequest();
        return TeaModel.build(map, self);
    }

}
