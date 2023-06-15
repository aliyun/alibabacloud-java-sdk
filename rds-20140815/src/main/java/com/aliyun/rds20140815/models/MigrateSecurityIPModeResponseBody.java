// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateSecurityIPModeResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The whitelist mode after the change, which is the enhanced whitelist mode.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   safety</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    enhanced whitelist mode</p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("SecurityIPMode")
    public String securityIPMode;

    public static MigrateSecurityIPModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MigrateSecurityIPModeResponseBody self = new MigrateSecurityIPModeResponseBody();
        return TeaModel.build(map, self);
    }

    public MigrateSecurityIPModeResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public MigrateSecurityIPModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MigrateSecurityIPModeResponseBody setSecurityIPMode(String securityIPMode) {
        this.securityIPMode = securityIPMode;
        return this;
    }
    public String getSecurityIPMode() {
        return this.securityIPMode;
    }

}
