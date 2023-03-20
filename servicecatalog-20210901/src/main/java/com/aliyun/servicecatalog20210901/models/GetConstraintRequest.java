// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetConstraintRequest extends TeaModel {
    /**
     * <p>The ID of the constraint.</p>
     */
    @NameInMap("ConstraintId")
    public String constraintId;

    public static GetConstraintRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConstraintRequest self = new GetConstraintRequest();
        return TeaModel.build(map, self);
    }

    public GetConstraintRequest setConstraintId(String constraintId) {
        this.constraintId = constraintId;
        return this;
    }
    public String getConstraintId() {
        return this.constraintId;
    }

}
