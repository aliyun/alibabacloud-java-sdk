// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckCreateDdrDBInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsValid")
    @Validation(required = true)
    public String isValid;

    public static CheckCreateDdrDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCreateDdrDBInstanceResponse self = new CheckCreateDdrDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CheckCreateDdrDBInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckCreateDdrDBInstanceResponse setIsValid(String isValid) {
        this.isValid = isValid;
        return this;
    }
    public String getIsValid() {
        return this.isValid;
    }

}
