// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateSecurityIPModeResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EF1E53AB-5625-49C7-ADF1-FBD0B6640D19</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The whitelist mode after the change, which is the enhanced whitelist mode.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>safety</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>enhanced whitelist mode</p>
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>safety</p>
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
