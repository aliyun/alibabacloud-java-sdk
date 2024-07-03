// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceSecurityGroupRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>07F6177E-6DE4-408A-BB4F-0723301340F4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDBInstanceSecurityGroupRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceSecurityGroupRuleResponseBody self = new CreateDBInstanceSecurityGroupRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceSecurityGroupRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDBInstanceSecurityGroupRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDBInstanceSecurityGroupRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
