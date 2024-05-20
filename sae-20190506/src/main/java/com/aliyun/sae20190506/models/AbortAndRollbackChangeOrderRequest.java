// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class AbortAndRollbackChangeOrderRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChangeOrderId")
    public String changeOrderId;

    public static AbortAndRollbackChangeOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        AbortAndRollbackChangeOrderRequest self = new AbortAndRollbackChangeOrderRequest();
        return TeaModel.build(map, self);
    }

    public AbortAndRollbackChangeOrderRequest setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

}
