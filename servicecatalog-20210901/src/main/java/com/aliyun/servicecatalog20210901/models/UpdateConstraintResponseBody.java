// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateConstraintResponseBody extends TeaModel {
    /**
     * <p>The ID of the constraint.</p>
     * 
     * <strong>example:</strong>
     * <p>cons-bp1yx7x42v****</p>
     */
    @NameInMap("ConstraintId")
    public String constraintId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateConstraintResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConstraintResponseBody self = new UpdateConstraintResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConstraintResponseBody setConstraintId(String constraintId) {
        this.constraintId = constraintId;
        return this;
    }
    public String getConstraintId() {
        return this.constraintId;
    }

    public UpdateConstraintResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
