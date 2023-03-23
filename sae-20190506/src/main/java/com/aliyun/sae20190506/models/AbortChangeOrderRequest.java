// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class AbortChangeOrderRequest extends TeaModel {
    /**
     * <p>be2e1c76-682b-4897-98d3-1d8d6478\*\*\*\*</p>
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
