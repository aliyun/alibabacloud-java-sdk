// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DeleteConstraintRequest extends TeaModel {
    // 约束ID
    @NameInMap("ConstraintId")
    public String constraintId;

    @NameInMap("RegionId")
    public String regionId;

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

    public DeleteConstraintRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
