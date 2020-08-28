// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBDescriptionRequest extends TeaModel {
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

    @NameInMap("DBName")
    @Validation(required = true)
    public String DBName;

    @NameInMap("DBDescription")
    @Validation(required = true)
    public String DBDescription;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static ModifyDBDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBDescriptionRequest self = new ModifyDBDescriptionRequest();
        return TeaModel.build(map, self);
    }

}
