// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeOssDownloadsForSQLServerRequest extends TeaModel {
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

    @NameInMap("MigrateTaskId")
    @Validation(required = true)
    public String migrateTaskId;

    public static DescribeOssDownloadsForSQLServerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssDownloadsForSQLServerRequest self = new DescribeOssDownloadsForSQLServerRequest();
        return TeaModel.build(map, self);
    }

}
