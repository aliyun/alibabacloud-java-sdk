// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckDBNameAvailableRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("DBName")
    @Validation(required = true)
    public String DBName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static CheckDBNameAvailableRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDBNameAvailableRequest self = new CheckDBNameAvailableRequest();
        return TeaModel.build(map, self);
    }

}
