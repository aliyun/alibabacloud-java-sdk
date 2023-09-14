// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckCreateDdrDBInstanceResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the data of the source instance can be restored across regions. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("IsValid")
    public String isValid;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckCreateDdrDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckCreateDdrDBInstanceResponseBody self = new CheckCreateDdrDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckCreateDdrDBInstanceResponseBody setIsValid(String isValid) {
        this.isValid = isValid;
        return this;
    }
    public String getIsValid() {
        return this.isValid;
    }

    public CheckCreateDdrDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
