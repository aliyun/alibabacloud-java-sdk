// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceID")
    @Validation(required = true)
    public String DBInstanceID;

    @NameInMap("EnableBackupLog")
    @Validation(required = true)
    public String enableBackupLog;

    @NameInMap("LocalLogRetentionHours")
    @Validation(required = true)
    public Integer localLogRetentionHours;

    @NameInMap("LocalLogRetentionSpace")
    @Validation(required = true)
    public String localLogRetentionSpace;

    @NameInMap("HighSpaceUsageProtection")
    @Validation(required = true)
    public String highSpaceUsageProtection;

    @NameInMap("CompressType")
    @Validation(required = true)
    public String compressType;

    @NameInMap("LogBackupLocalRetentionNumber")
    @Validation(required = true)
    public Integer logBackupLocalRetentionNumber;

    public static ModifyBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPolicyResponse self = new ModifyBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

}
