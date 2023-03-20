// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DeleteConstraintRequest extends TeaModel {
    /**
     * <p>The ID of the constraint.</p>
     */
    @NameInMap("ConstraintId")
    public String constraintId;

    public static DeleteConstraintRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConstraintRequest self = new DeleteConstraintRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConstraintRequest setConstraintId(String constraintId) {
        this.constraintId = constraintId;
        return this;
    }
    public String getConstraintId() {
        return this.constraintId;
    }

}
