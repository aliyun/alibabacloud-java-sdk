// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossBackupMetaListRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("BackupSetId")
    @Validation(required = true)
    public String backupSetId;

    @NameInMap("GetDbName")
    public String getDbName;

    @NameInMap("Pattern")
    public String pattern;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("PageIndex")
    public String pageIndex;

    @NameInMap("Region")
    public String region;

    public static DescribeCrossBackupMetaListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossBackupMetaListRequest self = new DescribeCrossBackupMetaListRequest();
        return TeaModel.build(map, self);
    }

}
