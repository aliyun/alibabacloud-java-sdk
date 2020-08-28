// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDetachedBackupsRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("BackupStatus")
    public String backupStatus;

    @NameInMap("BackupMode")
    public String backupMode;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Region")
    @Validation(required = true)
    public String region;

    public static DescribeDetachedBackupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDetachedBackupsRequest self = new DescribeDetachedBackupsRequest();
        return TeaModel.build(map, self);
    }

}
