// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class AbortChangeOrderRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChangeOrderId")
    public String changeOrderId;

    public static AbortChangeOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        AbortChangeOrderRequest self = new AbortChangeOrderRequest();
        return TeaModel.build(map, self);
    }

    public AbortChangeOrderRequest setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

}
