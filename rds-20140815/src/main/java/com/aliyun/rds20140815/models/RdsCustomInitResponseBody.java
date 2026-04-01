// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RdsCustomInitResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RegisterUidSuccess")
    public Boolean registerUidSuccess;

    /**
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AA****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RdsCustomInitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RdsCustomInitResponseBody self = new RdsCustomInitResponseBody();
        return TeaModel.build(map, self);
    }

    public RdsCustomInitResponseBody setRegisterUidSuccess(Boolean registerUidSuccess) {
        this.registerUidSuccess = registerUidSuccess;
        return this;
    }
    public Boolean getRegisterUidSuccess() {
        return this.registerUidSuccess;
    }

    public RdsCustomInitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
