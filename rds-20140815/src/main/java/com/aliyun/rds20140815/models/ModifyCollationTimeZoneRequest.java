// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyCollationTimeZoneRequest extends TeaModel {
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

    @NameInMap("Collation")
    public String collation;

    @NameInMap("Timezone")
    public String timezone;

    public static ModifyCollationTimeZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCollationTimeZoneRequest self = new ModifyCollationTimeZoneRequest();
        return TeaModel.build(map, self);
    }

}
