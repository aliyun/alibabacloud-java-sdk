// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateConstraintResponseBody extends TeaModel {
    // 约束ID
    @NameInMap("ConstraintId")
    public String constraintId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static CreateConstraintResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConstraintResponseBody self = new CreateConstraintResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConstraintResponseBody setConstraintId(String constraintId) {
        this.constraintId = constraintId;
        return this;
    }
    public String getConstraintId() {
        return this.constraintId;
    }

    public CreateConstraintResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
