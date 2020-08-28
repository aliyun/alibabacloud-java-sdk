// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CancelImportRequest extends TeaModel {
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

    @NameInMap("ImportId")
    @Validation(required = true)
    public Integer importId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static CancelImportRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelImportRequest self = new CancelImportRequest();
        return TeaModel.build(map, self);
    }

}
