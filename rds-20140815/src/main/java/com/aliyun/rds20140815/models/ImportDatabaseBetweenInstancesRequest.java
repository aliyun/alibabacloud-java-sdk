// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ImportDatabaseBetweenInstancesRequest extends TeaModel {
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

    @NameInMap("SourceDBInstanceId")
    @Validation(required = true)
    public String sourceDBInstanceId;

    @NameInMap("DBInfo")
    @Validation(required = true)
    public String DBInfo;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static ImportDatabaseBetweenInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDatabaseBetweenInstancesRequest self = new ImportDatabaseBetweenInstancesRequest();
        return TeaModel.build(map, self);
    }

}
