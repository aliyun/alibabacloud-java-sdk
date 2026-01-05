// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class DeleteSlotRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    public static DeleteSlotRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSlotRequest self = new DeleteSlotRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSlotRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
