// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class AbortChangeOrderQuery extends TeaModel {
    @NameInMap("ChangeOrderId")
    @Validation(required = true)
    public String changeOrderId;

    public static AbortChangeOrderQuery build(java.util.Map<String, ?> map) throws Exception {
        AbortChangeOrderQuery self = new AbortChangeOrderQuery();
        return TeaModel.build(map, self);
    }

    public AbortChangeOrderQuery setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

}
