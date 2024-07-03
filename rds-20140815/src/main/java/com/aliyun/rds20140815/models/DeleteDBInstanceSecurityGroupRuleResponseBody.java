// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDBInstanceSecurityGroupRuleResponseBody extends TeaModel {
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
     * <p>07F6177E-6DE4-408A-BB4F-0723301340F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDBInstanceSecurityGroupRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBInstanceSecurityGroupRuleResponseBody self = new DeleteDBInstanceSecurityGroupRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDBInstanceSecurityGroupRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteDBInstanceSecurityGroupRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteDBInstanceSecurityGroupRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
