// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateSecurityIPModeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("SecurityIPMode")
    @Validation(required = true)
    public String securityIPMode;

    public static MigrateSecurityIPModeResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateSecurityIPModeResponse self = new MigrateSecurityIPModeResponse();
        return TeaModel.build(map, self);
    }

}
